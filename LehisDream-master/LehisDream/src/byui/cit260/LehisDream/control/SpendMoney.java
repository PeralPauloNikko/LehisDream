/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.control;

import byui.cit260.LehisDream.exceptions.SpendMoneyException;

/**
 *
 * @author fairy_000
 */
public class SpendMoney {
    public static double CalculateBalance(double currentBalance, double itemCost)throws SpendMoneyException{       
        if (currentBalance < itemCost) {
            throw new SpendMoneyException("Sorry, you cannot purchase this because "
                            + "you only have $" + currentBalance + " left.");
                   
                }
        return currentBalance - itemCost;
    }
    
}
