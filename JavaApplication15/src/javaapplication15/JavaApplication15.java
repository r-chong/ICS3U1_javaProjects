/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

// import necessary libraries (scanner)
import java.util.Scanner;

/**
 *
 * @author s201076119
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declare and initialize new scanner
        Scanner keyedInput = new Scanner (System.in);   
        
        // declare and initialize new array with bound 20
        // declare and initialize integer total
        int [ ] numbers = new int [20];
        int total = 0; 
        
        // ask user for input (10 integers)
        System.out.println("Enter ten integers:");
        
        // loop through to collect all numbers using for loop
        // start at 0 and increment by 1
        // upper bound is 19 because arrays are 0-indexed
        for (int i = 0; i <= 19; i = i + 1){
             numbers[i] = keyedInput.nextInt();}   
        
        // loop through to add all numbers to total
        // start at 0 and increment by 1
        // again, upper bound is 19 because arrays are 0-indexed
        for (int i = 0; i <= 19; i = i + 1){
             total = total + numbers[i];}   	
        
        // output context message for user
        // print out sum
        System.out.println("The sum of those numbers is:");
        System.out.println(total);
        
        //---------------------------------------------------------------------------------------------
        // PROGRAM 2
        
        String [ ] friends = new String [10]; 
        System.out.println("Enter the names of five friends:"); 
        for (int i = 0; i <= 4; i = i + 1)
        { 
             friends[i] = keyedInput.next(); 
        }    	  
        System.out.println("The second third and fourth names were:"); 
        System.out.println("Second: " + friends[1]); 
        System.out.println("Third: " + friends[2]);  
        System.out.println("Fourth: " + friends[3]); 
        // error?
    }
    
}
