public class Recursion {
    public static void printDecreasing(int n) {
        if(n==1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDecreasing(n - 1);
    }

    public static void printIncrease(int n) {
        if(n == 1) {
            System.out.print(n + " ");
            return;
        }
        printIncrease(n-1);
        System.out.print(n + " ");
    }

    public static int factorial(int n) {
        if(n == 0) return 1;
        return n * factorial(n-1);
    }

    public static int sum(int n) {
        if(n == 0) return 0;
        return n + sum(n-1);
    }

    public static int fibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int fib = fibonacci(n-1) + fibonacci(n-2);
        return fib;
    }

    public static boolean isSorted(int arr[], int i) {
        if(i == arr.length - 1) return true;
        if(arr[i] > arr[i+1]) return false;
        return isSorted(arr, i+1);
    } 

    public static int firstOccurance(int arr[], int key, int i) {
        if(i == arr.length) return -1;
        if(arr[i] == key) return i;

        return firstOccurance(arr, key, i+1);
    }

    public static int lastOccurance(int arr[], int key, int i) {
        if(i == arr.length) return -1;
        int isFound = lastOccurance(arr, key, i+1);
        if(isFound == -1 && arr[i] == key) return i;
        return isFound;
    }

    public static int power(int x, int n) {
        if(n == 0) return 1;
        return x * power(x, n-1);
    }

    public static int optimizedPower(int x, int n) {
        if(n == 0) return 1;
        int halfPower = optimizedPower(x, n/2);
        int halfSq = halfPower * halfPower;
        if(n % 2 != 0) halfSq = n * halfSq;
        return halfSq;
    }
    public static void main(String[] args) {
        // int n = 10;
        // printDecreasing(n);
        // printIncrease(n);

        // System.out.println(factorial(4));
        // System.out.println(sum(6));
        // System.out.println(fibonacci(8));

        // int arr[] = {1, 2, 3, 4, 5};
        // System.out.println(isSorted(arr, 0));

        // int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        // System.out.println(firstOccurance(arr, 5, 0));
        // System.out.println(lastOccurance(arr, 5, 0));

        System.out.println(power(2, 10));
    }
}
