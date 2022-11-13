/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kant2
 */
public class servlet extends HttpServlet {

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
        String ID = request.getParameter("ID");
        String Name = request.getParameter("Name");
        String GPA = request.getParameter("GPA");
        
        try (PrintWriter out = response.getWriter()) {
            if(ID.equals("") || Name.equals("") || GPA.equals("")) {
                request.getRequestDispatcher("/Error.jsp").forward(request, response);
                }
            int id = Integer.parseInt(ID);
            double gpa = Double.parseDouble(GPA);
        
        
//        List<Student> stdList = AddStudent.findAllStudent();
        Student s;
        s = StudentTable.findStudentById(id);
        if(s == null){
        Student std = new Student(id,Name,gpa);
        StudentTable.insertStudent(std);
          request.getRequestDispatcher("/Success.jsp").forward(request, response);
 
        } else {
             request.getRequestDispatcher("/Error.jsp").forward(request, response);
        }
            
//            if((AddStudent.findStudentById(id) != null) || (!AddStudent.findStudentByName(Name).equals(null))){
//                request.getRequestDispatcher("/Error.jsp").forward(request, response);
//            }
//            Student std = new Student(id,Name, gpa);
//            AddStudent.insertStudent(std);
            /* TODO output your page here. You may use following sample code. */

            
        }
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