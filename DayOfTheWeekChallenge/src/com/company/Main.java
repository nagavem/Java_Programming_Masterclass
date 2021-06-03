package com.company;

public class Main {

    public static void main(String[] args) {
        printDaysOfTheWeek(-1);
        printDaysOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);





    }

    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid Day");
                break;

        }
    }

        public static void printDaysOfTheWeek(int daynum)
        {
            if (daynum == 0 )
            {
                System.out.println("Sunday");
            }

            else if(daynum == 1)
            {
                System.out.println("Monday");
            }

            else if(daynum == 2)
            {
                System.out.println("Tuesday");
            }

            else if(daynum == 3)
            {
                System.out.println("Wednesday");
            }

            else if(daynum == 4)
            {
                System.out.println("Thursday");
            }

            else if(daynum == 5)
            {
                System.out.println("Friday");
            }

            else if(daynum == 6)
            {
                System.out.println("Saturday");
            }

            else
            {
                System.out.println("Invalid day");
            }

        }
    }

