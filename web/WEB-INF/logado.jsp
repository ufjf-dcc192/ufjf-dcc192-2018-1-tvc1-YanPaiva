<%-- 
    Document   : logado
    Created on : 27/04/2018, 21:56:27
    Author     : YanNotebook
--%>

<%@page import="DCC192.ufjf.br.dados.Pessoas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bem vindo!</title>
    </head>
    <body>
        <table border="1">
            <thead>
                <tr>
                    <th>Nome usuario</th>
                    <th>Possiveis matchs</th>
                    <th>Data Limite do match</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><select name="matchs">
                               <option><%=((Pessoas)request.getAttribute("pessoa")).getNome()%></option>
                            <c:forEach var="p" items="${match}">                
                                <option>${p.getNome()}</option>  
                                <option><input type="text" name="DataLimite" value="${p.getDataDisponivelTermino()}" size="50" readonly="readonly" /></option>
                            </c:forEach>
                        </select></td>
                    <td></td>
                    <td></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                </tr>
            </tbody>
        </table>


    </body>
</html>
