/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author EthicalH1
 */
public class Backpack implements Serializable{
    
    //class instance variables
    private String itemsInStock;
    private IronRodGame ironrodgame;

    public Backpack() {
        
    }

    public String getItemsInStock() {
        return itemsInStock;
    }

    public void setItemsInStock(String itemsInStock) {
        this.itemsInStock = itemsInStock;
    }

    public IronRodGame getIronrodgame() {
        return ironrodgame;
    }

    public void setIronrodgame(IronRodGame ironrodgame) {
        this.ironrodgame = ironrodgame;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.itemsInStock);
        return hash;
    }

    @Override
    public String toString() {
        return "BackPack{" + "itemsInStock=" + itemsInStock + '}';
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
        final Backpack other = (Backpack) obj;
        if (!Objects.equals(this.itemsInStock, other.itemsInStock)) {
            return false;
        }
        return true;
    }
    
}