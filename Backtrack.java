public class Backtrack {
    public static void changeArray(int arr[], int i, int val) {
        //base
        if(i == arr.length) {
            printArray(arr);
            return;
        }
        //recursion
        arr[i] = val;
        changeArray(arr, i+1, val+1);
        arr[i] = arr[i] - 2;
    }

    public static void printArray(int arr[]) {
        for(int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void findSubset(String str, String ans, int i) {
        //base 
        if(i == str.length()) {
            if(ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        //recursion
        findSubset(str, ans + str.charAt(i), i+1); //yes
        findSubset(str, ans, i+1); //no
    }

    public static void permutation(String str, String ans) {
        //base
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            permutation(newStr, ans+curr);
        }
    }
    public static void main(String args[]) {
        // int arr[] = new int[5];
        // changeArray(arr, 0, 1);
        // printArray(arr);

        String str = "abc";
        // findSubset(str, "", 0);
        permutation(str, "");
    }
}