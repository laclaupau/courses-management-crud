package models;

public class Person {
    private String name;
    private String lastName;
    private int dni;

    public Person() {
    }

    public Person(String name, String lastname, int dni) {
        this.name = name;
        this.lastName = lastname;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastname) {
        this.lastName = lastname;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getFullName() {
        return name + " " + lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastName + '\'' +
                ", dni=" + dni +
                '}';
    }





}
