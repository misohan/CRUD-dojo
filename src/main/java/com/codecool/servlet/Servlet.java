//package com.codecool.servlet;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//@WebServlet(name = "newservlet", urlPatterns = {"/list"}, loadOnStartup = 1)
//public class Servlet extends HttpServlet {
//    Student student = new Student(1, "M", "K", 39);
//    Student student1 = new Student(2, "M", "K", 39);
//
//    List<Student> listStudents = new ArrayList<>();
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        doGet(request, response);
//    }
//
//    @Override
//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        String action = request.getServletPath();
//
//        try {
//            switch (action) {
//                case "/students":
//                    showStudents(request, response);
//                    break;
//                case "/add":
//                    showNewForm(request, response);
//                    break;
//                case "/index":
////                    insertStudents(request, response);
//                    break;
//                case "/delete":
////                    deleteStudent(request, response);
//                    break;
//                case "/edit":
////                    showEditForm(request, response);
//                    break;
//                case "/list":
//                    listStudents(request, response);
//                    break;
//                default:
////                    listStudents(request, response);
//                    break;
//            }
//        } catch (ServletException ex) {
//            throw new ServletException(ex);
//        }
//
//    }
//    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        RequestDispatcher view = request.getRequestDispatcher("WEB-INF/StudentForm.jsp");
//        view.forward(request, response);
//    }
//    private void showStudents(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        RequestDispatcher view = request.getRequestDispatcher("WEB-INF/index.jsp");
//        view.forward(request, response);
//    }
//    private void listStudents(HttpServletRequest request, HttpServletResponse response)
//            throws  IOException, ServletException {
//
//
//        request.setAttribute("listStudents", listStudents);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/index.jsp");
//        dispatcher.forward(request, response);
//    }
//}

