package by.student;

import java.util.ArrayList;
// Неполучается взвать из мейна(

public class PrintCustomer {


    public void printCard(ArrayList<Customer> customers) {
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n",
                "Id", "Surname", "Name", "Patronymic", "Date", "Address", "PhoneN", "Faculty", "Course", "Group");
        for (Customer s : customers) {
            System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n",
                    s.getId(), s.getSurname(), s.getName(), s.getPatronymic(), s.getAddress(), s.getNumberCard(), s.getBankAccountNumber());

        }
    }


}
