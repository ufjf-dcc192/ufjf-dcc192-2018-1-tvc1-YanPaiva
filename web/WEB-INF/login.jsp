<%-- 
    Document   : login
    Created on : 27/04/2018, 21:07:58
    Author     : YanNotebook
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <form method="POST">
            <table border="1">
                <tbody>
                    <tr>
                        <td>
                            <h2>Usuario:</h2>
                        </td>
                        <td>
                            <input type="text" name="usuario" value="" size="50" />   
                        </td>
                    </tr>
                    <tr>
                        <td>

                            <h2>Senha:</h2>
                        </td>
                        <td>
                            <input type="password" name="Senha" value="" size="50"/>
                        </td>
                    </tr>
                </tbody>
            </table>
            <input type="submit" value="Entrar" name="btnEntrar" />
            <input type="submit" value="Cadastra" name="btnCadastrar" />

        </form>

    </body>
</html>
