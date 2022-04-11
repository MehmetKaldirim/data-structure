public class TreeApp {
    public static void main(String[] args) {
        MyTree tree=new MyTree();
        int[] numbers=new int[] {10, 5, 12, 3, 6, 11, 13, 2};
        for (int i = 0; i <8 ; i++) {
            tree.insert(numbers[i]);
        }
        VisualizeTree.printTree(tree.root, null,false);
        System.out.println("preorder traversal");
        tree.preorderTraversal(tree.root);
        System.out.println("inorder traversal");
        tree.inOrderTraversal(tree.root);
        System.out.println("postOrder traversal");
        tree.postOrderTraversal(tree.root);

    }
}