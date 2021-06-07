/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Vincent Smith
 */

import java.util.Scanner;

public class EX17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double A, W, R, H, BAC;
        int MF;

        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        MF = input.nextInt();

        if(MF==1)
            R = 0.73;
        else
            R=0.66;

        System.out.println("How many ounces of alcohol did you have? ");
        A = input.nextDouble();
        System.out.println("What is your weight, in pounds? ");
        W = input.nextDouble();
        System.out.println("How many hours has it been since your last drink");
        H = input.nextDouble();

        double b = (A*5.14);
        double a = (W*R);
        double c = (.015*H);
        double d = (b/a) - c;
        System.out.println("Your BAC is "+d+"");

        if (d<=.04)
            System.out.println("It is legal for you to drive ");
        else
            System.out.println("It is not legal for you to drive ");
    }



    }

