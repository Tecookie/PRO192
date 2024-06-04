/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classtest;

/**
 *
 * @author GIGABYTE
 */
public class ClassTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try
        {   
            Student Info = new Student();
            Info.print();
            Info.Student("001","Tec");
            Info.print();
            
        } catch (Exception e)
        {
            System.out.println("Error"+e.getMessage());
        }
        // TODO code application logic here
    }
    
}
