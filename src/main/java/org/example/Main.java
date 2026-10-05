package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter expense 1: ");
        double e1 = sc.nextDouble();

        System.out.print("Enter expense 2: ");
        double e2 = sc.nextDouble();

        System.out.print("Enter expense 3: ");
        double e3 = sc.nextDouble();

        double total = e1 + e2 + e3;

        System.out.println("Total Student Expense = " + total);
    }
}