
package com.mycompany.part9_3_animals;

/**
 *
 * @author delam
 */
public class Dog extends Animal implements NoiseCapable{
private String name;

    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super("Dog");
        
    }


@Override
  void eat(){
    System.out.println(super.getName()+ " eats");
}
@Override
  void sleep(){
    System.out.println(super.getName() + " sleeps");   
}  
  
@Override
  public void makeNoise(){
      this.bark();
  }
  
  
  public void bark(){
      System.out.println(super.getName() + " barks");
  }
}
