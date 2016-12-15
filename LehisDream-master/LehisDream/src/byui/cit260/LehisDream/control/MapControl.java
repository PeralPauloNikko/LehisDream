/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.control;

import byui.cit260.LehisDream.exceptions.MapControlException;
import byui.cit260.LehisDream.model.Map;
import byui.cit260.LehisDream.model.Question;
import byui.cit260.LehisDream.model.Scene;
import byui.cit260.LehisDream.model.SceneType;

/**
 *
 * @author smith
 */
public class MapControl {

    public static double calcVolumeOfFont(double height, double width, double length)throws MapControlException {
        
        if (height < 3 || height > 6) { //height has limits, 3 and 6
                throw new MapControlException("\nHeight must be between 3 and 6."
                        + "Please enter in another value for the height.");
        }
        
        if (width < 5 || width > 10) { //width has limits, 5 and 10
                throw new MapControlException("\nWidth must be between 5 and 10."
                        + "Please enter in another value for the width.");
        }        
        
        if (length < 4 || length > 8) { //length has limits, 4 and 8
                throw new MapControlException("\nLength must be between 4 and 8."
                        + "Please enter in another value for the length.");
        }
        
        double volume = (height * width * length);
        
        return volume;
    
    }

//    public static double calcSquareFeetOfHome(double length, double width)throws MapControlException {
//        
//        if (length < 0) {//length is negative? 
//        throw new MapControlException("\nLength must be greater than 0."
//                        + "Please enter in another value for the length.");
//        }
//        
//        if (width < 0) { //width is negative?
//        throw new MapControlException("\nWidth must be greater than 0."
//                        + "Please enter in another value for the width.");
//        }
//        
//        //calculates squarefeet by multiplying length and width
//        double squarefeet = (length * width);
//        
//        //returns squarefeet
//        return squarefeet;
//
//    }

    public static Map createMap() {
        Map map = new Map(5, 5);
        
        Scene[] scenes = createScenes();
        map.setScenes(scenes);
        
        //TODO: look @ code in developer forum with code
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
        
    }
   
        //scene 1
    private static Scene[] createScenes(){
        Question currentQuestion;
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene currentScene = new Scene();
        currentScene.setDescription(
            "You have started the game, Lehi's Dream. \n\rYou will need to venture down"
          + " the path moving your player along the way. \n\rYou will answer questions "
          + " until you reach your destination, the Tree of Life.");
        currentScene.setName("Start");
        currentScene.setSymbol("ST");
        currentQuestion = new Question();
//        currentQuestion.setCurrentQuestion(
            
//        currentQuestion.setAnswer1("Vote for them");
//        currentQuestion.setAnswer2("Run away");
//        currentQuestion.setAnswer3("Follow them");
//        currentQuestion.setAnswer4("Copy them");
//        currentQuestion.setCorrectAnswer(2);
//        currentScene.setQuestion(currentQuestion);
//        
        scenes[SceneType.start.ordinal()] = currentScene;
        
        //scene 2
        currentScene = new Scene();
        currentScene.setDescription(
            "You have entered the zone At Home. You are at the front door of the "
          + "house. \n\rIn order to enter the house, you need to answer the following "
          + "question:");
        currentScene.setName("Front Door");
        currentScene.setSymbol("FD");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What do you do when someone lies?");
        currentQuestion.setAnswer1("Vote for them");
        currentQuestion.setAnswer2("Run away");
        currentQuestion.setAnswer3("Follow them");
        currentQuestion.setAnswer4("Copy them");
        currentQuestion.setCorrectAnswer(2);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.frontDoor.ordinal()] = currentScene;
        
