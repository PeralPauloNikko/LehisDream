/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.view;

import byui.cit260.LehisDream.control.GameControl;
import lehisdream.LehisDream;

/**
 *
 * @author smith
 */
public class MainMenuView extends View {
    
   
    
public MainMenuView() {
          super("\n"
              + "\n-------------------------------------------"
              + "\n| Main Menu                               |"
              + "\n-------------------------------------------"
              + "\nN - Start new game"
              + "\nR - Restart saved game"
              + "\nH - Get Help on how to play the game"
              + "\nS - Save game"
              + "\nQ - Quit"
              + "\n-------------------------------------------");

}
    
@Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "N": // create and start a new game
                this.startNewGame();
                break;
            case "R": // restart an existing game
                this.restartExistingGame();
                break;
            case "H": // display the help menu
                this.displayHelpMenu();
                break;
            case "S": // save the current game
                this.saveGame();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {
        // create a new game
        GameControl.createNewGame(LehisDream.getPlayer());
        
      // display the game menu
       GameMenuView gameMenu = new GameMenuView();
       gameMenu.display();
    }

    private void restartExistingGame() {
        this.console.println("*** restartExistingGame function called ***");
    }

    private void displayHelpMenu() {
        
        //display the game menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        SaveGameView.SaveGame();
    }


    }
    

