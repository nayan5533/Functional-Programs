/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamblerprg;
import java.util.Scanner;

/**
 *
 * @author nayan
 */
public class GamblerPrg {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the initial stake ($): ");
        int stake = scanner.nextInt();
        
        System.out.println("Enter the goal ($): ");
        int goal = scanner.nextInt();
        
        System.out.println("Enter the number of times to run experiment: ");
        int N = scanner.nextInt();
        
        int wins = 0;
        int totalBets = 0;
        
        for (int i = 0; i < N; i++) {
            int cash = stake;
            int bets = 0;
            
            while (cash > 0 && cash < goal) {
                bets++;
                if (Math.random() < 0.5){
                    cash++; 
                } else {
                    cash--;
                }
                
            }
            
            totalBets += bets;
            if (cash == goal){
                wins++;
            }
        }
        
        
        double winPercentage = (double) wins / N * 100;
        double avgBets = (double) totalBets / N;
        
        System.out.println("Number of Wins: " + wins);
        System.out.println("Percentage of Wins: " + winPercentage + "%");
        System.out.println("Avg number of bets: " + avgBets);
                
    }
}
