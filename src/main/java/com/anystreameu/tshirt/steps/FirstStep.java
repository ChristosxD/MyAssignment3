/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anystreameu.tshirt.steps;

import com.anystreameu.tshirt.custom.Basket;
import com.anystreameu.tshirt.custom.Custom;
import com.anystreameu.tshirt.data.DammyData;
import com.anystreameu.tshirt.models.Color;
import com.anystreameu.tshirt.models.Fabric;
import com.anystreameu.tshirt.models.Size;
import com.anystreameu.tshirt.models.TShirt;
import com.anystreameu.tshirt.utilities.Validation;
import java.util.List;

/**
 *
 * @author Chris
 */
public class FirstStep {

    /* 
    Print my dammy data
     */
    public void printTShirts() {
        for (int i = 0; i < Custom.getCustom().size(); i++) {
            System.out.println(i + 1 + ") T-Shirt \n" + Custom.getCustom().get(i).getBrand());
            System.out.println("");

        }
    }

    public void firstWindow() {
        System.out.println("|===================|");
        System.out.println("|Welcome In My Shop |");
        System.out.println("|===================|");
        System.out.println("");

        DammyData.myData();

        printTShirts();

        System.out.println("");
        System.out.println("===================");
        System.out.println("Add Item/s In Your Basket");
        System.out.println("===================");

        itemsInBasket();

    }

    /* 
    In this method, the user with input choose from my dammy data,
    and fill the basket list
     */
    public void itemsInBasket() {
        Basket basket = new Basket();
        boolean exit = false;
        while (!exit) {
            List<TShirt> copyList = Custom.getCustom();
            int addTshirt = Validation.ifWriteString(1, Custom.getCustom().size());
            System.out.println("===================");
            TShirt ckeckedTshirt = Custom.getCustom().get(addTshirt - 1);

            ckeckedTshirt.setColor(getColor());

            ckeckedTshirt.setSize(getSize());
          
            ckeckedTshirt.setFabric(getFabric());
            
            System.out.println("===================");
            TShirt completedTshirt = new TShirt(ckeckedTshirt.getBrand(), ckeckedTshirt.getColor(), ckeckedTshirt.getSize(), ckeckedTshirt.getFabric());
            basket.addTShirt(completedTshirt);

            double totalBasketPrice = 0.0;
            System.out.println("YOUR BASKET :");
            System.out.println("");
            for (int i = 0; i < basket.getTshirts().size(); i++) {
                totalBasketPrice += basket.getTshirts().get(i).getPrice();
                System.out.println(i + 1 + ")" + basket.getTshirts().get(i).getBrand() + "\n" + basket.getTshirts().get(i).getColor()
                        + ", " + basket.getTshirts().get(i).getSize()
                        + ", " + basket.getTshirts().get(i).getFabric());
            }
            System.out.println(" Total price : " + "\n" + totalBasketPrice + "€");
            System.out.println("");
            System.out.println("===================");
            System.out.println("Would you like add  any other T-Shirt in your Basket?");
            System.out.println("Press 1) for add, Press 2) for payment.");
            switch (Validation.ifWriteString(1, 2)) {
                case 1:
                    printTShirts();
                    System.out.println("");
                    System.out.println("===============");
                    System.out.println("Choose Another One T-Shirt");
                    continue;
                case 2:
                    // here i send the user with filled basket for pay payment.
                    SecondStep ss = new SecondStep();
                    ss.secondWindow(basket.getTshirts());
                    exit = true;
                    break;
            }
        }
    }

    
    /*
    Pring all Colors and user choose color
    */
    public Color getColor() {

        for (int i = 0; i < Color.values().length; i++) {
            System.out.println(i + 1 + ") " + Color.values()[i]);

        }
        System.out.println("===================");
        System.out.println("Please Choose Color");
        System.out.println("===================");
        return Color.values()[Validation.ifWriteString(1, Color.values().length) - 1];
    }

    /*
    Pring all Size and user choose size
    */
    public Size getSize() {
        System.out.println("===================");
        for (int i = 0; i < Size.values().length; i++) {
            System.out.println(i + 1 + ") " + Size.values()[i]);
        }
        System.out.println("===================");
        System.out.println("Please Choose Size");
        System.out.println("===================");
        return Size.values()[Validation.ifWriteString(1, Size.values().length) - 1];
    }
    
    /*
    Pring all Fabric and user choose fabric
    */
    
    public Fabric getFabric(){
    
            System.out.println("===================");
            for (int i = 0; i < Fabric.values().length; i++) {
                System.out.println(i + 1 + ") " + Fabric.values()[i]);

            }
            System.out.println("===================");
            System.out.println("Please Choose Fabric");
            System.out.println("===================");
            return Fabric.values()[Validation.ifWriteString(1, Fabric.values().length) - 1];
    }
}
