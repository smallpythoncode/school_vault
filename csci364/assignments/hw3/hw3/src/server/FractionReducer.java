package server;

import api.Worker;
import api.ClientManager;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;


// FractionReducer: Reduces a fraction
class FractionReducer extends Worker {
    private static final long serialVersionUID = 1L;
    private int numerator;
    private int denominator;
    
    FractionReducer(int id, int num, int den) {
        super(id, "FractionReducer");
        this.numerator = num;
        this.denominator = den;
    }
    
    @Override
    public void doWork() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }
    
    public int getNumerator() {
        return numerator;
    }
    
    public int getDenominator() {
        return denominator;
    }
    
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
