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
public enum Color {

    RED(1.4), ORANGE(1.5), YELLOW(1.6), GREEN(1.7), BLUE(1.8), INDIGO(1.9), VIOLET(2.0);
    private double price;

    private Color(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

}
