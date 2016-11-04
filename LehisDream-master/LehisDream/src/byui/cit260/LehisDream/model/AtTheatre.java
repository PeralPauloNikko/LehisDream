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
public class AtTheatre implements Serializable{
    //class instance variables
    private String atTheatreDescription;
    private String calculateAdmission;

    public AtTheatre() {
    }

    public String getAtTheatreDescription() {
        return atTheatreDescription;
    }

    public void setAtTheatreDescription(String atTheatreDescription) {
        this.atTheatreDescription = atTheatreDescription;
    }

    public String getCalculateAdmission() {
        return calculateAdmission;
    }

    public void setCalculateAdmission(String calculateAdmission) {
        this.calculateAdmission = calculateAdmission;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.atTheatreDescription);
        hash = 71 * hash + Objects.hashCode(this.calculateAdmission);
        return hash;
    }

    @Override
    public String toString() {
        return "AtTheatre{" + "atTheatreDescription=" + atTheatreDescription + ", calculateAdmission=" + calculateAdmission + '}';
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
        final AtTheatre other = (AtTheatre) obj;
        if (!Objects.equals(this.atTheatreDescription, other.atTheatreDescription)) {
            return false;
        }
        if (!Objects.equals(this.calculateAdmission, other.calculateAdmission)) {
            return false;
        }
        return true;
    }
    
}
