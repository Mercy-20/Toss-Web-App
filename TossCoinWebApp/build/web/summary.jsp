<%-- 
    Document   : summary
    Created on : 25 Oct 2023, 8:30:09 AM
    Author     : LEBO MERCY MOGALE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Summary Page</title>
    </head>
    <body>
        <h1>Summary</h1>
        <%
            Integer numTossMade = (Integer) session.getAttribute("numTossMade");
            Integer tossWonByComputer = (Integer) session.getAttribute("tossWonByComputer");
            Integer tossWonByUser = (Integer) session.getAttribute("tossWonByUser");


        %>
        <table>
            <tr>
                <td>Number of tosses made: </td>
                <td><%=numTossMade%></td>
            </tr>
            <tr>
                <td>Number of tosses Won by Computer: </td>
                <td><%=tossWonByComputer%></td>
            </tr>
            <tr>
                <td>Number of tosses Won by User: </td>
                <td><%=tossWonByUser%></td>
            </tr>
        </table>
            <p>Please click <a href="index.html">here</a> to go back to home page</p>
    </body>
</html>

