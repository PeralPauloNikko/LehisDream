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
public class Question implements Serializable{
    //Class instance variables
    private String yesOrNoPrompt;
    private String multipleChoice;
    private String action;

    public Question() {
    }

    
    
    public String getYesOrNoPrompt() {
        return yesOrNoPrompt;
    }

    public void setYesOrNoPrompt(String yesOrNoPrompt) {
        this.yesOrNoPrompt = yesOrNoPrompt;
    }

    public String getMultipleChoice() {
        return multipleChoice;
    }

    public void setMultipleChoice(String multipleChoice) {
        this.multipleChoice = multipleChoice;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.yesOrNoPrompt);
        hash = 71 * hash + Objects.hashCode(this.multipleChoice);
        hash = 71 * hash + Objects.hashCode(this.action);
        return hash;
    }

    @Override
    public String toString() {
        return "Question{" + "yesOrNoPrompt=" + yesOrNoPrompt + ", multipleChoice=" + multipleChoice + ", action=" + action + '}';
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
        final Question other = (Question) obj;
        if (!Objects.equals(this.yesOrNoPrompt, other.yesOrNoPrompt)) {
            return false;
        }
        if (!Objects.equals(this.multipleChoice, other.multipleChoice)) {
            return false;
        }
        if (!Objects.equals(this.action, other.action)) {
            return false;
        }
        return true;
    }
   
    
    
}
