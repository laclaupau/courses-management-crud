package interfaces;

import java.util.ArrayList;
import models.Teacher;

public interface ICrudTeacher {

    ArrayList<Teacher> populate();
    ArrayList<Teacher> addNewTeacher(Teacher newTeacher, ArrayList<Teacher> teachers);

    ArrayList<Teacher> getTeachersByLastName(ArrayList<Teacher> teachers, String lastName);

    ArrayList<Teacher> updateTeacher(ArrayList<Teacher> teachers, int idTeacher, int newDni);
    ArrayList<Teacher> deleteTeacher(ArrayList<Teacher> teachers, int idTeacher);

}
