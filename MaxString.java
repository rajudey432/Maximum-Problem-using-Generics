package com.bridgelabz.generics;

public class MaxString {

    public static String max(String x, String y, String z) {
        String max = x; // assume x is the largest

        if (y.compareTo(max) > 0) {
            max = y; // update max if y is larger
        }

        if (z.compareTo(max) > 0) {
            max = z; // update max if z is larger
        }

        return max;
    }

    public static void main(String[] args) {
        // Test case 1: max string is first
        String a = "Apple", b = "Peach", c = "Banana";
        System.out.println("Max string: " + max(a, b, c)); // expected output: "Peach"

        // Test case 2: max string is second
        String d = "Orange", e = "Grapefruit", f = "Lemon";
        System.out.println("Max string: " + max(d, e, f)); // expected output: "Orange"

        // Test case 3: max string is third
        String g = "Carrot", h = "Broccoli", i = "Zucchini";
        System.out.println("Max string: " + max(g, h, i)); // expected output: "Zucchini"
    }
}