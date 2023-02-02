package interfaces;

import models.Course;
import models.Student;

import java.util.ArrayList;

public interface ICrud {
    void create();
    void read();
    void update();
    void delete();

    ArrayList<Student> getStudentsByCourse(String courseName);

    ArrayList<Student> getStudentsByTeacher(String teacherName);

    ArrayList<Course> getCoursesByDayOfWeek(String dayOfWeek);
}
