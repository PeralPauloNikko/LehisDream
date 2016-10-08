/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lehisdream;

import byui.cit260.LehisDream.model.Player;
import byui.cit260.LehisDream.model.IronRodGame;
/**
 *
 * @author EthicalH1
 */
public class LehisDream {
    
    public static void teamTest(){
        Player playerOne = new Player();
        
        playerOne.setName("Lehi");
        playerOne.setEnergyLeft(100);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }

    public static void aprilTest(){
        IronRodGame gameOne = new IronRodGame();
        
        gameOne.setTotalEnergy(100);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        teamTest();
        aprilTest();
        
     
    }
    

    
}