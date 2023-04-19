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
        System.out.println(
                "Instructions: Read the story and choose from the story options in square brackets, eg. [Option 1] [Option 2]");
        System.out.println("Note: make sure to type the options case sensitive");
        System.out.println("Type \"Play\" to start.");
        System.out.println("---------------------------");

        choice = keyedInput.nextLine();

        System.out.println("---------------------------");

        // decision lvl 0 - search island or stay put
        if (choice.equals("Play")) {
            System.out.println(
                    "You wake up on a deserted island with no memory of how you got there, and as you try to recall what happened, everything remains a mystery.\nYour phone is dead, you have no supplies except for the clothes on your back, and no way to communicate with the outside world.\nYou start to wonder how long you can survive and if anyone will ever find you...");
            System.out.println("[Search Island] [Stay Put]");
            choice = keyedInput.nextLine();
            // decision lvl 1 - east or west
            if (choice.equals("Search Island")) {
                System.out.println("You decide to search the island. Move east or west?");
                System.out.println("[East] [West]");
                choice = keyedInput.nextLine();
                // decision lvl 2 - climb tree or swim in water
                if (choice.equals("East")) {
                    System.out.println(
                            "You decide to head towards the rocky cove, hoping to find some sense of where you are.\nAs you approach the cove, you notice the crashing waves against the palm trees and the sound of seagulls in the distance.\nThe sun is shining brightly, and the sand is warm beneath your feet.");
                    System.out.println("[Explore Water] [Climb Tree]");
                    choice = keyedInput.nextLine();
                    // lvl 3 end sequence
                    if (choice.equals("Explore Water")) {
                        System.out.println(
                                "You plunge into the green sea and come face-first with a bull shark. \nYou are promptly bitten and dragged to the bottom of the ocean. \nThe only trace of you left is your blood floating to the surface.");
                        // STORY ENDPOINT
                    }
                    // lvl 3 end sequence
                    else if (choice.equals("Climb Tree")) {
                        System.out.println(
                                "From the top of the 16-foot tree, you relish the breathtaking view of the expansive landscape below, feeling a sense of triumph and accomplishment. \nSuddenly, your footing slips, and you plummet down, unable to stop the fall. The impact is jarring, and your skull cracks open upon hitting the ground.");
                        // STORY ENDPOINT
                    }
                }
                // decision lvl 2 - eat berries or ants
                else if (choice.equals("West")) {
                    System.out.println(
                            "There is a forest area with some berry bushes and anthills.\nYou are very hungry and could not possibly wait any longer. What item in sight will you eat?");
                    System.out.println("[Eat Berries] [Eat Ants] ");
                    choice = keyedInput.nextLine();
                    // decision lvl 3 - check for poison or eat w/out checking
                    if (choice.equals("Eat Berries")) {
                        System.out.println("Test if it is edible or just take a bite?");
                        System.out.println("[Check For Poison] [Eat Without Checking]");
                        choice = keyedInput.nextLine();
                        // decision lvl 4 - drink water or vomit
                        if (choice.equals("Eat Without Checking")) {
                            System.out.println("After consuming the berries, your throat starts to constrict, and your skin erupts in hives. \nWith a sinking feeling, you realize you don't have an EpiPen with you. You die of suffocation.");
                            System.out.println("[Drink Water] [Vomit]");
                            choice = keyedInput.nextLine();
                            // decision lvl 5 - keep drinking or back out
                            if (choice.equals("Drink Water")) {
                                System.out.println("Your throat is parched, and the intense thirst pushes you to disregard the potential dangers of consuming saltwater from the rocky cove.\nYou reach the cove and gulp down the salty liquid, but to your dismay, it only worsens your condition.");
                                System.out.println("[Continue Drinking] [Back Out]");
                                choice = keyedInput.nextLine();
                                if (choice.equals("Continue Drinking")) {
                                System.out.println("You ignore everything that your body is telling you and continue to drink seawater.\nYou lean down to drink some more and your head is bitten off by a shark.");
                                // STORY ENDPOINT
                                }
                            } else if (choice.equals("Vomit")) {
                                System.out.println("You're too scared to drink saltwater, but indecision still eats up your time. \n As you pace around, your throat closes up and you suffocate");
                                // STORY ENDPOINT
                            }
                        } else if (choice.equals("Check For Poison")) {
                            System.out.println("You eat the berries and you have an allergic reaction. Thankfully, you didn't eat the entire bunch.\n You're still really hungry though. \nMaybe your body was just overreacting?");
                            System.out.println("[Eat Berries Anyway] [Throw Away]");
                            choice = keyedInput.nextLine();
                            // decision lvl 5
                            if (choice.equals("Eat Berries Anyway")) {
                                System.out.println("After consuming the berries, your throat starts to constrict, and your skin erupts in hives. \nWith a sinking feeling, you realize you don't have an EpiPen with you. You die of suffocation.");
                                // STORY ENDPOINT
                            } else if (choice.equals("Throw Away")) {
                                System.out.println("As you desperately try to rid yourself of the berries that caused your allergic reaction, you grab them and fling them off the edge of a towering cliff.\nHowever, in the midst of your haste, you lose your balance and tumble over the precipice as well.\nYour only hope is to survive the fall.");
                                System.out.println("[Fall Legs-First] [Fall Head-First]");
                                choice = keyedInput.nextLine();
                            }
                        }
                    } else if (choice.equals("Eat Ants")) {
                        System.out.println(
                                "You try to eat ants but a rabid anteater appears to defend its food. Over the next three days, you die of rabies");
                        // STORY ENDPOINT
                    }
                }
            } else if (choice.equals("Stay Put")) {
                System.out.println("You decide it is safer to stay in one spot. Now you try to get comfortable.");
                System.out.println("[Build Fire] [Sleep]");
                choice = keyedInput.nextLine();

                if (choice.equals("Build Fire")) {
                    System.out.println("");
                    System.out.println("[] []");
                    choice = keyedInput.nextLine();
                    if (choice.equals("")) {
                        System.out.println("");
                        System.out.println("[] []");
                        choice = keyedInput.nextLine();
                        if (choice.equals("")) {
                            System.out.println("");
                            System.out.println("[] []");
                            choice = keyedInput.nextLine();
                            if (choice.equals("")) {
                                System.out.println("");
                                System.out.println("[] []");
                                choice = keyedInput.nextLine();
                            } else if (choice.equals("")) {
                                System.out.println("");
                                System.out.println("[] []");
                                choice = keyedInput.nextLine();
                            }
                        } else if (choice.equals("")) {
                            System.out.println("");
                            System.out.println("[] []");
                            choice = keyedInput.nextLine();
                            if (choice.equals("")) {
                                System.out.println("");
                                System.out.println("[] []");
                                choice = keyedInput.nextLine();
                            } else if (choice.equals("")) {
                                System.out.println("");
                                System.out.println("[] []");
                                choice = keyedInput.nextLine();
                            }
                        }
                    } else if (choice.equals("Sleep")) {
                        System.out.println("");
                        System.out.println("[] []");
                        choice = keyedInput.nextLine();
                        if (choice.equals("")) {
                            System.out.println("");
                            System.out.println("[] []");
                            choice = keyedInput.nextLine();
                            if (choice.equals("")) {
                                System.out.println("");
                                System.out.println("[] []");
                                choice = keyedInput.nextLine();
                            } else if (choice.equals("")) {
                                System.out.println("");
                                System.out.println("[] []");
                                choice = keyedInput.nextLine();
                            }
                        } else if (choice.equals("")) {
                            System.out.println("");
                            System.out.println("[] []");
                            choice = keyedInput.nextLine();
                            if (choice.equals("")) {
                                System.out.println("");
                                System.out.println("[] []");
                                choice = keyedInput.nextLine();
                            } else if (choice.equals("")) {
                                System.out.println("");
                                System.out.println("[] []");
                                choice = keyedInput.nextLine();
                            }
                        }
                    }
                }
            } else {
                System.out.println(choice + " is not an option. Please reload and type \"Play\"");
            }
        }

    }

}
