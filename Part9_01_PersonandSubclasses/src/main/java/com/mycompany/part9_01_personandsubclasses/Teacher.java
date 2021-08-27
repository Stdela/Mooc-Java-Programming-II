/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part9_01_personandsubclasses;

/**
 *
 * @author delam
 */
public class Teacher extends Person {
    private int salary;

    public Teacher() {
    }

    public Teacher(int salary, String name, String address) {
        super(name, address);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n salary=" + salary + " euros per month";
    }
    
}
