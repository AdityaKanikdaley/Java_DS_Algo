package apniKaksha.BinaryTree;

import java.util.Scanner;
/*
                      2
                   4     1
                 7     8   3

(LNR)      Inorder = Left -> Node -> Right = 7, 4, 2, 8, 1, 3
(NLR)     Preorder = Node -> Left -> Right = 2, 4, 7, 1, 8, 3
(LRN)    PostOrder = Left -> Right -> Node = 7, 4, 8, 3, 1, 2
 */

public class intro_in_pre_post_order {
    static Scanner sc = new Scanner(System.in);
    public static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
        }
    }

    public static Node createTree(){
        Node root;
        System.out.println("Enter data:");
        int data = sc.nextInt();

        if(data == -1) return null; // base condition

        root = new Node(data);

        System.out.println("Enter left for " + data);
        root.left = createTree();

        System.out.println("Enter right for " + data);
        root.right = createTree();

        return root;
    }

    public static void inOrder(Node root){
        if(root == null) return; //base condition

        inOrder(root.left); // L
        System.out.print(root.data + " "); // N
        inOrder(root.right); // R
    }

    public static void preOrder(Node root){
        if(root == null) return; //base condition

        System.out.print(root.data + " "); // N
        preOrder(root.left); // L
        preOrder(root.right); // R
    }

    public static void postOrder(Node root){
        if(root == null) return; //base condition

        postOrder(root.left); // L
        postOrder(root.right); // R
        System.out.print(root.data + " "); // N
    }
    public static void main(String[] args) {
        Node root = createTree();

        System.out.print("inOrder: "); inOrder(root);
        System.out.println();

        System.out.print("preOrder: "); preOrder(root);
        System.out.println();

        System.out.print("postOrder: "); postOrder(root);
        System.out.println();
    }
}
