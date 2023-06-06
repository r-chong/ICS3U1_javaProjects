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

    public static void areaEllipsoid(int n1, int n2) {
        int area = n1 * n2;
        System.out.println("The area is " + area);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice;
        int n1;
        int n2;
        boolean gameOver = false;
        
        // initialize new scanner
        Scanner keyedInput = new Scanner(System.in);    
        
        do {
            System.out.println("---------------------------------");
            System.out.println("Welcome to the Volume of Strange Shapes Program!");
            System.out.println("Please choose 1 option:");
            System.out.println("1... Find the volume of a tetrahedron");
            System.out.println("2... Find the volume of a hexagon");
            System.out.println("3... Find the volume of a hemisphere");
            System.out.println("4... Find the volume of a prism");
            System.out.println("5... Find the volume of a pyramid");
            System.out.println("6... Exit Program");
            System.out.println("Please choose 1 option:");
            System.out.println("---------------------------------");

            // ask user for their choice
            choice = keyedInput.nextInt();
            
            switch(choice) {
                case 1:
                  System.out.println("Enter the radius and the height");
                  n1 = keyedInput.nextInt();
                  n2 = keyedInput.nextInt();
                  //  1/3 x pi x r2 x h
                  // asldkfjlk
                  break;
                case 2:
                  // code block
                  break;
                case 3:
                  // code block
                  break;
                case 4:
                  // code block
                  break;
                case 5:
                  // code block
                  break;
                default:
                  // code block
              }
        } while (gameOver==false);
    }
    
}
