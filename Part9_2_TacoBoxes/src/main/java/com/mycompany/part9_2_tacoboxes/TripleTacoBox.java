/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part9_2_tacoboxes;

/**
 *
 * @author delam
 */
public class TripleTacoBox implements TacoBox {
private int tacos = 3;

@Override
public void eat(){
    if (this.tacos>0) {
        this.tacos--;
    }
    
}
@Override
public int tacosRemaining(){
    return this.tacos;
}

   
    
}
