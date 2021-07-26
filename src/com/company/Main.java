package com.company;


import java.util.Scanner;

import static com.company.FibonacciCalculator.fibonacciCalculator;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input index : ");
        int number = scanner.nextInt();
        System.out.println(number + "-th number of fibonacci is " +
                fibonacciCalculator(number));

    }
}



