package models;

import java.util.ArrayList;

public class Course {
    private int idCourse;
    private String courseName;
    private Teacher teacher;
    private ArrayList<String> schedule;

    public Course() {
    }

    public Course(int idCourse, String courseName, Teacher teacher, ArrayList<String> schedule) {
        this.idCourse = idCourse;
        this.courseName = courseName;
        this.teacher = teacher;
        this.schedule = schedule;
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<String> getSchedule() {
        return schedule;
    }

    public void setSchedule(ArrayList<String> schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Course{" +
                "idCourse=" + idCourse +
                ", courseName='" + courseName + '\'' +
                ", teacher=" + teacher +
                ", schedule=" + schedule +
                '}';
    }
}

