/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chongassignment3;

import java.util.Scanner;
/**
 *
 * @author Reese Chong
 */
public class ChongAssignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyedInput = new Scanner(System.in);
        
        final double taxRate = 0.13;
        final String[] itemOptions = {"Peanuts","Treenuts","Walnuts"};
        final int numOfItems = itemOptions.length;
        final double[] itemPrice = {1.99, 0.99, 4.99};
        
        // If users wish to purchase fractions of a lb, then they are able to do so.
        double[] cartCount = new double[numOfItems];
        double subTotal = 0.0;
        double hstTotal;
        double grandTotal;
        
        System.out.println("Welcome to BulkBin! Feel free to browse our catalogue and add items to your cart.");
        System.out.println("...");
        
        //Loop through items in parallel arrays, take user input for # purchased
        for (int j = 0; j < numOfItems; j++) {
            String item = itemOptions[j];
            System.out.println("How many lbs of " + item + " would you like to add to your cart?");
            cartCount[j] = keyedInput.nextDouble();
            subTotal += cartCount[j] * itemPrice[j];
        }
        hstTotal = subTotal * taxRate;
        grandTotal = subTotal + hstTotal;
        
        System.out.println("---------------------------");        
        System.out.println("Your subtotal is: $" + subTotal);
        System.out.println("HST Total: $" + hstTotal);
        System.out.println("");
        System.out.println("Your grand total is: $" + grandTotal);
        System.out.println("Thank you for shopping at BulkBin!");
        System.out.println("---------------------------");
        
        // Future considerations: Rounding to 2 decimal points for financial values
    }
    
}
