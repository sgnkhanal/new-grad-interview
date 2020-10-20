package tests;// Java program for different tree traversals

/* Class containing left and right child of current 
node and key value*/

public class BinaryTreeTest {



    static class Node {
        int key;
        Node left, right;

        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }

    static class BinaryTree {
        // Root of Binary Tree
        Node root;

        BinaryTree() {
        root = null;
        }

        //--------------------DFS InOrder-----------------
        /* Given a binary tree, print its nodes in inorder*/
        //Output- 4 2 5 1 3
        void printInorder(Node node)
        {
            if (node == null)
            return;

            /* first recur on left child */
            printInorder(node.left);

            /* then print the data of node */
            System.out.print(node.key + " ");

            /* now recur on right child */
            printInorder(node.right);
        }

        // Wrappers over above recursive functions
        void printInorder()
        {
            printInorder(root);
        }

        //---------------------DFS PreOrder------------------
        /* Given a binary tree, print its nodes in preorder*/
        //Output- 1 2 4 5 3
        void printPreorder(Node node)
        {
            if (node == null)
                return;

            /* first print data of node */
            System.out.print(node.key + " ");

            /* then recur on left sutree */
            printPreorder(node.left);

            /* now recur on right subtree */
            printPreorder(node.right);
        }

        // Wrappers over above recursive functions
        void printPreorder() { printPreorder(root); }


        //---------------------DFS PostOrder------------------
        //Output- 4 5 2 3 1
        void printPostorder(Node node)
        {
            if (node == null)
                return;

            // first recur on left subtree
            printPostorder(node.left);

            // then recur on right subtree
            printPostorder(node.right);

            // now deal with the node
            System.out.print(node.key + " ");
        }

        // Wrappers over above recursive functions
        void printPostorder() { printPostorder(root); }

    }

    // Driver method
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("\nDFS Inorder traversal of binary tree is ");
        tree.printInorder();

        System.out.println("\nDFS Preorder traversal of binary tree is ");
        tree.printPreorder();

        System.out.println("\nDFS Postorder traversal of binary tree is ");
        tree.printPostorder();

    }

}
