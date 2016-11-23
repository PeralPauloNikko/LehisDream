/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author EthicalH1
 */
public enum Actor implements Serializable{
    //class instance variables
    Lehi("He is the leader of the family."),
    Nephi("He is the obedient son of Lehi."),
    Laman("The oldest rebellious brother and leader of the Lamanites."),
    Lemuel("The second rebellious brother who went with Laman.");
    
    private final String description;
    private final Point coordinates;
    private final double positiveNegativeEnergy = 0.0;
    private Location location;
    private Scene[] scene;
    
    Actor(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }

    public Scene[] getScene() {
        return scene;
    }

    public void setScene(Scene[] scene) {
        this.scene = scene;
    }
    
    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public double getPositiveNegativeEnergy() {
        return positiveNegativeEnergy;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    

    @Override
    public String toString() {
        return "Actor{" + "description=" + description + ", coordinates=" + coordinates + ", positiveNegativeEnergy=" + positiveNegativeEnergy + '}';
    }

   

    
    
    
    
    
}
