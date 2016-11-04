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
public class AtSchool implements Serializable{
    
    //class instance variables
    private String schoolDescription;
    private String schoolLocation;

    public AtSchool() {
    }
    
    public String getSchoolDescription() {
        return schoolDescription;
    }

    public void setSchoolDescription(String schoolDescription) {
        this.schoolDescription = schoolDescription;
    }

    public String getSchoolLocation() {
        return schoolLocation;
    }

    public void setSchoolLocation(String schoolLocation) {
        this.schoolLocation = schoolLocation;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.schoolDescription);
        hash = 23 * hash + Objects.hashCode(this.schoolLocation);
        return hash;
    }

    @Override
    public String toString() {
        return "AtSchool{" + "schoolDescription=" + schoolDescription + ", schoolLocation=" + schoolLocation + '}';
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
        final AtSchool other = (AtSchool) obj;
        if (!Objects.equals(this.schoolDescription, other.schoolDescription)) {
            return false;
        }
        if (!Objects.equals(this.schoolLocation, other.schoolLocation)) {
            return false;
        }
        return true;
    }
    
    
}
