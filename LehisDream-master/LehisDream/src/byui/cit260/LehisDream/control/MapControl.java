/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.control;

import byui.cit260.LehisDream.model.Location;
import byui.cit260.LehisDream.model.Map;
import byui.cit260.LehisDream.model.Question;
import byui.cit260.LehisDream.model.Scene;
import byui.cit260.LehisDream.model.SceneType;

/**
 *
 * @author smith
 */
public class MapControl {

    public static double calcVolumeOfFont(double height, double width, double length) {
        
        if (height < 3 || height > 6) { //height has limits, 3 and 6
                return -1;
        }
        
        if (width < 5 || width > 10) { //width has limits, 5 and 10
                return -2;
        }        
        
        if (length < 4 || length > 8) { //length has limits, 4 and 8
                return -3;
        }
        
        double volume = (height * width * length);
        
        return volume;
    
    }
    public static double calcSquareFeetOfHome(double length, double width) {
        
        if (length < 0) {//length is negative? 
        return -1;
        }
        
        if (width < 0) { //width is negative?
        return -2;
        }
        
        //calculates squarefeet by multiplying length and width
        double squarefeet = (length * width);
        
        //returns squarefeet
        return squarefeet;

    }

    public static Map createMap() {
        Map map = new Map(5, 5);
        
        Scene[] scenes = createScenes();
        
        //TODO: look @ code in developer forum with code
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
        
    }
        //scene 1
    private static Scene[] createScenes(){
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene currentScene = new Scene();
        currentScene.setDescription(
            "You have entered the zone At Home. You are at the front door of the"
          + "house. In order to enter the house you need to answer the following "
          + "question:");
        currentScene.setName("Front Door");
        currentScene.setSymbol("FD");
        Question currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What do you do when someone lies?");
        currentQuestion.setAnswer1("Vote for them");
        currentQuestion.setAnswer2("Run away");
        currentQuestion.setAnswer3("Follow them");
        currentQuestion.setAnswer4("Copy them");
        currentQuestion.setCorrectAnswer(2);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.frontDoor.ordinal()] = currentScene;
        
