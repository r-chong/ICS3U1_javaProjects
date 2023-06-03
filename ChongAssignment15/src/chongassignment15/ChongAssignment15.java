/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chongassignment15;

// import necessary libraries (scanner)
import java.util.Scanner;

/**
 *
 * @author Reese
 */
public class ChongAssignment15 {

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
        System.out.println("Enter twenty integers:");
        
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

        // -----------------------------------------------------------------------
        // program 2
        // -----------------------------------------------------------------------

        // declare and initialize string array with bound 5
        String [ ] friends = new String [5];    	
        // prompt user for 5 names
        System.out.println("Enter the names of five friends:"); 
        
        // loop through to collect all names using for loop
        // start at 0 and increment by 1
        // upper bound is 4 because arrays are 0-indexed 
        for (int i = 0; i <= 4; i = i + 1)
        { 
             friends[i] = keyedInput.next(); 
        }    	  
        
        // output 2nd, 3rd, 4th names
        System.out.println("The 2nd, 3rd and 4th names were:"); 
        System.out.println("Second: " + friends[1]); 
        System.out.println("Third: " + friends[2]); 
        System.out.println("Fourth: " + friends[3]); 

        // -----------------------------------------------------------------------
        // program 3
        // -----------------------------------------------------------------------
        
        // declare and initialize double array containing marks, totalProgram3, average
        // renamed "total" variable to totalProgram3 due to name conflict
        double [ ] marks = {33.7, 55.1, 32.8, 97.6, 41.6, 49.2,65.2, 44.6, 88.4}; 
        double totalProgram3 = 0; 
        double average; 
        
        // output to user showing them the marks
        System.out.println("These are the marks:"); 
        
        // two loops to loop through to collect all names using for loop
        // start at 0 and increment by 1
        // upper bound is 8 because arrays are 0-indexed 
        // first time is to output the individual marks
        // second time is to add individual marks to totalProgram3 variable
        for (int i = 0; i<=8; i= i + 1){ 
             System.out.println(marks[i]);} 
        for (int i = 0; i<=8; i= i + 1){ 
             totalProgram3 = totalProgram3 + marks[i];} 
        
        // divide total of marks by amount in existence
        // optimized using marks.length
        average = total/marks.length; 
        average = average * 10; 
        
        // multiply average by 10 as per math.round method
        // divide by 10 to get back to original decimal places
        average = Math.round(average); 
        average = average/10; 
        
        // print out context message and output average
        System.out.println("The average mark is:"); 
        System.out.println(average); 
    }
    
}
