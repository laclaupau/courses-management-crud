package models;


public class Student extends Person{
    private int idStudent;
    private Course course;

    public Student() {
    }

    public Student(String name, String lastname, int dni, int idStudent, Course course) {
        super(name, lastname, dni);
        this.idStudent = idStudent;
        this.course = course;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "full name=" + getFullName() +
                ", idStudent=" + idStudent +
                ", course=" + course +
                '}';
    }





}
