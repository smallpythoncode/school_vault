package server;

import api.ClientManager;
import api.Worker;

import java.rmi.ConnectException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.UnknownHostException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.List;
import java.util.Arrays;


/**
 * server.Server.java
 * HW3
 * CSCI 364, Spring 2025
 *
 * @author jahnke
 */
public class Server extends UnicastRemoteObject implements ClientManager {
    /** Serializable class definition */
    private static final long serialVersionUID = 69L;
    /** stores client IDs and their scores */
    private Map<String, Float> clientScores;
    /** used in generation of task IDs and other random values */
    private Random random;

    /**
     * server constructor
     *
     * @throws RemoteException RMI errors
     */
    protected Server() throws RemoteException {
        super();
        clientScores = new HashMap<>();
        random = new Random();
    }

    /**
     * registers a new client and returns list of available tasks type.
     *
     * @param userid client id
     * @return list of available tasks
     * @throws RemoteException if a remote communication error occurs
     */
    @Override
    public List<String> register(String userid) throws RemoteException {
        clientScores.putIfAbsent(userid, 0.0f);
        System.out.println("Registered clients and scores: " + clientScores);
        return Arrays.asList("SortWorker", "SumReducer", "PrimeChecker", "FractionReducer");
    }

    /**
     * requests a new task for given client
     *
     * @param userId client id
     * @param taskName task type requested
     * @return Worker object for the assigned task.
     * @throws RemoteException if an error occurs
     */
    @Override
    public Worker requestWork(String userId, String taskName) throws RemoteException {
        int taskId = random.nextInt(1000);
        switch (taskName) {
            case "SortWorker":
                return new SortWorker<>(taskId, random.nextInt(100), random.nextInt(100));
            case "SumReducer":
                return new SumReducer(taskId, random.nextInt(1000), random.nextInt(1000));
            case "PrimeChecker":
                return new PrimeChecker(taskId, random.nextInt(1000));
            case "FractionReducer":
                return new FractionReducer(taskId, random.nextInt(100), random.nextInt(100) + 1);
            default:
                throw new RemoteException("Unknown task: " + taskName);
        }
    }

    /**
     * submission of client work results and associated score
     *
     * @param userId client id
     * @param answer Worker task completed
     * @throws RemoteException if an error occurs
     */
    @Override
    public synchronized void submitResults(String userId, Worker answer) throws RemoteException {
        System.out.println("Received work from " + userId + ": " + answer.getTaskName());

        if (answer instanceof SumReducer) {
            SumReducer sumTask = (SumReducer) answer;
            System.out.println("Task: SumReducer | Inputs: " + sumTask.getNumbers() + " | Result: " + sumTask.getSum());
        } else if (answer instanceof PrimeChecker) {
            PrimeChecker primeTask = (PrimeChecker) answer;
            System.out.println("Task: PrimeChecker | Input: " + primeTask.getNumber() + " | Result: " + (primeTask.isPrime() ? "Prime" : "Not Prime"));
        } else if (answer instanceof SortWorker) {
            SortWorker<?> sortTask = (SortWorker<?>) answer;
            System.out.println("Task: SortWorker | Inputs: " + sortTask.getList() + " | Sorted: " + sortTask.getList());
        } else if (answer instanceof FractionReducer) {
            FractionReducer fractionTask = (FractionReducer) answer;
            System.out.println("Task: FractionReducer | Input: " + fractionTask.getNumerator() + "/" + fractionTask.getDenominator() +
                    " | Reduced: " + fractionTask.getNumerator() + "/" + fractionTask.getDenominator());
        }

        float oldScore = clientScores.getOrDefault(userId, 0.0f);
        float newScore = oldScore + 10;
        clientScores.put(userId, newScore);

        System.out.println("Updated scores:");
        for (Map.Entry<String, Float> entry : clientScores.entrySet()) {
            System.out.println("Client " + entry.getKey() + ": " + entry.getValue());
        }
    }

    /**
     * getter for current score of a client.
     *
     * @param userId client id
     * @return client score
     * @throws RemoteException if an error occurs
     */
    @Override
    public float getScore(String userId) throws RemoteException {
        return clientScores.getOrDefault(userId, 0.0f);
    }

    /**
     * @param args terminal arguments: [host] [port]
     */
    public static void main(String[] args) {
        String host = "localhost"; // Declare variables before try block
        int port = 1099;

        try {
            host = args.length > 0 ? args[0] : "localhost";
            port = args.length > 1 ? Integer.parseInt(args[1]) : 1099;

            LocateRegistry.createRegistry(port);
            Server server = new Server();
            Naming.rebind("//" + host + ":" + port + "/ClientManager", server);

            System.out.println("Server is running on " + host + " at port " + port + "...");
        } catch (UnknownHostException e) {
            System.err.println("Unknown host: " + host + ". Try 'localhost'.");
        } catch (ConnectException e) {
            System.err.println("Connection refused: " + port + ". Try 1099.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
