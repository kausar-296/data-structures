class MakeNode {
    int val;
    MakeNode next;
    MakeNode(int x) {
        val = x;
        next = null;
    }
}    
public class LeetCode141 {
    public static boolean main(String [] arg) {
        
        MakeNode head = new MakeNode(1);
        MakeNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
           fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
    return false;
    }
}
