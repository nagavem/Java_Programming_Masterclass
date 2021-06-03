package com.company;

public class Main {

    public static void main(String[] args) {

        int switchValue = 6;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1,2,3,4 or 5");
                break;

        }

        char test = 'F';

        switch (test)
        {
            case  'A':
                System.out.println("It is A");
                break;

            case 'B':
                System.out.println("It is B");
                break;

            case 'C':
                System.out.println("It is C");
                break;

            case 'D':
                System.out.println("It is D");
                break;

            case 'E':
                System.out.println("It is E");
                break;

            default:
                System.out.println("Could not find A, B, C , D or E");
                break;
        }

        String month = "JuNE";

        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("June");
                break;
            default:
                System.out.println("Not Sure");
        }

    }




}
