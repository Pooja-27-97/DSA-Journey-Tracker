public class Functions {
    public static void printAvg(int a, int b, int c) {
        int avg = (a+b+c)/3;
        System.out.println("Average : " + avg);
    }

    public static boolean isEven(int n) {
        if(n % 2 == 0) return true;
        else return false;
    }

    public static void printEvenNumbers(int start, int end) {
        for(int i=start; i <= end; i++) {
            if(isEven(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static int getReverse(int num) {
        int reverse = 0;

        while(num > 0) {
            int lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num /= 10;
        }
        return reverse;
    }

    public static void palindrome(int num) {
        int reverse = getReverse(num);
        if(num == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Plaindrome");
        }
    }    

    public static int sumOfDigit(int num) {
        int sum = 0;

        while(num > 0) {
            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }
        return sum;
    }

    public static boolean checkPrime(int num) {
        boolean isPrime = true;
        if(num == 2) {
            return true;
        }
        for(int i=2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void isPrime(int num) {
        if(checkPrime(num)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }

    public static void primeRange(int n) {
        for(int i=2; i <= n; i++) {
            if(checkPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static int findFactorial(int num) {
        int fact = 1;
        for(int i=1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void binomialCoeff(int n, int r) {
        int result = (findFactorial(n))/((findFactorial(r)) * (findFactorial(n-r)));
        System.out.println("Binomail Coefficient: " + result);
    }
    public static void main(String[] args) {
        // printAvg(6, 15, 30);
        // printEvenNumbers(20, 40);
        // palindrome(123421);
        // System.out.println("Sum of digits: " + sumOfDigit(98567));
        // isPrime(79);
        // binomialCoeff(4, 2);
        // primeRange(20);
    }
}
