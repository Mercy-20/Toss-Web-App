<%-- 
    Document   : guess_info
    Created on : 25 Oct 2023, 8:30:43 AM
    Author     : LEBO MERCY MOGALE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Guess Page</title>
    </head>
    <body>
        <h1>Outcome</h1>
        <%
            String guessTH = (String) request.getAttribute("guessTH");
            String computerGuess = (String) request.getAttribute("computerGuess");
            String outcome = (String) request.getAttribute("outcome");

        %>
        <table>
            <tr>
                <td>User Guess: </td>
                <td> <%=guessTH%></td>
            </tr>
            <tr>
                <td>Computer Guess: </td>
                <td> <%=computerGuess%></td>
            </tr>
            <tr>
                <td>Outcome: </td>
                <td> <%=outcome%></td>
            </tr>
        </table>

        <form action="AskUserServlet.do" method="POST">
            <tr>
                <td>Do you want to proceed with the game, yes or no?</td>
                <td>
                    <input type="text" name="option" />
                </td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <input type="submit" value="SUBMIT" />
                </td>
            </tr>
        </form>
    </body>
</html>
