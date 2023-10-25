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
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

/**
 *
 * @author LEBO MERCY MOGALE
 */
public class AskUserServlet extends HttpServlet {

   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        String option = request.getParameter("option");

        request.setAttribute("option", option);

        String useroption = determineOption(option);

        RequestDispatcher disp = request.getRequestDispatcher(useroption);
        disp.forward(request, response);

    }

    private String determineOption(String option) {
        String url = "";

        if (option.contains("yes")) {
            url = "guess_entry.jsp";

        } else if (option.contains("no")) {
            url = "summary.jsp";

        }
        return url;
    }
}
