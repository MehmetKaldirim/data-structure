package phoneBook;

import java.util.List;
import java.util.stream.Stream;

public interface PhoneBookAbs<T> {

  void insert(T t);
  void insertAll(Stream<T> stream);
  List<T> findAll();
  List<T> findAllByLastName(String lastName);
  void deleteByName(String Name);
  void deleteAllMatchingLastName(String lastName);
  void printAll();
  void printName();
  void printNode(Node<T> node);
}
/**Tasks:
 1. Implement a phone book using linked list structure. In this phone book you are going to store name, last name, email and phone number.
 2. Implement an insert operation to the phone book. With the insert operation your going to add name, last name, email and phone number of the person.
 3. Implement following methods:
 • findByName: Will return the information of the first record matching the
 name you send.
 • FindAllByLastName: Will return an ArrayList of all entries matching the Last
 name you send.
 • deleteByName: Will delete the first record matching the name you send to
 this method.
 • deleteAllMatchingLastName: Will delete all entries matching the Last name
 you send.
 • findAll: Return all records as an ArrayList.
 • printPhoneBook: will print all entries in the phone book.
 */