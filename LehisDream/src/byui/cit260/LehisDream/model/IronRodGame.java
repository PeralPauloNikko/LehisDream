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
 * @author smith / peral
 */
public class IronRodGame implements Serializable{
    
    //class instance variables
    private String name;
    private double energyLeft;

    public IronRodGame() {
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEnergyLeft() {
        return energyLeft;
    }

    public void setEnergyLeft(double energyLeft) {
        this.energyLeft = energyLeft;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.name);
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.energyLeft) ^ (Double.doubleToLongBits(this.energyLeft) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "IronRodGame{" + "name=" + name + ", energyLeft=" + energyLeft + '}';
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
        final IronRodGame other = (IronRodGame) obj;
        if (Double.doubleToLongBits(this.energyLeft) != Double.doubleToLongBits(other.energyLeft)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
    
}
