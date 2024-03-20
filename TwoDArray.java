/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.twodarray;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.OutputStreamWriter;

/**
 *
 * @author nayan
 */
public class TwoDArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of rows (M): ");
        int M = scanner.nextInt();
        System.out.println("Enter the number of columns (N): ");
        int N = scanner.nextInt();
        
        int[][] array = new int[M][N];
        
        System.out.println("Enter the elements of the 2D array: ");
        for(int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        
        pw.println("2D Array: ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++ ) {
                pw.print(array[i][j] + " ");
            }
            
            pw.println();
        }
        
        pw.flush();
        
        scanner.close();
    }
}
