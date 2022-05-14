package phoneBook;

import java.util.LinkedList;

public class MyCustomCollectionApp {
    PhoneBook phoneBook;
    public static void main(String[] args) {
        MySinglyLinkedList<PhoneBook> single = new MySinglyLinkedList<>();
        MyDoublyLinkedList<PhoneBook> doubly= new MyDoublyLinkedList() ;
        doubly.insertAll(PhoneBookData.getAll().stream());
        doubly.printAll();
        doubly.printName();
        doubly.deleteAllMatchingLastName("Eder");
        doubly.printName();

        /*single.insertAll(PhoneBookData.getAll().stream());
        single.printName();
        System.out.println("here is all");
        //System.out.println(single.findAll());
        System.out.println(single.findAllByLastName("Eder"));
        single.deleteByName("Sigmund");


        single.deleteAllMatchingLastName("Eder");
        single.printAll();
        single.printNode(single.findByName("Carl"));*/
    }
}
