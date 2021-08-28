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
public class CustomTacoBox implements TacoBox {
    private int InitialTacos;

    public CustomTacoBox(int tacos) {
        this.InitialTacos = InitialTacos;
    }
    
    
    @Override
    public void eat(){
        if (this.InitialTacos>0) {
            this.InitialTacos--;
        }
    
}
    @Override
    public int tacosRemaining(){
    return this.InitialTacos;
}
}
