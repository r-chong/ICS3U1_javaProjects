/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chongassignment2;

import java.util.Scanner;
/**
 *
 * @author Reese Chong
 */
public class ChongAssignment2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner keyedInput = new Scanner(System.in);
        
        double pi = 3.14;        
        double diameter;
        double radius;
        double area;
        
        System.out.println("This program will find the area of any circle.");
        System.out.println("...");
        System.out.println("Please enter the diameter of your circle, in metres.");
        System.out.println("Note: values entered should be positive.");
        diameter = keyedInput.nextDouble();
        
        radius = diameter / 2;
        area = pi * Math.pow(radius, 2);
        
        System.out.println("The area of a circle with diameter " + diameter + " is " + area + "m^2");
    }
    
}
