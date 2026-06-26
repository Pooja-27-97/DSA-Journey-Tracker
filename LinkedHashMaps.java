import java.util.*;
public class LinkedHashMaps {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("Naruto", 5);
        lhm.put("JJK", 2);
        lhm.put("AOT", 4);
        lhm.put("Spy*Family", 5);
        lhm.put("One Piece", 3); 
        System.out.println(lhm);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Naruto", 5);
        hm.put("JJK", 2);
        hm.put("AOT", 4);
        hm.put("Spy*Family", 5);
        hm.put("One Piece", 3); 
        System.out.println(hm);

        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("Naruto", 5);
        tm.put("JJK", 2);
        tm.put("AOT", 4);
        tm.put("Spy*Family", 5);
        tm.put("One Piece", 3); 
        System.out.println(tm);
    }
}
