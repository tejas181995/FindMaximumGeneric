package com.bridgelabz.genericproblem;

public class FindMaximum {
    public static Integer findMaximum(Integer firstPosition, Integer secondPosition, Integer thirdPosition) {
        Integer max = firstPosition;
        if (secondPosition.compareTo(max) > 0) {
            max = secondPosition;
        }
        if (thirdPosition.compareTo(max) > 0) {
            max = thirdPosition;
        }
        return max;
    }
}
