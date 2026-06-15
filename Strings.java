public class Strings {
    public static void printLetters(String str) {
        for(int i=0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static boolean isPalindrome(String str) {
        for(int i=0; i < str.length()/2; i++) {
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-i-1)) return false;
        }
        return true;
    }

    public static void checkPalindrome(String str) {
        if(isPalindrome(str)) System.out.println("Palindrome");
        else System.out.println("Not palindrome");
    }

    public static float findShortestPath(String path) {
        int x=0, y=0;

        for(int i=0; i < path.length(); i++) {
            char dir = path.charAt(i);
            //north
            if(dir == 'N') y++;
            else if (dir == 'S') y--;
            else if (dir == 'W') x--;
            else x++;
        }
        float shortPath = (float)Math.sqrt((x*x) + (y*y));
        return shortPath;
    }

    public static String subString(String str, int si, int ei) {
        String sub = "";
        for(int i=si; i < ei; i++) {
            sub += str.charAt(i);
        }
        return sub;
    }

    public static String largestString(String fruits[]) {
        String largest = fruits[0];
        for(int i=1; i < fruits.length; i++) {
            if(largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        return largest;
    }

    public static String stringToUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i < str.length(); i++) {
            if(str.charAt(i) ==  ' ' && i < str.charAt(i)-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String compress(String str) {
        String newStr = "";

        for(int i=0; i < str.length(); i++) {
            Integer count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count > 1) newStr += count.toString();
        }
        return newStr;
    }

    public static void main(String[] args) {
        // String str = "Hello World";
        // printLetters(str);
        // checkPalindrome(str);

        // String path = "WNEENESENN";
        // System.out.println(findShortestPath(path));

        // System.out.println("hello".equals("hello"));

        // System.out.println(subString("hello", 0, 4));
        // System.out.println("dreams".substring(3, 6));

        // System.out.println("hello".compareTo("heLlo"));
        // System.out.println("dream".compareToIgnoreCase("dreAM"));

        // String fruits[] = {"apple", "kiwi", "pineapple", "banana"};
        // System.out.println(largestString(fruits));

        // String str = "dreams are powerful";
        // System.out.println(stringToUpperCase(str));

        String str = "aaabbbsssytmmmmpppjjjjj";
        System.out.println(compress(str));
    }
}
