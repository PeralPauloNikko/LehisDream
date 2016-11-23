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
public class Map implements Serializable{
    //class instance variables
   
    private int noOfRows = 0;
    private int noOfColumns = 0;
    private Location[][] locations;
    private Location currentLocation;
    private boolean visited;
    
    public Map() {
    }
    public Map(int noOfRows, int noOfColumns) {
        
       if (noOfRows < 1 || noOfColumns < 1) {
           System.out.println("The number of rows and columns must be > zero");
           return;
       }
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        //create 2-D array for Location objects
        this.locations = new Location[noOfRows][noOfColumns];
        
        for (int row = 0; row < noOfRows; row++){
            for(int column = 0; column < noOfColumns; column++){
                //create and initialize new Location object instance
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                
                //assign the Location object to the current position in array
                locations[row][column] = location;
            }
        }
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    public int getNoOfRows() {
        return noOfRows;
    }

    public void setNoOfRows(int noOfRows) {
        this.noOfRows = noOfRows;
    }

    public int getNoOfColumns() {
        return noOfColumns;
    }

    public void setNoOfColumns(int noOfColumns) {
        this.noOfColumns = noOfColumns;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }  
    
    
}


