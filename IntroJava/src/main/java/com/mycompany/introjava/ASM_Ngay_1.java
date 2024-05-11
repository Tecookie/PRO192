/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.introjava;

/**
 *
 * @author GIGABYTE
 */
import java.util.Scanner;

public class IntroJava {

    public static void main(String[] args) {
        double lenght,width;
        double area,cir;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai:");
        lenght = sc.nextDouble();
        System.out.print("Nhap chieu rong:");
        width = sc.nextDouble();
        area = width*lenght;
        cir = (width + lenght) * 2;
        System.out.print("Area ="+area);
        System.out.print("\nCircumfernce ="+cir);
        
    }
}
