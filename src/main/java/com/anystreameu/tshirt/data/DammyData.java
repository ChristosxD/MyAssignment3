/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anystreameu.tshirt.data;

import com.anystreameu.tshirt.custom.Custom;
import com.anystreameu.tshirt.models.Color;
import com.anystreameu.tshirt.models.Fabric;
import com.anystreameu.tshirt.models.Size;
import com.anystreameu.tshirt.models.TShirt;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
/**
 *
 * @author Chris
 */
public class DammyData {
    
    
    public static void myData(){
        List<TShirt> tshirts = new ArrayList();
        Custom custom = new Custom();
        TShirt t1 = new TShirt("NIKE");
        TShirt t2 = new TShirt("AIR JORDAN");
        TShirt t3 = new TShirt("ADIDAS");
        TShirt t4 = new TShirt("PUMA");
        TShirt t5 = new TShirt("ADMIRAL");
        TShirt t6 = new TShirt("UDER ARMOUR");
        Collections.addAll(tshirts,t1,t2,t3,t4,t5,t6);
        custom.addTshirt(tshirts);
    }
    
}
