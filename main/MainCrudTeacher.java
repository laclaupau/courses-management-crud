package main;

import interfaces.implementation.CrudTeacher;
import models.Teacher;

import java.util.ArrayList;

public class MainCrudTeacher {

    public static void main(String[] args) {
        CrudTeacher crudTeacher = new CrudTeacher();

        ArrayList<Teacher> teachers = crudTeacher.populate();
        System.out.println(teachers);

        Teacher Juan = new Teacher("Juan", "Dominguez", 654, 4);
        ArrayList<Teacher> teachersAfterCreate = crudTeacher.addNewTeacher(Juan, teachers);
        System.out.println(teachersAfterCreate);
        Teacher Mario = new Teacher("Mario", "Gimenez", 658, 5);
        teachersAfterCreate = crudTeacher.addNewTeacher(Mario, teachers);
        System.out.println(teachersAfterCreate);

        ArrayList<Teacher> teachersByLastName = crudTeacher.getTeachersByLastName(teachersAfterCreate, "Dominguez");
        System.out.println(teachersByLastName);

        ArrayList<Teacher> teachersByLastName2 = crudTeacher.getTeachersByLastName(teachersAfterCreate, "Piluso");
        System.out.println(teachersByLastName2);

        ArrayList<Teacher> updatedTeachers = crudTeacher.updateTeacher(teachersAfterCreate, 3, 698721);
        System.out.println(updatedTeachers);

        ArrayList<Teacher> teachersAfterDelete = crudTeacher.deleteTeacher(updatedTeachers, 3);
        System.out.println(teachersAfterDelete);


    }
}