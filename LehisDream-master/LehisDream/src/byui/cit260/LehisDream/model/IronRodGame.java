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

    private double totalEnergy;

    public IronRodGame() {
    }
    
    

    public double getTotalEnergy() {
        return totalEnergy;
    }

    public void setTotalEnergy(double totalEnergy) {
        this.totalEnergy = totalEnergy;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.totalEnergy) ^ (Double.doubleToLongBits(this.totalEnergy) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "IronRodGame{" + "totalEnergy=" + totalEnergy + '}';
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
        if (Double.doubleToLongBits(this.totalEnergy) != Double.doubleToLongBits(other.totalEnergy)) {
            return false;
        }
        return true;
    }
    
    

  
    

    
    
}
