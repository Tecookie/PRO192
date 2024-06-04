/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Slide5;
import java.util.Scanner;

/**
 *
 * @author GIGABYTE
 */
public class Method1 {
    public static void main(String[] args) {
        int nums;
        long sum;
        try {
            System.out.println("Enter:");
            nums = Utilities.getinInt();
            sum = 0;
            for (int i = 0; i <= nums; i++) {
                sum += i;
                
            }
            System.out.format("Sum = %d%n",sum);
        }   catch (Exception ex)
        {
            System.out.println(ex.getMessage());
       
    }
// TODO code application logic here
    }
    
}
