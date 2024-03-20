/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stringpermutation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 *
 * @author nayan
 */
public class StringPermutation {

    public static void main(String[] args) {
        String input = "abc";
        
        String[] iterativePermutations = getPermutationsIterative(input);
        System.out.println("Iterative Permutations: " + Arrays.toString(iterativePermutations));
        
        String[] recursivePermutations = getPermutationsRecursive(input);
        System.out.println("Recursive Permutations: " + Arrays.toString(recursivePermutations));
        
        boolean areEqual = Arrays.equals(iterativePermutations, recursivePermutations);
        System.out.println("Are permutations equal? " + areEqual);
        
    }
    public static String[] getPermutationsIterative(String str) {
        List<String> permutations = new ArrayList<>();
        permutations.add("");
        for (char c : str.toCharArray()) {
            List<String> newPermutations = new ArrayList<>();
            for(String permutation : permutations) {
                for (int i = 0; i <= permutation.length(); i++) {
                    newPermutations.add(permutation.substring(0, i) + c + permutation.substring(i));
                }
            }
            permutations = newPermutations;
        }
        return permutations.toArray(new String[0]);
    }
    
    public static String[] getPermutationsRecursive(String str) {
        List<String> permutations = new ArrayList<>();
        getPermutationsRecursiveHelper("", str, permutations);
        return permutations.toArray(new String[0]);
    }
    
    private static void getPermutationsRecursiveHelper(String prefix, String remaining, List<String> permutations) {
        int n = remaining.length();
        if (n == 0){
            permutations.add(prefix);
        } else {
            for(int i = 0; i < n; i++) {
                getPermutationsRecursiveHelper(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1), permutations);
                
            }
        }
    }
}
