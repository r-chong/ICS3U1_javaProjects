/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chongassignment4.test;

/**
 *
 * @author Reese
 */
public class ChongAssignment4Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double[] nums = {0.0,0,0,0};
        double sum;
        double answer;
        
        //convert to scanner inputs
        nums[0] = Integer.parseInt(txtFirstNum.getText());
        nums[1] = Integer.parseInt(txtSecondNum.getText());
        nums[2] = Integer.parseInt(txtThirdNum.getText());
        nums[3] = Integer.parseInt(txtFourthNum.getText());
        
        System.out.println(nums);
        
        sum = (nums[0] + nums[1] + nums[2] + nums[3]) / 4;
        
        answer = sum * 100;
        answer = Math.round(answer);
        answer = answer / 100;
    }
    
}