        //scene 2
        currentScene = new Scene();
        currentScene.setDescription(
            "You are at the front door of the house. In order to enter the house"
          + "you need to answer the following question:");
        currentScene.setName("At Home");
        currentScene.setSymbol("AH");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What do you do when someone lies?");
        currentQuestion.setAnswer1("Vote for them");
        currentQuestion.setAnswer2("Run away");
        currentQuestion.setAnswer3("Follow them");
        currentQuestion.setAnswer4("Copy them");
        currentQuestion.setCorrectAnswer(2);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.laundryRoom.ordinal()] = currentScene;
        
        //scene 3
        currentScene = new Scene();
        currentScene.setDescription(
            "You are at the front door of the house. In order to enter the house"
          + "you need to answer the following question:");
        currentScene.setName("At Home");
        currentScene.setSymbol("AH");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What do you do when someone lies?");
        currentQuestion.setAnswer1("Vote for them");
        currentQuestion.setAnswer2("Run away");
        currentQuestion.setAnswer3("Follow them");
        currentQuestion.setAnswer4("Copy them");
        currentQuestion.setCorrectAnswer(2);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.livingRoom.ordinal()] = currentScene;
        
        //scene 4
        currentScene = new Scene();
        currentScene.setDescription(
            "You are at the front door of the house. In order to enter the house"
          + "you need to answer the following question:");
        currentScene.setName("At Home");
        currentScene.setSymbol("AH");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What do you do when someone lies?");
        currentQuestion.setAnswer1("Vote for them");
        currentQuestion.setAnswer2("Run away");
        currentQuestion.setAnswer3("Follow them");
        currentQuestion.setAnswer4("Copy them");
        currentQuestion.setCorrectAnswer(2);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.bedroom.ordinal()] = currentScene;
        
        //scene 5
        currentScene = new Scene();
        currentScene.setDescription(
            "You are at the front door of the house. In order to enter the house"
          + "you need to answer the following question:");
        currentScene.setName("At Home");
        currentScene.setSymbol("AH");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What do you do when someone lies?");
        currentQuestion.setAnswer1("Vote for them");
        currentQuestion.setAnswer2("Run away");
        currentQuestion.setAnswer3("Follow them");
        currentQuestion.setAnswer4("Copy them");
        currentQuestion.setCorrectAnswer(2);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.kitchen.ordinal()] = currentScene;
        
        //scene 6
        currentScene = new Scene();
        currentScene.setDescription(
            "You are at the front door of the house. In order to enter the house"
          + "you need to answer the following question:");
        currentScene.setName("At Home");
        currentScene.setSymbol("AH");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What do you do when someone lies?");
        currentQuestion.setAnswer1("Vote for them");
        currentQuestion.setAnswer2("Run away");
        currentQuestion.setAnswer3("Follow them");
        currentQuestion.setAnswer4("Copy them");
        currentQuestion.setCorrectAnswer(2);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.cafeteria.ordinal()] = currentScene;
        
        //scene 7
        currentScene = new Scene();
        currentScene.setDescription(
            "You are at the front door of the house. In order to enter the house"
          + "you need to answer the following question:");
        currentScene.setName("At Home");
        currentScene.setSymbol("AH");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What do you do when someone lies?");
        currentQuestion.setAnswer1("Vote for them");
        currentQuestion.setAnswer2("Run away");
        currentQuestion.setAnswer3("Follow them");
        currentQuestion.setAnswer4("Copy them");
        currentQuestion.setCorrectAnswer(2);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.auditorium.ordinal()] = currentScene;
        
        //scene 8
        currentScene = new Scene();
        currentScene.setDescription(
            "You are at the front door of the house. In order to enter the house"
          + "you need to answer the following question:");
        currentScene.setName("At Home");
        currentScene.setSymbol("AH");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What do you do when someone lies?");
        currentQuestion.setAnswer1("Vote for them");
        currentQuestion.setAnswer2("Run away");
        currentQuestion.setAnswer3("Follow them");
        currentQuestion.setAnswer4("Copy them");
        currentQuestion.setCorrectAnswer(2);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.office.ordinal()] = currentScene;
        
        //scene 9
        currentScene = new Scene();
        currentScene.setDescription(
            "You are at the front door of the house. In order to enter the house"
          + "you need to answer the following question:");
        currentScene.setName("At Home");
        currentScene.setSymbol("AH");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What do you do when someone lies?");
        currentQuestion.setAnswer1("Vote for them");
        currentQuestion.setAnswer2("Run away");
        currentQuestion.setAnswer3("Follow them");
        currentQuestion.setAnswer4("Copy them");
        currentQuestion.setCorrectAnswer(2);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.library.ordinal()] = currentScene;
        
        //scene 10
        currentScene = new Scene();
        currentScene.setDescription(
            "You are at the front door of the house. In order to enter the house"
          + "you need to answer the following question:");
        currentScene.setName("At Home");
        currentScene.setSymbol("AH");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What do you do when someone lies?");
        currentQuestion.setAnswer1("Vote for them");
        currentQuestion.setAnswer2("Run away");
        currentQuestion.setAnswer3("Follow them");
        currentQuestion.setAnswer4("Copy them");
        currentQuestion.setCorrectAnswer(2);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.playground.ordinal()] = currentScene;
        
        //scene 11
        currentScene = new Scene();
        currentScene.setDescription(
            "You are at the front door of the house. In order to enter the house"
          + "you need to answer the following question:");
        currentScene.setName("At Home");
        currentScene.setSymbol("AH");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What do you do when someone lies?");
        currentQuestion.setAnswer1("Vote for them");
        currentQuestion.setAnswer2("Run away");
        currentQuestion.setAnswer3("Follow them");
        currentQuestion.setAnswer4("Copy them");
        currentQuestion.setCorrectAnswer(2);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.meatDept.ordinal()] = currentScene;
        
        //scene 12
        currentScene = new Scene();
        currentScene.setDescription(
            "You are at the front door of the house. In order to enter the house"
          + "you need to answer the following question:");
        currentScene.setName("At Home");
        currentScene.setSymbol("AH");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What do you do when someone lies?");
        currentQuestion.setAnswer1("Vote for them");
        currentQuestion.setAnswer2("Run away");
        currentQuestion.setAnswer3("Follow them");
        currentQuestion.setAnswer4("Copy them");
        currentQuestion.setCorrectAnswer(2);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.deliShoppe.ordinal()] = currentScene;
        
        //scene 13
        currentScene = new Scene();
        currentScene.setDescription(
            "You are at the front door of the house. In order to enter the house"
          + "you need to answer the following question:");
        currentScene.setName("At Home");
        currentScene.setSymbol("AH");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What do you do when someone lies?");
        currentQuestion.setAnswer1("Vote for them");
        currentQuestion.setAnswer2("Run away");
        currentQuestion.setAnswer3("Follow them");
        currentQuestion.setAnswer4("Copy them");
        currentQuestion.setCorrectAnswer(2);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.dairyAisle.ordinal()] = currentScene;
        
        //scene 14
        currentScene = new Scene();
        currentScene.setDescription(
            "You are at the front door of the house. In order to enter the house"
          + "you need to answer the following question:");
        currentScene.setName("At Home");
        currentScene.setSymbol("AH");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What do you do when someone lies?");
        currentQuestion.setAnswer1("Vote for them");
        currentQuestion.setAnswer2("Run away");
        currentQuestion.setAnswer3("Follow them");
        currentQuestion.setAnswer4("Copy them");
        currentQuestion.setCorrectAnswer(2);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.produceAisle.ordinal()] = currentScene;
        
        //scene 15
        currentScene = new Scene();
        currentScene.setDescription(
            "You are at the front door of the house. In order to enter the house"
          + "you need to answer the following question:");
        currentScene.setName("At Home");
        currentScene.setSymbol("AH");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What do you do when someone lies?");
        currentQuestion.setAnswer1("Vote for them");
        currentQuestion.setAnswer2("Run away");
        currentQuestion.setAnswer3("Follow them");
        currentQuestion.setAnswer4("Copy them");
        currentQuestion.setCorrectAnswer(2);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.customerService.ordinal()] = currentScene;
        
        //scene 16
        currentScene = new Scene();
        currentScene.setDescription(
            "You are at the front door of the house. In order to enter the house"
          + "you need to answer the following question:");
        currentScene.setName("At Home");
        currentScene.setSymbol("AH");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What do you do when someone lies?");
        currentQuestion.setAnswer1("Vote for them");
        currentQuestion.setAnswer2("Run away");
        currentQuestion.setAnswer3("Follow them");
        currentQuestion.setAnswer4("Copy them");
        currentQuestion.setCorrectAnswer(2);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.theatreOne.ordinal()] = currentScene;
        
        //scene 17
        currentScene = new Scene();
        currentScene.setDescription(
            "You are at the front door of the house. In order to enter the house"
          + "you need to answer the following question:");
        currentScene.setName("At Home");
        currentScene.setSymbol("AH");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What do you do when someone lies?");
        currentQuestion.setAnswer1("Vote for them");
        currentQuestion.setAnswer2("Run away");
        currentQuestion.setAnswer3("Follow them");
        currentQuestion.setAnswer4("Copy them");
        currentQuestion.setCorrectAnswer(2);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.theatreTwo.ordinal()] = currentScene;
        
        //scene 18
        currentScene = new Scene();
        currentScene.setDescription(
            "You are at the front door of the house. In order to enter the house"
          + "you need to answer the following question:");
        currentScene.setName("At Home");
        currentScene.setSymbol("AH");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What do you do when someone lies?");
        currentQuestion.setAnswer1("Vote for them");
        currentQuestion.setAnswer2("Run away");
        currentQuestion.setAnswer3("Follow them");
        currentQuestion.setAnswer4("Copy them");
        currentQuestion.setCorrectAnswer(2);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.theatreThree.ordinal()] = currentScene;
        
        //scene 19
        currentScene = new Scene();
        currentScene.setDescription(
            "You are at the front door of the house. In order to enter the house"
          + "you need to answer the following question:");
        currentScene.setName("At Home");
        currentScene.setSymbol("AH");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What do you do when someone lies?");
        currentQuestion.setAnswer1("Vote for them");
        currentQuestion.setAnswer2("Run away");
        currentQuestion.setAnswer3("Follow them");
        currentQuestion.setAnswer4("Copy them");
        currentQuestion.setCorrectAnswer(2);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.theatreFour.ordinal()] = currentScene;
        
        //scene 20
        currentScene = new Scene();
        currentScene.setDescription(
            "You are at the front door of the house. In order to enter the house"
          + "you need to answer the following question:");
        currentScene.setName("At Home");
        currentScene.setSymbol("AH");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What do you do when someone lies?");
        currentQuestion.setAnswer1("Vote for them");
        currentQuestion.setAnswer2("Run away");
        currentQuestion.setAnswer3("Follow them");
        currentQuestion.setAnswer4("Copy them");
        currentQuestion.setCorrectAnswer(2);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.theatreFive.ordinal()] = currentScene;
        
        //scene 21
        currentScene = new Scene();
        currentScene.setDescription(
            "You are at the front door of the house. In order to enter the house"
          + "you need to answer the following question:");
        currentScene.setName("At Home");
        currentScene.setSymbol("AH");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What do you do when someone lies?");
        currentQuestion.setAnswer1("Vote for them");
        currentQuestion.setAnswer2("Run away");
        currentQuestion.setAnswer3("Follow them");
        currentQuestion.setAnswer4("Copy them");
        currentQuestion.setCorrectAnswer(2);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.chapel.ordinal()] = currentScene;
        
        //scene 22
        currentScene = new Scene();
        currentScene.setDescription(
            "You are at the front door of the house. In order to enter the house"
          + "you need to answer the following question:");
        currentScene.setName("At Home");
        currentScene.setSymbol("AH");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What do you do when someone lies?");
        currentQuestion.setAnswer1("Vote for them");
        currentQuestion.setAnswer2("Run away");
        currentQuestion.setAnswer3("Follow them");
        currentQuestion.setAnswer4("Copy them");
        currentQuestion.setCorrectAnswer(2);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.primaryRoom.ordinal()] = currentScene;
        
        //scene 23
        currentScene = new Scene();
        currentScene.setDescription(
            "You are at the front door of the house. In order to enter the house"
          + "you need to answer the following question:");
        currentScene.setName("At Home");
        currentScene.setSymbol("AH");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What do you do when someone lies?");
        currentQuestion.setAnswer1("Vote for them");
        currentQuestion.setAnswer2("Run away");
        currentQuestion.setAnswer3("Follow them");
        currentQuestion.setAnswer4("Copy them");
        currentQuestion.setCorrectAnswer(2);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.culturalHall.ordinal()] = currentScene;
        
        //scene 24
        currentScene = new Scene();
        currentScene.setDescription(
            "You are at the front door of the house. In order to enter the house"
          + "you need to answer the following question:");
        currentScene.setName("At Home");
        currentScene.setSymbol("AH");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What do you do when someone lies?");
        currentQuestion.setAnswer1("Vote for them");
        currentQuestion.setAnswer2("Run away");
        currentQuestion.setAnswer3("Follow them");
        currentQuestion.setAnswer4("Copy them");
        currentQuestion.setCorrectAnswer(2);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.reliefSocietyRoom.ordinal()] = currentScene;
        
        //scene 25
        currentScene = new Scene();
        currentScene.setDescription(
            "You are at the front door of the house. In order to enter the house"
          + "you need to answer the following question:");
        currentScene.setName("At Home");
        currentScene.setSymbol("AH");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What do you do when someone lies?");
        currentQuestion.setAnswer1("Vote for them");
        currentQuestion.setAnswer2("Run away");
        currentQuestion.setAnswer3("Follow them");
        currentQuestion.setAnswer4("Copy them");
        currentQuestion.setCorrectAnswer(2);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.classroom.ordinal()] = currentScene;
        
       return scenes; 
       
    }
    static void movePlayerToStartingLocation(Map map) {
       // movePlayer(map, 2, 2);
         movePlayer(map, 0, 0);
}

    public static void movePlayer(Map map, int row, int column) {
        map.setCurrentLocation(map.getLocations()[row][column]);
        map.getCurrentLocation().setVisited(true);

        map.setNoOfRows(row);
        map.setNoOfColumns(column);
}
    
    
    }

    