        //scene 3
        currentScene = new Scene();
        currentScene.setDescription(
            "You are in the Laundry Room. \n\rIn order to wash your clothes, "
          + "you need to answer the following question:");
        currentScene.setName("Laundry Room");
        currentScene.setSymbol("LA");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What does it mean to be a Special "
                + "Witnes of Christ?");
        currentQuestion.setAnswer1("Be Famous");
        currentQuestion.setAnswer2("Be Batman");
        currentQuestion.setAnswer3("A Prophet");
        currentQuestion.setAnswer4("Be a mean person");
        currentQuestion.setCorrectAnswer(3);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.laundryRoom.ordinal()] = currentScene;
        
        //scene 4
        currentScene = new Scene();
        currentScene.setDescription(
            "You are in the living room. In order to enter enjoy family time, "
          + "you need to answer the following question:");
        currentScene.setName("Living Room");
        currentScene.setSymbol("LR");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What is a patriarchal blessing?");
        currentQuestion.setAnswer1("A guide");
        currentQuestion.setAnswer2("A romantic letter");
        currentQuestion.setAnswer3("A letter");
        currentQuestion.setAnswer4("A exam");
        currentQuestion.setCorrectAnswer(1);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.livingRoom.ordinal()] = currentScene;
        
        //scene 5
        currentScene = new Scene();
        currentScene.setDescription(
            "You are in the Bedroom. In order to go to sleep and rest, "
          + "you need to answer the following question:");
        currentScene.setName("Bedroom");
        currentScene.setSymbol("BD");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("How many years is a young man called to"
                + " serve the Lord");
        currentQuestion.setAnswer1("Three years");
        currentQuestion.setAnswer2("One year and a half");
        currentQuestion.setAnswer3("Few years");
        currentQuestion.setAnswer4("Two years");
        currentQuestion.setCorrectAnswer(4);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.bedroom.ordinal()] = currentScene;
        
