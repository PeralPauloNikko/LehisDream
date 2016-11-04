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
 * @author smith
 */
public class AtChurch implements Serializable{
    
    //class instance variables
    private String churchDescription;
    private String churchLocation;

    public AtChurch() {
    }
    
    public String getChurchDescription() {
        return churchDescription;
    }

    public void setChurchDescription(String churchDescription) {
        this.churchDescription = churchDescription;
    }

    public String getChurchLocation() {
        return churchLocation;
    }

    public void setChurchLocation(String churchLocation) {
        this.churchLocation = churchLocation;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.churchDescription);
        hash = 67 * hash + Objects.hashCode(this.churchLocation);
        return hash;
    }

    @Override
    public String toString() {
        return "AtChurch{" + "churchDescription=" + churchDescription + ", churchLocation=" + churchLocation + '}';
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
        final AtChurch other = (AtChurch) obj;
        if (!Objects.equals(this.churchDescription, other.churchDescription)) {
            return false;
        }
        if (!Objects.equals(this.churchLocation, other.churchLocation)) {
            return false;
        }
        return true;
    }
    
    
    
}
