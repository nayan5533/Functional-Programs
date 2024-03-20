/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.threesumzero;
import java.util.*;

/**
 *
 * @author nayan
 */
public class ThreeSumZero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of integers: ");
        int N = scanner.nextInt();
        
        int[] array = new int[N];
        
        System.out.println("Enter the integers: ");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        List<List<Integer>> triplets = findTriplets(array);
        
        System.out.println("Number of distinct triplets: " + triplets.size());
        
        System.out.println("Distinct triplets: ");
        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }
        
        scanner.close();
    }
    
    public static List<List<Integer>> findTriplets(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> resultSet = new HashSet<>();
        
        for(int i = 0; i <nums.length - 2; i++){
            int left = i + 1, right = nums.length - 1;
            
            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    resultSet.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return new ArrayList<>(resultSet);
    }
}
