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
    private boolean visited;
    private double energyRemaining;
    private int row;
    private int column;
    private Scene scene;
    
    
    public Location() {
    }
    
    public boolean getVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
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

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.visited ? 1 : 0);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.energyRemaining) ^ (Double.doubleToLongBits(this.energyRemaining) >>> 32));
        hash = 53 * hash + this.row;
        hash = 53 * hash + this.column;
        hash = 53 * hash + Objects.hashCode(this.scene);
        return hash;
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
        if (this.visited != other.visited) {
            return false;
        }
        if (Double.doubleToLongBits(this.energyRemaining) != Double.doubleToLongBits(other.energyRemaining)) {
            return false;
        }
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (!Objects.equals(this.scene, other.scene)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "visited=" + visited + ", energyRemaining=" + energyRemaining + ", row=" + row + ", column=" + column + ", scene=" + scene + '}';
    }

}
    
    
    
     
    
    

