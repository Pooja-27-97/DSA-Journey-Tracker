import java.util.*;
public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert
        hm.put("Naruto", 5);
        hm.put("JJK", 5);
        hm.put("AOT", 4);
        System.out.println(hm);

        // //size
        // System.out.println(hm.size());

        // //is empty
        // hm.clear();
        // System.out.println(hm.isEmpty());

        // //Get
        // System.out.println(hm.get("Demon Slayer"));

        // //Contains key - O(n)
        // System.out.println(hm.containsKey("Naruto"));

        // //Remove
        // System.out.println(hm.remove("AOT"));
        // System.out.println(hm);
    }
}