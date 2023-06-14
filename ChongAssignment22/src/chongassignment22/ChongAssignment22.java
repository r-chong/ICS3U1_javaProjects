/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chongassignment22;

import java.util.Scanner;

/**
 *
 * @author s201076119
 */
public class ChongAssignment22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Stage 1: The user must enter a string that is greater than 6 characters long. (3)
        Stage 2: The user must enter a string that contains at least one lowercase “a”. (5)
        Stage 3: The user must enter a string that is between 5 and 15 characters long, and does not contain the letter “z”. (7)
        Stage 4: The user must enter an integer between 5 and 500. (3)
        Stage 5: The user must enter a negative integer. (4)
        Stage 6: The user must enter a positive, odd integer. (5)
        */
        Scanner keyedInput = new Scanner(System.in);
        
        String tempString;
        int value = 0; 
        boolean valid = false; 
        
        while (valid == false) {
            System.out.println("Please enter a string that is greater than 6 characters long:"); 
            tempString = keyedInput.nextLine();
            System.out.println(""); 
            
            if (tempString.length() >= 6) {
                valid = true;
                System.out.println("Thank you!");
                System.out.println(tempString + " is a valid string."); 
            }
        }
    System.out.println("Let's continue with the rest of the program..."); 
    System.out.println("..."); 
    System.out.println("..."); 
    
    valid = false;
    while (valid == false) {
            System.out.println("Please enter a string that contains at least one lowercase “a”"); 
            tempString = keyedInput.nextLine();
            System.out.println(""); 
            
            if (tempString.contains("a")) {
                valid = true;
                System.out.println("Thank you!");
                System.out.println(tempString + " is a valid string."); 
            }
        }
    
    System.out.println("Let's continue with the rest of the program..."); 
    System.out.println("..."); 
    System.out.println("..."); 
    
    valid = false;
    while (valid == false) {
            System.out.println("Please enter a string that string that is between 5 and 15 characters long, and does not contain the letter “z”"); 
            tempString = keyedInput.nextLine();
            int len = tempString.length();
            System.out.println(""); 
            
            if (len > 5 && len < 15 && !tempString.contains("z")) {
                valid = true;
                System.out.println("Thank you!");
                System.out.println(tempString + " is a valid string."); 
            }
        }
    
    System.out.println("Let's continue with the rest of the program..."); 
    System.out.println("..."); 
    System.out.println("..."); 
    
    valid = false;    
    while (valid == false) {
        System.out.println("Enter an integer between 5 and 500."); 
        tempString = keyedInput.nextLine();
        System.out.println(""); 

        try {
            value = Integer.parseInt(tempString);
            
            // can be modified to include 5, 500 with >= <=
            if(value > 5 && value < 500) {
                valid = true;
            }
        } 
        catch(NumberFormatException e){ 
            System.out.println("Sorry, that is not valid input."); 
            System.out.println("");
        }
        System.out.println("Thank you!");
        System.out.println(value + " is a valid integer."); 
        System.out.println("..."); 
        System.out.println("..."); 
        }
    
    System.out.println("Let's continue with the rest of the program..."); 
    System.out.println("..."); 
    System.out.println("..."); 
    
    valid = false;    
    while (valid == false) {
        System.out.println("Enter a negative integer:"); 
        tempString = keyedInput.nextLine();
        System.out.println(""); 

        try {
            // something is wrong here
            value = Integer.parseInt(tempString);
            
            if(value < 0) {
                valid = true;
            }
        } 
        catch(NumberFormatException e){ 
            System.out.println("Sorry, that is not valid input."); 
            System.out.println("");
        }
        System.out.println("Thank you!");
        System.out.println(value + " is a valid integer."); 
        System.out.println("..."); 
        System.out.println("..."); 
        }
    
    
    System.out.println("Let's continue with the rest of the program..."); 
    System.out.println("..."); 
    System.out.println("..."); 
    
    valid = false;    
    while (valid == false) {
        System.out.println("Enter a positive, odd integer."); 
        tempString = keyedInput.nextLine();
        System.out.println(""); 

        try {
            value = Integer.parseInt(tempString); 
            
            if(value > 0 && !(value % 2 == 0)) {
                valid = true;
            }
        } 
        catch(NumberFormatException e){ 
            System.out.println("Sorry, that is not valid input."); 
            System.out.println("");
        }
        System.out.println("Thank you!");
        System.out.println(value + " is a valid integer."); 
        System.out.println("..."); 
        System.out.println("..."); 
        }
    }
}