/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.coupennumbers;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author nayan
 */
public class CoupenNumbers {

    public static int generateRandomNumber(int N){
        Random random = new Random();
        return random.nextInt(N) + 1;
    }
    public static int generateDistinctCoupons(int N){
        Set<Integer> couponSet = new HashSet<>();
        int randomCount = 0;
        
        while (couponSet.size() < N){
            int randomNumber = generateRandomNumber(N);
            couponSet.add(randomNumber);
            randomCount++;
        }
        return randomCount;
    }
    public static void main(String[] args){
        
        int N = 10;
        int randomCount = generateDistinctCoupons(N);
        
        System.out.println("Total random numbers needed to have all distinct numbers: " + randomCount);
    }
    }
