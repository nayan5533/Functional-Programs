/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.leapyear;
import java.util.Scanner;

/**
 *
 * @author nayan
 */
public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Input
        System.out.println("Enter Year: ");
        int year = scanner.nextInt();       
        //Logic
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        //Output
        if (isLeapYear) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
        
    }
}
