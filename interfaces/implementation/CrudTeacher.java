package interfaces.implementation;

import interfaces.ICrudTeacher;
import models.Teacher;

import java.util.ArrayList;

public class CrudTeacher implements ICrudTeacher {
    private ArrayList<Teacher> teachers = new ArrayList<Teacher>();


    @Override
    public ArrayList<Teacher> populate() {
        Teacher Lore = new Teacher("Lore", "Paz", 123, 1);
        Teacher Pau = new Teacher("Paula", "Laclau", 235, 2);
        Teacher Vicki = new Teacher("Vicky", "Catra", 568, 3);
        teachers.add(Vicki);
        teachers.add(Pau);
        teachers.add(Lore);

        return teachers;
    }

    @Override
    public ArrayList<Teacher> addNewTeacher(Teacher newTeacher, ArrayList<Teacher> teachers) {
        teachers.add(newTeacher);
        return teachers;
    }

    @Override
    public ArrayList<Teacher> getTeachersByLastName(ArrayList<Teacher> teachers, String lastName) {
        ArrayList<Teacher> foundTeachers = new ArrayList<>();
        for (Teacher teacher : teachers) {
            if (teacher.getLastname().equals(lastName)) {
                foundTeachers.add(teacher);
            }
        }

        if (foundTeachers.isEmpty()) {
            System.out.println("No results were found.");
        }

        return foundTeachers;
    }

    @Override
    public ArrayList<Teacher> updateTeacher(ArrayList<Teacher> teachers, int idTeacher, int newDni) {
        for (Teacher teacher : teachers) {
            if(teacher.getIdTeacher() == idTeacher) {
                teacher.setDni(newDni);
            }
        }
        return teachers;
    }

    @Override
    public ArrayList<Teacher> deleteTeacher(ArrayList<Teacher> teachers, int idTeacher) {
        Teacher teacherToRemove = null;
        for (Teacher teacher : teachers) {
            if (teacher.getIdTeacher() == idTeacher) {
                teacherToRemove = teacher;
            }
        }
        teachers.remove(teacherToRemove);
        return teachers;
    }
}
