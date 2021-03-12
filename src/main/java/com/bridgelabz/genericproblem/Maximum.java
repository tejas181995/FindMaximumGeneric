package com.bridgelabz.genericproblem;

public class Maximum {
    public static <E extends Comparable<E>> E findMaximum(E value1, E value2, E value3) {
        E max = value1;
        if (value2.compareTo(max) > 0) {
            max = value2;
        }
        if (value3.compareTo(max) > 0) {
            max = value3;
        }
        return max;
    }
}
