public class QueueTestApp {
    public static void main(String[] args) {

        MyQueue<String> myQueue =new MyQueue<>();
        System.out.println(myQueue.isEmpty());
        myQueue.myEnqueue("first");
        myQueue.myEnqueue("second");
        myQueue.myEnqueue("third");

        myQueue.myPrintAll();
    }
}
