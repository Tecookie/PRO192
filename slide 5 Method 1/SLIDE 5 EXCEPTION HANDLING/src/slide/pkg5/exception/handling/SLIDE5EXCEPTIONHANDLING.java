/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package slide.pkg5.exception.handling;

/**
 *
 * @author GIGABYTE
 */
import java.util.Scanner; 
public class SLIDE5EXCEPTIONHANDLING {
    public static int InputN()
    {
    int number = 0;
    Scanner sc = new Scanner(System.in);
    number = Integer.parseInt(sc.nextLine());
    return number;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number = 0;
        int sum = 0;
        System.out.println("Enter:");
        do{
            try{
            number = InputN();
            sum += number;
            }
            catch (Exception e)
            {
                System.out.println("Data invalid");
            }
            
        } while( number != 0);
        System.out.println("Sum =" + sum);
        // TODO code application logic here
    }
    
}
