/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.view;


import byui.cit260.LehisDream.model.Item;
import java.io.PrintWriter;
import java.util.ArrayList;
import lehisdream.LehisDream;


/**
 *
 * @author smith
 */
public class MyFirstClass {
protected static PrintWriter console = LehisDream.getOutFile();
    
    public static void main(String[] args)
    {
      
        //create an ArrayList of grocery items
        ArrayList<Item> groceries = new ArrayList<>();
        groceries.add(new Item("Banana Bunch", 5, 5.50, "B"));
        groceries.add(new Item("Gallon of Milk", 2, 5.25, "M"));
        groceries.add(new Item("Slice of Pie", 3, 4.75, "P"));
        groceries.add(new Item("Turkey Sandwich", 4, 3.25, "S"));
        
        displayItems(groceries);
    }
        static void displayItems(ArrayList<Item> groceryItems){
           
        console.printf("Item\t\t\tQuant\tCost\n");
        console.printf("----------------\t-------\t-------\n");
//         for (int i=0;i<groceryItems.size();i++){ 
//             console.printf("\n",groceryItems.get(i) + " ");
//         }
//         console.println();
                
            for (int i=0;i<groceryItems.size();i++){
                Item item = groceryItems.get(i);
                console.println(item.getName() + "\t\t" + "\t" + item.getCost());
                                   
               }
        }
}
