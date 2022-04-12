import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElementsQueue {
    public static void main(String[] args) {
        Deque<Integer> queue =  new ArrayDeque<>();
        for(int i = 0; i < 6 ; i++){
            queue.add(i);
        }
        System.out.println(queue.toString());
        int k = 3;
        System.out.println(reverseFirstK( queue, k));
    }

    private static Queue<Integer> reverseFirstK(Deque<Integer> queue, int k) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k ; i++) {
            stack.push(queue.removeFirst());
        }

        System.out.println(queue.toString());
        for (int i = 0; i < k ; i++) {
            queue.add(stack.pop());
        }
        for (int i = 0; i < queue.size()- k ; i++) {
            queue.add(queue.removeFirst());
        }
        return queue;
    }
}
