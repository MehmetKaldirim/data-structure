import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class CollectionsStack {
    public static void main(String[] args) {
        int[] arr = { 5, 4,3, 2,1};
        Deque<Integer> stack = new LinkedList<>();
        Deque<Integer> stack1 = new LinkedList<>();
        for (int i = 0; i < 5;i++) {
            stack.push(i);
            stack1.push(arr[i]);

        }
        System.out.println("poll " + stack.poll());
        System.out.println("Stack elements are:");
        stack.forEach(System.out::println);
        System.out.println("--------------------");
        stack.push(4);

        stack.forEach(System.out::println);

        System.out.println("Top of the stack is:   "+ stack.peek());

        stack1.forEach(a-> stack.push(a));

        stack.forEach(System.out::print);

        System.out.println(" here is last in first out "+ stack.peek());

        stack.remove(2);
        System.out.println("Updated Stack:   ");
        stack.forEach(System.out::print);
    }
}