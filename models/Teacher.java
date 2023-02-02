package models;

public class Teacher extends Person{
    private int idTeacher;

    public Teacher() {
    }

    public Teacher(String name, String lastname, int dni, int idTeacher) {
        super(name, lastname, dni);
        this.idTeacher = idTeacher;
    }

    public int getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "full name=" + getFullName() +
                ", idTeacher=" + idTeacher +
                ", DNI=" + getDni() +
                '}';
    }
}
