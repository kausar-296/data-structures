/*linear data structure.
last in first out principle (LIFO), first in last out (FILO).
push() operation used to put items in stack and pop() operation used to remove items from stack.
diagramatically, a stack is represented like a water glass where push n pop operations occurs from top end.

operations-
push() inserting an element into the stack => in java, we have "stack.push(element);" => python we have "append(element)"
pop() deleting the top element of the stack => in java, we have "stack.pop();"
peek() displays the top element of the stack but it will not remove it => "stack.peek();"
isEmpty() it prints true if stack is empty otherwise false => "stack.isEmpty();"

a stack is created using "Stack class" in java. in python we use "List" and in 'C' we use "Array"*/

import java.util.*;

public class StackDS {
    public static void main(String[] arg) {
        Stack <Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        st.push(18);
        System.out.println(st.isEmpty());
        st.push(21);
        st.push(26);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
    }
}
