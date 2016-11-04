/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lehisdream;

import byui.cit260.LehisDream.model.AtChurch;
import byui.cit260.LehisDream.model.AtHome;
import byui.cit260.LehisDream.model.AtSchool;
import byui.cit260.LehisDream.model.Player;
import byui.cit260.LehisDream.model.IronRodGame;
import byui.cit260.LehisDream.model.Location;
import byui.cit260.LehisDream.model.Scene;
import byui.cit260.LehisDream.model.TreeOfLife;

//nikkoTest
import byui.cit260.LehisDream.model.BackPack;
import byui.cit260.LehisDream.model.Person;
import byui.cit260.LehisDream.model.Map;
import byui.cit260.LehisDream.model.Item;
import byui.cit260.LehisDream.model.Question;
import byui.cit260.LehisDream.model.AtStore;
import byui.cit260.LehisDream.model.AtTheatre;
import byui.cit260.LehisDream.view.StartProgramView;

/**
 *
 * @author EthicalH1
 */
public class LehisDream {
    
    private static Game currentGame = null;
    private static Player player = null;

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
        playerOne.setEnergyLeft(100);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }

    public static void aprilTest(){
        
        //IronRodGame Test
        IronRodGame gameOne = new IronRodGame();
        
        gameOne.setTotalEnergy(100);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        //Location Test
        Location place = new Location();
        
        place.setVisited("Start");
        place.setEnergyRemaining(50);
        place.setRow(1);
        place.setColumn(1);
        place.setZone(1);
        
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
        portrait.setLocation("Start Spot");
        
        String sceneInfo = portrait.toString();
        System.out.println(sceneInfo);
        
        //At Home Test
        AtHome room = new AtHome();
        
        room.setHomeDescription("Living Room");
        room.setHomeLocation("Zone 1");
        
        String homeInfo = room.toString();
        System.out.println(homeInfo);
       
        //At School Test
        AtSchool classroom = new AtSchool();
        
        classroom.setSchoolDescription("Classroom");
        classroom.setSchoolLocation("Zone 2");
        
        String schoolInfo = classroom.toString();
        System.out.println(schoolInfo);
        
        //At Church Test
        AtChurch facility = new AtChurch();
        
        facility.setChurchDescription("Chapel");
        facility.setChurchLocation("Zone 5");
        
        String churchInfo = facility.toString();
        System.out.println(churchInfo);
    }
    
    
    public static void nikkoTest() {
    //BackPack
    BackPack backPackOne = new BackPack();
    
    backPackOne.setItemsInStock("");
    
    String backPackInfo = backPackOne.toString();
    System.out.println(backPackOne);
    
    //Person Test
    Person personOne = new Person();
    
    personOne.setCoordinates("Home");
    personOne.setPositiveNegativeEnergy(100);
    
    String personOneInfo = personOne.toString();
    System.out.println(personOne);
    
    //Map Test
    Map gps = new Map();
    
    gps.setVisited("");
    gps.setRowCount("");
    gps.setRowCount("");
    
    String mapInfo = gps.toString();
    System.out.println(mapInfo);
    
    //Item Test
    Item stuff = new Item();
    
    stuff.setCost(5);
    stuff.setDescription("These are the things available in your backpack");
    stuff.setEnergyAdd(25);
    stuff.setCost(5);
    
    String itemInfo = stuff.toString();
    System.out.println(itemInfo);
    
    //Question Test
    Question questionOne = new Question();
    
    questionOne.setYesOrNoPrompt("Yes");
    questionOne.setYesOrNoPrompt("No");
    questionOne.setMultipleChoice("");
    questionOne.setAction("");
    
    
    String questionOneInfo = questionOne.toString();
    System.out.println(questionOneInfo);
    
    //AtStore Test
    AtStore buySell = new AtStore();
    
    buySell.setStoreDescription("Buy and Sell Stuff for your long journey!");
    buySell.setGetPurchasedItem("Energy Bar, Water, Energy Drink");
    
    String buySellInfo = buySell.toString();
    System.out.println(buySellInfo);
    
    //AtTheatre Test
    AtTheatre theatreLocation = new AtTheatre();
    
    theatreLocation.setAtTheatreDescription("The theatre! It's dark inside!");
    theatreLocation.setCalculateAdmission("$25");
    
    String theatreLocationInfo = theatreLocation.toString();
    System.out.println(theatreLocationInfo);
    
    
    
    
    }
    
    
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create StartProgramViewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
    }

    private static class Game {

        public Game() {
        }
    }
    

    
}