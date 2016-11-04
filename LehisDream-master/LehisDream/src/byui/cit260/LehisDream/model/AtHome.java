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
public class AtHome implements Serializable{
    
    //class instance variables
    private String homeDescription;
    private String homeLocation;

    public AtHome() {
    }
 
    public String getHomeDescription() {
        return homeDescription;
    }

    public void setHomeDescription(String homeDescription) {
        this.homeDescription = homeDescription;
    }

    public String getHomeLocation() {
        return homeLocation;
    }

    public void setHomeLocation(String homeLocation) {
        this.homeLocation = homeLocation;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.homeDescription);
        hash = 53 * hash + Objects.hashCode(this.homeLocation);
        return hash;
    }

    @Override
    public String toString() {
        return "AtHome{" + "homeDescription=" + homeDescription + ", homeLocation=" + homeLocation + '}';
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
        final AtHome other = (AtHome) obj;
        if (!Objects.equals(this.homeDescription, other.homeDescription)) {
            return false;
        }
        if (!Objects.equals(this.homeLocation, other.homeLocation)) {
            return false;
        }
        return true;
    }
    

}    