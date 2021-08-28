
package com.mycompany.part9_2_packable;

import java.util.ArrayList;


public class Box implements Packable  {
ArrayList<Packable> boxes;
double maxWeight;


    public Box() {
     
    }

    public Box(double maxWeight) {
        
        this.maxWeight = maxWeight;
        this.boxes = new ArrayList<>();
    }
   public void add(Packable packable){
       this.boxes.add(packable);
       
       }
   
   
    @Override
    public String toString() {
        return " Amount of items " + this.boxes.size() +" , "+ this.weight() + " total kilos";
    }
   @Override
    public double weight(){
        double weight= 0;
        for (Packable box : boxes) {
           weight += box.weight();
           
       }
        return weight;
    }
   
   }

    
   


