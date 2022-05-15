package newPhoneBook;

import java.util.Arrays;
import java.util.List;

public class PhoneBookApp {
    public static void main(String[] args) {

        Contact contact1 = new Contact("Tom", "Joe", "qwe@gmail.com", "23454321");
        Contact contact2 = new Contact("John", "Smith", "qweee@gmail.com", "23567321");
        Contact contact3 = new Contact("Mark", "Sel", "qwert@gmail.com", "2345454321");
        Contact contact4 = new Contact("Andrei", "Smith", "qderwe@gmail.com", "4545678");
        Contact contact5 = new Contact("Malta", "Smith", "qwe@gmail.com", "567876");
        Contact contact6 = new Contact("Segrei", "Smith", "qwe@gmail.com", "567876");


        PhoneBook book = new PhoneBook();
        book.add(contact1);
        book.add(contact2);
        book.add(contact3);
        book.add(contact4);
        book.add(contact5);
        book.add(contact6);


        book.print();
        book.deleteAllByLastName("Smith");
        //book.deleteAllMatchingLastName("Smith");
        book.print();


    }
}