//        //scene 5
//        currentScene = new Scene();
//        currentScene.setDescription(
//            "You are at the Kitchen. In order to enter to start cooking a "
//          + "delicious meal you need to answer the following question:");
//        currentScene.setName("Kitchen");
//        currentScene.setSymbol("KI");
//        currentQuestion = new Question();
//        currentQuestion.setCurrentQuestion("Why was Jesus Christ baptized?");
//        currentQuestion.setAnswer1("Because he want it");
//        currentQuestion.setAnswer2("To give us an example");
//        currentQuestion.setAnswer3("They asking him to do it");
//        currentQuestion.setAnswer4("He wanted a bath");
//        currentQuestion.setCorrectAnswer(2);
//        currentScene.setQuestion(currentQuestion);
//        
//        scenes[SceneType.kitchen.ordinal()] = currentScene;
//        
        //scene 6
        currentScene = new Scene();
        currentScene.setDescription(
            "You have entered the zone At School. You are in the Cafeteria. "
          + "In order to enter to enjoy your lunch, you need to answer the "
          + "following question:");
        currentScene.setName("Cafeteria");
        currentScene.setSymbol("CA");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What do you do when someone steals?");
        currentQuestion.setAnswer1("Help them");
        currentQuestion.setAnswer2("Follow them");
        currentQuestion.setAnswer3("Teach them");
        currentQuestion.setAnswer4("Copy them");
        currentQuestion.setCorrectAnswer(3);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.cafeteria.ordinal()] = currentScene;
        
        //scene 7
        currentScene = new Scene();
        currentScene.setDescription(
            "You are at the Auditorium. In order to enter to see the play, "
          + "you need to answer the following question:");
        currentScene.setName("Auditorium");
        currentScene.setSymbol("AU");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What do you do when someone hurts "
                + "your feelings?");
        currentQuestion.setAnswer1("Beg them");
        currentQuestion.setAnswer2("Demand for a appology");
        currentQuestion.setAnswer3("Give them a price");
        currentQuestion.setAnswer4("Forgive them");
        currentQuestion.setCorrectAnswer(4);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.auditorium.ordinal()] = currentScene;
        
        //scene 8
        currentScene = new Scene();
        currentScene.setDescription(
            "You are at the Office. In order to work, "
          + "you need to answer the following question:");
        currentScene.setName("Office");
        currentScene.setSymbol("OC");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("Why did Jesus die for us?");
        currentQuestion.setAnswer1("He did not have a choice");
        currentQuestion.setAnswer2("He love us");
        currentQuestion.setAnswer3("Someone ask him");
        currentQuestion.setAnswer4("To win a gift");
        currentQuestion.setCorrectAnswer(2);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.office.ordinal()] = currentScene;
        
        //scene 9
        currentScene = new Scene();
        currentScene.setDescription(
            "You are at the library. In order to enter to read a great book, "
          + "you need to answer the following question:");
        currentScene.setName("Library");
        currentScene.setSymbol("LI");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("How many books are in the New "
                                         + "Testament?");
        currentQuestion.setAnswer1("27");
        currentQuestion.setAnswer2("30");
        currentQuestion.setAnswer3("15");
        currentQuestion.setAnswer4("23");
        currentQuestion.setCorrectAnswer(1);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.library.ordinal()] = currentScene;
        
        //scene 10
        currentScene = new Scene();
        currentScene.setDescription(
            "You are at the playground. In order to enter to have a lot of fun, "
          + "you need to answer the following question:");
        currentScene.setName("Play Ground");
        currentScene.setSymbol("PG");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("Who were the first apostles called "
                                          + "to follow Jesus?");
        currentQuestion.setAnswer1("Joseph and Hyrum");
        currentQuestion.setAnswer2("Peter and Andrew");
        currentQuestion.setAnswer3("Adam and Peter");
        currentQuestion.setAnswer4("Maria and Jose");
        currentQuestion.setCorrectAnswer(2);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.playground.ordinal()] = currentScene;
        
        //scene 11
        currentScene = new Scene();
        currentScene.setDescription(
            "You have entered the zone At the Store. You are in the meat department. "
          + "In order to prepare the best food, you need to answer the following question:");
        currentScene.setName("Meat Dept");
        currentScene.setSymbol("MD");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("How many apostles did Jesus have?");
        currentQuestion.setAnswer1("12");
        currentQuestion.setAnswer2("11");
        currentQuestion.setAnswer3("8");
        currentQuestion.setAnswer4("15");
        currentQuestion.setCorrectAnswer(1);
        currentQuestion.setStore(true);
        currentScene.setQuestion(currentQuestion);
        
        
        scenes[SceneType.meatDept.ordinal()] = currentScene;
        
        //scene 12
        currentScene = new Scene();
        currentScene.setDescription(
            "You are at the deli shoppe. In order to enter to enjoy our food, "
          + "you need to answer the following question:");
        currentScene.setName("Deli Shoppe");
        currentScene.setSymbol("DS");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What was the boat Noah built called?");
        currentQuestion.setAnswer1("Ship");
        currentQuestion.setAnswer2("An Ark");
        currentQuestion.setAnswer3("Yacht");
        currentQuestion.setAnswer4("Boat");
        currentQuestion.setCorrectAnswer(2);
        currentQuestion.setStore(true);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.deliShoppe.ordinal()] = currentScene;
        
        //scene 13
        currentScene = new Scene();
        currentScene.setDescription(
            "You are at the Dairy Aisle. In order to enter have some milk, "
          + "you need to answer the following question:");
        currentScene.setName("Dairy Aisle");
        currentScene.setSymbol("DA");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("Who rolled back the stone in front "
                + "of Jesus' tomb?");
        currentQuestion.setAnswer1("Peter");
        currentQuestion.setAnswer2("Maria");
        currentQuestion.setAnswer3("Angels");
        currentQuestion.setAnswer4("Jesus");
        currentQuestion.setCorrectAnswer(3);
        currentQuestion.setStore(true);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.dairyAisle.ordinal()] = currentScene;
        
        //scene 14
        currentScene = new Scene();
        currentScene.setDescription(
            "You are at the Produce Aisle. In order to enter make some salad "
          + "you need to answer the following question:");
        currentScene.setName("Produce Aisle");
        currentScene.setSymbol("PA");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("How can you go to heaven?");
        currentQuestion.setAnswer1("Make Mary cry");
        currentQuestion.setAnswer2("Be a good person");
        currentQuestion.setAnswer3("Be a mean person");
        currentQuestion.setAnswer4("Eating cake");
        currentQuestion.setCorrectAnswer(2);
        currentQuestion.setStore(true);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.produceAisle.ordinal()] = currentScene;
        
        //scene 15
        currentScene = new Scene();
        currentScene.setDescription(
           "You are at the Customer Service. In order to enter ask for some help "
          +"you need to answer the following question:");
        currentScene.setName("CustomerService");
        currentScene.setSymbol("CS");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What was the first thing Lehi saw in "
                + "his dream?");
        currentQuestion.setAnswer1("An iron rod");
        currentQuestion.setAnswer2("A man dressed in white");
        currentQuestion.setAnswer3("a tree");
        currentQuestion.setAnswer4("mists of darkness");
        currentQuestion.setCorrectAnswer(2);
        currentQuestion.setStore(true);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.customerService.ordinal()] = currentScene;
        
        //scene 16
        currentScene = new Scene();
        currentScene.setDescription(
            "You have entered the zone At the Theatre. You are in the Theatre One. "
          + "In order to enter enjoy the show"
          + "you need to answer the following question:");
        currentScene.setName("Theatre One");
        currentScene.setSymbol("T1");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("How long did Lehi say he traveled "
                + "in mists of darkness ?");
        currentQuestion.setAnswer1("Many hours");
        currentQuestion.setAnswer2("An Eternity");
        currentQuestion.setAnswer3("A little while");
        currentQuestion.setAnswer4("Just 10 minutes");
        currentQuestion.setCorrectAnswer(1);
        currentQuestion.setTheatre(true);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.theatreOne.ordinal()] = currentScene;
        
        //scene 17
        currentScene = new Scene();
        currentScene.setDescription(
            "You are at the Theatre Two. In order to enter to enjoy the movie"
          + "you need to answer the following question:");
        currentScene.setName("Theatre Two");
        currentScene.setSymbol("T2");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What does LDS stand for?");
        currentQuestion.setAnswer1("Latter-day Souls");
        currentQuestion.setAnswer2("Nothing in particular");
        currentQuestion.setAnswer3("Learning Daily Songs");
        currentQuestion.setAnswer4("Latter-day Saints");
        currentQuestion.setCorrectAnswer(4);
        currentQuestion.setTheatre(true);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.theatreTwo.ordinal()] = currentScene;
        
        //scene 18
        currentScene = new Scene();
        currentScene.setDescription(
            "You are at the Theatre Three. In order to enter to enjoy the show"
          + "you need to answer the following question:");
        currentScene.setName("Theatre Three");
        currentScene.setSymbol("T3");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("Who was the last prophet to write in"
                + " the Book of Mormon?");
        currentQuestion.setAnswer1("Nephi");
        currentQuestion.setAnswer2("Moroni");
        currentQuestion.setAnswer3("Mormon");
        currentQuestion.setAnswer4("Alma");
        currentQuestion.setCorrectAnswer(2);
        currentQuestion.setTheatre(true);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.theatreThree.ordinal()] = currentScene;
        
        //scene 19
        currentScene = new Scene();
        currentScene.setDescription(
            "You are at the Theatre four. In order to enter to enjoy the show"
          + "you need to answer the following question:");
        currentScene.setName("Theatre Four");
        currentScene.setSymbol("T4");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What do you do during Conference "
                + "Weekend?");
        currentQuestion.setAnswer1("Listen to the Prophets");
        currentQuestion.setAnswer2("Vacation time");
        currentQuestion.setAnswer3("Party all day");
        currentQuestion.setAnswer4("Sleep");
        currentQuestion.setCorrectAnswer(1);
        currentQuestion.setTheatre(true);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.theatreFour.ordinal()] = currentScene;
        
        //scene 20
        currentScene = new Scene();
        currentScene.setDescription(
            "You are at the theatre five. In order to enter to enjoy a carol"
          + "you need to answer the following question:");
        currentScene.setName("Theatre Five");
        currentScene.setSymbol("T5");
        currentQuestion = new Question(); 
        currentQuestion.setCurrentQuestion("What do you do when someone hits "
                                         + "you?");
        currentQuestion.setAnswer1("Hit them Back");
        currentQuestion.setAnswer2("Forgive them");
        currentQuestion.setAnswer3("Cry");
        currentQuestion.setAnswer4("Hate them");
        currentQuestion.setCorrectAnswer(2);
        currentQuestion.setTheatre(true);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.theatreFive.ordinal()] = currentScene;
        
        //scene 21
        currentScene = new Scene();
        currentScene.setDescription(
            "You have entered the zone At Church. You are at the Chapel. In order "
          + "to enter to pray and listen the to talks of amazing people "
          + "you need to answer the following question:");
        currentScene.setName("Chapel");
        currentScene.setSymbol("CP");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What do you do when you found "
                                    + "a cellphone that you always wanted it?");
        currentQuestion.setAnswer1("Give it back");
        currentQuestion.setAnswer2("keep it");
        currentQuestion.setAnswer3("Sell it");
        currentQuestion.setAnswer4("Eat it");
        currentQuestion.setCorrectAnswer(1);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.chapel.ordinal()] = currentScene;
        
        //scene 22
        currentScene = new Scene();
        currentScene.setDescription(
            "You are at the primary room. In order to enter learn and sing more "
          + "about Jesus Christ you need to answer the following question:");
        currentScene.setName("Primary Room");
        currentScene.setSymbol("PM");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What do you do with the Book of "
                + "Mormon?");
        currentQuestion.setAnswer1("See it");
        currentQuestion.setAnswer2("Read it");
        currentQuestion.setAnswer3("Make it part of your book selection");
        currentQuestion.setAnswer4("Sell it");
        currentQuestion.setCorrectAnswer(2);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.primaryRoom.ordinal()] = currentScene;
        
        //scene 23
        currentScene = new Scene();
        currentScene.setDescription(
            "You are in the cultural hall. In order to enter and have fun with "
          + "friends, you need to answer the following question:");
        currentScene.setName("Cultural Hall");
        currentScene.setSymbol("CH");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("What do you do when you have a bad "
                + "day?");
        currentQuestion.setAnswer1("Be angry");
        currentQuestion.setAnswer2("Learn, grow and move on");
        currentQuestion.setAnswer3("Be mad");
        currentQuestion.setAnswer4("Cry the rest of the day");
        currentQuestion.setCorrectAnswer(2);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.culturalHall.ordinal()] = currentScene;
        
        //scene 24
        currentScene = new Scene();
        currentScene.setDescription(
            "You are in the relief society room. In order to enter and learn "
          + "how to cook,bake, and make amazing things and enjoy time,"
          + "you need to answer the following question:");
        currentScene.setName("Relief Society Room");
        currentScene.setSymbol("RS");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("How can I be more positive?");
        currentQuestion.setAnswer1("Focus on my mistakes");
        currentQuestion.setAnswer2("Have a bad attitude");
        currentQuestion.setAnswer3("Dance in the Sky");
        currentQuestion.setAnswer4("See the good in everything");
        currentQuestion.setCorrectAnswer(4);
        currentScene.setQuestion(currentQuestion);
        
        scenes[SceneType.reliefSocietyRoom.ordinal()] = currentScene;
        
        //scene 25
        currentScene = new Scene();
        currentScene.setDescription(
            "You are in the classroom. In order to enter to learn,"
          + "you need to answer the following question:");
        currentScene.setName("Classroom");
        currentScene.setSymbol("CR");
        currentQuestion = new Question();
        currentQuestion.setCurrentQuestion("Which of the following people was "
                + "not one of Lehi's son?");
        currentQuestion.setAnswer1("Joseph");
        currentQuestion.setAnswer2("Sam");
        currentQuestion.setAnswer3("Jacob");
        currentQuestion.setAnswer4("Jarom");
        currentQuestion.setCorrectAnswer(4);
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

    
