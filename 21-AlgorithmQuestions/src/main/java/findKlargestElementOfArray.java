import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class findKlargestElementOfArray {
    public static void main(String[] args) {

        int [] array = new int []{ 1,1,2,3,4,4,5,5,6};
        System.out.println( " 3 largaest elemenst of array " + findKthLargestElement(array ,3));
    }

    private static int findKthLargestElement(int[] array, int k) {

        Queue<Integer> heap = new PriorityQueue(Collections.reverseOrder());
        int result= 0;
        for (int j = 0; j < array.length ; j++) {
            heap.add(array[j]);
        }

        for (int j = 0; j < k; j++) {
            result = heap.remove();
        }
        return result;
    }
}
