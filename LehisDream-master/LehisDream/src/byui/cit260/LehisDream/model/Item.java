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
    private String name;
    private double energyAdd;
    private double cost;
    private String choiceValue;
   
    public Item() {
    }
    
    public Item(String name, double energyAdd,  double cost, String choiceValue) {
        this.name = name;
        this.cost = cost;
        this.choiceValue = choiceValue;
        this.energyAdd = energyAdd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getChoiceValue() {
        return choiceValue;
    }

    public void setChoiceValue(String choiceValue) {
        this.choiceValue = choiceValue;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.energyAdd) ^ (Double.doubleToLongBits(this.energyAdd) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.cost) ^ (Double.doubleToLongBits(this.cost) >>> 32));
        hash = 71 * hash + Objects.hashCode(this.choiceValue);
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
        final Item other = (Item) obj;
        if (Double.doubleToLongBits(this.energyAdd) != Double.doubleToLongBits(other.energyAdd)) {
            return false;
        }
        if (Double.doubleToLongBits(this.cost) != Double.doubleToLongBits(other.cost)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.choiceValue, other.choiceValue)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", energyAdd=" + energyAdd + ", cost=" + cost + ", choiceValue=" + choiceValue + '}';
    }

    
    
    
   
    
    
    
}
