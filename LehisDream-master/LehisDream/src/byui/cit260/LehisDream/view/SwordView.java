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
          System.out.println("You have chosen to use the Sword. This will help you in your battle."
                  + " You will lose less energy with the Sword.");  
          break;
        case "N":
          System.out.println("You chose No");
          break;
        default: 
            System.out.println("\n*** Invalid selection *** Try again");
            break;
    }
    return false;
 }
}
