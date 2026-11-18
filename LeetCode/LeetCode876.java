class MakeNode {
    int val;
    MakeNode next;
    MakeNode(int x) {
        val = x;
        next = null;
    }
}

public class LeetCode876 {
    public static void main(String[] arg) {
        MakeNode head = new MakeNode(3);
        MakeNode fast = head, slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println(slow);
    }
}