
package com.mycompany.part9_3_animals;


public class Cat extends Animal implements NoiseCapable {

    public Cat() {
        super("Cat");
    }
    public Cat(String name) {
        super(name);
    }


     @Override
  void eat(){
    System.out.println(super.getName()+ " eats");
}

  
    @Override
  public void makeNoise(){
      this.purr();
  }
  
  void purr(){
    System.out.println(super.getName() + " purrrss");   
}  
     
     
    }

   
