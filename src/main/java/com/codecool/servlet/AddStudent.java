package com.codecool.servlet;

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
//@WebServlet(name = "addServlet", urlPatterns = {"/add"}, loadOnStartup = 1)
//public class AddStudent extends HttpServlet {
//    Student student = new Student(1, "M", "K", 39);
//    Student student1 = new Student(2, "M", "K", 39);
//
//    List<Student> listStudents = new ArrayList<>();
//
//    @Override
//    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        listStudents.add(student);
//        request.setAttribute("listStudents", listStudents);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/index.jsp");
//        dispatcher.forward(request, response);
//    }
//}
