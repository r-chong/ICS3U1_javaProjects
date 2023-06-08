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
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    
    // declare num1 and num2
    public static double num1, num2;

    // menu subroutine
    public static void menuOut() {
        System.out.println("---------------------------------");
        System.out.println("Welcome to the Calculationator!");
        System.out.println("Please choose 1 option:");
        System.out.println("1... Find");
        System.out.println("2... Find");
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
    
    // X subroutine
    public static void calculationA(double n1, double n2) {
        double area = 0.5 * n1 * n2;
        System.out.println(ANSI_GREEN_BACKGROUND + "\nThe area of the rhombus is " + area + "m^2" + ANSI_RESET);
    }
    
    /*ideas
Zero-product property
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
        System.out.println("Thank you for using The Area of Strange Shapes Program!");
    }
}
