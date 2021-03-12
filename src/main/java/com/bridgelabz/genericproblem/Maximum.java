package com.bridgelabz.genericproblem;

public class Maximum {
    public static Integer maxInteger(Integer firstPosition, Integer secondPosition, Integer thirdPosition) {
        Integer max = firstPosition;
        if (secondPosition.compareTo(max) > 0) {
            max = secondPosition;
        }
        if (thirdPosition.compareTo(max) > 0) {
            max = thirdPosition;
        }
        return max;
    }
    public static Float maxFloat(Float firstPosition, Float secondPosition, Float thirdPosition) {
        Float max = firstPosition;
        if (secondPosition.compareTo(max) > 0) {
            max = secondPosition;
        }
        if (thirdPosition.compareTo(max) > 0) {
            max = thirdPosition;
        }
        return max;
    }
    public static String maxString(String firstPosition, String secondPosition, String thirdPosition) {
        String max = firstPosition;
        if (secondPosition.compareTo(max) > 0) {
            max = secondPosition;
        }
        if (thirdPosition.compareTo(max) > 0) {
            max = thirdPosition;
        }
        return max;
    }
}
