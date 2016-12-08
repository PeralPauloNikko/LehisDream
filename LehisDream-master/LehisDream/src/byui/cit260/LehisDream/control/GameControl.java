/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.control;

import byui.cit260.LehisDream.exceptions.GameControlException;
import byui.cit260.LehisDream.model.Game;
import byui.cit260.LehisDream.model.Location;
import byui.cit260.LehisDream.model.Map;
import byui.cit260.LehisDream.model.Player;
import byui.cit260.LehisDream.model.Scene;
import byui.cit260.LehisDream.model.SceneType;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
        player.setEnergyLevel(100);
        
        LehisDream.setPlayer(player);//save the player

        return player;
    }

    public static void createNewGame(Player player) {
        Game game = new Game();
        LehisDream.setCurrentGame(game);

        game.setPlayer(player);

        Map map = MapControl.createMap();
        game.setMap(map);

        MapControl.movePlayerToStartingLocation(map);

    }

    public static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] location = map.getLocations();
        
        location[0][0].setScene(scenes[SceneType.start.ordinal()]);
        location[0][1].setScene(scenes[SceneType.frontDoor.ordinal()]);
        location[0][2].setScene(scenes[SceneType.laundryRoom.ordinal()]);
        location[0][3].setScene(scenes[SceneType.livingRoom.ordinal()]);
        location[0][4].setScene(scenes[SceneType.bedroom.ordinal()]);
//        location[1][0].setScene(scenes[SceneType.kitchen.ordinal()]);
        location[1][0].setScene(scenes[SceneType.cafeteria.ordinal()]);
        location[1][1].setScene(scenes[SceneType.auditorium.ordinal()]);
        location[1][2].setScene(scenes[SceneType.office.ordinal()]);
        location[1][3].setScene(scenes[SceneType.library.ordinal()]);
        location[1][4].setScene(scenes[SceneType.playground.ordinal()]);
        location[2][0].setScene(scenes[SceneType.meatDept.ordinal()]);
        location[2][1].setScene(scenes[SceneType.deliShoppe.ordinal()]);
        location[2][2].setScene(scenes[SceneType.dairyAisle.ordinal()]);
        location[2][3].setScene(scenes[SceneType.produceAisle.ordinal()]);
        location[2][4].setScene(scenes[SceneType.customerService.ordinal()]);
        location[3][0].setScene(scenes[SceneType.theatreOne.ordinal()]);
        location[3][1].setScene(scenes[SceneType.theatreTwo.ordinal()]);
        location[3][2].setScene(scenes[SceneType.theatreThree.ordinal()]);
        location[3][3].setScene(scenes[SceneType.theatreFour.ordinal()]);
        location[3][4].setScene(scenes[SceneType.theatreFive.ordinal()]);
        location[4][0].setScene(scenes[SceneType.chapel.ordinal()]);
        location[4][1].setScene(scenes[SceneType.primaryRoom.ordinal()]);
        location[4][2].setScene(scenes[SceneType.culturalHall.ordinal()]);
        location[4][3].setScene(scenes[SceneType.reliefSocietyRoom.ordinal()]);
        location[4][4].setScene(scenes[SceneType.classroom.ordinal()]);

    }

    public static void saveGame(Game currentGame, String filePath) 
            throws GameControlException {
        
        try( FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(currentGame);
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        
    }  
}
    public static void getSavedGame(String filepath) 
                    throws GameControlException {
        
        Game game = null;
        
        try(FileInputStream fips = new FileInputStream(filepath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject(); // read the game object from file
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
        
        // close the output file
        LehisDream.setCurrentGame(game);  //save in LehisDream
    }
}
