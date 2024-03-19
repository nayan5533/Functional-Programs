/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;
import java.util.Scanner;
/**
 *
 * @author nayan
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Input
        System.out.println("Enter name: ");
        String userName = scanner.nextLine();
        
        //Logic
        if (userName.length() < 3){
            System.out.println("Username should have a minimum of 3 characters.");
        } else {
            
            //Replace
            String template = "Hello <<userName>>, How are you?";
            String result = template.replace("<<userName>>", userName);
            
            //Output
            System.out.println("Output: " + result);



            
        }
    }
}
