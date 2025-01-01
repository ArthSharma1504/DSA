import java.util.*;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();
    
        // Add elements at both ends
        deque.addFirst(10);  // Adds 10 to the front
        deque.addLast(20);   // Adds 20 to the rear
        deque.addFirst(5);   // Adds 5 to the front

        // Print the deque
        System.out.println("Deque after adding elements: " + deque);

        // Remove elements from both ends
        System.out.println("Removed from front: " + deque.removeFirst()); // Removes 5
        System.out.println("Removed from rear: " + deque.removeLast());  // Removes 20

        // Print the remaining deque
        System.out.println("Deque after removals: " + deque);
        
    }

    
}
