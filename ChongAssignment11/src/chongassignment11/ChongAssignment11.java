/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chongassignment11;

// import necessary libraries
import java.util.Scanner;
/**
 *
 * @author Reese
 */
public class ChongAssignment11 {
    
    public static void main(String[] args) {
        String choice;
        
        // initialize new input scanner
        Scanner keyedInput = new Scanner(System.in);
        
        // Start game
        System.out.println("Choose Your Own Adventure: The Island");
        System.out.println("Type \"Play\" to start.");
        System.out.println("---------------------------");
        
        choice = keyedInput.nextLine();
        
        
        System.out.println("---------------------------");
        
        if (choice.equals("Play")) {
            System.out.println("You wake up on a deserted island with no memory of how you got there, and as you try to recall what happened, everything remains a mystery.\nYour phone is dead, you have no supplies except for the clothes on your back, and no way to communicate with the outside world.\nYou start to wonder how long you can survive and if anyone will ever find you...");
        }
        
    }
    
}
