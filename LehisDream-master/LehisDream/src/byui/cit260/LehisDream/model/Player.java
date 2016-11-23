/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author EthicalH1
 */
public class Player implements Serializable{
    
    //class instance variables
    private String name;
    private double energyLevel;
    private Game[] game;
    private double cash;
    

    public Player() {
        this.cash = 40;
    }

    public Game[] getGame() {
        return game;
    }

    public void setGame(Game[] game) {
        this.game = game;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEnergyLevel() {
        return energyLevel;
        
    }

    public void setEnergyLevel(double energyLevel) {
        this.energyLevel = energyLevel;
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.energyLevel) ^ (Double.doubleToLongBits(this.energyLevel) >>> 32));
        hash = 29 * hash + Arrays.deepHashCode(this.game);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.cash) ^ (Double.doubleToLongBits(this.cash) >>> 32));
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
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.energyLevel) != Double.doubleToLongBits(other.energyLevel)) {
            return false;
        }
        if (Double.doubleToLongBits(this.cash) != Double.doubleToLongBits(other.cash)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Arrays.deepEquals(this.game, other.game)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", energyLevel=" + energyLevel + ", game=" + game + ", cash=" + cash + '}';
    }
    
}
    
    
    