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
 * @author smith
 */
public class Scene implements Serializable{
    
    //class instance variables
    private String description;
    private String name;
    private String symbol;
    private Actor actor;
    private Question question;
    private Item[] itemsInStock;
    private int visits;
    

    public Scene() {
        visits = 0;
    }

    public int getVisits() {
        return visits;
    }

    public void setVisits(int visits) {
        this.visits = visits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Item[] getItemsInStock() {
        return itemsInStock;
    }

    public void setItemsInStock(Item[] itemsInStock) {
        this.itemsInStock = itemsInStock;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.description);
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.symbol);
        hash = 37 * hash + Objects.hashCode(this.actor);
        hash = 37 * hash + Objects.hashCode(this.question);
        hash = 37 * hash + Arrays.deepHashCode(this.itemsInStock);
        hash = 37 * hash + this.visits;
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
        final Scene other = (Scene) obj;
        if (this.visits != other.visits) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.symbol, other.symbol)) {
            return false;
        }
        if (this.actor != other.actor) {
            return false;
        }
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        if (!Arrays.deepEquals(this.itemsInStock, other.itemsInStock)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", name=" + name + ", symbol=" + symbol + ", actor=" + actor + ", question=" + question + ", itemsInStock=" + itemsInStock + ", visits=" + visits + '}';
    }
    

    
    
    
}
