/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chongassignment12;

// import necessary libraries
import java.util.Scanner;
/**
 *
 * @author Reese
 */
public class ChongAssignment12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // initialize new input scanner
        Scanner keyedInput = new Scanner(System.in);

        // initialize and declare the user's choice of count
        int choice = 0;

        // start printed menu
        System.out.println("---Cool Counting Program---");
        System.out.println("");

        System.out.println("Please enter your choice:");
        System.out.println("1... Count from 0 to 10 by 1");
        System.out.println("2... Count from 100 to 0 by 10");
        System.out.println("3... Count from 50 to 500 by 50");
        System.out.println("4... Count from 6000 to 1000 by 1000");
        System.out.println("Please enter your choice:");

        // save user input to choice variable
        choice = keyedInput.nextInt();

        // print space and menu divider
        System.out.println("");
        System.out.println("-------------------------");

        // if choice 1, remind user of their choice
        // perform task by executing for loop
        // initial value 0,final value 10,increment 1
        if (choice == 1) {
                System.out.println("You have chosen to count from 0 to 10 by 1");
                for (int i = 0; i <= 10; i = i + 1) {
                        System.out.println(i);
                }
        }
        
        // if choice 2, remind user of their choice
        // perform task by executing for loop
        // initial value 100,final value 0,increment 10
        else if (choice == 2) {
                System.out.println("You have chosen to count from 100 to 0 by 10");
                for (int i = 100; i >= 0; i = i - 10) {
                        System.out.println(i);
                }
        }
        
        // if choice 3, remind user of their choice
        // perform task by executing for loop
        // initial value 50,final value 500,increment 50
        else if (choice == 3) {
                System.out.println("You have chosen to count from 50 to 500 by 50");
                for (int i = 50; i <= 500; i = i + 50) {
                        System.out.println(i);
                }
        }
        
        // if choice 4, remind user of their choice
        // perform task by executing for loop
        // initial value 6000,final value 1000,increment 1000
        else if (choice == 4) {
                System.out.println("You have chosen to count from 6000 to 1000 by 1000");
                for (int i = 6000; i >= 1000; i = i - 1000) {
                        System.out.println(i);
                }
        }
    }
}
