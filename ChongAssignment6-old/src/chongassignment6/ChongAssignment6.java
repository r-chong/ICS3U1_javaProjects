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
        // declare double variable for amount saved
        double amountSpent;
        double amountSaved;
        double grandTotal;
        String formatAmountSaved;
        String formatGrandTotal;
        
        // declare and initialize the DecimalFormat 
        DecimalFormat df = new DecimalFormat("#.00");
        
        System.out.println("Please enter the amount spent at the store");
        amountSpent = keyedInput.nextDouble();
        
        if (amountSpent >= 0.01 && amountSpent < 50.00) {
            amountSaved = amountSpent * 0.15;
        }
        else if (amountSpent >= 50.01 && amountSpent < 90.00) {
            amountSaved = amountSpent * 0.20;
        }
        else if (amountSpent >= 90.01 && amountSpent < 130.00) {
            amountSaved = amountSpent * 0.25;
        }
        else if (amountSpent > 130) {
            amountSaved = amountSpent * 0.35;
        }
        else {
            amountSaved = 0;
        }
        grandTotal = amountSpent - amountSpent;
        
        formatAmountSaved = Double.toString(amountSaved);
        formatAmountSaved = df.format(formatAmountSaved);
        formatGrandTotal = Double.toString(grandTotal);
        formatGrandTotal = df.format(formatGrandTotal); 
        
        System.out.println("Your amount saved is: " + formatAmountSaved);
        System.out.println("Your final total is: " + formatGrandTotal);
    }
    
}
