 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception.pkgclass;

/**
 *
 * @author GIGABYTE
 */
public class EXCEPTIONCLASS {
    public static void checkAge(int age) throws InvalidAge{
        if (age < 0)
        { throw new InvalidAge("Age > 0");
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            checkAge(-1);
        }
        catch (InvalidAge e)  {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        }
        // TODO code application logic here
    }
    

