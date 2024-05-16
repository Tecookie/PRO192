/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.part1 to edit this template
 */
package part1;
import java.util.Scanner;
/**
 *
 * @author GIGABYTE
 */
public class part1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rows;
        int cols;
        int matrixs[][];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        rows = sc.nextInt();
        System.out.println("Enter the number of columms");
        cols = sc.nextInt();
        matrixs = new int[rows][cols];
        System.out.println("Enter the matrix:");
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("\nm["+i+"]["+j+"]=");
                matrixs[i][j] = sc.nextInt();
                sum = sum + matrixs[i][j];
            }
        }   
        
        System.out.println("Matrix Inputted:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.format("%3d",matrixs[i][j]);   
            }
            System.out.println("\n");
        }
        System.out.println("Sum:"+sum);
        System.out.println("Average:" +(float)sum/(rows*cols));
// TODO code application logic here
    }
    
}
