import java.util.*;
public class ArrayLists {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        // list1.add(1);
        // list1.add(2);
        // list1.add(3);
        // list1.add(4);
        // list1.add(5);

        ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(2);
        // list2.add(4);
        // list2.add(6);
        // list2.add(8);
        // list2.add(10);

        ArrayList<Integer> list3 = new ArrayList<>();
        // list3.add(3);
        // list3.add(6);
        // list3.add(9);
        // list3.add(12);
        // list3.add(15);

        for(int i=1; i <= 5; i++) {
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        for(int i=0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j <currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(mainList);

        // int max = Integer.MIN_VALUE;
        // list.add(7);
        // list.add(18);
        // list.add(9);
        // list.add(10);
        // list.add(1, 3);

        // Collections.sort(list, Collections.reverseOrder());
        // System.out.println(list);
        // int idx1 = 1, idx2 = 3;
        // System.out.println(list);
        // swap(list, idx1, idx2);
        // System.out.println(list);

        // for(int i=0; i < list.size(); i++) {
        //     // if(list.get(i) > max) max = list.get(i);
        //     max = Math.max(list.get(i), max);
        // }
        // System.out.println(max);

        // System.out.println(list);
        // System.out.println(list.size());

        // for(int i=0; i < list.size(); i++) {
        //     System.out.print(list.get(i) + " ");
        // }
        // System.out.println();
        // for(int i=list.size()-1; i >= 0; i--) {
        //     System.out.print(list.get(i) + " ");
        // }

        // System.out.println(list.get(2));

        // list.remove(1);
        // System.out.println(list);

        // list.set(1, 8);
        // System.out.println(list);

        // System.out.println(list.contains(70));
    }
}
