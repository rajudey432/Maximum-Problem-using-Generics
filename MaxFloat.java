package com.bridgelabz.generics;

public class MaxFloat {

    public static float max(float x, float y, float z) {
        float max = x; // assume x is the largest

        if (y > max) {
            max = y; // update max if y is larger
        }

        if (z > max) {
            max = z; // update max if z is larger
        }

        return max;
    }

    public static void main(String[] args) {
        // Test case 1: max number is first
        float a = 10.5f, b = 5.2f, c = 3.7f;
        System.out.println("Max number: " + max(a, b, c)); // expected output: 10.5

        // Test case 2: max number is second
        float d = 4.6f, e = 8.9f, f = 2.4f;
        System.out.println("Max number: " + max(d, e, f)); // expected output: 8.9

        // Test case 3: max number is third
        float g = 1.3f, h = 3.8f, i = 7.1f;
        System.out.println("Max number: " + max(g, h, i)); // expected output: 7.1
    }
}