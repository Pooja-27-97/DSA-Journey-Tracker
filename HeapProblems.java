import java.util.*;
public class HeapProblems {
    static class Point implements Comparable<Point>{
        int x, y, distSq, idx;

        public Point(int x, int y, int distSq, int idx) {
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.idx = idx;
        }

        @Override
        public int compareTo(Point p2) {
            return this.distSq - p2.distSq;
        }
    }

    static class Row implements Comparable<Row> {
        int soliders, idx;

        public Row(int soldier, int idx) {
            this.soliders = soldier;
            this.idx = idx;
        }

        @Override
        public int compareTo(Row r2) {
            if(this.soliders == r2.soliders) {
                return this.idx - r2.idx;
            } else {
                return this.soliders - r2.soliders;
            }
        }
    }

    static class Pair implements Comparable<Pair> {
        int val, idx;

        public Pair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair p2) {
            return p2.val - this.val;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int res[] = new int[arr.length-k+1]; //n-k+1

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(int i=0; i < k; i++) {
            pq.add(new Pair(arr[i], i));
        }

        res[0] = pq.peek().val;
        for(int i=k; i <arr.length; i++) {
            while(pq.size() > 0 && pq.peek().idx <= (i-k)) {
                pq.remove();
            }
            pq.add(new Pair(arr[i], i));
            res[i-k+1] = pq.peek().val;
        }

        for(int i=0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();


        // int army[][] = {
        //     {1, 0, 0, 0},
        //     {1, 1, 1, 1},
        //     {1, 0, 0, 0},
        //     {1, 0, 0, 0}
        // };
        // int k = 2;
        // PriorityQueue<Row> pq = new PriorityQueue<>();

        // for(int i=0; i < army.length; i++) {
        //     int count = 0;
        //     for(int j=0; j < army.length; j++) {
        //         count += army[i][j] == 1 ? 1 : 0;
        //     }
        //     pq.add(new Row(count, i));
        // }

        // for(int i=0; i <k; i++) {
        //     System.out.println("R" + pq.remove().idx);
        // }

        // int ropes[] = {2, 3, 3, 4, 6};
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // for(int i=0; i < ropes.length; i++) {
        //     pq.add(ropes[i]);
        // }
        // int cost = 0;
        // while(pq.size() > 1) {
        //     int min = pq.remove();
        //     int min2 = pq.remove();
        //     cost += min + min2;
        //     pq.add(min+min2);
        // }
        // System.out.println(cost);


        // int pts[][] = {{3, 3}, {5, -1}, {-2, 4}};
        // int k = 2;

        // PriorityQueue<Point> pq = new PriorityQueue<>();
        // for(int i=0; i < pts.length; i++) {
        //     int distSq = pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1];
        //     pq.add(new Point(pts[i][0], pts[i][1], distSq, i));
        // }

        // //nearest k
        // for(int i=0; i < k; i++) {
        //     System.out.println("C" + pq.remove().idx);
        // }
    }
}
