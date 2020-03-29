package by.student;
//Вывести в консоль:
//Список студентов заданного факультета
//Список студентов для каждого фокультета и курса
//список учебной группы


import javafx.scene.input.DataFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Comparable<Student> {
    IdRendom id = new IdRendom();
    private String surname;
    private String name;
    private String patronymic;
    private String dateOfBirth;
    private String address;
    private Integer phoneNumber;
    private String faculty;
    private Integer course;
    private String group;


    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Student(String surname, String name, String patronymic, String dateOfBirth, String address, Integer phoneNumber, String faculty, Integer course, String group) {
        super();

        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;


    }

    @Override
    public int compareTo(Student o) {
        if(o.getCourse()> o.getCourse())
            return 1;
        else if(o.getName()== o.getName())
            return -1;
        else
            return 0;





    }

    public class IdRendom {
        int id = (int) ((Math.random() + 1) * 1000);

        @Override
        public String toString() {
            return
                    "" + id;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", faculty='" + faculty + '\'' +
                ", course='" + course + '\'' +
                ", group='" + group + '\'' +
                '}' + "\n";
    }

    public IdRendom getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public Integer getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public Student() {
        super();
    }
    
}
//id+(int)(Math.random()*50)