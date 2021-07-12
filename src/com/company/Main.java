package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //TASK NR1
        //write a program that counts in descending order from 100 to 0
        //print out only the values divisible by 6

//        for (int i = 100; i > 0 ; i--) {
//            if (i % 6 == 0) {
//                System.out.println(i);
//            }
//        }

        //TASK NR2
        //write a program that takes input from the user for 10 values
        //find the average of those numbers

//        Scanner scanner = new Scanner(System.in);
//
//        int values[] = new int[10];
//        int sum = 0;
//        for (int i = 0; i < 10; i++) {
//            System.out.print("Enter value nr " + (i+1) + ": ");
//            values[i] = scanner.nextInt();
//            sum = sum + values[i];
//        }
//        int average = sum / values.length;
//        System.out.println("The average of numbers is:" + average);

        //TASK NR3
        //write a program that takes in 5 strings from the user
        //concatenate those in one sentence

//        Scanner scanner = new Scanner(System.in);
//
//        String[] words = new String[5];
//        String sentence = "";
//        for (int i = 0; i < 5; i++) {
//            System.out.print("Enter word nr" + (i+1) + ": ");
//            words[i] = scanner.next();
//            sentence = sentence + words[i] + " ";
//        }
//        System.out.println(Arrays.toString(words));
//        System.out.println(sentence);

        //TASK NR4
        //write a program that allows the user to input 10 values
        //find the largest number

//        Scanner scanner = new Scanner(System.in);
//
//        int values[] = new int[10];
//        int maxValue = 0;
//        for (int i = 0; i < 10; i++) {
//            System.out.print("Enter value nr " + (i+1) + ": ");
//            values[i] = scanner.nextInt();
//            if (maxValue < values[i]) {
//                maxValue = values[i];
//            }
//        }
//        System.out.println("The maximum from numbers is: " + maxValue);

        //TASK NR5
        //using an array, output the number of odd numbers in user entered values
        //allow the user to input a number of numbers and return this number

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the number of values to input: ");
//        int[] values = new int[scanner.nextInt()];
//        int counter = 0;
//        for (int i = 0; i < values.length; i++) {
//            System.out.print("Enter value nr " + (i+1) + ": ");
//            values[i] = scanner.nextInt();
//            if(values[i] % 2 == 0) {
//                counter += 1;
//            }
//        }
//        System.out.println("The number of odd values entered is: " + counter);

        //HOMEWORK
        //create a class called Vehicle
        //Let the car have length of vehicle, name/brand, number of seats, current speed, number of tires
        //methods: speed up(increase speed by 5), slow down(reduce speed by 5), start and stop engine

        Vehicle bike = new Vehicle("BMW", 2, 2, 2, 0);
        Vehicle car = new Vehicle("Volvo", 4, 4, 5, 0);

        bike.startEngine();
        bike.speedUp();
        System.out.println("Speed after speeding up is: " + bike.getCurrentSpeed());
        bike.slowDown();
        System.out.println("Speed after slowing down is: " + bike.getCurrentSpeed());
        bike.stopEngine();

    }
}
