/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chongassignment6;

import java.util.Scanner;
import  java.text.DecimalFormat;
/**
 *
 * @author s201076119
 */
public class ChongAssignment6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declare and initialize new scanner
        Scanner keyedInput = new Scanner(System.in);
        
        // declare double variable for the amount spent at store
        // declare double variable for amount saved, percent saved, grandtotal
        // declare string variable for values to be formatted for output
        double amountSpent;
        double amountSaved;
        double percentSaved;
        double grandTotal;
        String formatPercentSaved;
        String formatAmountSaved;
        String formatGrandTotal;
        
        // declare and initialize the DecimalFormat
        // the format is "#0.00" because it allows a leading zero
        // when the input is "0" it will return "0.00"
        // tested with edge cases
        DecimalFormat df = new DecimalFormat("#0.00");
        
        // ask user for input of how much was spent at the store
        // save to amountSpent variable
        System.out.println("Our store is offering discounts for certain purchases.");
        System.out.println("Enter your amount spent to see if you qualify!");
        amountSpent = keyedInput.nextDouble();
        
        // decision-making block
        // calculate amount saved by customer
        // if between 0.01 and 50.00, 15%
        // if between 50.01 and 90.00, 20%
        // if between 90.01 and 130.00, 25%
        // if over 130, 35%
        // else return 0 (program fails if this is not implemented)
        if (amountSpent >= 0.01 && amountSpent < 50.00) {
            percentSaved = 0.15;
        }
        else if (amountSpent >= 50.01 && amountSpent < 90.00) {
            percentSaved = 0.20;
        }
        else if (amountSpent >= 90.01 && amountSpent < 130.00) {
            percentSaved = 0.25;
        }
        else if (amountSpent > 130) {
            percentSaved = 0.35;
        }
        else {
            percentSaved = 0;
        }
        
        // calculate amount of discount
        // it will be a fraction of the total amount
        amountSaved = amountSpent * percentSaved;
        
        // calculate final amount to be paid
        // subtract discount from total
        grandTotal = amountSpent - amountSaved;
        
        // convert each value to string
        // use number format method to set 2 decimal places using DecimalFormat method
        formatAmountSaved = df.format(amountSaved);
        formatGrandTotal = df.format(grandTotal);
        formatPercentSaved = df.format(percentSaved * 100);
        
        // print user outputs to console
        System.out.println("You saved " + formatPercentSaved + "% on your purchase.");
        System.out.println("Amount saved in dollars: $" + formatAmountSaved);
        System.out.println("Your final total is: $" + formatGrandTotal);
    }
    
}
