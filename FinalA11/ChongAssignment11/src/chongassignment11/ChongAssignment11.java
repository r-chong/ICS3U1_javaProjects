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
        // declare and initialize string variable called choice
        // will be used throughout the game so it is not constant
        String choice;

        // initialize new input scanner
        Scanner keyedInput = new Scanner(System.in);

        // Start game
        // Give user text menu
        // Make sure it is clear to the user what information needs to be entered to make a decision (instructions)
        System.out.println("Choose Your Own Adventure: \"The Island\"");
        System.out.println(
                "Instructions: Read the story and choose from the story options in square brackets, eg. [Option 1] [Option 2]");
        System.out.println("Note: the options are case insensitive.");
        System.out.println("Type \"Play\" to start.");
        System.out.println("---------------------------");

        // set choice as next line
        choice = keyedInput.nextLine();

        // divider
        System.out.println("---------------------------");

        // decision lvl 0 - search island or stay put
        if (choice.equalsIgnoreCase("Play")) {
            System.out.println(
                    "You wake up on a deserted island with no memory of how you got there, and as you try to recall what happened, everything remains a mystery.\nYour phone is dead, you have no supplies except for the clothes on your back, and no way to communicate with the outside world.\nYou start to wonder how long you can survive and if anyone will ever find you...");
            System.out.println("[Search Island] [Stay Put]");
            choice = keyedInput.nextLine();
            // decision lvl 1 - east or west
            if (choice.equalsIgnoreCase("Search Island")) {
                System.out.println("You decide to search the island. Move east or west?");
                System.out.println("[East] [West]");
                choice = keyedInput.nextLine();
                // decision lvl 2 - climb tree or swim in water
                if (choice.equalsIgnoreCase("East")) {
                    System.out.println(
                            "You decide to head towards the rocky cove, hoping to find some sense of where you are.\nAs you approach the cove, you notice the crashing waves against the palm trees and the sound of seagulls in the distance.\nThe sun is shining brightly, and the sand is warm beneath your feet.");
                    System.out.println("[Explore Water] [Climb Tree]");
                    choice = keyedInput.nextLine();
                    // decision lvl 3 - explore water
                    if (choice.equalsIgnoreCase("Explore Water")) {
                        System.out.println(
                                "You plunge into the green sea and come face-first with a bull shark. \nYou are promptly bitten and dragged to the bottom of the ocean. \nThe only trace of you left is your blood floating to the surface.");
                        // STORY ENDPOINT
                    }
                    // else for decision lvl 3 - climb tree
                    else if (choice.equalsIgnoreCase("Climb Tree")) {
                        System.out.println(
                                "From the top of the 16-foot tree, you relish the breathtaking view of the expansive landscape below, feeling a sense of triumph and accomplishment. \nSuddenly, your footing slips, and you plummet down, unable to stop the fall. The impact is jarring, and your skull cracks open upon hitting the ground.");
                        // STORY ENDPOINT
                    }
                }
                // decision lvl 2 - eat berries or ants
                else if (choice.equalsIgnoreCase("West")) {
                    System.out.println(
                            "There is a forest area with some berry bushes and anthills.\nYou are very hungry and could not possibly wait any longer. What item in sight will you eat?");
                    System.out.println("[Eat Berries] [Eat Ants] ");
                    choice = keyedInput.nextLine();
                    // decision lvl 3 - check for poison or eat w/out checking
                    if (choice.equalsIgnoreCase("Eat Berries")) {
                        System.out.println("Test if it is edible or just take a bite?");
                        System.out.println("[Check For Poison] [Eat Without Checking]");
                        choice = keyedInput.nextLine();
                        // decision lvl 4 - drink water or vomit
                        if (choice.equalsIgnoreCase("Eat Without Checking")) {
                            System.out.println("After consuming the berries, your throat starts to constrict, and your skin erupts in hives.\nWith your problem-solving mind, you immediately try to stop the symptoms from getting worse.");
                            System.out.println("[Drink Water] [Vomit]");
                            choice = keyedInput.nextLine();
                            // decision lvl 5 - keep drinking or back out
                            if (choice.equalsIgnoreCase("Drink Water")) {
                                System.out.println("Your throat is parched, and the intense thirst pushes you to disregard the potential dangers of consuming saltwater from the rocky cove.\nYou reach the cove and gulp down the salty liquid, but to your dismay, it only worsens your condition.");
                                System.out.println("[Continue Drinking] [Back Out]");
                                choice = keyedInput.nextLine();
                                if (choice.equalsIgnoreCase("Continue Drinking")) {
                                System.out.println("You ignore everything that your body is telling you and continue to drink seawater.\nYou lean down to drink some more and your head is bitten off by a shark.\nAt least your throat won't bother you anymore..");
                                // STORY ENDPOINT
                                }
                            } else if (choice.equalsIgnoreCase("Vomit")) {
                                System.out.println("You're too scared to drink saltwater, but indecision still eats up your time. \n As you pace around, your throat closes up and you suffocate");
                                // STORY ENDPOINT
                            }
                        } else if (choice.equalsIgnoreCase("Check For Poison")) {
                            System.out.println("You eat the berries and you have an allergic reaction. Thankfully, you didn't eat the entire bunch.\n You're still really hungry though. \nMaybe your body was just overreacting?");
                            System.out.println("[Eat Berries Anyway] [Throw Away]");
                            choice = keyedInput.nextLine();
                            // decision lvl 5 - eat berries
                            if (choice.equalsIgnoreCase("Eat Berries Anyway")) {
                                System.out.println("After consuming the berries, your throat starts to constrict, and your skin erupts in hives. \nWith a sinking feeling, you realize you don't have an EpiPen with you.\nYou die of suffocation.");
                                // STORY ENDPOINT
                            // else for decision lvl 5 - throw away
                            } else if (choice.equalsIgnoreCase("Throw Away")) {
                                System.out.println("As you desperately try to rid yourself of the berries that caused your allergic reaction, you grab them and fling them off the edge of a towering cliff.\nHowever, in the midst of your haste, you lose your balance and tumble over the precipice as well.\nYour only hope is to survive the fall.");
                                System.out.println("[Fall Legs-First] [Fall Head-First]");
                                choice = keyedInput.nextLine();
                                // decision lvl 6  -fall head first
                                if (choice.equalsIgnoreCase("Fall Head-First")) {
                                    System.out.println("You fall head-first, breaking your neck and suffering instant death.\nPerhaps this is a better way to go.");
                                    // STORY ENDPOINT
                                // else for decision lvl 6  -fall legs first
                                } else if (choice.equalsIgnoreCase("Fall Legs-First")) {
                                    System.out.println("You remember reading that you'd have a greater chance of survival if you fall legs-first. \nYou break both legs on impact but survive.");
                                    System.out.println("[Give Up] [Crawl Around]");
                                    choice = keyedInput.nextLine();
                                    // decision lvl 6 - give up
                                    if (choice.equalsIgnoreCase("Give Up")) {
                                        System.out.println("With shattered legs, you resign to your fate. You don't have a chance out there with two broken legs.\nNature runs its course, and three days later, you die of lack of water.");
                                        // STORY ENDPOINT
                                    // else for decision lvl 6 - crawl around
                                    } else if (choice.equalsIgnoreCase("Crawl Around")) {
                                        System.out.println("It hurts to move your legs, so you look for things on the ground that may help. Look left or right?");
                                        System.out.println("[Look Left] [Look Right]");
                                        choice = keyedInput.nextLine();
                                        // decision lvl 7 - look left
                                        if (choice.equalsIgnoreCase("Look Left")) {
                                            System.out.println("You see a mirror on the ground. Grab it?");
                                            System.out.println("[Grab] [Don't Grab]");
                                            choice = keyedInput.nextLine();
                                            // decision lvl 8 - grab
                                            if (choice.equalsIgnoreCase("Grab")) {
                                                System.out.println("Backing the sea, you grab the mirror and dust it off. Gazing into the reflection, you see a boat in the background. \nWith the mirror, you may be able to signal them.");
                                                System.out.println("[Signal] [Don't Signal]");
                                                choice = keyedInput.nextLine();
                                                // decision lvl 9 - signal
                                                if (choice.equalsIgnoreCase("Signal")) {
                                                    System.out.println("SOS!! You signal the boat, who arrives on the island.\nCrawling to the shore, you are lifted up onto the boat where a kindly sailor speeds you to the nearest hospital.\nYou remember how didn't give up back at the cliff and spend the rest of your days as a keynote speaker about perseverence.");
                                                    // STORY ENDPOINT
                                                // else for decision lvl 9 - don't signal
                                                } else if (choice.equalsIgnoreCase("Don't Signal")) {
                                                    System.out.println("In your indecision, you wait too long to signal the boat as it zooms past. \nYou lose all hope of leaving the island and die of a broken heart.");
                                                    // STORY ENDPOINT
                                                }
                                            // decision lvl 8 - don't grab
                                            } else if (choice.equalsIgnoreCase("Don't Grab")) {
                                                System.out.println("You already have two broken legs, you need your hands to crawl around, you decide. \nYou don't want to hold anything as you crawl around.");
                                                System.out.println("[Crawl Back] [Give Up]");
                                                choice = keyedInput.nextLine();
                                                // decision lvl 9 - crawl back
                                                if (choice.equalsIgnoreCase("Crawl Back")) {
                                                    System.out.println("You crawl back and see some wood with some mushrooms on it. Use to get around or try to eat the mushrooms??");
                                                    System.out.println("[Use As Splint] [Try To Eat]");
                                                    choice = keyedInput.nextLine();
                                                    // decision lvl 10 - use as splint
                                                    if (choice.equalsIgnoreCase("Use As Splint")) {
                                                        System.out.println("You use the piece of wood as a splint, however you quickly feel an infection. As the infection spreads, your body weakens, and you become delirious. In the end, your organs fail, and you take your last breath, succumbing to the infection.");
                                                        // STORY ENDPOINT
                                                    // else for decision lvl 10 - try to eat
                                                    } else if (choice.equalsIgnoreCase("Try To Eat")) {
                                                        System.out.println("You eat the fungus off the wood because you make bad decisions. Your throat swells up and you die.");
                                                        // STORY ENDPOINT
                                                    }
                                                // else for decision lvl 9 - give up
                                                } else if (choice.equalsIgnoreCase("Give Up")) {
                                                    System.out.println("You don't want to do anything anymore. You die of laziness");
                                                    // STORY ENDPOINT
                                                }
                                            }
                                        // else for decision lvl 7 - look right
                                        } else if (choice.equalsIgnoreCase("Look Right")) {
                                            System.out.println("You see a piece of wood with fungus. Use as splint or try to eat?");
                                            System.out.println("[Use As Splint] [Try To Eat]");
                                            choice = keyedInput.nextLine();
                                            // decision lvl 8 - use as splint
                                            if (choice.equalsIgnoreCase("Use As Splint")) {
                                                System.out.println("You use the piece of wood as a splint, however you quickly feel an infection.\nAs the infection spreads, your body weakens, and you become delirious.\nIn the end, your organs fail, and you take your last breath, succumbing to the infection.");
                                                // STORY ENDPOINT
                                            // else for decision lvl - try to eat
                                            } else if (choice.equalsIgnoreCase("Try To Eat")) {
                                                System.out.println("As you consume the fungus, your throat begins to tingle, and you feel a strange sensation spreading throughout your body.\nYou desperately try to find help, but your airways close up, and you collapse on the ground, never to rise again.");
                                                // STORY ENDPOINT
                                            }
                                        }
                                    }   
                                }
                            }
                        }
                    // else for decision lvl 2 - eat ants
                    } else if (choice.equalsIgnoreCase("Eat Ants")) {
                        System.out.println(
                                "You try to eat ants but a rabid anteater appears to defend its food.\nOver the next three days, you die of a terrible case of rabies\nWhat a cruel fate for something that doesn't even taste good...");
                        // STORY ENDPOINT
                    }
                }
            // else for decision lvl 1 - stay put
            } else if (choice.equalsIgnoreCase("Stay Put")) {
                System.out.println("You decide it is safer to stay in one spot. Now you try to get comfortable.");
                System.out.println("[Build Fire] [Sleep]");
                choice = keyedInput.nextLine();

                // decision lvl 2 - build fire
                if (choice.equalsIgnoreCase("Build Fire")) {
                    System.out.println("It is too cold, so you start building a fire pit. You're going need wood and a firestarter. \nIt's daylight now, but it will soon be dark. One of them will probably take longer to collect than the other. \nWhich do you choose to collect first?");
                    System.out.println("[Gather Wood First] [Gather Firestarter First]");
                    choice = keyedInput.nextLine();
                    // decision lvl 3 - Gather Wood First
                    if (choice.equalsIgnoreCase("Gather Wood First")) {
                        System.out.println("It's getting dark. You decide to gather wood first. Having a consistent source of fuel will ensure that you last through the night.\nBesides, you'll only need to start the fire once, right? \nIn your search, you see a big tree and small tree. Which do you chop?");
                        System.out.println("[Big Tree] [Small Tree]");
                        choice = keyedInput.nextLine();
                        // decision lvl 4 - chop big tree
                        if (choice.equalsIgnoreCase("Big Tree")) {
                            System.out.println("You chop the big tree 57 times and it still won't fall. The sun goes below the horizon.\nYou wipe your brow, your sweat feels cold on your hand. The daytime heat is dissipating and you begin to doubt yourself.\nContinue chopping the big tree?");
                            System.out.println("[Keep Chopping] [Go Back To Small Tree]");
                            choice = keyedInput.nextLine();
                            // decision lvl 5 - keep chopping
                            if (choice.equalsIgnoreCase("Keep Chopping")) {
                                System.out.println("You decide that it would be foolish to start on another tree now. \nIt's best to push through and cut this tree down.");
                                System.out.println("An hour later, you finally chop down the big tree and receive 2 sticks. \nThe noise attracts a brown bear who mauls you to death.");
                                // STORY ENDPOINT
                            // else for decision lvl 5 - go back to small tree
                            } else if (choice.equalsIgnoreCase("Go Back To Small Tree")) {
                                System.out.println("Cutting your losses, you reflect wryly on having wasted the last hours of daylight on the big tree.\nYou recall learning about something called the 'sunk cost fallacy' in high school.\nPerhaps the small tree would be best after all.");
                                System.out.println("You chop down the small tree and receive 2 sticks. There is some light left.\nYou can either scavenge for a real source of fuel or try to start a fire old-school by rubbing two sticks.\nWhich will it be?");
                                System.out.println("[Scavenge For Fuel] [Start A Fire With Two Sticks]");
                                choice = keyedInput.nextLine();
                                // decision lvl 6 - scavenge for fuel
                                if (choice.equalsIgnoreCase("Scavenge For Fuel")) {
                                    System.out.println("You look for a fuel source to light the wood. Miraculously, you find petrol and a car battery.\nYou can only carry one. Which will it be?");
                                    System.out.println("[Gas] [Electric]");
                                    choice = keyedInput.nextLine();
                                    // decision lvl 7 - gasoline
                                    if (choice.equalsIgnoreCase("Gas")) {
                                        System.out.println("You light some dry grass on fire with gasoline. It spreads quickly and you die of fatal burns.");
                                        // STORY ENDPOINT
                                    // else for decision lvl 7 - electric
                                    } else if (choice.equalsIgnoreCase("Electric")) {
                                        System.out.println("You carry back the battery and it's dark. You need light, so you could try starting a fire with the electricity.\nOn the other hand, you could try to charge your dead phone. Which will it be?");
                                        System.out.println("[Charge Phone] [Light Electrical Fire]");
                                        choice = keyedInput.nextLine();
                                        // decision lvl 8 - charge phone
                                        if (choice.equalsIgnoreCase("Charge Phone")) {
                                            System.out.println("Your phone charges and you call for an Uber boat, saving you from the island.");
                                            // STORY ENDPOINT
                                        // else for decision lvl 8 - light electric fire
                                        } else if (choice.equalsIgnoreCase("Light Electrical Fire")) {
                                            System.out.println("As you try to create some light, you fiddle with the electrical wires in the car battery and sparks fly everywhere.\nSuddenly, a massive electrical fire ignites, and before you can even scream, you are consumed by the intense heat and flames.\nYour body is charred beyond recognition, and you are dead within seconds.");
                                            // STORY ENDPOINT
                                        }
                                    }
                                // else for decision lvl 6 - start fire w/ 2 sticks
                                } else if (choice.equalsIgnoreCase("Start A Fire With Two Sticks")) {
                                    System.out.println("Somehow you manage to start a fire with two sticks, just like in the movies.\nHowever, those two sticks were all of the fuel you had. Maybe they'd be of better use just as a torch?");
                                    System.out.println("[Use As Torch] [Make Campfire]");
                                    choice = keyedInput.nextLine();
                                    // decision lvl 7 - use as torch
                                    if (choice.equalsIgnoreCase("Use As Torch")) {
                                        System.out.println("You create two torches and, entranced by the fire, swing them around gleefully.\nIn your pyromaniacal spree, you catch the entire forest on fire.\nYou are quickly surrounded and cook yourself to death.\nThe only remains of your existence are a crispy husk of fried skin");
                                        // STORY ENDPOINT
                                    // else for decision lvl 7 - make campfire
                                    } else if (choice.equalsIgnoreCase("Make Campfire")) {
                                        System.out.println("You start to make a campfire but the flame is low. Perhaps it needs more fuel or oxygen.");
                                        System.out.println("[Blow It] [Add Dry Grass]");
                                        choice = keyedInput.nextLine();
                                        // decision lvl 8 - blow on flame
                                        if (choice.equalsIgnoreCase("Blow It")) {
                                            System.out.println("You blow on the flame. It turns out oxygen was the only thing it needed after all.\nThe flame explodes sharply and melts your face off.\nYou die a painful death, not being able to see anything through your melted eyelids.");
                                            // STORY ENDPOINT
                                        // else for decision lvl 8 - add dry grass
                                        } else if (choice.equalsIgnoreCase("Add Dry Grass")) {
                                            System.out.println("You add dry grass. It turns out dry grass was the only thing it needed after all.\nThe flame is exceptionally bright. You realize if a boat/plane goes by they would see a bonfire.\nThough what are the chances this late at night..?");
                                            System.out.println("[Make Bigger Bonfire] [Make Use Of Fire]");
                                            choice = keyedInput.nextLine();
                                            // decision lvl 9 - make bigger bonfire
                                            if (choice.equalsIgnoreCase("Make Bigger Bonfire")) {
                                                System.out.println("You make a fire pit that a beach party would be proud of. Miraculously, a helicopter flies by with its telltale lights..\nLight the fire so they can see you?");
                                                System.out.println("[Light Bonfire] [Don't Light]");
                                                // STORY ENDPOINT
                                                choice = keyedInput.nextLine();
                                                // decision lvl 10 - light bonfire
                                                if (choice.equalsIgnoreCase("Light Bonfire")) {
                                                    System.out.println("You light the massive fire, causing the helicopter to notice you.\nIt circles back and promptly air lifts you to the nearest place of civilization.\nYou are saved!");
                                                    // STORY ENDPOINT
                                                // else for decision lvl 10 - don't light
                                                } else if (choice.equalsIgnoreCase("Don't Light")) {
                                                    System.out.println("In your panic to light the fire, your performance anxiety kicks in and you can't seem to use your hands right.\nYou don't light the fire for some reason, and die of self pity.");
                                                    // STORY ENDPOINT
                                                }
                                            // else for decision lvl 9 - make use of fire
                                            } else if (choice.equalsIgnoreCase("Make Use Of Fire")) {
                                                System.out.println("You decide it is not worth it and you should cook some food on the fire.\nAs you roast some random nuts found nearby, you see a helicopter fly over the island. Overwhelmed in grief, you begin to ravage your supplies.");
                                                System.out.println("[Destroy Food] [Binge-Eat]");
                                                choice = keyedInput.nextLine();
                                                // decision lvl 11 - destroy food
                                                if (choice.equalsIgnoreCase("Destroy Food")) {
                                                    System.out.println("The helicopter flying by removes all sense of ration from your head.\nOut of self-rage, you throw all of your food onto the fire.\nThe nuts explode all at once like popcorn and shoot into your eyes.\nYou are now blind and cannot survive.");
                                                    // STORY ENDPOINT
                                                // else for decision lvl 11 - binge-eat
                                                } else if (choice.equalsIgnoreCase("Binge-Eat")) {
                                                    System.out.println("The helicopter flying by removes all sense of ration from your head.\nYou eat all of the supplies you had collected out of self-rage.\nOver the next few weeks, you starve to death and you don't even care.");
                                                    // STORY ENDPOINT
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        // else for decision lvl 5 - cut small tree
                        } else if (choice.equalsIgnoreCase("Small Tree")) {
                            System.out.println("You finally cut the big tree and receive two logs but the night is now pitch black.\nIn the darkness, you blindly fall off a cliff, instantly dying from your fall.");
                            // STORY ENDPOINT
                        }
                // else for decision level four - gather firestarter
                } else if (choice.equalsIgnoreCase("Gather Firestarter First")) {
                    System.out.println("It's getting dark. You decide that you will start by finding firestarter. \nAfter all, having something to light things with will serve you better than just having things to light.\nWorst case, you just light some random bushes on fire, right? \nIn your search, you miraculously find a can of petrol and a car battery. Which one do you take?");
                            System.out.println("[Gas] [Electric]");
                            choice = keyedInput.nextLine();
                            // decision lvl 5 - gas
                            if (choice.equalsIgnoreCase("Gas")) {
                                System.out.println("You light some dry grass on fire with gasoline.\nAs you strike the match and the dry grass ignites, the flames spread rapidly, and you are surrounded by an inferno of searing heat.\nThe gasoline explodes, and you are engulfed in flames, writhing in agony as the fire consumes your body. \nThe last thing you see is the smoke as you black out for the last time.");
                                // STORY ENDPOINT
                            // else for decision lvl 5 - electric
                            } else if (choice.equalsIgnoreCase("Electric")) {
                                System.out.println("You carry back the battery and it's dark. You need light, so you could try starting a fire with the electricity.\nOn the other hand, you could try to charge your dead phone. Which will it be?");
                                System.out.println("[Charge Phone] [Light Electrical Fire]");
                                choice = keyedInput.nextLine();
                                    // decision lvl 13 - charge phone
                                    if (choice.equalsIgnoreCase("Charge Phone")) {
                                    System.out.println("Your phone charges and you call for an Uber boat.\nAs you step aboard, you feel the tension and anxiety from your island ordeal gradually slip away.\nThe boat speeds away from the island, and you can finally relax, knowing that you have escaped to safety.");
                                    // STORY ENDPOINT
                                // else for decision lvl 13 - light electrical fire
                                } else if (choice.equalsIgnoreCase("Light Electrical Fire")) {
                                    System.out.println("As you try to create some light, you fiddle with the electrical wires in the car battery and sparks fly everywhere.\nSuddenly, a massive electrical fire ignites, and before you can even scream, you are consumed by the intense heat and flames.\nYour body is charred beyond recognition, and you are dead within seconds.");
                                    // STORY ENDPOINT
                                }
                            }
                }
            // else for decision lvl 3 - sleep
            } else if (choice.equalsIgnoreCase("Sleep")) {
                System.out.println("You look for a place to sleep on this island. You did decide to stay put, so it had better be around this area.\nYou see a cave about 20 metres away. You could either camp where you are, or visit the cave.");
                System.out.println("[Sleep On Ground] [Sleep In Cave]");
                choice = keyedInput.nextLine();
                // decision lvl 14 - sleep on ground                
                if (choice.equalsIgnoreCase("Sleep On Ground")) {
                    System.out.println("You toss and turn but eventually fall asleep. When you wake up, the ground feels softer than before, almost like a pillow.\nYou laugh and realize it was all a dream");
                    // STORY ENDPOINT
                // else for decision lvl 14 - sleep in cave
                } else if (choice.equalsIgnoreCase("Sleep In Cave")) {
                    System.out.println("You walk into a cave.\nAs you step further into the darkness of the cave, you hear a low growling sound.\nSuddenly, you see two piercing eyes staring right at you, and before you can react, the massive bear charges towards you.\nYou try to defend yourself, but its powerful claws and teeth tear through your flesh.");
                    // STORY ENDPOINT
                }
            }
        }
        }
    }

}
