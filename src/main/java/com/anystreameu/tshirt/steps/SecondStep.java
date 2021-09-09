/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anystreameu.tshirt.steps;

import com.anystreameu.tshirt.models.TShirt;
import com.anystreameu.tshirt.utilities.Validation;
import java.util.List;




/**
 *
 * @author Chris
 */
public class SecondStep {

    /*
        The user choose payment method.
    */
    public void secondWindow(List<TShirt> tshirts){

        System.out.println("");
        System.out.println("================");
        System.out.println("Types for payment");
        System.out.println("");
        System.out.println("Press 1.  Would you like pay With Cash? +(3.00 €)");
        System.out.println("Press 2.  Would you like pay With Credit/Debit Card? +(0.00 €)");
        System.out.println("Press 3. Would you like pay With Transfer Bank? +(0.00 €)");
        System.out.println("================");
        
            switch(Validation.ifWriteString(1, 3)){
                //case 1 pay on delivery
                case 1:
                    CashStep cs = new CashStep();
                    cs.homeDetails(tshirts);
                    break;
                //case 2 pay with card
                case 2:
                    CardStep cardStep = new CardStep();
                    cardStep.insertCardDetails(tshirts);
                    break;
                //case 3 pay with bank transfer.
                case 3:
                    BankTransferSetp bt = new BankTransferSetp();
                    bt.insertBankDetails(tshirts);
                    break;
            
            }
    }
}
