/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.view;

import byui.cit260.LehisDream.control.GameControl;
import byui.cit260.LehisDream.control.MapControl;
import byui.cit260.LehisDream.model.Game;
import byui.cit260.LehisDream.model.Location;
import byui.cit260.LehisDream.model.Map;
import java.util.Scanner;
import lehisdream.LehisDream;

/**
 *
 * @author smith
 */
public class GameMenuView extends View {

   public GameMenuView() {
        super("\n"
                + "\n-------------------------------------------"
                + "\n| Game Menu                               |"
                + "\n-------------------------------------------"
                + "\nV - View Path"
                + "\nM - Move Player"
                + "\nB - Visit Bishop's office"
                + "\nP - Go to Backpack"
                + "\nO - At Home"
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
            case "O": //go to home
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

    public void viewPath() {
        String leftIndicator;
        String rightIndicator;

        Game game = LehisDream.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        Location[][] locations = map.getLocations(); // retreive the locations from map
        try {
            System.out.print("  |");
            for (int column = 0; column < locations[0].length; column++) {
                System.out.print("  " + column + " |"); // print col numbers to side of map
            }
            System.out.println();
            for (int row = 0; row < locations.length; row++) {
                System.out.print(row + " "); // print row numbers to side of map
                for (int column = 0; column < locations[row].length; column++) {
                    leftIndicator = " ";
                    rightIndicator = " ";
                    if (locations[row][column] == map.getCurrentLocation()) {
                        leftIndicator = "*"; // can be stars or whatever these are indicators showing visited
                        rightIndicator = "*"; // same as above
                    } else if (locations[row][column].getVisited()) {
                        leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
                        rightIndicator = "<"; // same as above
                    }
                    System.out.print("|"); // start map with a |
                    if (locations[row][column].getScene() == null) {
                        System.out.print(leftIndicator + "??" + rightIndicator);
                    } else {
                        System.out.print(leftIndicator + locations[row][column].getScene().getSymbol() + rightIndicator);
                    }
                }
                System.out.println("|");
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    private void moveForward() {
        Game game = LehisDream.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        int newRow = map.getCurrentLocation().getRow();
        int newColumn = map.getCurrentLocation().getColumn();
        
        if (newColumn < 4)
            newColumn++;
        else {
            newColumn = 0;
            newRow++;
            if (newRow > 4)
                newRow = 0;
        }
        MapControl.movePlayer(map, newRow, newColumn);
        
        QuestionMenuView questionMenu = new QuestionMenuView();
        questionMenu.display();
        
        viewPath();
        
    }
    private void bishopsOffice() {
       BishopsOfficeView bishopsOffice = new BishopsOfficeView();
       bishopsOffice.display();
    }

    private void goToBackpack() {
        BackpackView backPack = new BackpackView();
        backPack.display();
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
