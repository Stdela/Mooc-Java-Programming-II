package com.mycompany.part11_03validatingparameters;

/**
 *
 * @author delam
 */
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (name.length()>40 || name.isEmpty()|| name == null) {
            throw new IllegalArgumentException("Name must be under 40 char, and can't be empty nor null. "); 
        }
        this.name = name;
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age must be between 0 and 120");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }
    
}
