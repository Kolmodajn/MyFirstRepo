package com.company;

import com.sun.javafx.css.CalculatedValue;

import java.util.Random;

public abstract class Main {

    public static void main(String[] args)
    {
        int number1 = 0;
        int number2 = 0;
        Random ran = new Random();

        doStuff(number1, number2);
    }

    static void doStuff(int value1, int value2)
    {
            for (int i = 0; i < 10; i++)
            {
                value1 = randomizeValue();
                value2 = randomizeValue();
                calculateValue(value1, value2);
                printValues(value1, value2);
            }

    }

    static int calculateValue(int value1, int value2)
    {
        int sum = value1 + value2;

        return sum;
    }

    static int randomizeValue()
    {
        Random ran = new Random();

        return ran.nextInt(20);
    }

    static void printValues(int value1, int value2)
    {
        System.out.println("---------------------");
        System.out.println("The random numbers are " + value1 + " " + value2);
        System.out.println("The sum of the numbers is : " + calculateValue(value1, value2));
        System.out.println("---------------------");

    }
}


