package pl.korwinbieniek.Basic_Exercises.Ex121to130;

public class Ex126 {
    class Node
    {
        int key;
        Node left, right;

        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }

    class BinaryTree {
        // Root of Binary Tree
        Node root;

        BinaryTree() {
            root = null;
        }

        // Print the nodes of binary tree in inorder
        void print_Inorder(Node node) {
            if (node == null)
                return;

            print_Inorder(node.left);

            // Print the data of node
            System.out.print(node.key + " ");

            print_Inorder(node.right);
        }

        void print_Inorder() {
            print_Inorder(root);

        }
    }
}
