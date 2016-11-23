/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.view;

import byui.cit260.LehisDream.model.Game;
import byui.cit260.LehisDream.model.Map;
import byui.cit260.LehisDream.model.Scene;
import lehisdream.LehisDream;

/**
 *
 * @author smith
 */
public class QuestionMenuView extends View {
   private Scene currentScene;
   private Game game;
   
public QuestionMenuView() {
   super("");
   game = LehisDream.getCurrentGame(); // retreive the game
   Map map = game.getMap(); // retreive the map from game
   currentScene =  map.getCurrentLocation().getScene();
   String question = currentScene.getQuestion().getCurrentQuestion()+
   "\n\r 1-"+currentScene.getQuestion().getAnswer1()+
   "\n\r 2-"+currentScene.getQuestion().getAnswer2()+
   "\n\r 3-"+currentScene.getQuestion().getAnswer3()+
   "\n\r 4-"+currentScene.getQuestion().getAnswer4();
   
   displayMessage = question;
   
    
}

@Override
public boolean doAction(String choice) {
     int ichoice = Integer.parseInt(choice);
     double currentEnergy = game.getPlayer().getEnergyLevel();
     
    if (ichoice == currentScene.getQuestion().getCorrectAnswer()){
        System.out.println("You are correct. Your energy will now be increased by 2%.");
        currentEnergy += 2;
        
        if(currentEnergy  > 100) {
            currentEnergy = 100;
        }
        
        game.getPlayer().setEnergyLevel(currentEnergy);
        
        System.out.println("Your current energy is now " + currentEnergy);
        if (currentScene.getQuestion().isStore()){
            AtStoreView atStore = new AtStoreView();
            atStore.display();
        }
//        if (currentScene.getQuestion().isStore()){
//            AtStoreView atStore = new AtStoreView();
//            atStore.display();
//todo change infor to thetre view class
//        }
//
     return true;           //TODO finish println for correct answer & energy level
    }
    System.out.println("You are incorrect. You lose 3% energy.");
        currentEnergy -= 3;
        game.getPlayer().setEnergyLevel(currentEnergy);
        System.out.println("Your current energy is now " + currentEnergy);
    return true;
}  
}