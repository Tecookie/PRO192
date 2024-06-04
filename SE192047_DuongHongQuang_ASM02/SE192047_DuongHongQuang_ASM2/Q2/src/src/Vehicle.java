/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author GIGABYTE
 */
public class Vehicle {
    protected String id,name;
    protected double price,subTotal;
    protected int quantity;

    public Vehicle(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = toTitleCase(name);
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id.trim();
    }

    public void setId(String id) {
        DetectNumber D = new DetectNumber(id);
        if (id != null && D.Check() == true){
            this.id = id;
        } else {
        this.id = "V000000";}
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 5 || name.length() > 50)
        {
            this.name = "new vehicle";
        }else this.name = name;
    }

    public double getPrice() {
        try{
            return price;
        }catch(Exception e)
        {
            return price = 1;
        }
        
    }

    public void setPrice(double price) {
        if (price <1 && price > 1000000)
        {
            this.price = 1;
        }else this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity <1 || quantity > 1000)
        {
            this.quantity = 1;
        }else this.quantity = quantity;
    }

    /**
     *
     * @return
     */
    
    public double getSubTotal()
    {
        return subTotal = price*quantity;
    }
    
    @Override
    
    public String toString()
    {
        
        
        
        
        
        return String.format("%s,%s,%.2f,%d,%.2f",id.toUpperCase(),name,price,quantity,getSubTotal());
        
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
