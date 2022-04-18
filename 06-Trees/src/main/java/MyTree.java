import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class MyTree {
    public Node root;

    public MyTree() {
    }

    public MyTree(Node root) {
        this.root = root;
    }
    public void insert(int value){
        Node newNode=new Node(value);
        if(root==null) {
            root=newNode;
            return;
        }
        Node current=root;
        while(true){
            if(value<=current.value) {
                if (current.leftChild==null) {
                    current.leftChild=newNode;
                    break;
                }
                current=current.leftChild;
            }
            else  {
                if (current.rightChild==null) {
                    current.rightChild=newNode;
                    break;
                }
                current=current.rightChild;
            }

        }

    }// end insert

    // PreOrder Traversal of Tree  Root-Left-Right

    public void preOrderTraversal(Node root){
        if (root==null) return;
        System.out.print(root.value+", ");
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }
    // In-Order Traversal of Tree  Root-Left-Right
    public void inOrderTraversal(Node root){
        if (root==null) return;
        inOrderTraversal(root.leftChild);
        System.out.print(root.value+", ");
        inOrderTraversal(root.rightChild);
    }


    // Post-Order traversal  left-right-root
    public void postOrderTraversal(Node root){
        if (root==null) return;
        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.print(root.value+", ");

    }



    public void breadthFirstTraversal(Node root) {
        Queue<Node>  queue = new ArrayDeque<>();
        queue.add(root);
        Node current = root;
        int counter = 0;
        while(!queue.isEmpty()){
            System.out.print( current.value + " ");
            current= queue.remove();
            if(current.leftChild != null)
            queue.add(current.leftChild);
            if(current.rightChild != null)
            queue.add(current.rightChild);
            current = queue.peek();

        }
        System.out.println();
    }

    public boolean breadthFirstTraversalSearch(Node root, int searchValue) {
        Queue<Node>  queue = new ArrayDeque<>();
        queue.add(root);
        Node current = root;
        int counter = 0;
        while(!queue.isEmpty()){
            current= queue.remove();
            if (current.value == searchValue){
                System.out.println("value is founded");
                return true;
            } else {
                if (current.leftChild != null)
                    queue.add(current.leftChild);
                if (current.rightChild != null)
                    queue.add(current.rightChild);
            }


        }
        return  false;

    }


    public boolean isLeaf(Node root, int searchValue) {
        Queue<Node>  queue = new ArrayDeque<>();
        queue.add(root);
        Node current = root;
        int counter = 0;
        while(!queue.isEmpty()){
            current= queue.remove();
            if (current.value == searchValue && current.leftChild == null && current.rightChild == null){

                System.out.println("value is Leaf");
                return true;
            } else {
                if (current.leftChild != null)
                    queue.add(current.leftChild);
                if (current.rightChild != null)
                    queue.add(current.rightChild);
            }


        }
        return  false;

    }

    public  void leavesOfBST(Node root) {
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        Node current = root;
        int counter = 0;
        while (!queue.isEmpty()) {
            current = queue.remove();
            if (current.leftChild == null && current.rightChild == null) {

                System.out.print(current.value + " ");

            } else {
                if (current.leftChild != null)
                    queue.add(current.leftChild);
                if (current.rightChild != null)
                    queue.add(current.rightChild);
            }


        }

    }

        public  int countOfleaves(Node root) {
            Queue<Node>  queue = new ArrayDeque<>();
            queue.add(root);
            Node current = root;
            int counter = 0;
            while(!queue.isEmpty()){
                current= queue.remove();
                if (current.leftChild == null && current.rightChild == null){
                    counter++;


                } else {
                    if (current.leftChild != null)
                        queue.add(current.leftChild);
                    if (current.rightChild != null)
                        queue.add(current.rightChild);
                }


            }
            return counter;
    }


    public  int sumOfleaves(Node root) {
        Queue<Node>  queue = new ArrayDeque<>();
        queue.add(root);
        Node current = root;
        int sum = 0;
        while(!queue.isEmpty()){
            current= queue.remove();
            if (current.leftChild == null && current.rightChild == null){
                sum += current.value;


            } else {
                if (current.leftChild != null)
                    queue.add(current.leftChild);
                if (current.rightChild != null)
                    queue.add(current.rightChild);
            }


        }
        return sum;
    }

    // Assignment BreadthFirst Traversal here is his solutions
    public  void levelOrderTraversal(){
        if(root==null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node toVisit= queue.poll();
            System.out.print(toVisit.value+", ");
            if(toVisit.leftChild!=null) queue.add(toVisit.leftChild);
            if(toVisit.rightChild!=null) queue.add(toVisit.rightChild);
        }// end while
    }// end levelOrder
    // task-1 implement contains method
    public boolean contains(int value){
        if (root==null) return false;
        Node current=root;
        while(current!=null){
            if (value < current.value) current=current.leftChild;
            else if (value > current.value) current=current.rightChild;
            else return true;
        }
        return false;
    }
    public Node find(Node root, int value){
        Node result = null;
        if (root==null) return result;
        Node current=root;
        while(current!=null){
            if (value < current.value) current=current.leftChild;
            else if (value> current.value) current=current.rightChild;
            else {
                result = current;
                break;
            }
        }
       return result;
    }

    // task -2 return if the node is a leaf
    public boolean isLeaf(Node node) {
        return node.leftChild==null && node.rightChild==null;
    }
    // task -3 print leaves of a BST
    public void printLeaves(Node root){
        if (root==null) return;
        if (isLeaf(root)) System.out.print(root.value+", ");
        printLeaves(root.leftChild);
        printLeaves(root.rightChild);
    }
    // task -4 count leaves of a BST
    public int countLeaves(Node root){
        if (root==null) return 0;
        if (isLeaf(root)) return 1;
        return countLeaves(root.leftChild) + countLeaves(root.rightChild);
    }
    // task -5 sum leaf values of a BST
    public int findSumOfLeaves(Node root){
        if (root==null) return 0;
        if (isLeaf(root)) return root.value;
        return findSumOfLeaves(root.leftChild) + findSumOfLeaves(root.rightChild);
    }
    // task -6 Height of a node in a BST
    public int heightOfRoot(Node root){
        if (root==null) return -1;
        if (isLeaf(root)) return 0;
        return 1+ Math.max(heightOfRoot(root.leftChild), heightOfRoot(root.rightChild));
    }

    public int heightOfNode(int value){
        
        if (root==null) return -1;
        if (isLeaf(root)) return 0;
        return 1+ Math.max(heightOfRoot(root.leftChild), heightOfRoot(root.rightChild));
    }

}