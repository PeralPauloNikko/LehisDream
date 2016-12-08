/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.view;


import byui.cit260.LehisDream.control.MapControl;
import byui.cit260.LehisDream.model.Game;
import byui.cit260.LehisDream.model.Location;
import byui.cit260.LehisDream.model.Map;
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
                + "\nH - Help"
                + "\nS - Report"
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
            case "H": // Go to Help
                this.displayHelpMenu();
                break;
            case "S":
                this.sceneReport();
                break;
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void displayHelpMenu() {
        //display the game menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    public void viewPath() {
        String leftIndicator;
        String rightIndicator;

        Game game = LehisDream.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        Location[][] locations = map.getLocations(); // retreive the locations from map
        try {
            this.console.print("  |");
            for (int column = 0; column < locations[0].length; column++) {
                this.console.print("  " + column + " |"); // print col numbers to side of map
            }
            this.console.println();
            for (int row = 0; row < locations.length; row++) {
                this.console.print(row + " "); // print row numbers to side of map
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
                    this.console.print("|"); // start map with a |
                    if (locations[row][column].getScene() == null) {
                        this.console.print(leftIndicator + "??" + rightIndicator);
                    } else {
                        this.console.print(leftIndicator + locations[row][column].getScene().getSymbol() + rightIndicator);
                    }
                }
                this.console.println("|");
                
                
            }
            if (map.getCurrentLocation()!= null && map.getCurrentLocation().getScene()!= null){
                    this.console.println("\nYour current location is " + map.getCurrentLocation().getScene().getName() + ".");
//                    this.console.println(map.getCurrentLocation().getScene().getDescription());
            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),"Error");
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

    private void sceneReport() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
