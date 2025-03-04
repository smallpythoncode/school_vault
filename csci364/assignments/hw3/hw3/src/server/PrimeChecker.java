package server;

import api.Worker;


/**
 * server.PrimeChecker.java
 * HW3
 * CSCI 364, Spring 2025
 *
 * @author jahnke
 */
class PrimeChecker extends Worker {
    /** Serializable class definition */
    private static final long serialVersionUID = 69L;
    /** this number is checked for being prime */
    private int number;
    /** true : prime :: false: not prime */
    private boolean isPrime;

    /**
     * PrimeChecker object constructor
     * @param id object id
     * @param number input for number to check if prime
     */
    PrimeChecker(int id, int number) {
        super(id, "PrimeChecker");
        this.number = number;
    }

    /**
     * Does the work of checking if prime
     */
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

    /** is prime boolean getter */
    public boolean isPrime() {
        return isPrime;
    }

    /** getter for the number to check if prime */
    public int getNumber() {  // ✅ New getter method
        return number;
    }
}
