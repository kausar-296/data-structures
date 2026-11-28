class MakeNode {
    //purpose of this class is to create a node
    int val;
    MakeNode next;
    //the data type of "next" is "MakeNode" to move to the next node.
    MakeNode(int x) {
        /*constructor to initialize node value
        every node needs two fields. 
        user defined nodes are used.*/
        val = x;
        /*"x" is the initial value in the data field.
        the "x" value is passed into the function.*/
        next = null;
        //initially, the address field has the value "null".
        
        /*in double linked list, we have a variable "prev" of "MakeNode" data type.
        it is used to store the address of the previous node*/
    }
}

public class SingleLinkedList {
    public static void main(String [] args) {
        MakeNode n1 = new MakeNode(18);
        //making a node "n1" which has n1.val=18
        MakeNode head = n1;
        //the head stores the adress of the node "n1"
        System.out.println(head.val); //==n1.val =18
        System.out.println(head.next); //==n1.next =null
        MakeNode n2 = new MakeNode(20);
        head.next = n2;
        //to form the link from "n1" to "n2"
        System.out.println(head.next); //==n1.next =n2 address
        System.out.println(head.next.next); //==n2.next =null
        System.out.println(head.next.val); //==n2.val =20
        //writing "System.out.print()" lines to confirm the existence & working of nodes.
        MakeNode n3 = new MakeNode(15);
        n2.next = n3;
        System.out.println(head.next.next); //==n2.next =n3 address
        System.out.println(head.next.next.next); //==n3.next =null
        System.out.println(head.next.next.val); //==n3.val =15
        MakeNode n4 = new MakeNode(10);
        n3.next = n4;
        MakeNode n5 = new MakeNode(12);
        n4.next = n5;
        //only one link forward in single linked lists
        System.out.println("\n");


        //TRAVERSAL
        //to print all the nodes using only one print statement
        MakeNode temp = head;
        while(temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
