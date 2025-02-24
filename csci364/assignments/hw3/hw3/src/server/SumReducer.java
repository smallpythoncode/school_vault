package server;

import api.Worker;
import api.ClientManager;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;


// SumReducer: Sums a sequence of numbers
class SumReducer extends Worker {
    private static final long serialVersionUID = 1L;
    private List<Integer> numbers;
    private int sum;
    
    SumReducer(int id, int... values) {
        super(id, "SumReducer");
        this.numbers = new ArrayList<>();
        for (int v : values) {
            numbers.add(v);
        }
    }
    
    @Override
    public void doWork() {
        sum = numbers.stream().mapToInt(Integer::intValue).sum();
    }
    
    public int getSum() {
        return sum;
    }
}
