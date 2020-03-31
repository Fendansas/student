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
        //---------------------------------------------------------------------------------------------------
        List<Customer> AllCastomer = new ArrayList<>();
        AllCastomer.add(new Customer("Петров", "Веньямин", "Петрович", "Слоним", 7, 123959));
        AllCastomer.add(new Customer("Давыдов", "Евгений", "Генадьевич", "Слоним", 5, 123756));
        AllCastomer.add(new Customer("Вилькевич", "Олег", "Сергеевич", "Слоним", 11, 125456));
        AllCastomer.add(new Customer("Дешко", "Игорь", "Валерьевич", "Слоним", 13, 122456));

        //студенты
        System.out.println("Список студентов заданного факультета (ТДП)");
        printFaculty((ArrayList<Student>) AllSt);
        System.out.println("Список студентов для каждого фокультета и курса");
        printFacultyAndCourse((ArrayList<Student>)AllSt);
        System.out.println("список учебной группы");
        printGroup((ArrayList<Student>)AllSt);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println("Список покуптелей в алфовитном порядке");

        Collections.sort(AllCastomer);
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n",
                "Id", "Surname", "Name", "Patronymic", "Date", "NumberCard", "BankAccountNumber");
        for (Customer s : AllCastomer) {
            System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s  %-20s\n",
                    s.getId(), s.getSurname(), s.getName(), s.getPatronymic(), s.getAddress(), s.getNumberCard(), s.getBankAccountNumber());
        }
        System.out.println("");
        System.out.println("список покупателей у котрых номер карты находется в заданном диапазоне");
        System.out.println("min 4 - max 6");

        printCard((ArrayList<Customer>)AllCastomer);





    }


    private static void printAll(ArrayList<Student> students) {
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n",
                "Id", "Surname", "Name", "Patronymic", "Date", "Address", "PhoneN", "Faculty", "Course", "Group");
        for (Student s : students) {
            System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n",
                    s.getId(), s.getSurname(), s.getName(), s.getPatronymic(), s.getDateOfBirth(), s.getAddress(), s.getPhoneNumber(), s.getFaculty(), s.getCourse(), s.getGroup());

        }
    }//Общий список

    private static void printFaculty(ArrayList<Student> students) {
        String f = "ТДП";
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

    private static void printFacultyAndCourse(ArrayList<Student> students) {
        String f = "ТДП";
        Integer c = 1;

        System.out.println();
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n",
                "Id", "Surname", "Name", "Patronymic", "Date", "Address", "PhoneN", "Faculty", "Course", "Group");
        for (Student s : students) {
            if (f.equals(s.getFaculty())) {
                if (c.equals(s.getCourse())) {
                    System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n",
                            s.getId(), s.getSurname(), s.getName(), s.getPatronymic(), s.getDateOfBirth(), s.getAddress(), s.getPhoneNumber(), s.getFaculty(), s.getCourse(), s.getGroup());
                }
            }

        }

    }

    private static void printGroup(ArrayList<Student> students) {
        String f = "ТДС";
        System.out.println();
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n",
                "Id", "Surname", "Name", "Patronymic", "Date", "Address", "PhoneN", "Faculty", "Course", "Group");
        for (Student s : students) {
            if (f.equals(s.getGroup())) {
                System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n",
                        s.getId(), s.getSurname(), s.getName(), s.getPatronymic(), s.getDateOfBirth(), s.getAddress(), s.getPhoneNumber(), s.getFaculty(), s.getCourse(), s.getGroup());
            }

        }

    }

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    private static void printCard(ArrayList<Customer> customers) {
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n",
                "Id", "Surname", "Name", "Patronymic", "Date", "NumberCard", "BankAccountNumber");
        Integer min = 4;
        Integer max = 6;
        for (Customer s : customers) {
            if (min <= s.getNumberCard() & s.getNumberCard() <= max) {
                System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s  %-20s\n",
                        s.getId(), s.getSurname(), s.getName(), s.getPatronymic(), s.getAddress(), s.getNumberCard(), s.getBankAccountNumber());
            }

        }
    }



}
