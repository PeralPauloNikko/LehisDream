/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.view;

/**
 *
 * @author fairy_000
 */
public class SwordView extends View {
    
public SwordView(){
    super("\n You have chosen to active your Sword. "
         +"\n Enter Y for yes or N for no");
            
    
}

@Override
public boolean doAction(String choice) {
    choice = choice.toUpperCase(); // convert choice to upper case
    
    switch (choice) {
        case "Y": 
          this.console.println("You have chosen to use the Sword. This will help you in your battle."
                  + " You will lose less energy with the Sword.");  
          break;
        case "N":
          this.console.println("You chose No");
          break;
        default: 
            ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
            break;
    }
    return false;
 }
}
