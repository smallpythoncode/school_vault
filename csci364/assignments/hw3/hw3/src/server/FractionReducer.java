package server;

import api.Worker;


/**
 * server.FractionReducer.java
 * HW3
 * CSCI 364, Spring 2025
 *
 * @author jahnke
 */
class FractionReducer extends Worker {
    /** Serializable class definition */
    private static final long serialVersionUID = 69L;
    /** the numerator - gcd between it and denominator will be found */
    private int numerator;
    /** the denominator - gcd between it and numerator will be found */
    private int denominator;

    /**
     * FractionReducer object constructor
     * @param id object id
     * @param num numerator input
     * @param den denominator input
     */
    FractionReducer(int id, int num, int den) {
        super(id, "FractionReducer");
        this.numerator = num;
        this.denominator = den;
    }

    /**
     * Perform the work of getting the gcd with defined numerator, denominator
     */
    @Override
    public void doWork() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }
    
    /** numerator getter */
    public int getNumerator() {
        return numerator;
    }

    /** denominator getter */
    public int getDenominator() {
        return denominator;
    }

    /**
     * The calculation of the gcd between a and b
     * @param a first num
     * @param b second num
     * @return the gcd
     */
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
