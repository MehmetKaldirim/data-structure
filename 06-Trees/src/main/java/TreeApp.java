public class TreeApp {
    public static void main(String[] args) {
        MyTree tree=new MyTree();
        int[] numbers=new int[] {10, 5, 12, 3, 6, 11, 13, 2,7,17,19,15};
        for (int i = 0; i <numbers.length ; i++) {
            tree.insert(numbers[i]);
        }
        VisualizeTree.printTree(tree.root, null,false);

        // solution last System.out.println(tree.depthOfRoot(tree.root,0));

        System.out.print("depth of  Node= " + tree.depthOfRoot(tree.find(tree.root, 5),0));

        /*System.out.println(tree.myHeightOfRoot(tree.root));

        System.out.println(tree.mySumLeavesSecond(tree.root));

        System.out.println(tree.myCountLeavesSecond(tree.root));

        tree.printLeaves(tree.root);
        System.out.print("height of  Node= " + tree.heightOfRoot(tree.find(tree.root, 2)));
         System.out.print("find Node= " + tree.find(tree.root, 2).value);


       int searchValue  = 2;


        System.out.println( "is LEAF ? " + tree.isLeaf(tree.root, searchValue));


        System.out.println( "is search value in tree ? " + tree.breadthFirstTraversalSearch(tree.root, searchValue));
        System.out.print("preorder traversal = ");
        tree.preOrderTraversal(tree.root);
        System.out.println();

        System.out.print("inorder traversal = ");
        tree.inOrderTraversal(tree.root);
        System.out.println();

        System.out.print("postOrder traversal = ");
        tree.postOrderTraversal(tree.root);*/

    }
}