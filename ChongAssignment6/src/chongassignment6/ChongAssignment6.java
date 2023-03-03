/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chongassignment6;

import java.util.Scanner;
import  java.text.NumberFormat;
import java.util.Locale;

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
        // declare double variable for amount saved
        double amountSpent;
        double amountSaved;
        int percentSaved;
        double grandTotal;
        String formatAmountSaved;
        String formatGrandTotal;
        
        // declare and initialize the DecimalFormat 
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.CANADA);
        
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
            percentSaved = 15;
        }
        else if (amountSpent >= 50.01 && amountSpent < 90.00) {
            percentSaved = 20;
        }
        else if (amountSpent >= 90.01 && amountSpent < 130.00) {
            percentSaved = 25;
        }
        else if (amountSpent > 130) {
            percentSaved = 35;
        }
        else {
            percentSaved = 0;
        }
        
        // 
        amountSaved = amountSpent * (percentSaved/100);
        
        // calculate final amount to be paid
        grandTotal = amountSpent - amountSaved;
        
        // convert each value to string
        // use number format method to set 2 decimal places
        formatAmountSaved = currencyFormatter.format(amountSaved);
        formatGrandTotal = currencyFormatter.format(grandTotal);
        
        // print user outputs to console
        System.out.println("You saved " + Math.round(percentSaved) + "% on your purchase.");
        System.out.println("Amount saved in dollars: " + formatAmountSaved);
        System.out.println("Your final total is: " + formatGrandTotal);
    }
    
}
