/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author EthicalH1
 */
public class Backpack implements Serializable{
    
    //class instance variables
    
    private Game ironrodgame;
    private Item[] items;

    public Backpack() {
        
    }

    public Game getIronrodgame() {
        return ironrodgame;
    }

    public void setIronrodgame(Game ironrodgame) {
        this.ironrodgame = ironrodgame;
    }
    
    

}