/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anystreameu.tshirt.models;

/**
 *
 * @author Chris
 */
public enum Fabric {
    
    WOOL(1.4), COTTON(1.5),  POLYESTER(1.6),  RAYON(1.7),  LINEN(1.8),  CASHMERE(1.9),  SILK(2.0);
    
    private double price;
    
    private Fabric(double price){
        this.price = price;
    }
 
    public double getPrice(){
        return this.price;
    }
}
