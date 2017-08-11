/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import capaNegocio.Grupo;
import capaNegocio.Notificacion;
import capaservicio.PersistentException_Exception;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Matias
 */
@WebServlet(name = "ServletAgregarNotificacion", urlPatterns = {"/AgregarNotificacion"})
public class ServletAgregarNotificacion extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
 

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
        RequestDispatcher dispatcher = request.getRequestDispatcher("agregarNotificacion.jsp");
        dispatcher.forward(request, response);
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
         String mensajeNotificacion = request.getParameter("mensajeNotificacion");
         int uidGrupo = Integer.parseInt(request.getParameter("uidGrupo"));
        
        Notificacion notificacion = new Notificacion();
        if(mensajeNotificacion!=null){
            notificacion.setMensaje(mensajeNotificacion);
        }else{
            mensajeNotificacion="";
            notificacion.setMensaje(mensajeNotificacion);
        }
        
        Grupo grupoNegocio = new Grupo();
        grupoNegocio.setUid(uidGrupo);
       
          String  resultado="";
        try {
            resultado = notificacion.agregarNotificacion(notificacion,grupoNegocio);
        } catch (PersistentException_Exception ex) {
            Logger.getLogger(ServletAgregarContacto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        request.setAttribute("resultado", resultado);
        RequestDispatcher dispatcher = request.getRequestDispatcher("agregarNotificacion.jsp");
        dispatcher.forward(request, response);
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
