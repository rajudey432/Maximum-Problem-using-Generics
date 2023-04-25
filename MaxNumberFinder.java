package com.bridgelabz.generics;

public class MaxNumberFinder<T extends Comparable<T>> {

    public T findMax(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        // Test case 1: Max number at first position
        MaxNumberFinder<Integer> finder = new MaxNumberFinder<Integer>();
        Integer max1 = finder.findMax(10, 5, 2);
        if (max1 != 10) {
            System.out.println("Test Case 1 Failed");
        }

        // Test case 2: Max number at second position
        Integer max2 = finder.findMax(5, 10, 2);
        if (max2 != 10) {
            System.out.println("Test Case 2 Failed");
        }

        // Test case 3: Max number at third position
        Integer max3 = finder.findMax(5, 2, 10);
        if (max3 != 10) {
            System.out.println("Test Case 3 Failed");
        }
    }
}