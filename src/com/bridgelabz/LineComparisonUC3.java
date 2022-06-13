package com.bridgelabz;
import java.util.Scanner;

public class LineComparisonUC3 {
    static void compareLine() {

        int x1, x2, y1, y2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Line :");
        x1 = sc.nextInt();
        x2 = sc.nextInt();
        y1 = sc.nextInt();
        y2 = sc.nextInt();

        double length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length of Line1: " + length1);

        System.out.print("Enter Second Line :");
        x1 = sc.nextInt();
        x2 = sc.nextInt();
        y1 = sc.nextInt();
        y2 = sc.nextInt();

        double length2 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length of Line1: " + length2);

        if (length1 == length2)
            System.out.println("Line1 and Line2 are equal");
        else if (length1 > length2)
            System.out.println("Length of Line1 is greater than Line2");
        else
            System.out.println("Length of Line2 is greater than Line1");
    }

    public static void main(String[] args) {
        compareLine();
    }
}