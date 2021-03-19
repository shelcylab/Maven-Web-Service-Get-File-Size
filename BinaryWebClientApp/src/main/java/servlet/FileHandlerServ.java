/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import com.services.Exception_Exception;
import com.services.FileHandlerService;
import com.services.FileHandlerServiceService;
import static data.FileDetails.getServicePort;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author shelc
 */
@WebServlet(name = "FileHandlerServ", urlPatterns = {"/FileHandlerServ"})
@MultipartConfig
public class FileHandlerServ extends HttpServlet {

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
            throws ServletException, IOException, Exception_Exception {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("</head>");
            out.println("<body>");
            out.println("Shelcy Shaji Thekkedathu");
            File file2 = new File("C:\\Image\\color.png");
            byte[] data2 = Files.readAllBytes(file2.toPath());
            System.out.println("Filename: " + getServicePort().getFileName(file2.getName(), data2));
            out.println("</body>");
            out.println("</html>");
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

        File file = new File("C:\\Image\\color.png");
        byte[] data = Files.readAllBytes(file.toPath());

        for (Part part : request.getParts()) {
            String filename = part.getSubmittedFileName();
            ByteArrayOutputStream bytes = new ByteArrayOutputStream();

            byte[] buffer = new byte[(int) part.getSize()];

            System.out.println("The filename : " + filename);
        }
        File file2 = new File("C:\\Image\\color.png");
        byte[] data2 = Files.readAllBytes(file.toPath());

        try {
            System.out.println("Size of the file: " + getServicePort().getFileSize(file2.getName(), data));
        } catch (Exception_Exception ex) {
            Logger.getLogger(FileHandlerServ.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println("Filename: " + getServicePort().getFileName(file2.getName(), data));
        } catch (Exception_Exception ex) {
            Logger.getLogger(FileHandlerServ.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static FileHandlerService getServicePort() {
        FileHandlerServiceService service = new FileHandlerServiceService();
        FileHandlerService port = service.getFileHandlerServicePort();
        return port;
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
        FileHandlerServiceService service = new FileHandlerServiceService();
        FileHandlerService port = service.getFileHandlerServicePort();

        File file2 = new File("C:\\Image\\color.png");
        byte[] data2 = Files.readAllBytes(file2.toPath());
        getServicePort().waitFor10Secs();
        try {
            processRequest(request, response);
        } catch (Exception_Exception ex) {
            System.out.println("I am here!");;
        }
        System.out.println("My output: " + file2.getName());

//        try {
//            System.out.println("Filename: " + getServicePort().getFileName(file2.getName(), data2));
//        } catch (Exception_Exception ex) {
//            Logger.getLogger(FileHandlerServ.class.getName()).log(Level.SEVERE, null, ex);
//        }
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
