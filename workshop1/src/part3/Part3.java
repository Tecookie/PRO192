/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package part3;

/**
 *
 * @author GIGABYTE
 */
import java.util.Scanner;
import java.util.function.Function;
public class Part3 {

    
    public static String toTitleCase(String input) {
        StringBuilder titleCase = new StringBuilder(input.length());
        boolean nextTitleCase = true;
        for (char c : input.toCharArray()) {
        if (Character.isSpaceChar(c)) {
            nextTitleCase = true;
            } else if (nextTitleCase) {
                c = Character.toTitleCase(c);
                nextTitleCase = false;
                }
            titleCase.append(c);
        }
        return titleCase.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] list = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Input students name");
            list[i] = sc.nextLine();
        }
        System.out.println("Output:");
        for (int i = 0; i < 10; i++) {
            
            System.out.println(toTitleCase(list[i]));
        }
                // TODO code application logic here
    }
    
    
}
