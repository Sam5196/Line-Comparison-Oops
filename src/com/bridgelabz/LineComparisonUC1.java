package com.bridgelabz;
import java.util.Scanner;

public class LineComparisonUC1 {
    static void lengthValue() {

        int x1, x2, y1, y2;
        System.out.print("Enter Value :");
        Scanner scanner = new Scanner(System.in);
        x1 = scanner.nextInt();
        x2 = scanner.nextInt();
        y1 = scanner.nextInt();
        y2 = scanner.nextInt();

        double length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length :" + length);

    }

    public static void main(String[] args) {
        lengthValue();
    }

}
