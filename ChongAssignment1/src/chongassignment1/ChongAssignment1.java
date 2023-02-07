/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chongassignment1;

/**
 *
 * @author Reese Chong
 */
public class ChongAssignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String itemName = "Avocado";
        int itemID = 95200;
        boolean inStock = true;
        double itemPrice = 1.99;
        char itemCategory = 'V';
       
        System.out.println("The product is " + itemName);
        System.out.println("The product's barcode is " + itemID);
        if (inStock == true) {
            System.out.println("The product is in stock");
        } else {
            System.out.println("The product is not in stock");
        }
        System.out.println("The product's price is $" + itemPrice);
        System.out.println("The product's category is " + itemCategory);       
    }
    
}
