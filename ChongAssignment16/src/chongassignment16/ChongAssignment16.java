/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chongassignment16;

//  _    _                                         _ 
// | |  | |                                       | |
// | |__| | __ _ _ __   __ _ _ __ ___   __ _ _ __ | |
// |  __  |/ _` | '_ \ / _` | '_ ` _ \ / _` | '_ \| |
// | |  | | (_| | | | | (_| | | | | | | (_| | | | |_|
// |_|  |_|\__,_|_| |_|\__, |_| |_| |_|\__,_|_| |_(_)
//                      __/ |                        
//                     |___/                         

import java.util.Scanner;
import java.util.HashMap;

/**
 *
 * @author s201076119
 */
public class ChongAssignment16 {

    static final String [] WORD_LIST = {"addition","comparison","advice","appearance","philosophy","security","world","negotiation","quantity","speaker","unit","basis","attitude","combination","data","reputation","dad","library","grocery","insect"};
    static String word;
    static int wordID;
    
    public static String generateNewWord() {
            wordID = (int)Math.round(Math.random()*19+1);
            word = WORD_LIST[wordID];
            return word;
        }
    
    public static void main(String[] args) {
        // declare and initialize constants which are also arrays
        final String [] HANGMAN_PICS = {
            "  +---+\n  |   |\n      |\n      |\n      |\n      |\n==========",
            "  +---+\n  |   |\n  O   |\n      |\n      |\n      |\n==========",
            "  +---+\n  |   |\n  O   |\n  |   |\n      |\n      |\n==========",
            "  +---+\n  |   |\n  O   |\n /|   |\n      |\n      |\n==========",
            "  +---+\n  |   |\n  O   |\n /|\\  |\n      |\n      |\n==========",
            "  +---+\n  |   |\n  O   |\n /|\\  |\n /    |\n      |\n==========",
            "  +---+\n  |   |\n  O   |\n /|\\  |\n / \\  |\n      |\n==========",
        };
        final int MAX_GUESS = 6;
        
        // Declare and initialize scanner
        Scanner keyedInput = new Scanner (System.in);
        
        // Declare and initialize 10 variables
        word = generateNewWord();
        char currentGuess;
        String[] correctGuesses = new String[26];
        int wordLength = word.length();
        char [] splitWord = word.toCharArray();
        char [] remainingLetters = {'a', 'b','c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's','t', 'u', 'v', 'w', 'x', 'y', 'z'};
        char letter;
        int hangingStatus = 0;
        
        // Create a HashMap object called guessTracker
        HashMap<Character, Boolean> answer_key = new HashMap<Character, Boolean>();
        HashMap<Character, Boolean> guess_key = new HashMap<Character, Boolean>();
        
        // initially loop through hashmaps "answer_key" and "guess_key"
        // set them both to false
        for(char c = 'a'; c <= 'z'; ++c) 
        {
            answer_key.put(c,false);
            guess_key.put(c,false);
        }

        // set each letter of the word as true in the hashmap answer_key
        for (int i = 0; i <= wordLength-1; i++) 
        {
            letter = splitWord[i];
            answer_key.put(letter,true);
        }
        
        System.out.println(HANGMAN_PICS[0]);
        
        // main game while loop
        while(true) 
        {
            // prompt user for input
            // take user input in type char; only take the first letter they type
            System.out.println("Guess a letter!");
            currentGuess = keyedInput.next().charAt(0);
            
            // remove that letter from the list of remaining letters (full alphabet)
            for(int i=0; i < 26; i++)
            {
               // this is a part of the looping system
                // if the current letter of the alphabet is equal to the guess, then drop that letter from array
               if(currentGuess == remainingLetters[i])
               {
                  // this is done by setting new variable j to i
                  // from letter j, set every letter as equal to the one next to it
                  // when it hits the last instance, then erase (else prints multiple z's)
                  // for example, given abcdef, d is erased, print abcef
                  for(int j = i;  j < 25; j++) 
                  {
                     remainingLetters[j] = remainingLetters[j+1];
                  }
                  remainingLetters[25] = ' ';
                  break;
               }            
            }
            // check if letter guessed is IN the word
            // if true, update guess key (which keeps track of what the user has guessed)
            // else progress the hanging of the man
            if(answer_key.get(currentGuess) == true) {
                System.out.println("you found a letter!");
                guess_key.put(currentGuess,true);
             } else {
                System.out.println("wrong... the man is closer to being hanged");
                hangingStatus++;
            }
            
            // add visual of the man being hanged
            // print remaining letters to screen
            // add space for user readability
            System.out.println(HANGMAN_PICS[hangingStatus]);
            System.out.println("remaining letters:");
            System.out.print(remainingLetters);
            System.out.println("");
            
            // if user guess is in guess key = true
            // then update each position to not be __
            // else be __
            for (int i = 0; i <= wordLength-1; i++) {        
                if (answer_key.get(splitWord[i]) == true && guess_key.get(splitWord[i]) == true) 
                {
                    System.out.printf("%s ",splitWord[i]);
                    guess_key.put(currentGuess, true);
                } else {
                    System.out.printf("%s ", "__");
                }
            }
            System.out.println("");
        }
            
        
        
//        10 Significant Variables (5 marks)
//        3 Significant Constant (3 marks)
//        2 Unique and Necessary Loops (10 marks)
//        Not just 2 loops that calculate 2 totals
//        At least one while loop or do while loop (2 marks)
//        2 Necessary Arrays (10 marks) 
//        At least 40 Elements (data) in total (5 marks)
//        Commenting (5 marks)
//        Creative, Original and User-friendly (30 marks)
//        No GUI needed (does not work with while loops)

    }
    
}
