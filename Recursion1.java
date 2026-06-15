public class Recursion1 {
    public static int tilingProblem(int n) {
        if(n ==0 || n == 1) return 1;
        //vertical
        int vertical = tilingProblem(n-1);
        //horizontal
        int horizontal = tilingProblem(n-2);

        int totalWays = vertical + horizontal;
        return totalWays;
    }

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true) removeDuplicates(str, idx+1, newStr, map);
        else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static int friendPairing(int n) {
        if(n == 1 || n == 2) return n;
        int single = friendPairing(n-1);
        int pair = (n-1) * friendPairing(n-2);
        int totalWays = single + pair;
        return totalWays;
    }

    public static void printBinString(int n, int lastPlace,String str) {
        // if(lastPlace == 0) {
        //     printBinString(n-1, 0, str.append("0"));
        //     printBinString(n-1, 1, str.append("1"));
        // } else {
        //     printBinString(n-1, 0, str.append("0"));
        // }

        if(n == 0) {
            System.out.println(str);
            return;
        }
        printBinString(n-1, 0, str + "0");
        if(lastPlace == 0) {
            printBinString(n-1, 1, str + "1");
        }
    }
    public static void main(String[] args) {
        // System.out.println(tilingProblem(3));
        // String str = "appnnacollege";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        // System.out.println(friendPairing(4));
        printBinString(3, 0, "");
    }
}
