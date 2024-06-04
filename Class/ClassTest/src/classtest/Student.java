/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classtest;

/**
 *
 * @author GIGABYTE
 */
public class Student {
    String id;
    String student;
    public Student()
    {
        id = "000";
        student = "Lol";
    }
    public String getid(String string)
    {
        return id;
    }
    public String getname(String tec)
    {
        return student;
    }
    public void Student(String id, String student) throws Exception
    {   
        if(id.isEmpty())
        {
            throw new Exception("Id Invalid");
        }
        if(student.isEmpty())
        {
            throw new Exception("No student name");
        }
        this.id = id;
        this.student = student;
    }

    public void print() {
        System.out.println("Student Info:");
        System.out.printf("Id:%s,FullName:%s\n",id,student.toUpperCase());
    }
    @Override
    public String toString() 
    {
        return String.format("Id:%s, Fullname: %s",id,Student());
    }
}
