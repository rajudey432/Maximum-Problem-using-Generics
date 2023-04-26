package com.bridgelabz.generics;

import java.util.Arrays;

public class MaximumValue<T extends Comparable<T>> {

    private T[] values;

    public MaximumValue(T... values) {
        this.values = values;
    }

    public T max() {
        Arrays.sort(values);
        return values[values.length - 1];
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

        // Test case 4: max long is second
        MaximumValue<Long> d = new MaximumValue<>(12L, 45L, 33L, 89L, 5L);
        System.out.println("Max long: " + d.max()); // expected output: 89
    }
}
