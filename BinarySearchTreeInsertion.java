/*binary search tree cant have duplicate data


45 12 98 47 67 43 27

45 in root
12<45 left
98>45 right
47>45 right 47<98 left
67>45 right 67<98 left 67>47 right
43<45 left 43>12 right
27<45 left 27>12 right 27<43 left

to insert in tree

node root = new node(1);
root.left = new node(2);
root.right = new node(3);

if there are multiple records then- */

import java.util.Scanner;

class BinarySearchTreeInsertion {
    static class Node {
        int data;
        Node left, right;
    }
    static Node newNode(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.left = temp.right = null;
        return temp;
    }
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        System.out.println("Enter number of elements to insert into the BST:");
        int n = sc.nextInt();
        for(int i=0; i<=n; i++) {
            System.out.println("Enter number" + (i+1) + ":");
            int x = sc.nextInt();
            root = insert(root, x);
        }
        System.out.println("Inorder traversal of the BST:");
        inorder(root);
        System.out.println("\nEnter the key to search:");
        int key = sc.nextInt();
        System.out.println(search(root, key));
        sc.close();
    }
    static Node insert(Node root, int data) {
        if(root == null) {
            root = newNode(data);
        }
        else if(data < root.data) {
            root.left = insert(root.left, data);
        }
        else if(data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }
    static void inorder(Node root) {
        if(root!= null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    static boolean search(Node root, int key) {
        if(root == null) {
            return false;
        }
        if(root.data == key) {
            return true;
        }
        return (root.data < key) ? search(root.right, key) : search(root.left, key);
    }
}
