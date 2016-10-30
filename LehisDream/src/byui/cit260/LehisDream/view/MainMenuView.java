/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.view;

/**
 *
 * @author smith
 */
public class MainMenuView {
    private String menu;
    
public MainMenuView() {
    this.menu = "\n"
              + "\n-------------------------------------------"
              + "\n| Main Menu                               |"
              + "\n-------------------------------------------"
              + "\nN - Start new game"
              + "\nR - Restart saved game"
              + "\nH - Get Help on how to play the game"
              + "\nS - Save game"
              + "\nQ - Quit"
              + "\n-------------------------------------------";
}
    
    void displayMainMenuView() {
        System.out.println("\n*** displayMenu() function called ***");
    }
    
}
