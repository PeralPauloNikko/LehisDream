/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;


/**
 *
 * @author smith / peral
 */
public class Game implements Serializable{
    
    //class instance variables

   
    private Player player;
    ArrayList <Item> groceries = new ArrayList<>();
    private Map map;
   
    
    public Game() {
        groceries.add(new Item("Banana Bunch",2.75,5.50, "B"));
        groceries.add(new Item("Gallon of Milk",3.4,5.25, "M"));
        groceries.add(new Item("Slice of Pie",3.25,4.75, "P"));
        groceries.add(new Item("Ham Sandwich",2.15,3.25, "S"));

    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public ArrayList<Item> getGroceries() {
        return groceries;
    }

    public void setGroceries(ArrayList<Item> groceries) {
        this.groceries = groceries;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.player);
        hash = 53 * hash + Objects.hashCode(this.groceries);
        hash = 53 * hash + Objects.hashCode(this.map);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Objects.equals(this.groceries, other.groceries)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "player=" + player + ", groceries=" + groceries + ", map=" + map + '}';
    }
    
    

}
   