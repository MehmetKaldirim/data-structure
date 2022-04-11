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

    public void preorderTraversal(Node node){

        if (root == null) return;
        System.out.println(root.value + " ");
        preorderTraversal(root.leftChild);
        preorderTraversal(root.rightChild);
    }

    public void inOrderTraversal(Node node){

        if (root == null) return;
        inOrderTraversal(root.leftChild);
        System.out.println(root.value + " ");

        inOrderTraversal(root.rightChild);
    }

    public void postOrderTraversal(Node node){
        if (root == null) return;
        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.println(root.value + " ");

    }
}