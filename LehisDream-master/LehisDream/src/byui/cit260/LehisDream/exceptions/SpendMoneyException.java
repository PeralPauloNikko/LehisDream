/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.exceptions;

/**
 *
 * @author fairy_000
 */


public class SpendMoneyException extends Exception {

    public SpendMoneyException() {
    }

    public SpendMoneyException(String string) {
        super(string);
    }

    public SpendMoneyException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public SpendMoneyException(Throwable thrwbl) {
        super(thrwbl);
    }

    public SpendMoneyException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
    
    
}

