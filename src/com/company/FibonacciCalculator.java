package com.company;

public class FibonacciCalculator {
    public static Integer fibonacciCalculator(int number) {

        while (number > 0) {
            int fibNum = 0;
            if (number == 1 || number == 2) {
                return 1;
            } else {
                fibNum = (fibonacciCalculator(number - 1) + fibonacciCalculator(number - 2));
                return fibNum;
            }
        }
        return 0;
    }
}

