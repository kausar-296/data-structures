/*linear data structure
follows fifo or lilo
diagramaticaly, it is represented like a container with both sides open
enqueue() to add elements and dequeue() to remove elements
queue.add(element) and queue.poll()
peek() to view the front element
queue.size() to get the number of elements in the queue
queue.peek() to view the front element 
queue.isEmpty() to check if the queue is empty
queue.clear() to remove all elements from the queue
prints true if the given element is in the queue- contains(element)
we use linked list concept to implement the queue*/

import java.util.LinkedList;
import java.util.Queue;

public class QueueDS {
    
    public static void main(String[] arg) {

        Queue<Integer> p = new LinkedList<>();
        System.out.println(p.isEmpty());
        p.add(18);
        System.out.println(p.isEmpty());
        p.add(20);
        p.add(25);
        System.out.println(p.peek());
        p.poll();
        System.out.println(p.peek());
        System.out.println(p.contains(20));
        System.out.println(p.isEmpty());
    }
}