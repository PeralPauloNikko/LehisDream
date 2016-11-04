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
public class AtStore implements Serializable{
    //class instance variables
    private String storeDescription;
    private String getPurchasedItem;

    public AtStore() {
    }
    
    public String getStoreDescription() {
        return storeDescription;
    }

    public void setStoreDescription(String storeDescription) {
        this.storeDescription = storeDescription;
    }

    public String getGetPurchasedItem() {
        return getPurchasedItem;
    }

    public void setGetPurchasedItem(String getPurchasedItem) {
        this.getPurchasedItem = getPurchasedItem;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.storeDescription);
        hash = 97 * hash + Objects.hashCode(this.getPurchasedItem);
        return hash;
    }

    @Override
    public String toString() {
        return "AtStore{" + "storeDescription=" + storeDescription + ", getPurchasedItem=" + getPurchasedItem + '}';
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
        final AtStore other = (AtStore) obj;
        if (!Objects.equals(this.storeDescription, other.storeDescription)) {
            return false;
        }
        if (!Objects.equals(this.getPurchasedItem, other.getPurchasedItem)) {
            return false;
        }
        return true;
    }
    
    
}
