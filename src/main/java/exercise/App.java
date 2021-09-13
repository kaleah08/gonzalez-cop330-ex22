package exercise;

/*UCF COP3330 Fall 2021 Assignment 1 Solution
Copyright 2021 Kaleah Gonzalez */

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        String firstString = input.next();
        int firstNumber = Integer.parseInt(firstString);

        System.out.print("Enter the second number: ");
        String secondString = input.next();
        int secondNumber = Integer.parseInt(secondString);

        System.out.print("Enter the third number: ");
        String thirdString = input.next();
        int thirdNumber = Integer.parseInt(thirdString);

        if( firstNumber > secondNumber && firstNumber > thirdNumber ){
            System.out.println("The largest number is " + firstNumber + ".");

        }
        else if( secondNumber > firstNumber && secondNumber > thirdNumber ){
            System.out.println("The largest number is " + secondNumber + ".");

        }
        else if( thirdNumber > firstNumber && thirdNumber > secondNumber ){
            System.out.println("The largest number is " + thirdNumber + ".");

        }
        return;

    }
}
