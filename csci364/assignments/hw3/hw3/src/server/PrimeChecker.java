package server;

import api.Worker;
import api.ClientManager;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;


// PrimeChecker: Checks if a number is prime
class PrimeChecker extends Worker {
    private static final long serialVersionUID = 1L;
    private int number;
    private boolean isPrime;
    
    PrimeChecker(int id, int number) {
        super(id, "PrimeChecker");
        this.number = number;
    }
    
    @Override
    public void doWork() {
        if (number < 2) {
            isPrime = false;
            return;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                isPrime = false;
                return;
            }
        }
        isPrime = true;
    }
    
    public boolean isPrime() {
        return isPrime;
    }
}
