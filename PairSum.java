import java.util.*;
public class PairSum {
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        for(int i=0; i < list.size(); i++) {
            for(int j= i+1; j < list.size(); j++) {
                if(list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }
    //2 pointer approach
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;

        while(lp != rp) {
            if(list.get(lp) + list.get(rp) == target) return true;
            if(list.get(lp) + list.get(rp) < target) lp++;
            else rp--;
        }
        return false;
    } 

    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int bp = -1; //pivot point
        int n = list.size();
        for(int i=0; i < list.size(); i++) {
            if(list.get(i) > list.get(i+1)) {
                bp = i;
                break;
            }
        }

        int lp = bp+1;
        int rp = bp;

        while(lp != rp) {
            if(list.get(lp) + list.get(rp) == target) return true;
            if(list.get(lp) + list.get(rp) < target) lp = (lp+1) % n;
            else rp = (n+rp-1) % n;
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // list.add(6);
        // int target = 5;

        // System.out.println(pairSum1(list, target));
        // System.out.println(pairSum(list, target));

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(pairSum2(list, target));
    }
}
