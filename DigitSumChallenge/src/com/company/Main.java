package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of the digits in 125 is " + sumDigits(125));
        System.out.println("The sum of the digits in -125 is " + sumDigits(-125));
        System.out.println("The sum of the digits in 4 is " + sumDigits(4));
        System.out.println("The sum of the digits in 32123 is " + sumDigits(32123));

    }

    public static int sumDigits(int number) {
        int sum = 0;

            if (number < 10) {
                return -1;
            }
            else {
                while (number!= 0) {
                    sum += number % 10;
                    number = number / 10;

                }
                return sum;

            }
        }

}
