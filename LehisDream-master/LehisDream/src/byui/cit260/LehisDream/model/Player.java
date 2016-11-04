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
public class Player implements Serializable{
    
    //class instance variables
    private String name;
    private double energyLeft;

    public Player() {
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
        
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.name);
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.energyLeft) ^ (Double.doubleToLongBits(this.energyLeft) >>> 32));
        return hash;
    }
    
    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", energyLeft=" + energyLeft + '}';
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
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.energyLeft) != Double.doubleToLongBits(other.energyLeft)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
    
}
