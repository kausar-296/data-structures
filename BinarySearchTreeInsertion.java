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
        System.out.println("\nEnter the level to print:");
        int find = sc.nextInt();
        System.out.println("Nodes at level " + find + ":");
        printGivenLevel(root, 1, find);
        System.out.println("\nEnter two nodes to find their LCA:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        Node lca= LCA(root, n1, n2);
        if(lca != null) {
            System.out.println("LCA of " + n1 + " and " + n2 + " is: " + lca.data);
        } else {
            System.out.println("LCA not found.");
        }
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
    static void printGivenLevel(Node root, int level, int find) {
        if(root == null) {
            System.out.print("No nodes at this level.");
            return;
        }
        if(level == find) {
            System.out.print(root.data + " ");
        }
        else if(level > 1) {
            printGivenLevel(root.left, level-1, find);
            printGivenLevel(root.right, level-1, find);
        }
    }
    /* FIND LCA (LOWEST COMMON ANCESTOR):
    Compare both nodes woth root node to see if they are less than or greater than the root 
    if both less, move to left; if both greater, move to right; if one is less and the other is greater, the root is the LCA*/

    static Node LCA(Node root, int n1, int n2) {
        if(root == null) {
            return null;
        }
        if(root.data > n1 && root.data > n2) {
            return LCA(root.left, n1, n2);
        }
        if(root.data < n1 && root.data < n2) {
            return LCA(root.right, n1, n2);
        }
        return root;
    }
}
