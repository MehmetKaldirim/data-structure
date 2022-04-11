package SingleLinkedList;

import SingleLinkedList.Node;

public class MySinglyLinkedList {
    Node head;
    Node tail;
    int size;

    public MySinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // methods here!
    boolean isEmpty(){
        return head==null;
    }
    void addMy(int data){
       Node node = new Node(data);
        if(isEmpty()){
            head = tail =  node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    // Adds element into last position in the linked list
    void add(int data){
        // create a new node with data value
        Node node=new Node(data);
        // check if empty

        if(isEmpty()){head=tail=node;
        }
        else { // add element to last position
            tail.next=node;
            tail=node;
        }
        size++;
    }

    Node myGetKthItemAndDelete(int k) {
        Node prevDelete = head;
        Node current = head;
        Node kcurrent = head;
        int counter = 0;
        while (kcurrent.next != null) {

            if (counter < k-1) {
                System.out.println("values of k " + kcurrent.value + " counter = " + counter);
                kcurrent = kcurrent.next;

            }
            else {
                kcurrent = kcurrent.next;
                System.out.println("values of k " + kcurrent.value + " counter = " + counter);
                prevDelete = current;
                current = current.next;
                System.out.println("values of cur " + current.value + " counter = " + counter);

            }
            counter++;
        }
        if(current == head) {
            head = current.next;
        } else {
            prevDelete.next = current.next;
        }

        return current;
    }

    void printNodesMy() {
        Node current = head;
        while (current != null) {
            if(current.next == null){
                System.out.print(current.value + "=> null");
            } else {
                System.out.print(current.value + "=>");
            }
            current = current.next;

        }
        System.out.println();

    }

    void printNodes() {
        Node current=head;
        while(current!=null){
            if(current.next==null) System.out.print(current.value + "=> null");
            else System.out.print(current.value +"=>");
            current = current.next;
        }
        System.out.println();
    }

    int myIndexOf( int value) {
        Node current = head;
        int pos = 0;
        if(isEmpty()){
            return -1;
         }
         while(current != null) {
             if(current.value == value ) {
                 return pos;
             } else {
                 current = current.next;
                 pos++;
             }

         }
         return -1;
    }

    void myDeleteNode(int value) {
        Node current = head;
        Node previous = head;

        if ( isEmpty()) {
            System.out.println("There is nothing to delete here");
        }

        while (current != null ) {
            if(current.value == value) {
                if (current == head) {
                    head = current.next;
                    current.next = null;
                } else if (current == tail ) {
                    tail = previous;
                    tail.next = null;
                } else {
                    previous.next = current.next;
                    current.next = null;

                }

            }
            previous = current;
            current = current.next;
        }
    }


    // deletes all items with the value
    void deleteNode(int value) {
        if (isEmpty()) System.out.println("No values for delete!!!");
        Node current = head;
        Node prev = head;
        while (current != null) {
            if (current.value == value) {// if you find a match
                if (current == head) { // if the item tobe deleted is the head
                    head = current.next;
                    current.next = null;// will be available for garbage collection
                } else if (current == tail) {// if the item tobe deleted is the tail
                    tail = prev;
                    prev.next = null;
                } else {// if the item tobe deleted is in the middle
                    prev.next = current.next;
                    current.next = null;
                }
                size--;// decrease the size once you
            }
            prev = current;
            current = current.next;
        }

    }
    public int getKthFromLast(int k){
        Node ptr1=head;
        Node ptr2=head;
        for(int i=0;i<k-1;i++) {ptr2=ptr2.next;
            if (ptr2==null) return -1;
        }
        while(ptr2.next!=null) {
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        return ptr1.value;
    }
    public void removeKthFromLast(int k) {
        Node prevDelete = null;
        Node ptr1 = head;
        Node ptr2 = head;
        for (int i = 0; i < k - 1; i++) {
            ptr2 = ptr2.next;
            if (ptr2 == null) System.out.println("No such value");
            ;
        }
        while (ptr2.next != null) {
            prevDelete = ptr1;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        if (ptr1 == head) {
            head = ptr1.next;
            ptr1.next = null;
            size--;
        } else {
            prevDelete.next = ptr1.next;
            ptr1.next = null;
            size--;
        }
    }
    //Assinment 4 Remove duplication or sorted LInked lIst

    public void myRemoveDuplication(){
        if(isEmpty()) {
            System.out.println("there is no value");
        }
        Node current = head;

        while (current != null){

            Node curNext = current.next;
            while (curNext != null && curNext.value ==current.value ) {
                curNext = curNext.next;
            }
            current.next = curNext;
            current = current.next;
        }

    }



    // Assignment 4 Reverse the Nodes of Singly Linked List in one pass
    public  void myReverse() {
        if (isEmpty()) return;
        Node current = head.next;
        Node previous = head;
        int i = 0 ;
        while (current !=  null ) {
            Node template = current.next;
            current.next  =previous;
            previous = current;
            current = template;
        }
        tail = head;
        tail.next = null;
        head = previous;
    }

    public void reverse() {
        if (isEmpty()) return;
        Node previous = head;
        Node current = head.next;
        while (current != null) {
            Node nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        tail = head;
        tail.next = null;
        head = previous;
    }
    // Assignment 3 Remove Duplicated values from SLL
    // O(n) time | O(1) space - where n is the number of nodes in the Linked List
    void removeDuplicatesFromLinkedList() {
        Node current = head;
        while (current != null) {
            Node nextDistinctNode = current.next;
            while (nextDistinctNode != null && nextDistinctNode.value == current.value){
                nextDistinctNode = nextDistinctNode.next;
            }
            current.next = nextDistinctNode;
            current = nextDistinctNode;
        }
    }
    int indexOf(int value){
        int pos=0;
        Node current=head;
        if (isEmpty()) return-1;
        while(current!=null) {
            if (current.value==value) return pos;
            pos++;
            current=current.next;
        }
        return -1;
    }

}