/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.view;

import byui.cit260.LehisDream.control.SpendMoney;
import byui.cit260.LehisDream.exceptions.SpendMoneyException;
import byui.cit260.LehisDream.model.Game;
import byui.cit260.LehisDream.model.Item;
import java.util.ArrayList;
import lehisdream.LehisDream;

/**
 * 
 * @author fairy_000
 */
public class AtTheatreView extends View {

    private Game game;
    private ArrayList<Item> treats;

    public AtTheatreView() {
        super("");
        game = LehisDream.getCurrentGame(); // retreive the game
        this.treats = game.getTreats();

        String question = ("\nYou are in the theatre. You have the option"
                + "\nto buy these items in the theatre only. Please select from "
                + "\nthe list of items if you wish to purchase something to "
                + "\nreplenish energy. Please remember you can not go over 100% "
                + "energy.") + "\n\r"
                + "\n\rChoice\tItem\t\tEnergy+\tCost\n"
                + "\n\r-----\t-----------\t------\t------\n";
        for (Item item : treats) {

            question = question + "\n\r" + item.getChoiceValue() + "-\t"
                    + item.getName() + "\t\t" + item.getEnergyAdd() + "\t$" + item.getCost();
        }
        question = question + "\n\rYou have $" + game.getPlayer().getCash() + ".\n\rEnter Q to Quit";

        displayMessage = question;
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); // convert choice to upper case

        for (Item item : treats) {
            if (choice.equalsIgnoreCase(item.getChoiceValue())) {
                double cash = game.getPlayer().getCash();
                try { 
                    cash = SpendMoney.CalculateBalance(cash, item.getCost());
                } catch (SpendMoneyException ex) {
                    ErrorView.display(this.getClass().getName(),ex.getMessage());
                    return false;
                }
                
                game.getPlayer().setCash(cash);
                double currentEnergy = game.getPlayer().getEnergyLevel();
                currentEnergy += item.getEnergyAdd();
                if (currentEnergy  > 100) {
                    currentEnergy = 100;
                }
                game.getPlayer().setEnergyLevel(currentEnergy);
                this.console.println("Your current energy is now " + currentEnergy);
                this.console.println("You have $" + cash + " left.");

                return true;

                  
            }
        }
        return false;

    }
}
 

