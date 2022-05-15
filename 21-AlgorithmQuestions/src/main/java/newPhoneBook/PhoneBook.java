package newPhoneBook;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class PhoneBook {
    PhoneNode head;
    PhoneNode tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        PhoneNode current = head;
        if (isEmpty()) throw new NoSuchElementException("List is Empty");
        while (current != null) {

            System.out.println(current + "=>");
            current = current.next;
            if(current == null) {
                System.out.print("null");

            }

        }

        System.out.println();
    }

    public void add(Contact contact) {
        PhoneNode node = new PhoneNode(contact);
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public PhoneNode findByName(String firstName){
        if(isEmpty()) throw new NoSuchElementException("No elements");
        PhoneNode current = head;
        while(current!= null){
            if(current.contact.firstName.equalsIgnoreCase(firstName)) return current;
            current = current.next;
        }
        throw new NoSuchElementException("Theres no contact with first name = " + firstName);

    }

    public List<PhoneNode> findAllByLastName(String lastName){
        if(isEmpty()) throw new NoSuchElementException("No elements");
        List<PhoneNode> list = new ArrayList<>();
        PhoneNode current = head;
        while(current!= null){
            if(current.contact.lastName.equalsIgnoreCase(lastName)){
                list.add(current);
            }
            current = current.next;
        }
        if(list.isEmpty()){
            throw new NoSuchElementException("There is no matching lastName = " + lastName );
        }
           return list;
        }

    public void deleteByName(String firstName){
        if(isEmpty()) throw new NoSuchElementException("No elements");
        PhoneNode current = head;
        PhoneNode previous = head;
        while (current!=null){
            if(current.contact.firstName.equalsIgnoreCase(firstName)){
                if(current==head ){
                    if(size==1) {
                        head=tail=null;

                    } else {
                        head = current.next;
                        current.next = null;
                        size--;
                    }

                } else if (current==tail){
                    tail = previous;
                    previous.next = null;

                } else {
                    previous.next = current.next;

                }
            }
            previous = current;
            current = current.next;
        }
    }

    public void deleteAllByLastName(String lastName){
        if(isEmpty()) throw new NoSuchElementException("No elements");
        PhoneNode current = head;
        PhoneNode previous = head;
        while (current!=null){
            if(current.contact.lastName.equalsIgnoreCase(lastName)){
                //System.out.println("here lastnama please delete it" + current.contact.lastName );
                if(current==head ){
                    if(size==1) {
                        head=tail=null;
                        size--;
                    } else {
                        head = current.next;
                        size--;
                    }

                } else if (current==tail){
                    tail = previous;
                    previous.next = null;
                    size--;

                } else {
                    System.out.println(current.contact.firstName + " here last name please delete it "  + current.contact.lastName );
                    previous.next = current.next;

                    size--;

                }
            }
            previous = current;

            current = current.next;
        }
    }
    public void deleteAllMatchingLastName(String lastName) {
        PhoneNode current = head;
        PhoneNode previous = head;
        if (isEmpty()) {
            throw new NoSuchElementException("No record is available in phone book");
        }
        boolean isDeleted = false;
        while (current != null) {
            if (current.contact.lastName.equals(lastName)) {
                if (current == head) {
                    if (size == 1) {
                        head = tail = null;
                    } else {
                        head = current.next;
                        previous = head;

                    }
                } else if (current == tail) {
                    tail = previous;
                    previous.next = null;

                } else {
                    previous.next = current.next;

                }
                size--;
                isDeleted = true;
            }

            if (isDeleted) {
                current = previous.next;
                isDeleted = false;
            } else {
                previous = current;
                current = current.next;
            }

        }


    }

}

