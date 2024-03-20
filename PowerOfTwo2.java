/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poweroftwo2;

/**
 *
 * @author nayan
 */
public class PowerOfTwo2 {

    public static void main(String[] args) {
        
        if (args.length != 1){
            
            System.out.println(" Usage: java PowerOfTwo2 <N> ");
            return;
        }
        
        int N = Integer.parseInt(args[0]);
        if(N < 0 || N >= 31){
            
            System.out.println("N should be in the range 0 to 30.");
            return;
                
    }
    
    for (int i =0; i <= N; i++){
        long powerOf2 = (long) Math.pow(2, i);
        System.out.println("2^" + i + " = " + powerOf2);
        
  }
 }    
}
