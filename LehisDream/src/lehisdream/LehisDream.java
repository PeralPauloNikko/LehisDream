/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lehisdream;

import byui.cit260.LehisDream.model.Player;

/**
 *
 * @author EthicalH1
 */
public class LehisDream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Lehi");
        playerOne.setEnergyLeft(100);
        
     String playerInfo = playerOne.toString();
     System.out.println(playerInfo);
    }
    
}
