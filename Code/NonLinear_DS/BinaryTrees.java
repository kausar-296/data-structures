/*non linear data structure
it is a grp of nodes connected in a non sequencial fashion which replicates hierarchy. 
every tree is a graph but every graph is not a tree.

TERMINOLOGY
- Root: The topmost node in the tree.
- Parent: A node that has child nodes.
- Child: A node that has a parent node.
- Leaf: A node that has no child nodes.
- Sibling: Nodes that have the same parent.


these r the nodes existing on the path from the root node to the given node (ancestors)
Descendant: A node that is a child of a given node or a child of a descendant of a given node (children, grandchildren, great-grandchildren, etc.)
degree of a node: The number of children of a node.
degree of a tree: The maximum degree of any node in the tree.
depth of a node: The number of edges from the root to the node.


binary tree: A tree in which each node has at most two children.
binary search tree: A binary tree in which the left child of a node contains a value less than its parent node, and the right child contains a value greater than its parent node.
avl tree: A self-balancing binary search tree in which the heights of the two child subtrees of any node differ by at most one.
red black tree: A self-balancing binary search tree in which each node has an extra bit for denoting the color of the node, either red or black. The tree maintains balance by enforcing certain properties related to the colors of the nodes.
bt tree: A tree data structure in which each node can have an arbitrary number of children.
segment tree: A tree data structure used for storing intervals or segments. It allows querying which of the stored segments contain a given point.*/


class MakeTreeNode {
    int data;
    MakeTreeNode left;
    MakeTreeNode right;

    public MakeTreeNode(int x) {
        data = x;
        left = null;
        right = null;
    }
}

public class BinaryTrees {
/* it is a tree in which every node has at most two children
for a tree with only one node for every node, it is a skewed tree. for a tree with only one node for every node, it is a skewed tree.
if all nodes are on the right side of the tree, it is a right skewed tree. if all nodes are on the left side of the tree, it is a left skewed tree.


MEMORY REPRESENTATION OF BINARY TREES
one node has three fields, one for data and two for pointers to the left and right child nodes. The left pointer points to the left child node, and the right pointer points to the right child node. If a node does not have a left or right child, the corresponding pointer is set to null.*/

    public static void traversal(MakeTreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        traversal(root.left);
        traversal(root.right);
    }

    public static void main(String[] arg) {
        MakeTreeNode n1 = new MakeTreeNode(1);
        MakeTreeNode n2 = new MakeTreeNode(2);
        n1.left= n2;
        MakeTreeNode n3 = new MakeTreeNode(3);
        n1.right = n3;
        MakeTreeNode n4 = new MakeTreeNode(4);
        n2.left = n4;
        MakeTreeNode n5 = new MakeTreeNode(5);
        n2.right = n5;
        MakeTreeNode n6 = new MakeTreeNode(6);
        n3.left = n6;


        /*TRAVERSAL OF BINARY TREES
        rule- 
        pre order : root left right
        in order : left root right
        post order : left right root*/

        traversal(n1);
    }

}
