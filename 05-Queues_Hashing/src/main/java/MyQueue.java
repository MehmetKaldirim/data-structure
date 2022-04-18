import java.util.NoSuchElementException;

public class MyQueue <T>{
    private Node<T> front;
    private Node<T> back;
    private int size;

    public boolean isEmpty() { return front==null; }

    public T peek() {return (T) front.getValue();}

    public void enqueue (T item) {
        Node<T> node=new Node(item);

        if (isEmpty()) front=back=node;
        else {
            back.setNext(node);
            back=node;
        }
        size++;
    }
    public void myEnqueue(T item){
        Node<T> addNode = new Node(item);
        if(isEmpty()){
            front=back=addNode;
        } else {
            back.setNext(addNode);
            back = addNode;
        }
        size++;
    }
    public void myDequeue(){
        if(isEmpty()) throw new NoSuchElementException();
        if(front == back){
            front = back = null;
        } else {
            front = front.getNext();
        }
        size--;
    }

    public void myPrintAll(){
        if(isEmpty()){
            System.out.println("there is nothing here to write");
        } else {
            Node current = front;

            while (current != null){
                if(current == back){
                    System.out.println(current.getValue() + "=> null" );
                } else {
                    System.out.print(current.getValue() + "=>");

                }
                current = current.getNext();
            }

        }
    }

    public T dequeue() {
        Node frontNode;
        if(isEmpty()) throw new NoSuchElementException();
        if(front==back) {
            frontNode=front;
            front=back=null;
        }
        else{
            frontNode=front;
            front=front.getNext();

        }
        size--;
        return (T) frontNode.getValue();
    }

    public int size() {return size;}


}