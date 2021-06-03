package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10000 at 2% interest = " +calculateInterest(10000.0,2.0));

        for (int i =1; i<6 ;i++) {
            System.out.println("Loop " + i + " hello!");
        }
        for (int interest =2;interest<9;interest++ ){
            System.out.println("The interest is " +String.format("%.2f",calculateInterest(10000,interest)));
        }

        System.out.println("*****************");

        for (int interest =8;interest>1;interest--){
            System.out.println("10,000 at " +String.format("%.2f",calculateInterest(10000,interest)));
        }

       int count = 0;

        for (int i=10;i<50;i++)
        {
            if (isPrime(i))
            {
                System.out.println(i);
                count++;
                if (count == 10)
                    break;
            }
        }



    }

    public static double calculateInterest(double amount, double interestRate){
        return(amount *(interestRate/100));
    }

    public static boolean isPrime(int n)
    {
        if (n==1){
            return false;
        }

        for (int i = 2; i<= n/2; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
