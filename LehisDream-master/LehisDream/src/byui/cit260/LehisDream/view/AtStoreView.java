/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.view;

import byui.cit260.LehisDream.model.Game;
import byui.cit260.LehisDream.model.Item;
import java.util.ArrayList;
import lehisdream.LehisDream;

/**
 *
 * @author smith
 */
public class AtStoreView extends View {

    private Game game;
    private ArrayList<Item> groceries;

    public AtStoreView() {
        super("");
        game = LehisDream.getCurrentGame(); // retreive the game
        this.groceries = game.getGroceries();

        String question = ("\nYou are in  the store. You have the option"
                + "\nto buy these items in the store only. Please select from "
                + "\nthe list of items if you wish to purchase something to "
                + "\nreplenish energy. Please remember you can not go over 100% "
                + "energy.") + "\n\r"
                + "\n\rChoice\tItem\t\tEnergy+\tCost\n"
                + "\n\r-----\t--------------\t-------\t-------\n";
        for (Item item : groceries) {

            question = question + "\n\r" + item.getChoiceValue() + "-\t"
                    + item.getName() + "\t" + item.getEnergyAdd() + "\t$" + item.getCost();
        }
        question = question + "\n\rYou have $" + game.getPlayer().getCash() + ".\n\rEnter Q to Quit";

        displayMessage = question;
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to upper case

        for (Item item : groceries) {
            if (choice.equalsIgnoreCase(item.getChoiceValue())) {
                double cash = game.getPlayer().getCash();
                if (cash < item.getCost()) {
                    System.out.println("Sorry, you cannot purchase this because "
                            + "you only have $" + cash + " left.");
                    return false;
                }
                cash = cash - item.getCost();
                game.getPlayer().setCash(cash);
                double currentEnergy = game.getPlayer().getEnergyLevel();
                currentEnergy += item.getEnergyAdd();
                if (currentEnergy  > 100) {
                    currentEnergy = 100;
                }
                game.getPlayer().setEnergyLevel(currentEnergy);
                System.out.println("Your current energy is now " + currentEnergy);
                System.out.println("You have $" + cash + " left.");

                return true;

                //todo incorporate money deductions    
            }
        }
        return false;

    }
}

