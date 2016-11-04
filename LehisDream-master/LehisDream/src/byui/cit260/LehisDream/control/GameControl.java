/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.control;
import byui.cit260.LehisDream.model.Player;
import lehisdream.LehisDream;

/**
 *
 * @author smith
 */
public class GameControl {

    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }
        Player player = new Player();
        player.setName(name);
        
        LehisDream.setPlayer(player);//save the player
        
        return player;
        
    }

    public static void createNewGame(Player player) {
       System.out.println("\n*** createNewGame stub function called ***");
    }
    }
    

