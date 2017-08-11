/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;


import capaNegocio.Contacto;

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
@WebServlet(name = "ServletEditarContacto", urlPatterns = {"/EditarContacto"})
public class ServletEditarContacto extends HttpServlet {

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
            RequestDispatcher dispatcher = request.getRequestDispatcher("editarContacto.jsp");
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
        int uidContacto = Integer.parseInt(request.getParameter("uidContacto"));
        String nombre = request.getParameter("nombreContacto");
         String apellidoContacto = request.getParameter("apellidoContacto");
        String telefonoContacto = request.getParameter("telefonoContacto");
        String mailContacto = request.getParameter("mailContacto");
        //int uidEmpresa = Integer.parseInt(request.getParameter("uidEmpresa"));
        String nombreEmpresa = request.getParameter("nombreEmpresa");
        //int uidCiudad = Integer.parseInt(request.getParameter("uidCiudad"));
        String nombreCiudad = request.getParameter("nombreCiudad");
        String imagen = request.getParameter("imagen");
        
        
        
        Contacto contactoNegocio = new Contacto();
        contactoNegocio.setUid(uidContacto);
        
        if(nombre!=null){
        contactoNegocio.setNombre(nombre);
        }else{
            contactoNegocio.setNombre("");
        }
        if(apellidoContacto!=null){
        contactoNegocio.setApellido(apellidoContacto);
        }else{
            contactoNegocio.setApellido("");
        }
        if(telefonoContacto!=null){
        contactoNegocio.setTelefono(telefonoContacto);
        }else{
            contactoNegocio.setTelefono("");
        }
        if(mailContacto!=null){
        contactoNegocio.setMail(mailContacto);
        }else{
            contactoNegocio.setMail("");
        }
        if(nombreCiudad!=null){
            contactoNegocio.setCiudad(nombreCiudad);
        }else{
           contactoNegocio.setCiudad("");
        }
        if(nombreEmpresa!=null){
            contactoNegocio.setEmpresa(nombreEmpresa);
        }else{
            contactoNegocio.setEmpresa("");
        }
        if(imagen!=null){
           contactoNegocio.setImagenes(imagen);
        }else{
            contactoNegocio.setImagenes("");
        }
        String resultado="";
        try {
            resultado = contactoNegocio.editarContacto(contactoNegocio);
        } catch (PersistentException_Exception ex) {
            Logger.getLogger(ServletEditarContacto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        request.setAttribute("resultado", resultado);
        RequestDispatcher dispatcher = request.getRequestDispatcher("editarContacto.jsp");
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
