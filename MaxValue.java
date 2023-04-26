package com.bridgelabz.generics;

public class MaxValue {

    public static <T extends Comparable<T>> T max(T x, T y, T z) {
        T max = x; // assume x is the largest

        if (y.compareTo(max) > 0) {
            max = y; // update max if y is larger
        }

        if (z.compareTo(max) > 0) {
            max = z; // update max if z is larger
        }

        return max;
    }

    public static void main(String[] args) {
        // Test case 1: max number is first
        int a = 10, b = 5, c = 3;
        System.out.println("Max number: " + max(a, b, c)); // expected output: 10

        // Test case 2: max float is second
        float d = 4.6f, e = 8.9f, f = 2.4f;
        System.out.println("Max float: " + max(d, e, f)); // expected output: 8.9

        // Test case 3: max string is third
        String g = "Carrot", h = "Broccoli", i = "Zucchini";
        System.out.println("Max string: " + max(g, h, i)); // expected output: "Zucchini"
    }
}