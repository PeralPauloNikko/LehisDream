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
public class EndGameView {
    protected final PrintWriter console = LehisDream.getOutFile();
   
    public EndGameView() {
        
    }
    
    public void wonGame() {
     { 
    this.console.println("\r\nYou have won the game. Congratulations, you have "
                       + "been righteous and have arrived at the Tree of Life.");
    this.console.println("" +
"                               vv\r\n" +
"                         vvv^^^^vvvvv\r\n" +
"                   vvvvvvvvv^^vvvvvv^^vvvvv\r\n" +
"              vvvvvvvvvvv^^^^^^^^^^^^^vvvvv^^^vvvvv\r\n" +
"           vvvvvvv^^^^^^^^^vvv^^^^^^^vvvvvvvvvvv^^^vvv\r\n" +
"          vvvv^^^^^^vvvvv^^^^^^^vv^^^^^^^vvvv^^^vvvvvv\r\n" +
"        vv^^^^^^^^vvv^^^^^vv^^^^vvvvvvvvvvvv^^^^^^vv^vvvvvv       \r\n" +
"        vvv^^^^^vvvv^^^^^^vvvvv^^vvvvvvvvv^^^^^^vvvvv^vvvvvvvvv   \r\n" +
"    ooo vvvvvvvv^^^v^^^vvvvvv^^vvvvvvvvvv^^^vvvvvvvvvvvvvv  ooo   \r\n" +
"   o   o ^vv^^^vvvvvvv^^vvvvv^^^^^^^^vvvvvvvvv^^^^^^vvvvv  o   o  \r\n" +
"    ooo  ^vvvvvvvvv^^^^vvvvvv^^^^^^vvvvvvvv^^^vvvvvvvvvv^v  ooo   \r\n" +
"       ^^^^^^vvvvvv^^vvvvv^vvvv^^^v^^^^^^vvvvvv^^^^vvvv ooo       \r\n" +
"     vvvv^^vvv^^^vvvvvvvvvv^vvvvv^vvvvvv^^^vvvvvvv^^vv o   o      \r\n" +
"    vvv^vvvvv^^vvvvvvv^^vvvvvvv^^vvvvv^vvvv^vvvv^^vvvv  ooo       \r\n" +
"    ooo  ^vvvvvv^^vvvvvvvv^vv^vvv^^^^^^^^^vvvvvvvvvvvvvv^ ooo     \r\n" +
"   o   o    ^^vooovvv^^vvvvvvvvvv^^^^vvvvvvvvvvvvvvv^^^  o   o    \r\n" +
"    ooo       o   o  ^^vvvvvv^^^^^^vvvvvvvvv^vvvvvvvvvv   ooo     \r\n" +
"               ooo ^^^^vvvvvvvvvvvvvvvvvvvvvvvvvv^^^^             \r\n" +
"                        v_           v                            \r\n" +
"                         v          v                             \r\n" +
"                          v        v                              \r\n" +
"                           v      v                               \r\n" +
"                            |     |                               \r\n" +
"                            |     |                               \r\n" +
"                            |     |                               \r\n" +
"                            |     ]                               \r\n");
}
    }
    
    public void lostGame() { 
        this.console.println("\r\nYou have lost the game. You have gone to the Great "
                            +"and Spacious Building. You are laughing and mocking "
                            +"others. Sorry you can repent and start again and see "
                            +"if you can make it to the Tree of Life.");
        this.console.println("" +      
"                                   _____                                      \r\n" +
"                                   |___|                                      \r\n" +
"                                   |___|                                      \r\n" +
"                                   |]_[|                                      \r\n" +
"                                   | I |                                      \r\n" +
"                               JL| | |JL                                      \r\n" +
"      .-.                    i   ()   |   () i                      .-.       \r\n" +
"      |_|     .^.           |_|  LJ=======LJ  |_|           .^.     |_|       \r\n" +
"_._._|___|._.|___|_._._._._.L_J_|.-. .-. .-.|_L_J._._._._._|___|._.|___|._._._\r\n" +
".,        ., |-,-| .,       L_J  |_| [I] |_|  L_J       ., |-,-| .,         .,\r\n" +
"JL        JL |-O-| JL       L_J%%%%%%%%%%%%%%%L_J       JL |-O-| JL         JL\r\n" +
"HH_IIIIII_HH_'-'-'_HH_IIIIII|_|=======H=======|_|IIIIII_HH_'-'-'_HH_IIIIII_HH_\r\n" +
"[]--------[]-------[]-------[_]----|.=I=.|----[_]-------[]-------[]--------[]-\r\n" +
"||  _||_  ||||_I_||||  _||_ [_] []_|_L_J_|_[] [_] _||_  ||||_I_||||  _||_  |||\r\n" +
"||  |__|  ||=|_|_|=||  |__|_|_|   _L_L_J_J_   |_|_|__|  ||=|_|_|=||  |__|  ||-\r\n" +
"||  |__|  |||__|__|||  |__[___]__--__===__--__[___]__|  |||__|__|||  |__|  |||\r\n" +
"[_]IIIIIII[_]IIIII[_]IIIIIL___J__II__|_|__II__L___JIIIII[_]IIIII[_]IIIIIIII[_]\r\n" +
"[_] |_I_| [_]|_I_|[_] |_I_[_]|II|[]|_|I|_|[]|II|[_]_I_| [_]|_I_|[_] |_I_|  [_]\r\n" +
"L_J.|   |.L_J|   |L_J.|   L_JI  I[]|     |[]I  IL_J   |.L_J|   |L_J.|   |. L_J\r\n" +
"L_J|     |L_J|   |L_J|    L_J|  |[]|     |[]|  |L_J    |L_J|   |L_J|      |L_J\r\n" +
"L_JL_____JL_JL___JL_JL____|-||  |[]|     |[]|  ||-|____JL_JL___JL_JL______JL_J\r\n");
    }
    
    
    
    
    
}




