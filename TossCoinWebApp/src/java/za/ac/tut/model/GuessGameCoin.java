/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model;

import java.util.Random;
import javax.servlet.http.HttpSession;

/**
 *
 * @author LEBO MERCY MOGALE
 */
public class GuessGameCoin {
    
    
    public final String[] coins = {"Tail", "Head"};

    public GuessGameCoin() {
    }

    public String determineComputerOutcome() {
        Random random = new Random();

        Integer flip = random.nextInt(2);

        String flipArr = coins[flip];

        return flipArr;
    }

    public String detemineOut(String guessTH, String computerGuess, HttpSession session) {
        String outcome = "";

        Integer numTossMade = (Integer) session.getAttribute("numTossMade");
        Integer tossWonByComputer = (Integer) session.getAttribute("tossWonByComputer");
        Integer tossWonByUser = (Integer) session.getAttribute("tossWonByUser");

        if (guessTH.equalsIgnoreCase(computerGuess)) {
            tossWonByUser++;
            outcome = "UserWON";
        } else {
            tossWonByComputer++;
            outcome = "ComputerWon";

        }
        numTossMade++;
        session.setAttribute("numTossMade", numTossMade);
        session.setAttribute("tossWonByComputer", tossWonByComputer);
        session.setAttribute("tossWonByUser", tossWonByUser);

        return outcome;
    }
    
}
