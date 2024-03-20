/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorstest;
import java.util.Scanner;

/**
 *
 * @author nayan
 */
public class FactorsTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int N = scanner.nextInt();
        
        System.out.println("Prime factors of " + N + ": ");
        for(int i = 2; i * i <= N; i++) {
            while (N % i == 0) {
                System.out.println(i + " ");
                N /= i;
            }
        }
        if (N > 1){
            System.out.println(N);
        }
        
    }
}
