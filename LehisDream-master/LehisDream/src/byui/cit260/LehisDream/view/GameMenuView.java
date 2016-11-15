/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.view;

import byui.cit260.LehisDream.control.GameControl;
import java.util.Scanner;
import lehisdream.LehisDream;

/**
 *
 * @author smith
 */
public class GameMenuView extends View{

    
   public GameMenuView() {
          super("\n"
              + "\n-------------------------------------------"
              + "\n| Game Menu                               |"
              + "\n-------------------------------------------"
              + "\nV - View Path"
              + "\nM - Move Forward"
              + "\nB - Visit Bishop's office"
              + "\nP - Go to Backpack"
              + "\nG - At Home"
              + "\nC - At Church"
              + "\nS - Save game"
              + "\nH - Help"
              + "\nQ - Quit"
              + "\n-------------------------------------------");
}

    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "V": // view path
                this.viewPath();
                break;
            case "M": // view path
                this.moveForward();
                break;    
            case "B": // visit Bishop's office
                this.bishopsOffice();
                break;
            case "P": // go to backpack
                this.goToBackpack();
                break;
            case "G": //go to home
                this.atHome();
                break;
            case "C": //
                this.atChurch();
                break;
            case "S": // save the current game
                this.saveGame();
                break;
            case "H": // Go to Help
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void displayHelpMenu() {
        //display the game menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
    private void saveGame() {
        SaveGameView.SaveGame();
    }
    
    private void viewPath() {
        System.out.println("*** viewPath function called ***");
    }

    private void bishopsOffice() {
       BishopsOfficeView bishopsOffice = new BishopsOfficeView();
       bishopsOffice.display();
    }

    private void goToBackpack() {
        
        BackpackView backPack = new BackpackView();
        backPack.display();
    }
    private void moveForward() {
        System.out.println("*** moveForward function called ***");          
    }
    private void atHome() {
        AtHomeView atHome = new AtHomeView();
        atHome.displayAtHomeView();
    }
    private void atChurch() {     
        AtChurchView atChurch = new AtChurchView();
        atChurch.displayAtChurchView();
    }
    }
     

