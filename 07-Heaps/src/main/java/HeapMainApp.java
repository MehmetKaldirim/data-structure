public class HeapMainApp {
    public static void main(String[] args) {
        MyHeap heap = new MyHeap(8);
        heap.insert(61);
        heap.insert(120);
        heap.insert(52);
        heap.insert(45);
        heap.insert(83);
        heap.printHeap();
        System.out.println(heap.remove() + " is removed  and size is" + heap.size);
        heap.printHeap();
        System.out.println("------------find K largest elements ---------------------------------");
        int [] array = new int []{ 1,1,2,3,4,4,5,5,6};
        System.out.println( " 7 largaest elemenst of array " + findKthLargestElement(array ,7));
    }

    private static int findKthLargestElement(int [] array, int k) {
        MyHeap heap = new MyHeap(array.length);
        int result= 0;
        for (int j = 0; j < array.length ; j++) {
            heap.insert(array[j]);
        }

        result = heap.items[k];
        return result;
    }
}
