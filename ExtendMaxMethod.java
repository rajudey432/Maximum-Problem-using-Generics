package com.bridgelabz.generics;


import java.util.Arrays;

public class ExtendMaxMethod<T extends Comparable<T>> {

    private T[] values;

    public ExtendMaxMethod(T... values) {
        this.values = values;
    }

    public T max() {
        Arrays.sort(values);
        return values[values.length - 1];
    }

    public static <T extends Comparable<T>> void printMax(T... values) {
        ExtendMaxMethod<T> ExtendMaxMethod = new ExtendMaxMethod<>(values);
        System.out.println("Max value: " + ExtendMaxMethod.max());
    }

    public static void main(String[] args) {
        // Test case 1: max number is first
        printMax(10, 5, 3); // expected output: Max value: 10

        // Test case 2: max float is second
        printMax(4.6f, 8.9f, 2.4f); // expected output: Max value: 8.9

        // Test case 3: max string is third
        printMax("Carrot", "Broccoli", "Zucchini"); // expected output: Max value: Zucchini

        // Test case 4: max long is second
        printMax(12L, 45L, 33L, 89L, 5L); // expected output: Max value: 89
    }
}
