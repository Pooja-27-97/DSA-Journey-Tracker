public class SearchMethods {
    public static int linearSearch(int arr[], int val) {
        for(int i=0; i < arr.length; i++) {
            if(arr[i] == val) return i;
        }
        return -1;
    }

    public static int printLargest(int arr[]) {
        int max = Integer.MIN_VALUE;

        for(int i=0; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }

    public static int printSmallest(int arr[]) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i < arr.length; i++) {
            if(arr[i] < min) min = arr[i];
        }
        return min;
    }

    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end)/2;
            if(arr[mid] == key) return mid;
            if(arr[mid] < key) start = mid+1;
            else end = mid-1;
        }
        return -1;
    }

    public static void reverseArray(int arr[]) {
        int start = 0;
        int end = arr.length-1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int i=0; i < arr.length; i++) System.out.print(arr[i] + " "); 
    }

    public static void arrayPairs(int arr[]) {
        int pairs = 0;
        for(int i=0; i < arr.length; i++) {
            for(int j= i+1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
                pairs++;
            }
            System.out.println();
        }
        System.out.println("Total number of pairs: " + pairs);
   }
    public static void main(String[] args) {
        // int num[] = {4, 5, 9, 6, 3, 1, 7};
        // arrayPairs(num);

        // int marks[] = {14, 26, 38, 47, 59, 67, 71, 82, 94};
        // int key = 14; // 4
        // System.out.println("Desired key " + key+ " is in index " + binarySearch(marks, key));

        // int num[] = {4, 5, 9, 6, 3, 1, 7};
        // System.out.print("Reversed array: ");
        // reverseArray(num);

        // int num[] = {4, 5, 9, 6, 3, 1, 7};
        // System.out.println("Largest element in an array is " + printLargest(num));
        // System.out.println("Smallest element in an array is " + printSmallest(num));

        // int num[] = {4, 5, 9, 6, 3, 1, 7};
        // int key = 1;
        // System.out.println("Desired key " + key+ " is in index " + linearSearch(num, key));
    }
}