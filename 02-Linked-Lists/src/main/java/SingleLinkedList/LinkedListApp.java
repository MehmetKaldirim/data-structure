package SingleLinkedList;

import SingleLinkedList.MySinglyLinkedList;

public class LinkedListApp {
    public static void main(String[] args) {
        int[] numbers={1,1,2,2,2,3,4,4,4,4,5,6,6};
        MySinglyLinkedList nums1 = new MySinglyLinkedList();
        for (int i = 0; i < numbers.length ; i++) {
            nums1.add(numbers[i]);
        }
        nums1.myRemoveDuplication();
        nums1.myReverse();
        nums1.printNodesMy();

        MySinglyLinkedList list1 = new MySinglyLinkedList();

        for(int i=0;i<11;i++) {
            list1.add(i);

        }
        //System.out.println("With duplicates");
        //list1.printNodes();
        //System.out.println("Without duplicates");
        //list1.removeDuplicatesFromLinkedList();
        list1.printNodesMy();
        System.out.println("My index of 5 = " + list1.myIndexOf(5));
        System.out.println("the size now  = " + list1.size);
        System.out.println("last  from 4 rd= " + list1.myGetKthItemAndDelete(4).value);
        System.out.println("After reverse in one pass");
        //list1.myDeleteNode(5);
        list1.reverse();
        list1.printNodes();

    }
}