/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package co.edu.sena.wbrecepcioncfim.servlets;

import co.edu.sena.wbrecepcioncfim.logica.Controladora;
import co.edu.sena.wbrecepcioncfim.logica.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author Diego A Cuenca
 */
@WebServlet(name = "SvUser", urlPatterns = {"/SvUser"})
public class SvUser extends HttpServlet {
    
    Controladora controladora= new Controladora();
    
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
       /* 
        List<Estudiante>estudiantes = new ArrayList<>();
        
        estudiantes.add(new Estudiante(101, "Juan", "Perez", 25));
        estudiantes.add(new Estudiante(102, "Maria", "Lopez", 14));
        estudiantes.add(new Estudiante(103, "Luisa", "Ruiz", 30));
        estudiantes.add(new Estudiante(104, "Jose", "Duran", 24));
        
        
        HttpSession sesion=request.getSession();
        sesion.setAttribute("listaEstudiantes", estudiantes);
        
        response.sendRedirect("listar.jsp");
        
        */
       List<User>users = new ArrayList<>();
       users= controladora.consultarUsers();
       
        HttpSession sesion=request.getSession();
        sesion.setAttribute("listaUsers", users);
        
        response.sendRedirect("listar.jsp");
       
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
      
        int identificacion= Integer.parseInt(request.getParameter("identificacion"));
        String email= request.getParameter("email");
        String nombre= request.getParameter("nombre");
        String apellido=request.getParameter("apellido");
        String fechacontratacion=request.getParameter("fechacontratacion");
       String rol=request.getParameter("rol");
        
      //  System.out.println("codigo= "+codigo);
      
      User e = new User();
      e.setId(identificacion);
      e.setEmail(email);
      e.setNombre(nombre);
      e.setApellido(apellido);
      e.setFechaContratacion(fechacontratacion);
      e.setRol(rol);
      
      
      controladora.crearUser(e);
        
        
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
