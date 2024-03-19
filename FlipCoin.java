/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.flipcoin;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author nayan
 */
public class FlipCoin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Input
        System.out.println("Enter the number of times to flip the coin: ");
        int numberOfFlips = scanner.nextInt();
        
        if (numberOfFlips <= 0) {
            System.out.println("Please enter a positive integer for the number of flips.");
            return;
                    
        }
        
        //Now count
        int heads = 0;
        int tails = 0;
        Random random = new Random();
        
        //Logic
        for(int i = 0; i < numberOfFlips; i++){
            if (random.nextDouble() < 0.5) {
                heads++;
            } else {
                tails++;
            }
        }
        
        //Output
        double percentageHeads = (double) heads / numberOfFlips * 100;
        double percentageTails = (double) tails / numberOfFlips * 100;
        
        System.out.println("Percentage of Heads: " + percentageHeads + "%");
        System.out.println("Percentage of Tails: " + percentageTails + "%");
                
                
    }
}
