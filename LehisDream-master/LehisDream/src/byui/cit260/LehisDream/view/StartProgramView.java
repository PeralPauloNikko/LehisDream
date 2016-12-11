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
      
//       this.console.println(
//               "\n**************************************************************"
//              +"\n*                                                             *"
//              +"\n* This is the game of Lehi's Dream.                         *"
//              +"\n* In this game you will follow a path to try to make it to    *"
//              +"\n* the Tree of Life. The rod represents the word of God.       *"
//              +"\n* If you fail to make it to the tree, you                     *"
//              +"\n* will find yourself at the Great and Spacious Building.       *"
//              +"\n*                                                             *"
//              +"\n* Along the path, you will encounter challenges and obstacles *"
//              +"\n* where you must decide what to do in situations. You will    *"
//              +"\n* need to overcome them in order to advance on the path. If   *"
//              +"\n* you run out of energy before you reach the tree, the game   *"
//              +"\n* will end and you will end up at the great and spacious      *"
//              +"\n* building.                                                   *"
//              +"\n*                                                             *"
//              +"\n* Good luck in arriving at the Tree of Life.                  *"
//              +"\n*                                                             *"
//              +"\n***************************************************************" 
//               );
       this.console.println(
               
    "           OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO           \r\n"
    +"         OO                                                     OO         \r\n"
    +"       OOO                                                       OOO       \r\n "
    +"  OOOOOO                                                          OOOOOO   \r\n"
    +"OOOOOOO                                                             OOOOOOO\r\n"
    +"OOOOOOO             This is the game of Lehi's Dream.               OOOOOOO\r\n"
    +"OOOOOOO  In this game you will follow a path to try to make it to   OOOOOOO\r\n"
    +"OOOOOOO    the Tree of Life. The rod represents the word of God.    OOOOOOO\r\n"
    +"      O          If you fail to make it to the tree, you            O      \r\n"      
    +"      O   will find yourself at the Great and Spacious Building.    O      \r\n"
    +"OOOOOOO                                                             OOOOOOO\r\n"
    +"OOOOOOO Along the path, you will encounter challenges and obstacles OOOOOOO\r\n"              
    +"OOOOOOO  where you must decide what to do in situations. You will   OOOOOOO\r\n"
    +"OOOOOOO  need to overcome them in order to advance on the path. If  OOOOOOO\r\n"
    +"      O  you run out of energy before you reach the tree, the game  O      \r\n"
    +"      O  will end and you will end up at the great and spacious     O      \r\n"
    +"OOOOOOO                          building.                          OOOOOOO\r\n"
    +"OOOOOOO                                                             OOOOOOO\r\n"
    +"OOOOOOO         Good luck in arriving at the Tree of Life.          OOOOOOO\r\n"
    +"  OOOOOO                                                         OOOOOOO   \r\n"
    +"      OOO                                                       OOO        \r\n"
    +"       OO                                                      OO          \r\n"
    +"        OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO           \r\n"
    +"                                            OO                             \r\n"        
    +"                                          O   O                            \r\n"
    +"                                          O   O                            \r\n"
    +"                                            OO                             \r\n"
    +"                                              OO                           \r\n"
    +"                                             O   O                         \r\n"
    +"                                             O   O                         \r\n"
    +"                                              OO                           \r\n"
    );
    }
    @Override    
    public boolean doAction(String playersName) {
        if (playersName.length() < 2){
       ErrorView.display(this.getClass().getName(),"\nInvalid players name: "
                       + "The name must be greater than one character in length");
            return false;
    }
        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) {//if unsuccessful
            ErrorView.display(this.getClass().getName(),"\nError creating the player.");
            return false;
        }
        //display next view
        this.displayNextView(player);
        
        return true; //success!
    }
            
    private void displayNextView(Player player) {
        
        //display a custom welcome message
        this.console.println("\n========================================="
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


    
