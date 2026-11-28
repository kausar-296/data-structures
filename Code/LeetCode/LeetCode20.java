import java.util.*;

public class LeetCode20 {
    public static void main(String[] args) {
        Stack <Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.next();
        System.out.println(s);
        sc.close();
        for(char x:s.toCharArray()) {
            if(x == '(' || x == '[' || x == '{') {
                st.push(x);
            }
            else {
                if(st.isEmpty() == false && x == ')' && st.peek() == '(') {
                    st.pop();
                }
                else if(st.isEmpty() == false && x == '}' && st.peek() == '{') {
                    st.pop();
                }
                else if(st.isEmpty() == false && x == ']' && st.peek() == '[') {
                    st.pop();
                }
                else {
                    System.out.println("false");
                }
            }
        }
        System.out.println(st.isEmpty());
    }
}
