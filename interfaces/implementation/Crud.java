package interfaces.implementation;

import interfaces.ICrud;
import models.Course;
import models.Student;
import models.Teacher;

import java.util.ArrayList;

public class Crud  implements ICrud {

    private ArrayList<Teacher> teachers = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Course> courses = new ArrayList<>();


    @Override
    public void create() {
        Teacher Lore = new Teacher("Lore", "Paz", 123, 1);
        Teacher Pau = new Teacher("Paula", "Laclau", 235, 2);
        Teacher Vicki = new Teacher("Vicky", "Catra", 568, 3);
        teachers.add(Vicki);
        teachers.add(Pau);
        teachers.add(Lore);

        ArrayList<String> schedule1 = new ArrayList<>();
        schedule1.add("Monday");
        schedule1.add("Wednesday");
        schedule1.add("Friday");

        ArrayList<String> schedule2 = new ArrayList<>();
        schedule2.add("Tuesday");
        schedule2.add("Thursday");
        schedule2.add("Saturday");

        ArrayList<String> schedule3 = new ArrayList<>();
        schedule3.add("Monday");
        schedule3.add("Thursday");
        schedule3.add("Saturday");

        Course beginner = new Course(1, "beginner", Vicki, schedule1);
        Course intermediate = new Course(2, "intermediate", Pau, schedule2);
        Course advanced = new Course(3, "advanced", Lore, schedule3);
        courses.add(beginner);
        courses.add(intermediate);
        courses.add(advanced);

        Student st1 = new Student("Ana", "Laclau", 235, 01, advanced);
        Student st2 = new Student("Susana", "Horia", 564, 02, intermediate);
        Student st3 = new Student("Adriana", "Lamber", 456, 03, beginner);
        Student st4 = new Student("Agus", "Ibanez", 5454, 04, beginner);
        Student st5 = new Student("Lucía", "Haiuen", 896, 05, advanced);
        Student st6 = new Student("Aylen", "Maldonado", 147, 06, intermediate);

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.add(st6);
    }

    @Override
    public void read() {
        create();
        System.out.println(teachers);
        System.out.println(courses);
        System.out.println(students);
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public ArrayList<Student> getStudentsByCourse(String courseName) {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        create();

        for (Student student : students) {
            if (student.getCourse().getCourseName() ==courseName) {
                studentArrayList.add(student);
            }
        }

        return studentArrayList;
    }

    @Override
    public ArrayList<Student> getStudentsByTeacher(String teacherName) {
        ArrayList<Student> studentsByTeacherArrayList = new ArrayList<>();
        create();
        for (Student student : students) {
            if (student.getCourse().getTeacher().getName().equals(teacherName)) {
                studentsByTeacherArrayList.add(student);
            }
        }
        return studentsByTeacherArrayList;
    }

    @Override
    public ArrayList<Course> getCoursesByDayOfWeek(String dayOfWeek) {
        ArrayList<Course> courseArrayList = new ArrayList<>();
        create();
        for (Course course : courses) {
            if (course.getSchedule().contains(dayOfWeek)) {
                courseArrayList.add(course);
            }
        }
        return courseArrayList;
    }
}
