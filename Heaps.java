import java.util.*;
public class Heaps {
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;   
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // pq.add(3);
        // pq.add(5);
        // pq.add(1);
        // pq.add(4);

        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("A", 5));
        pq.add(new Student("B", 3));
        pq.add(new Student("C", 1));
        pq.add(new Student("D", 4));

        while(!pq.isEmpty()) {
            System.out.println(pq.peek().name + " -> " + pq.peek().rank);
            pq.remove();
        }
    }
}
