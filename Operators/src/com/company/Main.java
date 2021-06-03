package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println(" 1 + 2 = " +result);

        int previousResult = result;
        System.out.println("previousREsult = " +previousResult);
        result = result -1; //3 - 1= 2

        System.out.println("3 - 1 =" +result  );
        System.out.println("previousREsult = " +previousResult);

        result = result * 10; //2 * 10 = 20
        System.out.println(" 2 * 10 = " +result);

        result = result /5 ; //20/5 =4
        System.out.println("20 / 5 = " +result);

        result = result % 3; //The reminder of (4 % 3)
        System.out.println(" 4 % 3 = "+result);

        //result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println(" 1 + 1 = "+result);

        result--; //2 - 1 = 1
        System.out.println("2 - 1 = " +result) ;

        //result = result + 2;
        result+= 2; //1 + 2 = 3
        System.out.println("1 + 2 = "+result);

        //result = result * 10;
        result *= 10; //3 * 10 = 30
        System.out.println(" 3 * 10 = "+result);

        //result = result /3
        result /= 3; //30/3 = 10
        System.out.println("30 / 3 = " +result);

        //result = result - 2
        result -= 2; //10 -2 = 8
        System.out.println("10 -2 = "+ result);

        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if(topScore <= 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore>secondTopScore) && (topScore<100)){
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore>90) || (secondTopScore <=90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if(newValue==50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar){
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true :false;
        if(wasCar){
            System.out.println("wasCar is true");
        }

        double var1 = 20.00;
        double var2 = 80.00;
        double res = var1 + var2;
        res *= 100;
        System.out.println("MyValuesTotal = " +res);
        double remainder = res % 40.00;
        System.out.println("TheRemainder = " +remainder);

        boolean remflag;
        if (remainder == 0){
            remflag = true;
        }
        else
        {
            remflag = false;
        }

        System.out.println(remflag);

        if (!remflag)
        {
            System.out.println("Got some remainder");
        }


    }
}
