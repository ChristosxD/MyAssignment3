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
public enum Size {
   
    XS(1.5), S(1.6),M(1.7),L(1.8), XL(1.9), XXL(2.0), XXXL(2.0);
    
    private double price;
    
    private Size(double price){
        this.price = price;
    }
 
    public double getPrice(){
        return this.price;
    }
}
