<%-- 
    Document   : guess_entry
    Created on : 25 Oct 2023, 8:31:23 AM
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
        <h1>Guess Head or Tail</h1>
        <form action="GuessingGameServlet.do" method="POST">
            <table>
                <tr>
                    <td>Guess:</td>
                    <td>
                        <input type="text" name="guessTH" />
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <input type="submit" value="SUBMIT" />
                    </td>
                </tr>
            </table> 
        </form>
    </body>
</html>
