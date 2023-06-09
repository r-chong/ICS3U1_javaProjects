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
        System.out.println("Please choose 1 option:");
        System.out.println("1... Find side C in pythagorean theorem");
        System.out.println("2... Find F in F = ma");
        System.out.println("3... Find");
        System.out.println("4... Find");
        System.out.println("5... Find");
        System.out.println("6... Exit Program");
        System.out.println("Please choose 1 option:");
        System.out.println("---------------------------------");
    }
    
    // collect user input
    public static void userCollectData() {
        // ask for inputs in double form
        System.out.println("Please enter the first number");
        num1 = keyedInput.nextDouble();
        System.out.println("Please enter the second number");
        num2 = keyedInput.nextDouble();
    }
    
    public static void outputAnswer(String ans) {
        System.out.println(ANSI_YELLOW_BACKGROUND + "The answer is " + ans + ANSI_RESET);
        return;
    };
    
    public static String formatString(double n1) {
        n1 = Math.round(n1);
        String s = Double.toString(n1);
        return s;
    }
    
    public static double pythagTheorem(double n1, double n2) {
        // c^2 = a^2 + b^2
        double n3 = Math.pow(n1,2) + Math.pow(n2,2);
        n3 = Math.sqrt(n3);
        return n3;
    };
    
    public static double forceEquation(double m, double a) {
        // F = ma
        double f = m * a;
        return f;
    };
    
    public static double energyEquation(double m, double c) {
        // E = mc^2
        double e = m * Math.pow(c,2);
        return e;
    };
    
    public static double modulusEquation(double n1, double n2) {
        // E = mc^2
        double n3 = n1 % n2;
        return n3;
    };
    
    /*ideas
Difference of two squares
Perfect square trinomial
Sum of interior angles of a polygon
Pythagorean theorem
    */
    
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
            menuOut();

            // ask user for their choice
            choice = keyedInput.nextInt();
            
            // exit program sequence
            // (not in switch statement because we ask for inputs before switch)
            if (choice == 6){
                endProgram = true;
                break;
            }
            
            userCollectData();
            
            // depending on choice, run the correct subroutine
            switch(choice){
                case 1:
                    outputAnswer(formatString(pythagTheorem(ChongAssignment20.num1, ChongAssignment20.num2)));
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4: 
                    break;
                case 5:
                    break;
            }
        } while (endProgram==false);
        System.out.println("Thank you for using The Calculationator Program!");
    }
}
