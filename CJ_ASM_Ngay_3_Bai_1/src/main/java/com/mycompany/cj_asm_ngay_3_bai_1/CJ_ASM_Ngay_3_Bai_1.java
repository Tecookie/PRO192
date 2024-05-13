/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cj_asm_ngay_3_bai_1;
import java.util.Scanner;
/**
 *
 * @author GIGABYTE
 */

public class CJ_ASM_Ngay_3_Bai_1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int number[];
    int n;
    int tong = 0;
        System.out.print("Nhap so:");
        n = sc.nextInt();
        if (n > 100){   
            System.out.print("Nhap so lai:");
            n = sc.nextInt();
        }
        number = new int[n];
        for (int i = 1; i <= n; i++) {
            if (i %2 == 0)
            {
                tong += i;
            }
        
    }
    System.out.print("Tong so chan la:"+tong);
}
}


