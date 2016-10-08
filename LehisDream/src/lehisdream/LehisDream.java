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
/**
 *
 * @author EthicalH1
 */
public class LehisDream {
    
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
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        teamTest();
        aprilTest();
        
     
    }
    

    
}