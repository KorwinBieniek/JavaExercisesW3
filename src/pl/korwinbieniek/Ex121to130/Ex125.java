package pl.korwinbieniek.Ex121to130;


import javax.swing.tree.TreeNode;

public class Ex125 {
    class Node{
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

// Print the nodes of binary tree

        void print_Preorder(Node node) {
            if (node == null)
                return;

            /* Print data of node */
            System.out.print(node.key + " ");

            print_Preorder(node.left);

            print_Preorder(node.right);
        }

        void print_Preorder() {
            print_Preorder(root);
        }
    }
}
