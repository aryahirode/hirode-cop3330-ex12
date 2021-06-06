/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Arya Hirode
 */
package base;

import java.util.Scanner;

public class SimpleInterest {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        SimpleInterest myApp = new SimpleInterest();
        myApp.output();
    }

    private int principalPrompt() {
        System.out.print("Enter the principal: ");
        return Integer.parseInt(in.nextLine());
    }

    private double ratePrompt() {
        System.out.print("Enter the rate of interest: ");
        return Double.parseDouble(in.nextLine());
    }

    private int yearPrompt() {
        System.out.print("Enter the number of years: ");
        return Integer.parseInt(in.nextLine());
    }

    private double calculations(int p, double r, int t) {
        r /= 100;
        return p * (1 + (r * t));
    }

    private void output() {
        int p = principalPrompt();
        double r = ratePrompt();
        int t = yearPrompt();
        double simpleInterest = calculations(p, r, t);
        System.out.printf("After %d years at %.1f%%, the investment will be worth $%.2f.", t, r, simpleInterest);
    }
}
