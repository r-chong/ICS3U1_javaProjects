/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chongassignment19;

/**
 *
 * @author s201076119
 */

// import necessary libraries
import java.util.Scanner;

public class ChongAssignment19 {
    
    // initialize new scanner
    public static Scanner keyedInput = new Scanner(System.in);    
    
    // initialize colour for console (easier readability, user experience)   
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";

    // rhombus subroutine
    // area = 1/2 * diagonal1 * diagonal2
    public static void areaRhombusAndOut(double d1, double d2) {
        double area = 0.5 * d1 * d2;
        System.out.println(ANSI_GREEN_BACKGROUND + "\nThe area of the rhombus is " + area + "m^2" + ANSI_RESET);
    }
    
    // pentagon subroutine
    // area = 5 x sidelength * apothem
    public static void areaPentagonAndOut(double s, double a){
        double area = 0.5 * (s * 5) * a;
        System.out.println(ANSI_GREEN_BACKGROUND + "\nThe area of the pentagon is " + area + "m^2" + ANSI_RESET);
    };
    
    // hexagon subroutine
    // area = 6 x sidelength * apothem
    public static void areaHexagonAndOut(double s, double a){
        double area = 0.5 * (s * 6) * a;
        System.out.println(ANSI_GREEN_BACKGROUND + "\nThe area of the hexagon is " + area + "m^2" + ANSI_RESET);
    };
    
    // triangle subroutine
    // area = length * height * 1/2
    public static void areaTriangleAndOut(double l, double w){
        double area = 0.5 * l * w;
        System.out.println(ANSI_GREEN_BACKGROUND + "\nThe area of the triangle is " + area + "m^2" + ANSI_RESET);
    };
    
    // trapezoid subroutine
    // area = length * width * height
    public static void areaTrapezoidAndOut(double n1, double n2){
        System.out.println("One more thing: please enter the height of the prism");
        double h = keyedInput.nextDouble();

        double area = 0.5 * (n1 + n2) * h;
        System.out.println(ANSI_GREEN_BACKGROUND + "\nThe area of the trapezoid is " + area + "m^2" + ANSI_RESET);
    };
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declare variables for choice, and the two numbers
        int choice;
        double num1, num2;
        boolean endProgram = false;
        
        // main program loop (make multiple calculations)
        do {
            // user menu
            System.out.println("---------------------------------");
            System.out.println("Welcome to the Area of Strange Shapes Program!");
            System.out.println("Please choose 1 option:");
            System.out.println("1... Find the area of a rhombus, given diagonal 1 and diagonal 2");
            System.out.println("2... Find the area of a pentagon, given sidelength and apothem");
            System.out.println("3... Find the area of a hexagon, given sidelength and apothem");
            System.out.println("4... Find the area of a triangle, given length and width");
            System.out.println("5... Find the area of a trapezoid, given length1, length2, and height");
            System.out.println("6... Exit Program");
            System.out.println("Please choose 1 option:");
            System.out.println("---------------------------------");

            // ask user for their choice
            choice = keyedInput.nextInt();
            
            // exit program sequence
            // (not in switch statement because we ask for inputs before switch)
            if (choice == 6){
                endProgram = true;
                break;
            }
            
            // ask for inputs in double form
            System.out.println("Please enter the first number");
            num1 = keyedInput.nextDouble();
            System.out.println("Please enter the second number");
            num2 = keyedInput.nextDouble();
            
            // depending on choice, run the correct subroutine
            switch(choice){
                case 1:
                    areaRhombusAndOut(num1,num2);
                    break;
                case 2:
                    areaPentagonAndOut(num1,num2);
                    break;
                case 3:
                    areaHexagonAndOut(num1,num2);
                    break;
                case 4: 
                    areaTriangleAndOut(num1,num2);
                    break;
                case 5:
                    areaTrapezoidAndOut(num1,num2);
                    break;
            }
            // if user quit, end program
        } while (endProgram==false);
        // thank you message
        System.out.println("Thank you for using The Area of Strange Shapes Program!");
    }
}
