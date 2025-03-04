package server;

import api.Worker;
import java.util.ArrayList;
import java.util.List;


/**
 * server.SumReducer.java
 * HW3
 * CSCI 364, Spring 2025
 *
 * @author jahnke
 */
class SumReducer extends Worker {
    /** Serializable class definition */
    private static final long serialVersionUID = 69L;
    /** the set of number for which the sum will be found */
    private List<Integer> numbers;
    /** the sum of the numbers */
    private int sum;

    /**
     * SumReducer object constructor
     * @param id object id
     * @param values the values to sum
     */
    SumReducer(int id, int... values) {
        super(id, "SumReducer");
        this.numbers = new ArrayList<>();
        for (int v : values) {
            numbers.add(v);
        }
    }

    /**
     * Does the work of summing the numbers
     */
    @Override
    public void doWork() {
        sum = numbers.stream().mapToInt(Integer::intValue).sum();
    }

    /** sum getter */
    public int getSum() {
        return sum;
    }

    /** set of numbers getter */
    public List<Integer> getNumbers() {  // ✅ New getter method
        return numbers;
    }
}
