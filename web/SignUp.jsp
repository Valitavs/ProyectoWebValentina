<%-- 
    Document   : SignUp
    Created on : 26/02/2024, 4:24:06 p. m.
    Author     : valen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/registro.css">
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
            <form method="post" action="GuardarServlet">
                <h1>Registrarse</h1>
                <div class="input">
                    <label>Nombre completo</label>
                    <input type="text" required="" name="txtNombre">
                </div>
                <div class="input2">
                    <label>Correo</label>
                    <input type="text" required="" name="txtCorreo">
                </div>
                <div class="input3">
                    <label>Telefono</label>
                    <input type="text" required="" name="txtTelefono">
                </div>
                <div class="input4">
                    <label>Contraseña</label>
                    <input type="text" required="" name="txtContrasena">
                </div>
                <div class="check">
                    <input id="activar" type="checkbox">
                    <label for="activar">Aceptar términos y condiciones</label>
                </div>
                <input class="button" type="submit" value="Registrarse">
                <h6 class="o-inicio">o inicia sesión usando</h6>
                <div class="logos">
                    <img src="imagenes2/facebook.png" alt="">
                    <img src="imagenes2/social.png" alt="">
                    <img src="imagenes2/gorjeo.png" alt="">
                </div>
                <div class="registro">
                    <h6 class="No-registro">¿Ya tienes una cuenta?</h6>
                    <a href="Login.jsp"><h6 class="regis">Iniciar sesión</h6></a>
                </div>
            </form>
            
        </div>
    </div>
    </body>
</html>
