/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package asm;

import java.util.*;
/**
 *
 * @author GIGABYTE
 */
public class CJ_ASM_Ngay_2 {

    public static void main(String[] args) {
        int pack, distance;
        int shift,feedback;
        int call, electric;
        int other;
        double salary;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter package name:");
        pack = sc.nextInt();
        System.out.print("Enter distance number:");
        distance = sc.nextInt();
        System.out.print("Enter shift night number:");
        shift = sc.nextInt();
        System.out.print("Enter feedback grade:");
        feedback = sc.nextInt();
        System.out.print("Enter call number:");
        call = sc.nextInt();
        System.out.print("Enter electric payment:");
        electric = sc.nextInt();
        System.out.print("Enter the other payment:");
        other = sc.nextInt();
        salary = pack * 50 + distance * 75 + shift * 50 * 0.1 + feedback + call + electric + other;
        System.out.print("The salary is ="+salary);
    }
}
