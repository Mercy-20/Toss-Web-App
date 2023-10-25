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

/**
 *
 * @author LEBO MERCY MOGALE
 */
public class StartServlet extends HttpServlet {
 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        String outcome = (String) session.getAttribute("outcome");

        Integer numTossMade = 0;
        Integer tossWonByComputer = 0;
        Integer tossWonByUser = 0;

        session.setAttribute("numTossMade", numTossMade);
        session.setAttribute("tossWonByComputer", tossWonByComputer);
        session.setAttribute("tossWonByUser", tossWonByUser);
        session.setAttribute("outcome", outcome);

        RequestDispatcher disp = request.getRequestDispatcher("guess_entry.jsp");
        disp.forward(request, response);
    }
}
