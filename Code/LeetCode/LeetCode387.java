import java.util.*;

public class LeetCode387 {
    public static void main(String[] arg) {
        Queue<Character> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        char y;
        for (char x: s.toCharArray()) {
            q.add(x);
        }
        while(!q.isEmpty()) {
            y = q.peek();
            q.poll();
            if (!q.contains(y)) {
                System.out.println(s.indexOf(y));
                break;
            }
        }
    }
}
