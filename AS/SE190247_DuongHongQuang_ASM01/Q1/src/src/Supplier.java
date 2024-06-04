/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public final class Supplier {
    private int id;
    private String name;
    private String address;
    private String phone;
    private boolean status=false;

    public Supplier() {
    }

    public Supplier(int id, String name, String address, String phone) {
        setId(id);
        setName(name);
        setAddress(address);
        setPhone(phone);
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>=5 && name.length()<=50) {
            status=true;
            this.name = toTitleCase(name);
        }
        else{
            status=false;
            this.name="No Name";
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = toTitleCase(address);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone.length()>=9&&phone.length()<=10&&phone.startsWith("0")) {
            status=true;
            this.phone = phone;
        }
        else{
            this.phone="000.000.0000";
        }
    }

    @Override
    public String toString() {
        String status;
        
        if(this.status=true){
            status="Available";
        }
        status="Unavaible";
       return String.format("%d,%s,%s,%s,%s", id,name,address,phone,status);
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