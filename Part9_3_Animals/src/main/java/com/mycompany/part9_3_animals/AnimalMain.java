
package com.mycompany.part9_3_animals;
import java.util.Scanner;

public class AnimalMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 NoiseCapable dog = new Dog();
dog.makeNoise();

NoiseCapable cat = new Cat("Garfield");
cat.makeNoise();
Cat c = (Cat) cat;
c.purr();
    }

}
