<%-- 
    Document   : cadastro
    Created on : 27/04/2018, 21:07:01
    Author     : YanNotebook
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    </head>
    <body>
        <form method="POST">
            <table border="1">
                <tbody>
                    <tr>
                        <td><h3>insira seu nome</h3></td>
                        <td><input type="text" name="nomeUsuario" value="" /></td>
                    </tr>
                    <tr>
                        <td><h3>insira sua senha</h3></td>
                        <td><input type="password" name="senhaUsuario" value="" /></td>
                    </tr>
                    
                    <tr>
                        <td><h3>se for intercambista deixe a caixa desmarcada</h3></td>
                        <td><input type="checkbox" name="checkComunidade" value="ON" /></td>
                    </tr>
                    
                    <tr>
                        <td><h3>Insira a data incial que pretende fazer<br> intercambio ou receber alguem, 
                            no modelo DIA/MES/ANO(com 4 digitos)</h3></td>
                        <td><input type="text" name="dataInicial" value="" /></td>
                    </tr>
                    
                    <tr>
                        <td><h3>Insira a data final que pretende fazer intercambio ou receber alguem</h3></td>
                        <td><input type="text" name="dataFinal" value="" /></td>
                    </tr>
                    
                </tbody>
            </table>
            <input type="submit" value="cadastrar" name="btncadastrar" />
        </form>
    </body>
</html>
