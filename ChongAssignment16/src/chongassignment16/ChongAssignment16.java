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
        String currentGuess;
        int wordLength = word.length();
        String [] splitWord = word.split("");
        String [] guessedLetters = new String [wordLength];
        String [] usedLetters = new String [MAX_GUESS];
                
        // -------------------------
        
        // print visuals to screen
//        for (int i = 0; i <= 6; i++) {
//            System.out.println(HANGMAN_PICS[i]);
//        }
        
        
        System.out.println(HANGMAN_PICS[0]);
        
        // uses ternary operators to show empty space if it has been guessed
        for (int i = 0; i <= wordLength-1; i++) {
            System.out.printf("%s ",guessedLetters[i] == splitWord[i] ? guessedLetters[i] : "__" , " ");
        }
        
        while(true) {
            System.out.println("\n\nGuess a letter!");
            currentGuess = keyedInput.nextLine();
//            if currentGuess in
            generateNewWord();
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
