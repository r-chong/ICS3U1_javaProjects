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

// import necessary libraries
import java.util.Scanner;
import java.util.HashMap;

//        ☑ 10 Significant Variables (5 marks) -line 66
//        ☑ 3 Significant Constant (3 marks) -line 37
//        ☑ 2 Unique and Necessary Loops (10 marks) 
//        ☑ Not just 2 loops that calculate 2 totals -I have many for loops
//        ☑ At least one while loop or do while loop (2 marks)
//        ☑ 2 Necessary Arrays (10 marks) 
//        ☑ At least 40 Elements (data) in total (5 marks)
//        ☑ Commenting (5 marks)
//        ☑ Creative, Original and User-friendly (30 marks)

/**
 *
 * @author s201076119
 */
public class ChongAssignment16 {

    // declare and initialize constants that are used outside of class main
    static final String [] WORD_LIST = {"addition","comparison","advice","appearance","philosophy","security","world","negotiation","quantity","speaker","unit","basis","attitude","combination","data","reputation","dad","library","grocery","insect","back",
		"baggy","bare","campaigning","inspector","beautiful","belated","activity","failure","patronizer","garbage","bewitched","uncle",
		"bighearted","biodegradable","improvement","excitement","professor"};
    static String word;
    static int wordID;
    
    // declare and initialize method "generateNewWord()"
    // creates random number from 1 to 40
    // returns that index from WORD_LIST
    public static String generateNewWord() 
    {
        wordID = (int)Math.round(Math.random()*39+1);
        word = WORD_LIST[wordID];
        return word;
    }
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) 
    {
        // declare and initialize constants which are also arrays
        final String [] HANGMAN_PICS = 
        {
            "  +---+\n  |   |\n      |\n      |\n      |\n      |\n==========",
            "  +---+\n  |   |\n  O   |\n      |\n      |\n      |\n==========",
            "  +---+\n  |   |\n  O   |\n  |   |\n      |\n      |\n==========",
            "  +---+\n  |   |\n  O   |\n /|   |\n      |\n      |\n==========",
            "  +---+\n  |   |\n  O   |\n /|\\  |\n      |\n      |\n==========",
            "  +---+\n  |   |\n  O   |\n /|\\  |\n /    |\n      |\n==========",
            "  +---+\n  |   |\n  O   |\n /|\\  |\n / \\  |\n      |\n==========",
            "  +---+\nGAME  |\n  OVER|\n /|\\  |\n / \\  |\n      |\n==========",
            "  +---+\nYOU   |\n   WIN!\n  O   | \n\uD83D\uDC4D|\\  |\n / \\  |\n=========="
        };
        final int MAX_LOSS = 6;
        
        // Declare and initialize scanner
        Scanner keyedInput = new Scanner (System.in);
        
        // Declare and initialize 10 variables
        String word = generateNewWord();
        char currentGuess;
        int wordLength;
        int hangingStatus = 0;
        char [] splitWord;
        char [] remainingLetters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char letter;
        String playerQuitInput;
        boolean gameOver = false;
        boolean quit = false;
        int numCorrect;
        
        // Create a HashMap object called guessTracker
        HashMap<Character, Boolean> answer_key = new HashMap<Character, Boolean>();
        HashMap<Character, Boolean> guess_key = new HashMap<Character, Boolean>();
        
        // program main while loop
        do 
        {
            // set word length and splitWord
            wordLength = word.length();
            splitWord = word.toCharArray();
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
            
            // print first visual of hanging apparatus
            System.out.println(HANGMAN_PICS[0]);
            
            // game while loop
            // condition is (if gameOver == true)
            do
            {
                // prompt user for input
                // take user input in type char; only take the first letter they type
                System.out.println("Guess a letter!");
                currentGuess = keyedInput.next().charAt(0);
                System.out.println("");

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
                if(answer_key.get(currentGuess) == true) 
                {
                    System.out.println("you found a letter!");
                    guess_key.put(currentGuess,true);
                } 
                else 
                {
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

                numCorrect = 0;
                for (int i = 0; i <= wordLength-1; i++) 
                {        
                    // if user guess is in guess key = true
                    if (answer_key.get(splitWord[i]) == true && guess_key.get(splitWord[i]) == true) 
                    {
                        // %s string formats so that the letter is on the same line
                        // update that the guess was true
                        // start from 0, increment numCorrect (essential to checking for win)
                        System.out.printf("%s ",splitWord[i]);
                        guess_key.put(currentGuess, true);
                        numCorrect += 1;
                    } 
                    else 
                    {
                        // print __ if the user didn't get that letter yet
                        System.out.printf("%s ", "__");
                    }
                }
                System.out.println("\n\n");

                // check for win or loss
                // if the man has been hung, then player lose
                // if number of letters correct is the # of letters in the word, then player win
                // both instances close the nested game while loop
                if (hangingStatus >= MAX_LOSS) {
                    gameOver = true;
                } 
                else if (numCorrect == wordLength) 
                {
                    gameOver = true;
                }
            }while(gameOver == false);
            
            // back in primary while loop
            if (gameOver == true && hangingStatus == 6) 
            {
                // lose sequence
                System.out.println(HANGMAN_PICS[7]);
                System.out.println("Game over! The word was " + word);
            } 
            else if (gameOver == true && hangingStatus < 6)
            {
                // win sequence
                System.out.println(HANGMAN_PICS[8]);
                System.out.println("You win!");
            }
            // allow user to play again
            System.out.println("Play again? (Y/N)");
            playerQuitInput = keyedInput.next();
            
            // if "Y" then play again
            // else close primary while loop
            // if some other input, then do not understand
            if (playerQuitInput.equalsIgnoreCase("N")) 
            {
                quit = true;
            } 
            else if (playerQuitInput.equalsIgnoreCase("Y")) 
            {
                // reset variables that change based on the word
                gameOver = false;
                hangingStatus = 0;
                word = generateNewWord();
                System.out.println("\n\n");
                continue;
            } else 
            {
                System.out.println("invalid command");
            }
        } while (quit == false);
        
        // user goodbye message
        System.out.println("Thanks for playing hangman!");
    }
}
