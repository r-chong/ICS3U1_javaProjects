/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chongassignment22;

// import necessary libraries
import java.util.Scanner;

public class ChongAssignment22 {
    // declare, initialize ansi console colours
    // allows differentiation between console message
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String DARK_GREEN = "\033[0;32;2m"; // GREEN
    
    // subroutine for valid input message
    // makes it easier to give user menu
    public static void userFeedbackOut(String val, String type) {
        System.out.println(DARK_GREEN +"Thank you!" + ANSI_RESET);
        System.out.println(ANSI_RESET + val + DARK_GREEN + " is a valid " + type + "." + ANSI_RESET); 
        System.out.println(DARK_GREEN + "Let's continue with the rest of the program..." + ANSI_RESET);
        System.out.println("" + ANSI_RESET);
    }
    
    // subroutine for invalid input message
    public static void invalidInputOut() {
        System.out.println(RED_BOLD + "Sorry, that is not valid input.");
        System.out.println("Please try again." + ANSI_RESET);
        System.out.println("");
    }
    
    public static void main(String[] args) {
        // declare, initialize new keyed input
        Scanner keyedInput = new Scanner(System.in);
        
        // declare, initialize variables
        String tempString;
        int value = 0; 
        boolean valid = false; 
        
        // string with len greater than 6
        // uses if statement to check length
        while (valid == false) {
            System.out.println("Please enter a string that is greater than 6 characters long:"); 
            tempString = keyedInput.nextLine();
            System.out.println(""); 
            
            if (tempString.length() > 6) {
                valid = true;
                userFeedbackOut(tempString,"string");
            } else {
                invalidInputOut();
            }
        }

        // lowercase A
        // uses if statement to see if contains "a"
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
        // uses if statement to check if number in range, as well as if it does NOT contain "z"
        valid = false;
        while (valid == false) {
            System.out.println("Please enter a string that is between 5 and 15 characters long, and does not contain the letter “z”"); 
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
        // uses try catch statement with if statement inside, to ensure no type error
        // check if number in inclusive range of 5, 500
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
        // uses try catch statement with if statement inside, to ensure no type error
        // check if value is less (noninclusive) than zero
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
                } else {
                    invalidInputOut();
                }
            } 
            catch(NumberFormatException e){ 
                invalidInputOut();
            }
        }

        // positive odd int
        // uses try catch statement with if statement inside, to ensure no type error
        // check if number more than zero, and if divided by 2 there is NOT a remainder of zero (therefore odd)
        valid = false;    
        while (valid == false) {
            System.out.println("Enter a positive, odd integer."); 
            tempString = keyedInput.nextLine();
            System.out.println(""); 

            try {
                value = Integer.parseInt(tempString); 

                if(value > 0 && !(value % 2 == 0)) {
                    valid = true;
                    break;
                } else {
                    invalidInputOut();
                }
            } 
            catch(NumberFormatException e){ 
                invalidInputOut();
            }
        }
        
        // goodbye message
        System.out.println("Congratulations! You're the greatest inputter ever!");
        System.out.println("Have a great rest of your day.");
    }
}
