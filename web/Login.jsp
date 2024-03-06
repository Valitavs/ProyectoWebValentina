<%-- 
    Document   : Login
    Created on : 26/02/2024, 3:37:25 p. m.
    Author     : valen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/login.css">
        <title>JSP Page</title>
        <%
            response.setHeader("Cache-Control","no-cache, no-store, must-revalidete");//Borrar directivas de memoria cache y anular algoritmos predeterminados para almacenar cache
            response.setHeader("Pragma", "no-cache"); //Directivas compatibles con memorias cache
            response.setDateHeader("Expires", 0); //Proporciona fecha y hora para decir el tiempo de respuesta caduco
        %>
    </head>
    <body>
        <div class="imagen-over">
        <div class="over"></div>
        <div class="imagen"></div>
    </div>

    <div class="contenedor">
        <div class="contenido">
            <a href="index.html" class="link1">
                <div class="Volver">
                    <img src="imagenes2/flecha.png" alt="">
                    <h6>Volver</h6>
                </div>
            </a>
            <form method="post" action="InicioSesionServlet">
                <h1>Iniciar sesión para continuar</h1>
                <div class="input">
                    <label>Correo</label>
                    <input type="text" required name="txtCorreo">
                </div>
                <div class="input2">
                    <label>Contraeña</label>
                    <input type="password" required name="txtContrasena">
                </div>
                <div class="check">
                    <input id="activar" type="checkbox">
                    <label for="activar">Recordarme</label>
                </div>
                <input class="button" type="submit" value="Iniciar sesión">
                <h6 class="o-inicio">o inicia sesión usando</h6>
                <div class="logos">
                    <img src="imagenes2/facebook.png" alt="">
                    <img src="imagenes2/social.png" alt="">
                    <img src="imagenes2/gorjeo.png" alt="">
                </div>
                <div class="registro">
                    <h6 class="No-registro">¿No tienes cuenta?</h6>
                    <a href="SignUp.jsp"><h6 class="regis">Resgistrate</h6></a>
                </div>
            </form>
            
        </div>
    </div>
    </body>
</html>
