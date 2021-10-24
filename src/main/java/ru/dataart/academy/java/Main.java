package ru.dataart.academy.java;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Calculator works: " + calculator.getSum(Arrays.asList(6, 4, 3), Arrays.asList(5, 6, 8)));
        System.out.println("Odd elements: " + calculator.getOddElements(Arrays.asList(1, 2, 3, 4)));
        System.out.println("Bounds: " + calculator.getBounds(Arrays.asList(1, 3)));
    }
}