import java.util.NoSuchElementException;

public class MyStack <T> {
    private Node<T> bottom;
    private Node<T> top;
    private int size;

    public boolean isEmpty() { return bottom==null; }

    public void myPush(T item){
        Node<T> node = new Node<>(item);
        if(isEmpty()){
            bottom = top = node;
        } else {
            top.setNext(node);
            top = node;
            top.setNext(null);
        }
        size++;
    }
    public void push (T item) {

        Node<T> node=new Node(item);

        if (isEmpty()) {
            bottom = top = node;
        }
        else {
            top.setNext(node);
            top=node;
        }
        size++;
    }

    public void myPrintAll(){
        if(isEmpty()){
            System.out.println("No element to print");
        } else {
            Node current = bottom;
            while (current != null){
                if(current== top) {
                    System.out.print(current.getValue() + " => null");
                } else {
                    System.out.print(current.getValue() + " => ");

                }
                current = current.getNext();
            }
        }
        System.out.println();
    }

    public T peek() {return (T) top.getValue();}

    public T myPop() {
        Node peekNode;

        if(isEmpty()) {
            throw new NoSuchElementException();
        }

        if(top == bottom) {

            peekNode = top;
            bottom = top = null;
        } else {
            peekNode = top;
            Node<T> prev = getPrevious(top);
            prev.setNext(null);
            top = prev;

        }
        size--;
        return (T) peekNode.getValue();
    }

    public T pop() {
        Node peekNode;
        if(isEmpty()) throw new NoSuchElementException();
        if(top==bottom) {
            peekNode=bottom;
            bottom=top=null;
        }
        else{
            peekNode=top;
            Node<T> previous=getPrevious(top);
            top=previous;
            top.setNext(null);
        }
        size--;
        return (T) peekNode.getValue();
    }

    private Node getPrevious(Node node) {
        Node<T> current=bottom;
        while(current!=null){
            if(current.getNext() == node) return current;
            current=current.getNext();
        }
        return null;
    }

    public int size() {return size;}


}