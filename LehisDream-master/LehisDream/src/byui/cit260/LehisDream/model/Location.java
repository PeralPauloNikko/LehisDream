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
public class Location implements Serializable{
    
    //class instance variables
    private String visited;
    private double energyRemaining;
    private int row;
    private int column;
    private int zone;

    public Location() {
    }
    
    public String getVisited() {
        return visited;
    }

    public void setVisited(String visited) {
        this.visited = visited;
    }

    public double getEnergyRemaining() {
        return energyRemaining;
    }

    public void setEnergyRemaining(double energyRemaining) {
        this.energyRemaining = energyRemaining;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.visited);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.energyRemaining) ^ (Double.doubleToLongBits(this.energyRemaining) >>> 32));
        hash = 59 * hash + this.row;
        hash = 59 * hash + this.column;
        hash = 59 * hash + this.zone;
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "visited=" + visited + ", energyRemaining=" + energyRemaining + ", row=" + row + ", column=" + column + ", zone=" + zone + '}';
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
        final Location other = (Location) obj;
        if (Double.doubleToLongBits(this.energyRemaining) != Double.doubleToLongBits(other.energyRemaining)) {
            return false;
        }
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.zone != other.zone) {
            return false;
        }
        if (!Objects.equals(this.visited, other.visited)) {
            return false;
        }
        return true;
    }
    
    
     
    
    
}
