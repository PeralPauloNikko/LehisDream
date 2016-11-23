/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author EthicalH1
 */
public class Question implements Serializable{
    //Class instance variables
    private String currentQuestion;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private int correctAnswer;
    private boolean theatre;
    private boolean store;
    

    public Question() {
        theatre = false;
        store = false;
    }

    public String getCurrentQuestion() {
        return currentQuestion;
    }

    public void setCurrentQuestion(String currentQuestion) {
        this.currentQuestion = currentQuestion;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public boolean isTheatre() {
        return theatre;
    }

    public void setTheatre(boolean theatre) {
        this.theatre = theatre;
    }

    public boolean isStore() {
        return store;
    }

    public void setStore(boolean store) {
        this.store = store;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.currentQuestion);
        hash = 37 * hash + Objects.hashCode(this.answer1);
        hash = 37 * hash + Objects.hashCode(this.answer2);
        hash = 37 * hash + Objects.hashCode(this.answer3);
        hash = 37 * hash + Objects.hashCode(this.answer4);
        hash = 37 * hash + this.correctAnswer;
        hash = 37 * hash + (this.theatre ? 1 : 0);
        hash = 37 * hash + (this.store ? 1 : 0);
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
        final Question other = (Question) obj;
        if (this.correctAnswer != other.correctAnswer) {
            return false;
        }
        if (this.theatre != other.theatre) {
            return false;
        }
        if (this.store != other.store) {
            return false;
        }
        if (!Objects.equals(this.currentQuestion, other.currentQuestion)) {
            return false;
        }
        if (!Objects.equals(this.answer1, other.answer1)) {
            return false;
        }
        if (!Objects.equals(this.answer2, other.answer2)) {
            return false;
        }
        if (!Objects.equals(this.answer3, other.answer3)) {
            return false;
        }
        if (!Objects.equals(this.answer4, other.answer4)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Question{" + "currentQuestion=" + currentQuestion + ", answer1=" + answer1 + ", answer2=" + answer2 + ", answer3=" + answer3 + ", answer4=" + answer4 + ", correctAnswer=" + correctAnswer + ", theatre=" + theatre + ", store=" + store + '}';
    }
    
   
    
    
    
   
}