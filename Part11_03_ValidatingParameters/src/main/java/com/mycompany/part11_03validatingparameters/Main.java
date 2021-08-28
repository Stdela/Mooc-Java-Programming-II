
package com.mycompany.part11_03validatingparameters;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Person person1 = new Person("DDSJALDDLKSAJDKLSAJDLJASLDASDJDJAJDJSAJDLJSALDJLSAJDLASJ", 133);
      Calculator calculator1 = new Calculator();
      calculator1.factorial(-1);
      calculator1.binomialCoefficent(1, 4);
        System.out.println(person1);
    }

}
