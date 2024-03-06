/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import SQL.MetodosSQL;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author valen
 */
public class Guardar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            /* TODO output your page here. You may use following sample code. */
            
            MetodosSQL metodos = new MetodosSQL ();
            String txtNombre = request.getParameter("txtNombre");
            String txtCorreo = request.getParameter("txtCorreo");
            String txtTelefono = request.getParameter("txtTelefono");
            String txtContrasena = request.getParameter("txtContrasena");
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<body>");
            out.println("<script type=\"text/javascript\">");
            
            boolean usuarioRepetido = metodos.buscarUsuarioRepetido(txtCorreo);
            
            if(usuarioRepetido == true){//El usuario esta registrado
                out.println("alert('Atencion el usuario con el correo: " + txtCorreo + " Ya esta registrado en la BD')");
                out.println("location ='index.html'");
            }else{
                boolean registro = metodos.registrarUsuario(txtNombre, txtCorreo, txtTelefono, txtContrasena);

                if (registro == true) {//El usuario se ha registrado
                    out.println("alert('El usuario se ha registrado con exito :)')");
                    out.println("location ='index.html'");
                } else {
                    out.println("alert('Error el usuario no se ha registrado con exito :(')");
                    out.println("location ='index.html'");
                }
            }
            
            
            
            //System.out.println("El valor de registro en SERVLET es " + registro);
            
            out.println("</script>");
            out.println("</body>");
            out.println("</html>");
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}