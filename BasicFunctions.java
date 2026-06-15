public class BasicFunctions {
    public static int printAvg(int a, int b, int c) {
        return (a+b+c)/3;
    }

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printEven(int n) {
        for(int i =0; i <= n ; i++) {
            if(isEven(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void isPalindrome(int num) {
        int n = num;
        int pal = 0;
        while(num > 0) {
            int lastDigit = num % 10;
            pal = (pal * 10) + lastDigit;
            num /= 10;
        }
        if(n == pal) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static int digitSum(int num) {
        int sum = 0;
        while(num > 0) {
            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        // System.out.println("Average: " + printAvg(10, 2, 50));
        // printEven(50);
        // isPalindrome(1258798521);
        System.out.println("Sum of digits: " + digitSum(9874589));
    }
}