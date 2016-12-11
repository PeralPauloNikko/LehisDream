/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.view;


import byui.cit260.LehisDream.control.MapControl;
import byui.cit260.LehisDream.model.Game;
import byui.cit260.LehisDream.model.Item;
import byui.cit260.LehisDream.model.Location;
import byui.cit260.LehisDream.model.Map;
import byui.cit260.LehisDream.model.Scene;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
                + "\nR - Save Grocery List (April)" 
                + "\nT - Save Treat List (Irhen(Hirendira))"
                + "\nS - Save Scene Treat (Nikko)"
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
                if(this.moveForward())
                    return true;
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
            case "R":
                this.createReport();
                break;
            case "T":
                this.createReportTreat();
                break;  
            case "S":
                this.createSceneReport();
                break;
            case "H": // Go to Help
                this.displayHelpMenu();
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
    private boolean moveForward() {
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
        
        double currentEnergy = game.getPlayer().getEnergyLevel();
        if (currentEnergy <= 0) {
            EndGameView endgameview = new EndGameView();
            endgameview.lostGame();
            return true;
        }
        if(newColumn == 4 && newRow == 4){
            EndGameView endgameview = new EndGameView();
            endgameview.wonGame();
            return true;
        }
            
        viewPath();
        return false;
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
     private void createReport() {
        Game game = LehisDream.getCurrentGame(); // retreive the game
        ArrayList<Item> groceries = game.getGroceries();
         
        String oldMenu = this.displayMessage;
        displayMessage= "\n\nEnter the file path for the file where the report "
                            + "is to be printed.";
        String filePath = this.getInput();
        displayMessage = oldMenu;
      
      this.printReport(groceries, filePath);
      
     }     
     
     private void printReport(ArrayList<Item> groceries, String outputLocation) {
        
        //create BufferedReader object for input file
        try(PrintWriter out = new PrintWriter(outputLocation)) {
            
            //print title and column headings
            out.println("\n\n               Grocery Report               ");
            out.printf("%n%-20s%10s%9s",  "Name", "Energy Added", "Price");
            out.printf("%n%-20s%12s%10s", "----------------", "------------", "-------");
            
            //print the description and price of each item
            for (Item item: groceries) {
                out.printf("%n%-20s%9.2f%12.2f"       , item.getName()
                                                      , item.getEnergyAdd()
                                                      , item.getCost());
            }
        } catch (IOException ex) {
            ErrorView.display("MainMenuView","I/O Error: " + ex.getMessage());
        }
     }
        private void createReportTreat(){
        Game game = LehisDream.getCurrentGame(); // retreive the game
        ArrayList<Item> treats = game.getTreats();
         
        String oldMenu = this.displayMessage;
        displayMessage= "\n\nEnter the file path for the file where the report "
                            + "is to be printed.";
        String filePath = this.getInput();
        displayMessage = oldMenu;
      
      this.printReportTreat(treats, filePath);
      
     } 
        private void printReportTreat(ArrayList<Item> treats, String outputLocation) {
        
        //create BufferedReader object for input file
        try(PrintWriter out = new PrintWriter(outputLocation)) {
            
            //print title and column headings
            out.println("\n\n               Treats Report               ");
            out.printf("%n%-15s%10s%9s",  "Name", "Energy Added", "Cost");
            out.printf("%n%-12s%15s%10.5s", "--------", "------------", "-----");
            
            //print the description and price of each item
            for (Item item: treats) {
                out.printf("%n%-13s%8.2f%16.2f"       , item.getName()
                                                      , item.getEnergyAdd()
                                                      , item.getCost());
            }
        } catch (IOException ex) {
            ErrorView.display("MainMenuView","I/O Error: " + ex.getMessage());
        }
     }
        private void createSceneReport() {
       Game game = LehisDream.getCurrentGame(); // retreive the game
       Scene scenes = game.getMap().getCurrentLocation().getScene();
       
       String oldMenu = this.displayMessage;
       displayMessage= "\n\nEnter the file path for the file where the report "
                           + "is to be printed.";
       String filePath = this.getInput();
       displayMessage = oldMenu;
     
       this.printSceneReport(game.getMap().getScenes(), filePath);
     
    }     
    
    private void printSceneReport(Scene[] scenes, String outputLocation) {
       
       //create BufferedReader object for input file
       try(PrintWriter out = new PrintWriter(outputLocation)) {
           
           //print title and column headings
           out.println("\n\n         Scene Report               ");
           out.printf("%n%-20s%10s",  "Name", "Symbol");
           out.printf("%n%-20s%12s", "----------------", "------------");
           
           //print the description and price of each item
           for (Scene scene: scenes)  {
               out.printf("%n%-20s%9.2s"             , scene.getName()
                                                     , scene.getSymbol());
//                                                   , scene.getQuestion());
           }
       } catch (IOException ex) {
           ErrorView.display("MainMenuView","I/O Error: " + ex.getMessage());
       }
   }
}