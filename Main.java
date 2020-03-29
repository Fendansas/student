package by.student;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Student> AllSt = new ArrayList<>();
        AllSt.add(new Student("Иванов", "Сергей", "Иванович", "01/9/2000", "Минск", 339977, "ТДП", 1, "ТДС"));
        AllSt.add(new Student("Смирнов", "Генадий", "Петрович", "11/02/1985", "Витебск", 339988, "ТДП", 2, "ТДС"));
        AllSt.add(new Student("Вальчук", "Дмитрий", "Сергеевич", "08/03/1999", "Гродно", 339999, "ФМ", 1, "ФМС"));
        AllSt.add(new Student("Курило", "Владимир", "Евгеньевич", "15/10/2001", "Гродно", 388977, "ФМ", 1, "ФМС"));
        AllSt.add(new Student("Дупанов", "Иван", "Петрович", "30/12/1995", "Минск", 999977, "ТДП", 1, "ТДС"));


        //System.out.println(AllSt);


        //Collections.sort(AllSt);
        printAll((ArrayList<Student>) AllSt);
        printFaculty((ArrayList<Student>) AllSt);
        //


    }

    //Общий список
    private static void printAll(ArrayList<Student> students) {
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n",
                "Id", "Surname", "Name", "Patronymic", "Date", "Address", "PhoneN", "Faculty", "Course", "Group");
        for (Student s : students) {
            System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n",
                    s.getId(), s.getSurname(), s.getName(), s.getPatronymic(), s.getDateOfBirth(), s.getAddress(), s.getPhoneNumber(), s.getFaculty(), s.getCourse(), s.getGroup());

        }
    }

    private static void printFaculty(ArrayList<Student> students) {
        String f = "ТДС";
        Integer c = 1;

        System.out.println();
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n",
                "Id", "Surname", "Name", "Patronymic", "Date", "Address", "PhoneN", "Faculty", "Course", "Group");
        for (Student s : students) {
             if (f.equals(s.getFaculty())) {
                 System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n",
                         s.getId(), s.getSurname(), s.getName(), s.getPatronymic(), s.getDateOfBirth(), s.getAddress(), s.getPhoneNumber(), s.getFaculty(), s.getCourse(), s.getGroup());
            }






        }



    }
}
