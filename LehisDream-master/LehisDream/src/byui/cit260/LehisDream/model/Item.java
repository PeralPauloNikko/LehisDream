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
public class Item implements Serializable {
    //class instance variable
    private String description;
    private double energyAdd;
    private double cost;
    private double quantityPurchased;

    public Item() {
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getEnergyAdd() {
        return energyAdd;
    }

    public void setEnergyAdd(double energyAdd) {
        this.energyAdd = energyAdd;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getQuantityPurchased() {
        return quantityPurchased;
    }

    public void setQuantityPurchased(double quantityPurchased) {
        this.quantityPurchased = quantityPurchased;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.description);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.energyAdd) ^ (Double.doubleToLongBits(this.energyAdd) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.cost) ^ (Double.doubleToLongBits(this.cost) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.quantityPurchased) ^ (Double.doubleToLongBits(this.quantityPurchased) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Item{" + "description=" + description + ", energyAdd=" + energyAdd + ", cost=" + cost + ", quantityPurchased=" + quantityPurchased + '}';
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
        final Item other = (Item) obj;
        if (Double.doubleToLongBits(this.energyAdd) != Double.doubleToLongBits(other.energyAdd)) {
            return false;
        }
        if (Double.doubleToLongBits(this.cost) != Double.doubleToLongBits(other.cost)) {
            return false;
        }
        if (Double.doubleToLongBits(this.quantityPurchased) != Double.doubleToLongBits(other.quantityPurchased)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
    
    
}
