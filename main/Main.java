package main;

import interfaces.implementation.Crud;

public class Main {
    public static void main(String[] args) {
        Crud crud = new Crud();
        // System.out.println(crud.getStudentsByCourse("advanced"));
        // System.out.println(crud.getStudentsByTeacher("Vicky"));
        System.out.println(crud.getCoursesByDayOfWeek("Saturday"));

    }
}
