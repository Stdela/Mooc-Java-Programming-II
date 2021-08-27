
package com.mycompany.part9_01_personandsubclasses;

/**
 *
 * @author delam
 */
public class Student extends Person {
    private int Credits;

    public Student() {
    }

    public Student(String name, String address) {
        super(name, address);
        this.Credits = 0;
    }

    

    public int getCredits() {
        return Credits;
    }

    public void setCredits(int Credits) {
        this.Credits = Credits;
    }

    @Override
    public String toString() {
        return super.toString() +"\n"+ "Study credits " + Credits ;
    }
    
    public void study(){
        this.Credits++;
    }
}
