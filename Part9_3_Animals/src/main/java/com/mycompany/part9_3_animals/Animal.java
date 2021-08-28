
package com.mycompany.part9_3_animals;


public abstract class Animal {
private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }
 void eat(){
    System.out.println(this.name + " eats");
}
void sleep(){
    System.out.println(this.name + " sleeps");   
}  

    public String getName() {
        return name;
    }

}
