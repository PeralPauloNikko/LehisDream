/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.exceptions;

/**
 *
 * @author smith
 */
public class HouseControlException extends Exception {

    public HouseControlException() {
    }

    public HouseControlException(String string) {
        super(string);
    }

    public HouseControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public HouseControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public HouseControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
    
    
}
