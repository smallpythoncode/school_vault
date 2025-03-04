package client;

import api.ClientManager;
import api.Worker;
import java.rmi.Naming;
import java.rmi.UnknownHostException;
import java.rmi.ConnectException;
import java.util.List;
import java.util.Random;


/**
 * client.Client.java
 * HW3
 * CSCI 364, Spring 2025
 *
 * @author jahnke
 */
public class Client {
    /**
     * @param args terminal arguments: [userID] [host] [port]
     */
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java Client <userId> [host] [port]");
            return;
        }
        
        String userId = args[0];
        String host = args.length > 1 ? args[1] : "localhost";
        String port = args.length > 2 ? args[2] : "1099";
        
        try {
            ClientManager manager = (ClientManager) Naming.lookup("rmi://" + host + ":" + port + "/ClientManager");
            
            List<String> taskNames = manager.register(userId);
            System.out.println("Available tasks: " + taskNames);
            
            Random random = new Random();
            for (int i = 0; i < 5; i++) {
                String selectedTask = taskNames.get(random.nextInt(taskNames.size()));
                System.out.println("Requesting task: " + selectedTask);
                
                Worker task = manager.requestWork(userId, selectedTask);
                task.doWork();
                manager.submitResults(userId, task);
                Thread.sleep(50);  // Give server side time to update
                
                float score = manager.getScore(userId);
                System.out.println("Current score: " + score);
            }
        } catch (UnknownHostException e) {
            System.err.println("Unknown host: " + host + ". Try 'localhost'.");
        } catch (ConnectException e) {
            System.err.println("Connection refused: " + port + ". Try 1099.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
