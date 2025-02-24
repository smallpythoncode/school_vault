package server;

import api.Worker;
import api.ClientManager;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;


// Server: Implements ClientManager to handle clients and task assignments
public class Server extends UnicastRemoteObject implements ClientManager {
    private static final long serialVersionUID = 1L;
    private Map<String, Float> clientScores;
    private Random random;
    
    protected Server() throws RemoteException {
        super();
        clientScores = new HashMap<>();
        random = new Random();
    }
    
    @Override
    public List<String> register(String userid) throws RemoteException {
        clientScores.putIfAbsent(userid, 0.0f);
        System.out.println("Registered clients and scores: " + clientScores);
        return Arrays.asList("SortWorker", "SumReducer", "PrimeChecker", "FractionReducer");
    }
    
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
    
    @Override
    public void submitResults(String userId, Worker answer) throws RemoteException {
        System.out.println("Received work from " + userId + ": " + answer.getTaskName());
        clientScores.put(userId, clientScores.get(userId) + 10);
    }
    
    @Override
    public float getScore(String userId) throws RemoteException {
        return clientScores.getOrDefault(userId, 0.0f);
    }
    
    public static void main(String[] args) {
        try {
            Server server = new Server();
            java.rmi.Naming.rebind("ClientManager", server);
            System.out.println("Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
