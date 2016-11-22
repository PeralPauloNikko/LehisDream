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
public class AtStoreView extends View {
    

public AtStoreView() {
    super("\n"
        + "\n-------------------------------------------"
        + "\n|              At Store                   |"
        + "\n-------------------------------------------"
        + "\nI - Ice Cream Sandwich  $3     10% energy  "
        + "\nS - Turkey Sandwich     $5     15% energy  "
        + "\nY - Yogurt Parfait      $3     10% energy  "
        + "\nF - Fruit Bowl          $4     12% energy  " 
        + "\nQ - Quit"
        + "\n-------------------------------------------");    

}

@Override
    public boolean doAction(String choice) {
       choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "I": // Buy ice cream
                this.iceCream();
                break;
            case "S": // Buy turkey sandwich
                this.sandwich();
                break;
            case "Y": // Buy yogurt parfait
                this.yogurt();
                break;
            case "F": // Buy fruit bowl
                this.fruit();
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
}

    private void iceCream() {
        
    }

    private void sandwich() {
        
    }

    private void yogurt() {
        
    }

    private void fruit() {
        
    }
}