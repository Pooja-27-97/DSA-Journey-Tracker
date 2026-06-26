import java.util.*;
public class HeapOperations {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) { //O(log n)
            arr.add(data); // add at last idx

            int x = arr.size()-1;
            int par = (x-1)/2;

            while(arr.get(x) < arr.get(par)) {
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;
            }
        }

        public int peek() {
            return arr.get(0);
        }

        public void heapify(int i) {
            int left = 2 * i+1;
            int right = 2*i+2;
            int minIdx = i;

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)) minIdx = left;
            if(right < arr.size() && arr.get(minIdx) > arr.get(right)) minIdx = right;

            if(minIdx != i) {
                //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public int remove() {
            int data = arr.get(0);
            
            int temp = arr.get(0); //swap
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            arr.remove(arr.size()-1); //remove

            heapify(0);
            return data;
        }

        public boolean isEmpty() {
             return arr.size() == 0;   
        }
    }
    public static void main(String[] args) {
        Heap pq = new Heap();
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(5);

        while(!pq.isEmpty()) { //heap sort - O(n logn)
            System.out.println(pq.peek());
            
            pq.remove();
        }
    }
}