import java.util.*;
import java.util.LinkedList;

public class DequeP {
    static class Stack {
        Deque<Integer> dq = new LinkedList<>();

        public void push(int data) {
            dq.addLast(data);
        }

        public int pop() {
            return dq.removeLast();
        }

        public int peek() {
            return dq.getLast();
        }
    }

    static class Queue {
        Deque<Integer> dq = new LinkedList<>();

        public void add(int data) {
            dq.addLast(data);
        }

        public int remove() {
            return dq.removeFirst();
        }

        public int peek() {
            return dq.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue s = new Queue();
        s.add(1);
        s.add(2);
        s.add(3);
        System.out.println("peek = "+ s.peek());
        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.remove());

        // Stack s = new Stack();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // System.out.println("peek = "+ s.peek());
        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());

        // Deque<Integer> dq = new LinkedList<>();
        // dq.addFirst(1);
        // dq.addFirst(2);
        // dq.addFirst(3);
        // dq.addLast(4);
        // dq.addLast(5);
        // System.out.println(dq);
        // dq.removeLast();
        // System.out.println(dq);
        // dq.removeFirst();
        // System.out.println(dq);
        // System.out.println(dq.getFirst());
        // System.out.println(dq.getLast());
    }
}
