import java.util.*;

public class stack {
    public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.push(34);
    stack.push(56);
    stack.push(29);
    stack.push(78);
    stack.push(23);

    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    }

}
