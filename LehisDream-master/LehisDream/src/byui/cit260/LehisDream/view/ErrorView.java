/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.LehisDream.view;

import java.io.PrintWriter;
import lehisdream.LehisDream;

/**
 *
 * @author smith
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = LehisDream.getOutFile();
    private static final PrintWriter logFile = LehisDream.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                    "---------------------------------------------------"
                  + "\n- ERROR - " + errorMessage
                  + "\n-------------------------------------------------");
        //log error
        logFile.println(className + " - " + errorMessage);
        logFile.flush();
        }
}
