/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import capaNegocio.Grupo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
@WebServlet(name = "ServletBusquedaGrupo", urlPatterns = {"/BuscarGrupo"})
public class ServletBusquedaGrupo extends HttpServlet {

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
         RequestDispatcher dispatcher =request.getRequestDispatcher("buscarGrupo.jsp");
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
        String tipoBusqueda = "";
        tipoBusqueda = request.getParameter("btn_accion");
        if (tipoBusqueda.equals("simple")) {
            String textoBusqueda = request.getParameter("textoBusqueda");
            Grupo grupo = new Grupo();
            List <Grupo> lista = grupo.busquedaSimpleGrupoCliente(textoBusqueda);
            request.removeAttribute("busqueda");
            request.setAttribute("busqueda", lista);
        }else {
            String nombre = "", descripcion= "";
            try {
                nombre = request.getParameter("nombre");
            } catch (NullPointerException e) {
                
            }try {
                descripcion= request.getParameter("descripcion");
            } catch (NullPointerException e) {
                
            }
            Grupo grupo = new Grupo();
            grupo.setDescripcion(descripcion);
            grupo.setNombre(nombre);
            
            List<Grupo> lista = grupo.busquedaAvanzadaGrupoCliente(grupo);
            request.removeAttribute("busqueda");
            request.setAttribute("busqueda", lista);
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("buscarGrupo.jsp");
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
