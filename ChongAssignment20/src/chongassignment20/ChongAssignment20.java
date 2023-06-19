/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chongassignment20;

/**
 *
 * @author s201076119
 */

// import necessary libraries
import java.util.Scanner;

public class ChongAssignment20 {
    // initialize new scanner
    public static Scanner keyedInput = new Scanner(System.in);    
    
    // initialize colour for console (easier readability, user experience)   
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    
    // declare num1 and num2
    public static double num1, num2;
    
    // menu subroutine
    public static void menuOut() {
        System.out.println("---------------------------------");
        System.out.println("Welcome to the Calculationator!");
        System.out.println("Pleasec hoose 1 option:");
        System.out.println("1... Find C in pythagorean theorem, given a & b");
        System.out.println("2... Find F in F = ma equation, given m & a");
        System.out.println("3... Find modulus (n1 % n2)");
        System.out.println("4... Find E in E=mc^2 equation, given m");
        System.out.println("5... Find the log given base & value");
        System.out.println("6... Exit Program");
        System.out.println("Please choose 1 option:");
        System.out.println("---------------------------------");
    }
    
    // collect user input
    public static void userCollectData() {
        // ask for inputs in double form
        System.out.println("Please enter the first number");
        num1 = keyedInput.nextDouble();
        System.out.println("Please enter the second number (enter 0 if not needed)");
        num2 = keyedInput.nextDouble();
    }
    
    public static String formatString(double n1) {
        // this is a subroutine that I created so that I could format all numbers into strings that are rounded!
        // it is probably not necessary for this program, however I would do this in the future to save code
        n1 = Math.round(n1);
        String s = Double.toString(n1);
        return s;
    }
    
    public static void outputAnswer(String ans) {
        // subroutine to return nice-looking strings
        System.out.println(ANSI_YELLOW_BACKGROUND + "The answer is " + ans + ANSI_RESET);
        return;
    };
    
    public static double pythagTheorem(double a, double b) {
        // option 1
        // input into equation c^2 = a^2 + b^2
        double c = Math.pow(a,2) + Math.pow(b,2);
        c = Math.sqrt(c);
        return c;
    };
    
    public static double forceEquation(double m, double a) {
        // option 2
        // input into equation F = ma
        double f = m * a;
        return f;
    };
    
    public static double energyEquation(double m) {
        // option 3
        // input into equation E = mc^2
        double e = m * Math.pow(300000000,2);
        return e;
    };
    
    public static double modulus(double n1, double n2) {
        // option 4
        // modulus is finding the remainder after division
        double n3 = n1 % n2;
        return n3;
    };
    
    public static double logarithm(double n1, double n2) {
        // option 5
        // divide log of value by log of base
        double n3 = Math.log(n2) / Math.log(n1);
        return n3;
    };
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declare variables for choice, and the two numbers
        int choice;
        double num1, num2;
        boolean endProgram = false;
        
        // main program loop (make multiple calculations)
        do {
            // run menu subroutine
            menuOut();
            
            // ask user for their choice
            choice = keyedInput.nextInt();
            
            // exit program sequence
            // (not in switch statement because we ask for inputs before switch)
            if (choice == 6){
                endProgram = true;
                break;
            }
            
            // collect user input, store in public static (accessible everywhere)
            userCollectData();
            
            // depending on choice, run the correct subroutine
            switch(choice){
                case 1:
                    outputAnswer(formatString(pythagTheorem(ChongAssignment20.num1, ChongAssignment20.num2)));
                    break;
                case 2:
                    outputAnswer(formatString(forceEquation(ChongAssignment20.num1, ChongAssignment20.num2)));
                    break;
                case 3:
                    outputAnswer(formatString(modulus(ChongAssignment20.num1, ChongAssignment20.num2)));
                    break;
                case 4: 
                    outputAnswer(formatString(energyEquation(ChongAssignment20.num1)));
                    break;
                case 5:
                    outputAnswer(formatString(logarithm(ChongAssignment20.num1, ChongAssignment20.num2)));
                    break;
            }
        } while (endProgram==false);
        // exit message 
        System.out.println("Thank you for using The Calculationator! Goodbye!");
    }
}
