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
@WebServlet(name = "ServletAgregarContacto", urlPatterns = {"/AgregarContacto"})
public class ServletAgregarContacto extends HttpServlet {

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
        RequestDispatcher dispatcher = request.getRequestDispatcher("agregarContacto.jsp");
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
        String nombre = request.getParameter("nombreContacto");
        String apellidoContacto = request.getParameter("apellidoContacto");
        String telefonoContacto = request.getParameter("telefonoContacto");
        String mailContacto = request.getParameter("mailContacto");
        String nombreEmpresa = request.getParameter("nombreEmpresa");
        String nombreCiudad = request.getParameter("nombreCiudad");
        String imagen = request.getParameter("imagen");
        
       
        Contacto contactoNegocio = new Contacto();
        if(nombre!=null){
        contactoNegocio.setNombre(nombre);
        }else{
            nombre="";
            contactoNegocio.setNombre(nombre);
        }
        if(apellidoContacto!=null){
        contactoNegocio.setApellido(apellidoContacto);
        }else{
            apellidoContacto="";
            contactoNegocio.setApellido(apellidoContacto);
        }
        if(telefonoContacto!=null){
        contactoNegocio.setTelefono(telefonoContacto);
        }else{
            telefonoContacto="";
            contactoNegocio.setTelefono(telefonoContacto);
        }
        if(mailContacto!=null){
        contactoNegocio.setMail(mailContacto);
        }else{
            mailContacto="";
            contactoNegocio.setMail(mailContacto);
        }
        if(nombreCiudad!=null){
          contactoNegocio.setCiudad(nombreCiudad);
        }else{
            nombreCiudad="";
            contactoNegocio.setCiudad(nombreCiudad);
        }
        if(nombreEmpresa!=null){
           contactoNegocio.setEmpresa(nombreEmpresa);
        }else{
            nombreEmpresa="";
           contactoNegocio.setEmpresa(nombreEmpresa);
        }
        if(imagen!=null){
            contactoNegocio.setImagenes(imagen);
        }else{
            imagen="";
            contactoNegocio.setImagenes(imagen);
        }   
        
        
          String  resultado="";
        try {
            resultado = contactoNegocio.agregarContacto(contactoNegocio);
        } catch (PersistentException_Exception ex) {
            Logger.getLogger(ServletAgregarContacto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        request.setAttribute("resultado", resultado);
        RequestDispatcher dispatcher = request.getRequestDispatcher("agregarContacto.jsp");
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
