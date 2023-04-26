package com.bridgelabz.generics;

public class MaxValue<T extends Comparable<T>> {

    private T x;
    private T y;
    private T z;

    public MaxValue(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T max() {
        return MaxValue.max(x, y, z);
    }

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
        MaxValue<Integer> a = new MaxValue<>(10, 5, 3);
        System.out.println("Max number: " + a.max()); // expected output: 10

        // Test case 2: max float is second
        MaxValue<Float> b = new MaxValue<>(4.6f, 8.9f, 2.4f);
        System.out.println("Max float: " + b.max()); // expected output: 8.9

        // Test case 3: max string is third
        MaxValue<String> c = new MaxValue<>("Carrot", "Broccoli", "Zucchini");
        System.out.println("Max string: " + c.max()); // expected output: "Zucchini"
    }
}