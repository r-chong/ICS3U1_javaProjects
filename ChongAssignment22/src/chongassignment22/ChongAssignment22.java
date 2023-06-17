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
    // declare, initialize ansi console colours
    // allows differentiation between console message
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String RED_BOLD = "\033[1;31m";    // RED
    
    // valid input message
    // subroutine makes it easier to give user menu
    public static void userFeedbackOut(String val, String type) {
        System.out.println("Thank you!");
        System.out.println(val + " is a valid " + type); 
        System.out.println("Let's continue with the rest of the program...");
        System.out.println("..."); 
        System.out.println("...");
    }
    
    // invalid input message
    public static void invalidInputOut() {
        System.out.println(RED_BOLD + "Sorry, that is not valid input.");
        System.out.println("Please try again." + ANSI_RESET);
        System.out.println("");
    }
    
    public static void main(String[] args) {
        /*
        Stage 1: The user must enter a string that is greater than 6 characters long. (3)
        Stage 2: The user must enter a string that contains at least one lowercase “a”. (5)
        Stage 3: The user must enter a string that is between 5 and 15 characters long, and does not contain the letter “z”. (7)
        Stage 4: The user must enter an integer between 5 and 500. (3)
        Stage 5: The user must enter a negative integer. (4)
        Stage 6: The user must enter a positive, odd integer. (5)
        */
        
        // declare, initialize new keyed input
        Scanner keyedInput = new Scanner(System.in);
        
        // declare, initialize variables
        String tempString;
        int value = 0; 
        boolean valid = false; 
        
        // string with len greater than 6
        while (valid == false) {
            System.out.println("Please enter a string that is greater than 6 characters long:"); 
            tempString = keyedInput.nextLine();
            System.out.println(""); 
            
            if (tempString.length() >= 6) {
                valid = true;
                userFeedbackOut(tempString,"string");
            } else {
                invalidInputOut();
            }
        }

        // lowercase A
        valid = false;
        while (valid == false) {
            System.out.println("Please enter a string that contains at least one lowercase “a”"); 
            tempString = keyedInput.nextLine();
            System.out.println(""); 

            if (tempString.contains("a")) {
                valid = true;
                userFeedbackOut(tempString,"string");
            } else {
                invalidInputOut();
            }
        }

        // string between 5, 15 chars without z
        valid = false;
        while (valid == false) {
            System.out.println("Please enter a string that string that is between 5 and 15 characters long, and does not contain the letter “z”"); 
            tempString = keyedInput.nextLine();
            int len = tempString.length();
            System.out.println(""); 

            if (len >= 5 && len <= 15 && !tempString.contains("z")) {
                valid = true;
                userFeedbackOut(tempString,"string");
            } else {
                invalidInputOut();
            }
        }

        // int between 5, 500
        valid = false;    
        while (valid == false) {
            System.out.println("Enter an integer between 5 and 500."); 
            tempString = keyedInput.nextLine();
            System.out.println(""); 

            try {
                value = Integer.parseInt(tempString);

                if(value >= 5 && value <= 500) {
                    valid = true;
                    userFeedbackOut(Integer.toString(value),"integer");
                } else {
                    invalidInputOut();
                }
            } 
            catch(NumberFormatException e){ 
                invalidInputOut();
            }
        }

        // negative int
        valid = false;    
        while (valid == false) {
            System.out.println("Enter a negative integer:"); 
            tempString = keyedInput.nextLine();
            System.out.println(""); 

            try {
                value = Integer.parseInt(tempString);

                if(value < 0) {
                    valid = true;
                    userFeedbackOut(Integer.toString(value),"integer");
                }
            } 
            catch(NumberFormatException e){ 
                invalidInputOut();
            }
        }

        // positive odd int
        valid = false;    
        while (valid == false) {
            System.out.println("Enter a positive, odd integer."); 
            tempString = keyedInput.nextLine();
            System.out.println(""); 

            try {
                value = Integer.parseInt(tempString); 

                if(value > 0 && !(value % 2 == 0)) {
                    valid = true;
                    userFeedbackOut(Integer.toString(value),"integer");
                }
            } 
            catch(NumberFormatException e){ 
                invalidInputOut();
            }
        }
        
        // goodbye message
        System.out.println("Program over!");
        System.out.println("Goodbye");
    }
}
