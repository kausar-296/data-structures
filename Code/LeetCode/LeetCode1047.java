import java.util.*;

public class LeetCode1047 {
    public static void main(String[] arg) {
        Stack <Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("INPUT:");
        String s = sc.next();
        sc.close();
        for(char x:s.toCharArray()) {
            if(st.isEmpty() == true) {
                st.push(x);
            }
            else if(st.isEmpty() == false && x == st.peek()) {
                st.pop();
            }
            else if(st.isEmpty() == false && x != st.peek()) {
                st.push(x);
            }

        }   
        System.out.println(st);
        String ans = "";
        while(st.isEmpty() == false) {
            ans = st.peek() + ans;
            //Character.toString(st.peek()) + ans;
            st.pop();
        }
        System.out.println(ans);
    }
}


//STACK - -684, 2696, 844, 150, 682, -496, 1544, -1555