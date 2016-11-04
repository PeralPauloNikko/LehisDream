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
public class Person implements Serializable{
    //class instance variables
    private String coordinates;
    private double positiveNegativeEnergy;

    public Person() {
    }
    

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public double getPositiveNegativeEnergy() {
        return positiveNegativeEnergy;
    }

    public void setPositiveNegativeEnergy(double positiveNegativeEnergy) {
        this.positiveNegativeEnergy = positiveNegativeEnergy;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.coordinates);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.positiveNegativeEnergy) ^ (Double.doubleToLongBits(this.positiveNegativeEnergy) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Person{" + "coordinates=" + coordinates + ", positiveNegativeEnergy=" + positiveNegativeEnergy + '}';
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
        final Person other = (Person) obj;
        if (Double.doubleToLongBits(this.positiveNegativeEnergy) != Double.doubleToLongBits(other.positiveNegativeEnergy)) {
            return false;
        }
        if (!Objects.equals(this.coordinates, other.coordinates)) {
            return false;
        }
        return true;
    }
    
    
    
}
