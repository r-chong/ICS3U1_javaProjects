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
        // boolean for exit, set as false
        int choice;
        int n;
        int output;
        int range;     
        boolean exit = false;
        
        // initialize new scanner
        Scanner keyedInput = new Scanner(System.in);

        // do while loop to make the program only run when exit is false
        do {            
            // give text menu
            System.out.println("------------------");
            System.out.println("Welcome to the Power Program!");
            System.out.println("");
            System.out.println("Please choose 1 option:");
            System.out.println("1... Find the value of a number squared (5^2 = 5 x 5)");
            System.out.println("2... Find the value of a number cubed (7^3 = 7 x 7 x 7)");
            System.out.println("3... Find the value of a number to any power (2^5 = 2 x 2 x 2 x 2 x 2)");
            System.out.println("4... Exit");
            System.out.println("Please choose 1 option:");
            System.out.println("------------------");

            // ask user for their choice
            choice = keyedInput.nextInt();

            // print space and menu divider
            System.out.println("");
            System.out.println("------------------");
  
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
                System.out.println("Your new squared number is:");
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
                System.out.println("Your new cubed number is:");
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
                System.out.println("Your new number is:");
                System.out.println(output);
            }
            // option 4... exit program
            else if (choice == 4) {
                System.out.println("Thank you for using Power Program (TM)");
                System.out.println("If you ever need to do repeated addition, we are there for you.");
                exit = true;
            }

            // if user inputs invalid integer
            else {
              System.out.println("Sorry, that's not an option");  
            };
        } while (!exit);
    }
    
}
