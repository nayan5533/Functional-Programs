/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quadratictest;
import java.util.Scanner;

/**
 *
 * @author nayan
 */
public class QuadraticTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a value of a, b, c in the quadratic equation ax^2 + bx + c: ");
        System.out.println("a: ");
        double a = scanner.nextDouble();
        System.out.println("b: ");
        double b = scanner.nextDouble();
        System.out.println("c: ");
        double c = scanner.nextDouble();
        
        double discriminant = b * b - 4 * a * c;
        
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Root 1 of X = " + root1);
            System.out.println("Root 2 of X = " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Root of x = " + root);
        } else {
            System.out.println("The equation has imaginary roots.");
        }
                
    }
}
