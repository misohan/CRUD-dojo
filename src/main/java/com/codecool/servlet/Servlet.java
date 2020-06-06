package com.codecool.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "newservlet", urlPatterns = {"/"}, loadOnStartup = 1)
public class Servlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getServletPath();

        try {
            switch (action) {
                case "/students":
                    showStudents(request, response);
                    break;
                case "/add":
                    showNewForm(request, response);
                    break;
                case "/index":
//                    insertStudents(request, response);
                    break;
                case "/delete":
//                    deleteStudent(request, response);
                    break;
                case "/edit":
//                    showEditForm(request, response);
                    break;
                case "/update":
//                    updateStudent(request, response);
                    break;
                default:
//                    listStudents(request, response);
                    break;
            }
        } catch (ServletException ex) {
            throw new ServletException(ex);
        }

    }
    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher view = request.getRequestDispatcher("WEB-INF/StudentForm.jsp");
        view.forward(request, response);
    }
    private void showStudents(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher view = request.getRequestDispatcher("WEB-INF/index.jsp");
        view.forward(request, response);
    }


}


