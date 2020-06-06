package com.codecool.servlet;

import java.util.ArrayList;
import java.util.List;

public class StudentController {

    List<Student> studentList = new ArrayList<>();

    public void handle(){

    }
    public void index(){

    }
    public void edit(int id){


    }
    public void delete(int id){
        for(Student student: studentList){
            if(id == student.getId()){
                studentList.remove(student);
            }
        }

    }
}
