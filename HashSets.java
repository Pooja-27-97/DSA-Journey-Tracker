import java.util.*;
public class HashSets {
    public static void main(String[] args) {
        HashSet<String> animes = new HashSet<>();
        animes.add("Naruto");
        animes.add("JJK");
        animes.add("Spy*Family");
        animes.add("Demon Slayer");
        animes.add("One Piece");
        System.out.println(animes);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Naruto");
        lhs.add("JJK");
        lhs.add("Spy*Family");
        lhs.add("Demon Slayer");
        lhs.add("One Piece");
        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Naruto");
        ts.add("JJK");
        ts.add("Spy*Family");
        ts.add("Demon Slayer");
        ts.add("One Piece");
        System.out.println(ts);

        // Iterator it = animes.iterator();
        // while(it.hasNext()) {
        //     System.out.println(it.next());
        // }

        // for (String anime : animes) {
        //     System.out.println(anime);
        // }

        // HashSet<Integer> set = new HashSet<>();

        // set.add(1);
        // set.add(2);
        // set.add(4);
        // set.add(2);
        // set.add(1);

        // System.out.println(set);
        // System.out.println(set.contains(4));
        // System.out.println(set.size());
    }
}
