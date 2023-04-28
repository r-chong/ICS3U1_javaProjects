/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chongassignment16;

import java.util.Scanner;

/**
 *
 * @author s201076119
 */
public class ChongAssignment16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declare and initialize constants which are also arrays
        final String [] WORD_LIST = {"addition","comparison","advice","appearance","philosophy","security","world","negotiation","quantity","speaker","unit","basis","attitude","combination","data","reputation","dad","library","grocery","insect"};
        final String [] HANGMAN_PICS = {
            "  +---+\n  |   |\n      |\n      |\n      |\n      |\n==========",
            "  +---+\n  |   |\n  O   |\n /|\\  |\n / \\  |\n      |\n==========",
            "  +---+\n  |   |\n      |\n      |\n      |\n      |\n==========",
            "  +---+\n  |   |\n      |\n      |\n      |\n      |\n==========",
            "  +---+\n  |   |\n      |\n      |\n      |\n      |\n==========",
        };
        
//        
//          +---+
//          |   |
//          O   |
//         /|\  |
//         / \  |
//              |
//        =========
        
        // test
        System.out.println(HANGMAN_PICS[1]);
        
        // declare and initialize 10 variables
        String word = "testes";
        String [] splitWord = word.split("");
        int wordLength = word.length();
        String currentGuess;
        
        String [] guessedLetters = new String [wordLength];
        // 7 guesses only (change to constant?)
        String [] usedLetters = new String [7];
        
        // declare and initialize scanner
        Scanner keyedInput = new Scanner (System.in);
        
        // uses ternary operators to show empty space if it has been guessed
        for (int i = 0; i <= wordLength-1; i++) {
            System.out.printf("%s ",guessedLetters[i] == splitWord[i] ? guessedLetters[i] : "__" , " ");
        }
        
        System.out.println("\n\nGuess a letter!");
        currentGuess = keyedInput.nextLine();
        
        
        
        
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
