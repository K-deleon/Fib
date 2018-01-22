package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter a number to check if it's a Fibonacci number.");
        Scanner fibInp = new Scanner(System.in);
        int fibby = fibInp.nextInt();

        Fibonacci dif = new Fibonacci();
        if(dif.fibbage(fibby)){
            System.out.println(fibby);
            System.out.println("Input is a Fibonacci number! Above are the numbers leading up to it!");
        } else {
            System.out.println("Input is not a Fibonacci number!");
        }




    }
}
