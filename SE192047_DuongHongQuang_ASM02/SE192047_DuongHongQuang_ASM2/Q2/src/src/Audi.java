/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GIGABYTE
 */
public class Audi extends Vehicle {
    private int releasedYear;
    private String color;
    public Audi(String id, String name, double price, int quantity,String color, int releasedYear) {
        super(id, name, price, quantity); 
        this.releasedYear = releasedYear;
        this.color = toTitleCase(color);
    }

    public int getReleasedYear() {
        return releasedYear;
    }

    public void setReleasedYear(int releasedYear) {
        if (releasedYear > 2025 || releasedYear < 2022)
        {
            this.releasedYear = 2022;
        }
        else this.releasedYear = releasedYear;
        
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if("Black".equals(color) || "White".equals(color) || "Red".equals(color) || "Gray".equals(color))
        {
            this.color = color;
        }else this.color = "Black";
        
    }
   
    @Override
    public double getSubTotal()
    {
        if("Red".equals(color) || releasedYear == 2025)
        {
        return subTotal = quantity*price*1.2;
        }
        else return subTotal = quantity*price;
        
        
    }
    @Override
    public String toString()
    {
        return String.format("%s,%s,%s,%d,%.2f,%d,%.2f",id.toUpperCase(),name,color,releasedYear,price,quantity,getSubTotal());
    }
    
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
}
