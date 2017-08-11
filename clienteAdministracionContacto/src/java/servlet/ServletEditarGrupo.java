/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import capaNegocio.Grupo;
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
@WebServlet(name = "ServletEditarGrupo", urlPatterns = {"/EditarGrupo"})
public class ServletEditarGrupo extends HttpServlet {

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
        RequestDispatcher dispatcher = request.getRequestDispatcher("editarGrupo.jsp");
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
        int uidGrupo = Integer.parseInt(request.getParameter("uidGrupo"));
        String nombreGrupo = request.getParameter("nombreGrupo");
        String  descripcionGrupo = request.getParameter("descripcionGrupo");
        
        Grupo grupoNegocio = new Grupo();
        grupoNegocio.setUid(uidGrupo);
        
        if(nombreGrupo!=null){
        grupoNegocio.setNombre(nombreGrupo);
        }else{
            grupoNegocio.setNombre("");
        }
        if(descripcionGrupo!=null){
        grupoNegocio.setDescripcion(descripcionGrupo);
        }else{
            grupoNegocio.setDescripcion("");
        }
        String resultado="";
        try {
            resultado = grupoNegocio.editarGrupo(grupoNegocio);
        } catch (PersistentException_Exception ex) {
            Logger.getLogger(ServletEditarContacto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        request.setAttribute("resultado", resultado);
        RequestDispatcher dispatcher = request.getRequestDispatcher("editarGrupo.jsp");
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
