/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.view;

import byui.cit260.LehisDream.control.GameControl;
import byui.cit260.LehisDream.model.Player;


/**
 *
 * @author smith
 */
public class StartProgramView extends View{
   
    public StartProgramView() {
       //promptMessage = "Please enter your name"
       
      super("\nPlease enter your name: ");
       //display the banner when view is created
       this.displayBanner();
    }
    
    public void displayBanner() {
      
       System.out.println(
               "\n**************************************************************"
              +"\n*                                                             *"
              +"\n* This is the game of Lehi's Dream.                         *"
              +"\n* In this game you will follow a path to try to make it to    *"
              +"\n* the Tree of Life. The rod represents the word of God.       *"
              +"\n* If you fail to make it to the tree, you                     *"
              +"\n* will find yourself at the Great and Spacious Building.       *"
              +"\n*                                                             *"
              +"\n* Along the path, you will encounter challenges and obstacles *"
              +"\n* where you must decide what to do in situations. You will    *"
              +"\n* need to overcome them in order to advance on the path. If   *"
              +"\n* you run out of energy before you reach the tree, the game   *"
              +"\n* will end and you will end up at the great and spacious      *"
              +"\n* building.                                                   *"
              +"\n*                                                             *"
              +"\n* Good luck in arriving at the Tree of Life.                  *"
              +"\n*                                                             *"
              +"\n***************************************************************" 
       );
    }

    @Override    
    public boolean doAction(String playersName) {
        if (playersName.length() < 2){
       System.out.println("\nInvalid players name: "
                       + "The name must be greater than one character in length");
            return false;
    }
        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) {//if unsuccessful
            System.out.println("\nError creating the player.");
            return false;
        }
        //display next view
        this.displayNextView(player);
        
        return true; //success!
    }
            
    private void displayNextView(Player player) {
        
        //display a custom welcome message
        System.out.println("\n========================================="
                          + "\n Welcome to the game " + player.getName()
                          + "\n We hope you have a lot of fun!"
                          +"\n========================================="
                           );
        //Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
                
        //Display the main menu view
        mainMenuView.display();
    }
}


    
