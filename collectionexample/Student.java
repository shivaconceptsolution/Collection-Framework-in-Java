/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionexample;

/**
 *
 * @author Hp
 */
public class Student {

    
    private int rno;
    private String sname;
    private int fees;
    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }
    
    Student(int rno,String sname,int fees)
    {
        this.rno=rno;
        this.sname=sname;
        this.fees=fees;
    }
    
    public String toString()  //when we print object
    {
        return "rno is "+rno+" name is "+sname +"Fees is "+fees;
    }

   
}
