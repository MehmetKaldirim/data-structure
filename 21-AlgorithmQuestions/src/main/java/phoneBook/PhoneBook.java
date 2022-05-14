package phoneBook;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PhoneBook {

    private String name;
    private String lastName;
    private String email;
    private long phone;



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