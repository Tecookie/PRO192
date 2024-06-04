/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
  

/**
 *
 * @author GIGABYTE
 */
public class DetectNumber {
    private String StudentID;
    public DetectNumber(){}
    public DetectNumber(String StudentID) {
        this.StudentID = StudentID.toUpperCase();
    }
    
            
    public Boolean Check()
    {
        int input;
        char[] c = StudentID.toCharArray();
        if (StudentID.matches("V(.*)") == false)
            return false;
        for (int i = 2; i < c.length; i++) {
            char d = c[i];
            if (Character.isSpaceChar(d) == true) return false;
            try
            {
                input = Integer.parseInt(String.valueOf(d));
            }
            catch(NumberFormatException e)
                    {
                    return false;
                    }
            
        }
        return true;
    }
    
    
}
