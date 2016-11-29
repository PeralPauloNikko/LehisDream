/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lehisdream;


import byui.cit260.LehisDream.model.Player;
import byui.cit260.LehisDream.model.Game;
import byui.cit260.LehisDream.model.Location;
import byui.cit260.LehisDream.model.Scene;
import byui.cit260.LehisDream.model.TreeOfLife;

//nikkoTest
//import byui.cit260.LehisDream.model.Backpack;
import byui.cit260.LehisDream.model.Actor;
import byui.cit260.LehisDream.model.Map;
import byui.cit260.LehisDream.model.Item;
import byui.cit260.LehisDream.model.Question;

import byui.cit260.LehisDream.view.StartProgramView;

/**
 *
 * @author EthicalH1
 */
public class LehisDream {
    
    private static Game currentGame = null;
    private static Player player = null;
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        StartProgramView startProgramView = new StartProgramView();
        try {
            //create StartProgramView and display the start program view
            startProgramView.display();
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.display();
        }
    }


    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        LehisDream.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        LehisDream.player = player;
    }
    
    public static void teamTest(){
        //Player Test
        Player playerOne = new Player();
        
        playerOne.setName("Lehi");
        playerOne.setEnergyLevel(100);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }

    public static void aprilTest(){
        
        //IronRodGame Test
        Game gameOne = new Game();
        
//        gameOne.setTotalEnergy(100);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        //Location Test
        Location place = new Location();
        
//        place.setVisited("Start");
        place.setEnergyRemaining(50);
        place.setRow(1);
        place.setColumn(1);
       
        String locationInfo = place.toString();
        System.out.println(locationInfo);
        
        //Tree of Life Test
        TreeOfLife prize = new TreeOfLife();
        
        prize.setPrizeAcquired("Tree of Life");
        
        String prizeInfo = prize.toString();
        System.out.println(prizeInfo);
        
        //Scene Test
        Scene portrait = new Scene();
        
        portrait.setDescription("This is the starting place");
//        portrait.setLocation("Start Spot");
//        
        String sceneInfo = portrait.toString();
        System.out.println(sceneInfo);
        
    }
    
    
    public static void nikkoTest() {
    //BackPack
//    Backpack backPackOne = new Backpack();
    
//    backPackOne.setItemsInStock("");
//    
//    String backPackInfo = backPackOne.toString();
//    System.out.println(backPackOne);
//    
   
    //Map Test
    Map gps = new Map();
    
//    gps.setVisited("");
//    gps.setRowCount("");
//    gps.setRowCount("");
//    
    String mapInfo = gps.toString();
    System.out.println(mapInfo);
    
    //Item Test
    Item stuff = new Item();
    
    stuff.setCost(5);
//    stuff.setDescription("These are the things available in your backpack");
    stuff.setEnergyAdd(25);
    stuff.setCost(5);
    
    String itemInfo = stuff.toString();
    System.out.println(itemInfo);
    
    //Question Test
//    Question questionOne = new Question();
//    
//    questionOne.setYesOrNoPrompt("Yes");
//    questionOne.setYesOrNoPrompt("No");
//    questionOne.setMultipleChoice("");
//    questionOne.setAction("");
    
    
//    String questionOneInfo = questionOne.toString();
//    System.out.println(questionOneInfo);
    
   
    
    
    }
    
    
  
   
    
    

    
}