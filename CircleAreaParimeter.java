package com.company.TaskDay3;

import java.util.Scanner;

public class CircleAreaParimeter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please press 1 for perimeter:: press 2 for area:");
        double num = scanner.nextDouble();
        double radius = 4, perimeterCircle = 0, areaCircle = 0;

        if (num == 1)
        {
            perimeterCircle = 2 * Math.PI * radius;
            System.out.println("Circle perimeter equal :: " + perimeterCircle);
        } else if (num == 2)
        {
            areaCircle = 2 * Math.PI * Math.pow(radius, 2);
            System.out.println("Circle perimeter equal :: " + areaCircle);
        }
    }
}
