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
public class TreeOfLife implements Serializable{
    
    //class instance variables
    private String prizeAcquired;

    public TreeOfLife() {
    }
    
    public String getPrizeAcquired() {
        return prizeAcquired;
    }

    public void setPrizeAcquired(String prizeAcquired) {
        this.prizeAcquired = prizeAcquired;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.prizeAcquired);
        return hash;
    }

    @Override
    public String toString() {
        return "TreeOfLife{" + "prizeAcquired=" + prizeAcquired + '}';
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
        final TreeOfLife other = (TreeOfLife) obj;
        if (!Objects.equals(this.prizeAcquired, other.prizeAcquired)) {
            return false;
        }
        return true;
    }
    

   
    
    
    
    
}
