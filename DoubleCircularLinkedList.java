class MakeNode {
    //purpose of this class is to create a node
    int val;
    MakeNode prev, next;
    //the data type of "next" is "MakeNode" to move to the next node.
    MakeNode(int x) {
        /*constructor to initialize node value
        every node needs two fields. 
        user defined nodes are used.*/
        val = x;
        /*"x" is the initial value in the data field.
        the "x" value is passed into the function.*/
        prev = null;
        next = null;
        //initially, both the address fields have the value "null".
    }
}

public class DoubleCircularLinkedList {
    public static void main(String [] args) {
        MakeNode n1 = new MakeNode(18);
        //making a node "n1" which has n1.val=18
        MakeNode head = n1;
        //the head stores the adress of the node "n1"
        System.out.println(head.val); //==n1.val =18
        System.out.println(head.next); //==n1.next =null
        System.out.println(head.prev); //==n1.prev =null
        MakeNode n2 = new MakeNode(20);
        head.next = n2;
        n2.prev = n1;
        //to form the link from "n1" to "n2" on both ends
        System.out.println(head.next); //==n1.next =n2 address
        System.out.println(head.next.next); //==n2.next =null
        System.out.println(head.next.val); //==n2.val =20
        System.out.println(head.next.prev); //==n1 address
        System.out.println(head.next.prev.val); //==n1.val =18
        //writing "System.out.print()" lines to confirm the existence & working of nodes.
        MakeNode n3 = new MakeNode(15);
        n2.next = n3;
        n3.prev = n2;
        MakeNode n4 = new MakeNode(10);
        n3.next = n4;
        n4.prev = n3;
        MakeNode n5 = new MakeNode(12);
        n4.next = n5;
        n5.prev = n4;
        n5.next = n1;
        n1.prev = n5;
        
        /*the "prev" of 1st node is last node and "next" of last node is 1st node*/
        System.out.println("\n");

        //TRAVERSAL
        MakeNode temp1 = n1;
        while(temp1 != null) {
            System.out.println(temp1.val);
            temp1 = temp1.next;
        }
        MakeNode temp2 = n5;
        while(temp2 != null) {
            System.out.println(temp2.val);
            temp2 = temp2.prev;
        }
    }
}
