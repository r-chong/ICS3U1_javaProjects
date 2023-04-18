/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chongassignment14;

// import necessary libraries
import java.util.Scanner;

/**
 *
 * @author s201076119
 */
public class ChongAssignment14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // initialize integer variables
        int choice;
        int n;
        int output;
        int range;        
        
        // initialize new scanner
        Scanner keyedInput = new Scanner(System.in);

        // give text menu
        System.out.println("Welcome to the Power Program!");
        System.out.println("");
        System.out.println("Please choose 1 option:");
        System.out.println("1... Find the value of a number squared");
        System.out.println("2... Find the value of a number cubed");
        System.out.println("3... Find the value of a number to any power");
        System.out.println("Please choose 1 option:");
        System.out.println("------------------");
        
        // ask user for their choice
        choice = keyedInput.nextInt();
        
        // print space and menu divider
        System.out.println("");
        System.out.println("-------------------------");
        
        // option 1.. squaring
        if (choice == 1) {
            // ask for integer n that is to be squared
            System.out.println("What number would you like to square?");
            n = keyedInput.nextInt();
            output = n;
            
            // multiply n by itself twice
            for (int i = 0; i < 1; i++) {
                output *= n;
            }
            // output squared result
            System.out.println(output);
        }
        
        // option 2.. cubing
        else if (choice == 2) {
            // ask for integer n that is to be cubed
            System.out.println("What number would you like to cube?");
            n = keyedInput.nextInt();
            output = n;
            
            // multiply n by itself three times
            for (int i = 0; i < 2; i++) {
                output *= n;
            }
            // output cubed result
            System.out.println(output);
        }
        
        // option 3.. custom power
        else if (choice == 3) {
            // ask for integer n that is to be multipled
            System.out.println("What number would you like to multiply?");
            n = keyedInput.nextInt();
            output = n;
            
            // ask for integer for the number of times multiplied together
            System.out.println("What power would you like to raise it to?");
            range = keyedInput.nextInt();
            
            // multiply n by itself "range -1 " times
            // it is range - 1 because for loops are 0-indexed
            for (int i = 0; i < (range-1); i++) {
                output *= n;
            }
            // output multiplied result
            System.out.println(output);
        }
        
        // if user inputs invalid integer
        else {
          System.out.println("Sorry, that's not an option");  
        };
    }
    
}
