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

    public static void areaPentagonAndOut(int n1, int n2) {
        // area of a regular pentagon is 1/2 × (sidelength x 5) x a
        double area = 0.5 * (n1 * 5) * n2;
        System.out.println("The area of the pentagon is " + area + " m^2");
    }
    
    public static void areaHexagonAndOut(int n1, int n2) {
        // area of a regular hexagon is 1/2 × (sidelength x 6) x a
        double area = 0.5 * (n1 * 6) * n2;
        System.out.println("The area of the hexagon is " + area + " m^2");
    }
    
    public static void areaTrapezoidAndOut(int n1, int n2) {
        // area of a trapezoid is base1 + base2 / 2 x height
        double area = 0.5 * (n1 + n2) * n2;
        System.out.println("The area of the trapezoid is " + area + " m^2");
    }
    
    public static void areaTriangleAndOut(int n1, int n2) {
        // area of a trapezoid is 1/2 bh
        double area = 0.5 * n1 * n2;
        System.out.println("The area of the triangle is " + area + " m^2");
    }
    
    public static void areaRhombusAndOut(int n1, int n2) {
        // area of a trapezoid is 1/2 * diagonal 1 * diagonal 2 
        double area = 0.5 * n1 * n2;
        System.out.println("The area of the rhombus is " + area + " m^2");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice;
        int num1, num2;
        boolean gameOver = false;
        
        // initialize new scanner
        Scanner keyedInput = new Scanner(System.in);    
        
        do {
            System.out.println("---------------------------------");
            System.out.println("Welcome to the Area of Strange Shapes Calculator!");
            System.out.println("Please choose 1 option:");
            System.out.println("1... Find the area of a pentagon (given side length & length of apothem)");
            System.out.println("2... Find the area of a hexagon (given side length & length of apothem)");
            System.out.println("3... Find the area of a trapezoid (given base1, base2, & height)");
            System.out.println("4... Find the area of a triangle (given base & height)");
            System.out.println("5... Find the area of a rhombus (given diagonal 1 & 2)");
            System.out.println("6... Exit Program");
            System.out.println("Please choose 1 option:");
            System.out.println("---------------------------------");

            // ask user for their choice
            choice = keyedInput.nextInt();
            
            if(choice == 6) {
                gameOver = true;
                System.out.println("Thank you for using Area of Strange Shapes Calculator!");
                break;
            }
            
            System.out.println("Please enter the first number:");
            num1 = keyedInput.nextInt();

            System.out.println("Please enter the second number:");
            num2 = keyedInput.nextInt();
            
            areaPentagonAndOut(num1, num2);
            areaHexagonAndOut(num1, num2);
            areaTrapezoidAndOut(num1, num2);
            areaTriangleAndOut(num1, num2);
            areaRhombusAndOut(num1, num2);
        } while (gameOver==false);
    }
    
}
