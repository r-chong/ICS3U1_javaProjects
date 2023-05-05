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
    /**
     * @param args the command line arguments
     */
    
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
        int wordLength = word.length();
        String [] splitWord = word.split("");
        String [] guessedLetters = new String [wordLength];
        char letter;
        
        // Create a HashMap object called guessTracker
        HashMap<Character, Boolean> answer_key = new HashMap<Character, Boolean>();
        
        // -------------------------
        
//         print visuals to screen
//        for (int i = 0; i <= 6; i++) {
//            System.out.println(HANGMAN_PICS[i]);
//        }
        
        char c;
        for(c = 'a'; c <= 'z'; ++c) {
            answer_key.put(c,false);
        }

//        for (int i = 0; i <= wordLength-1; i++) {
//                answer_key.put('a',true);
//            }
        // set each letter of the word as true in the hashmap answer_key
        for (int i = 0; i <= wordLength-1; i++) {
            letter = splitWord[i].charAt(0);
            answer_key.put(letter,true);
            System.out.println(answer_key);
        }
        
        System.out.println(answer_key);
        System.out.println(HANGMAN_PICS[0]);

        
        while(true) {
            // uses ternary operators to show empty space if it has been guessed
            for (int i = 0; i <= wordLength-1; i++) {
                System.out.printf("%s ",guessedLetters[i] == splitWord[i] ? guessedLetters[i] : "__" , " ");
            }
            // console log the word
            System.out.println("(dev) the word is " + word);
            System.out.println("\n\nGuess a letter!");
            currentGuess = keyedInput.next().charAt(0);
            
            // check if letter guessed is IN the word
            if(answer_key.get(currentGuess) == true) {
                //Do task check if the boolean is true or false
                System.out.println("correct");
             } else {
                System.out.println("incorrect");
            }
//            for (String i : answer_key.values()) {               
//                 if (currentGuess.equalsIgnoreCase(i)) {
//                     System.out.println("you found a letter of " + word);
//                     answer_key.keySet();
//                 }
//            }
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
