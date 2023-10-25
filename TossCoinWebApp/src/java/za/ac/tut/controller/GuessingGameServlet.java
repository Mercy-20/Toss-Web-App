/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;
import za.ac.tut.model.GuessGameCoin;

/**
 *
 * @author LEBO MERCY MOGALE
 */
public class GuessingGameServlet extends HttpServlet {

     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        String guessTH = request.getParameter("guessTH");
         

        GuessGameCoin ggc = new GuessGameCoin();
        String computerGuess = ggc.determineComputerOutcome();
        String outcome = ggc.detemineOut(guessTH, computerGuess, session);

        request.setAttribute("guessTH", guessTH);
        request.setAttribute("computerGuess", computerGuess);
        request.setAttribute("outcome", outcome);

        RequestDispatcher disp = request.getRequestDispatcher("guess_info.jsp");
        disp.forward(request, response);
    }
    
}
