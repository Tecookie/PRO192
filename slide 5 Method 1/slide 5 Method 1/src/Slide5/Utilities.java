/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Slide5;

import java.util.Scanner;

/**
 *
 * @author GIGABYTE
 */
class Utilities {
    public static int getinInt () throws Exception {
        int num = 0;
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        if (s.matches("\\d{1,10}") == false)
        {
            throw new Exception("Data Invalid");
            
        } else {
        num = Integer.parseInt(s);    
        }
        return num;
        }
    
}
