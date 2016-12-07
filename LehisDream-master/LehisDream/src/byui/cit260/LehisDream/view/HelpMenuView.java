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
public class HelpMenuView extends View{

    
    public HelpMenuView() {
          super("\n"
              + "\n-------------------------------------------"
              + "\n| Help Menu                               |"
              + "\n-------------------------------------------"
              + "\nO - What is the object of the game"
              + "\nM - How to move"
              + "\nE - Entering into zones/scenes"
              + "\nQ - Quit"
              + "\n-------------------------------------------");
}
    @Override    
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "O": // learn more about object of game
                this.displayObject(); 
                break;// learn more about object of game
            case "M": // more info about moving character
                this.displayMoves(); 
                break;
            case "E": // entering the zones/scenes
                this.displayScenes();
                break;
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void displayObject() {
             this.console.println   ("\n --Object of the Game--"
                                  +"\n-----------------------------------------------------------------------------------------------------------------------------"
                                  +"\n The object of the game is to move along the path by answering the questions in the situations and not lose a lot of energy. "
                                  +"\n You will need to have enough energy to make it to the Tree of Life. There will be opportunities along the way where you can "
                                  +"\n accumulate more energy. If you run out of energy before you reach the Tree of Life, you will end up at the great and        "
                                  +"\n spacious building."
                                  +"\n-----------------------------------------------------------------------------------------------------------------------------");
    }
    private void displayMoves() {
            this.console.println    ("\n --How to Move-- "
                                  +"\n----------------------------------------------------------------------------------------------------------------------------"
                                  +"\n You will move your person sequentially along the spaces on the map. In each of the 5 zones, there will be 5 spaces. You    "
                                  +"\n will choose a choose to move your player on the game menu after answering each question.                                   "
                                  +"\n----------------------------------------------------------------------------------------------------------------------------");
    }
    private void displayScenes() {
        this.console.println("\n --Entetring the Scenes/Zones--"
                                  +"\n-----------------------------------------------------------------------------------------------------------------------------"
                                  +"\n During the course of the game, there are five zones that consisit of 5 spaces in each zone. The five zones are At Home, At  "
                                  +"\n School, At the Store, At the Movei Theatre, and At Church. In each zone, there are 5 situations where a question will be    "
                                  +"\n asked and then need an answer. Based on the answer given, energy will be lost. There are areas on the map where energy can  "
                                  +"\n be increased. There is also the possibility of visiting the Bishop's office or yusing the items in the backpack for the     "
                                  +"\n addition of energy."
                                  +"\n-----------------------------------------------------------------------------------------------------------------------------");
    }
}
