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
        System.out.println("Choose Your Own Adventure: \"The Island\"");
        System.out.println("Instructions: Read the story and choose from the story options in square brackets, eg. [Option 1] [Option 2]");
        System.out.println("Note: make sure to type the options case sensitive");
        System.out.println("Type \"Play\" to start.");
        System.out.println("---------------------------");
        
        choice = keyedInput.nextLine();  
        
        System.out.println("---------------------------");
        
        // decision 0 - start game
        // else, prompt user to play
        if (choice.equals("Play")) {
            System.out.println("You wake up on a deserted island with no memory of how you got there, and as you try to recall what happened, everything remains a mystery.\nYour phone is dead, you have no supplies except for the clothes on your back, and no way to communicate with the outside world.\nYou start to wonder how long you can survive and if anyone will ever find you...");
            System.out.println("[Search Island] [Stay Put]");
            choice = keyedInput.nextLine();
            
            // decision 1 - east or west
            if (choice.equals("Search Island")) {
                System.out.println("You decide to search the island. Move east or west?");
                System.out.println("[East] [West]");
                
                choice = keyedInput.nextLine();
                
                // decision lvl 2 - climb tree or swim in water
                if (choice.equals("East")) {
                    System.out.println("You decide to head towards the rocky cove, hoping to find some sense of where you are.\nAs you approach the cove, you notice the crashing waves against the palm trees and the sound of seagulls in the distance.\nThe sun is shining brightly, and the sand is warm beneath your feet.");
                    System.out.println("[Explore Water] [Climb Tree]");

                    choice = keyedInput.nextLine();
                    if (choice.equals("Explore Water")) {
                        System.out.println("You plunge into the green sea and come face-first with a bull shark. \nYou are promptly bitten and dragged to the bottom of the ocean. \nThe only trace of you left is your blood floating to the surface.");
                        // STORY ENDPOINT
                    }
                    else if (choice.equals("Climb Tree")) {
                        System.out.println("You climb to the top of a 16ft tree before falling and cracking your skull open");
                        // STORY ENDPOINT
                    }
                }
                // decision lvl 2 - eat berries or ants
                else if (choice.equals("West")) {
                    System.out.println("There is a forest area with some berry bushes and anthills.\nYou are very hungry and could not possibly wait any longer. What item in sight will you eat?");
                    System.out.println("[Eat Berries] [Eat Ants] ");
                    
                    choice = keyedInput.nextLine();
                    
                    // decision lvl 3 - check for poison or eat w/out checking
                    if (choice.equals("Eat Berries")) {
                        System.out.println("Test if it is edible or just take a bite?");
                        System.out.println("[Check For Poison] [Eat Without Checking]");
                        
                        choice = keyedInput.nextLine();
                        
                        if (choice.equals("Check For Poison")) {
                            System.out.println("You have an allergic reaction.");
                        } else if(choice.equals("Eat Without Checking")) {
                            System.out.println("You eat the berries and you have an allergic reaction. ");
                        }
                        System.out.println("You try to eat ants but a rabid anteater appears to defend its food. Over the next three days, you die of rabies");
                    }
                    else if (choice.equals("Eat Ants")){
                        System.out.println("You try to eat ants but a rabid anteater appears to defend its food. Over the next three days, you die of rabies");
                        // STORY ENDPOINT
                    }
                }
            } else if (choice.equals("Stay Put")) {
                System.out.println("You decide it is safer to stay in one spot. Now you try to get comfortable.");
                System.out.println("[Build Fire] [Sleep]");
                
                choice = keyedInput.nextLine();
        } else {
            System.out.println(choice + " is not an option. Please reload and type \"Play\"");
        }
        }
        
    }
    
}
