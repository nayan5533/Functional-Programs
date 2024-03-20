/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.harmonicnumber;
import java.util.Scanner;

/**
 *
 * @author nayan
 */
public class HarmonicNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Input
        System.out.println("Enter Number of N: ");
        int N = scanner.nextInt();
        
        if (N == 0) {
            System.out.println("N should not be 0.");
            return;
        }
        
        double harmonic = 0;
        for (int i = 1; i <= N; i++) {
            harmonic += 1.0 / i;
        }
        
        System.out.println("The " + N + "th Harmonic Value is: " + harmonic);
        
    }
}
