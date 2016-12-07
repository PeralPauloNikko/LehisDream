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
public class BishopsOfficeView extends View{
 
    public BishopsOfficeView(){
        super("\n You have entered the Bishop's Office. You are able to make"
             +"\n a total of 3 visits during the course of the game. Please"
             +"\n give the reference for the scripture in order to replenish"
             +"\n some of your energy."
             +"\n-----------------------------------------------------------"
             +"\nF     First Visit"
             +"\nS     Second Visit"   
             +"\nT     Third Visit"
             +"\n-----------------------------------------------------------");
    }
 
 
@Override
public boolean doAction(String choice) {
    
    choice = choice.toUpperCase(); // convert choice to upper case
    
        switch (choice) {
            case "F":
                this.console.println("\n For the natural man is an enemy to God and"
                        +"\n has been from the fall of Adam...");
                break;
            case "S":
                this.console.println("\n Adam fell that men might be; and men"
                        + "\n are, that they might have joy.");
                break;
            case "T":
                this.console.println("\n...Faith is things which are hoped for"
                        + "\n and not seen; wherefore, dispute not because ye see not, for"
                        + "\n ye receive no witness until after the trial of your faith.");
                break;
            default:
                ErrorView.display(this.getClass().getName(),"\n You have entered an invalid option."
                        +"\n Please try again.");
                break;
        }
   return false;
    }   
}

