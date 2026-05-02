package database;

public class Student {
    private int id_student;
    private String name;
    private String surname;
    private int dni;

    public Student() {
    }

    public Student(String name, String surname, int dni) {
        this.name = name;
        this.surname = surname;
        this.dni = dni;
    }

    public Student(int id_student, String name, String surname, int dni) {
        this.id_student = id_student;
        this.name = name;
        this.surname = surname;
        this.dni = dni;
    }
    
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getId_student() {
        return id_student;
    }

    public void setId_student(int id_student) {
        this.id_student = id_student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Student {" + "Id Student: " + id_student + ", Name: " + name + ", Surname: " + surname + ", DNI: " + dni + '}';
    }  
}
