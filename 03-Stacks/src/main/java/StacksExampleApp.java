public class StacksExampleApp {
    public static void main(String[] args) {
        MyStack<Character> myStack = new MyStack();
        myStack.myPush('c');
        myStack.myPush('b');
        myStack.myPush('a');
        myStack.myPrintAll();

        myStack.myPop();


        myStack.myPrintAll();

        System.out.println(myStack.peek());
        System.out.println("Size of the stack is : " +myStack.size());

    }
}