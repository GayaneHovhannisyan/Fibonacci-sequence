package com.company;


import java.util.Scanner;
import static com.company.FibonacciCalculator.fibonacciCalculator;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter index : ");
        int number = scanner.nextInt();
        while(number<1){
            System.out.println("index must be great then 0");
            System.out.println("Reenter index : ");
            number=scanner.nextInt();
        }
            System.out.println(number + "-th number of fibonacci is " +
                    fibonacciCalculator(number));

    }
}



