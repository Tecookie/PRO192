/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part2;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author GIGABYTE
 */
public class part2 {
    public static void main(String[] args)
    {
         float num1,num2;
         String op;
         Scanner sc = new Scanner(System.in);
         System.out.println("Input the number 1:");
         num1 = sc.nextFloat();
         System.out.println("Input the number 2:");
         num2 = sc.nextFloat();
         System.out.println("Input the operator (+-*/)");
         sc = new Scanner(System.in);
         op = sc.nextLine();
         if (op.equals("+"))
         {
             System.out.println("the result of " + num1 + op + num2 + "=" + String.format("%.0f",num1 + num2));
             
         }  
         if (op.equals("-"))
         {
             System.out.println("the result of " + num1 + op + num2 + "=" + String.format("%.0f", num1-num2));
         }
         if (op.equals("*"))
         {
             System.out.println("the result of " + num1 + op + num2 + "="+ String.format("%.0f",(num1*num2)));
         }
         if (op.equals("/"))
         {
             System.out.println("the result of " + num1 + op + num2 + "="+ String.format("%.2f",(num1/num2)));
         }
    }
}
