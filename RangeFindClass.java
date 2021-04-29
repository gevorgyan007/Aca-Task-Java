package com.company.TaskDay3;

import java.util.Scanner;

public class RangeFindClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int checkNumber = scanner.nextInt();

        if (checkNumber > 0 && checkNumber <100 )
        {
            System.out.prinln("", "Number is range (0,100)");
        } else if (checkNumber > 200 && checkNumber <300 )
        {
            System.out.prinln("", "Number is range (200,300)");
        } else if (checkNumber > 300 && checkNumber <500 )
        {
            System.out.prinln("", "Number is range (300,500)");
        }else{
            System.out.prinln("Number is range  out ");
        }
    }

}
