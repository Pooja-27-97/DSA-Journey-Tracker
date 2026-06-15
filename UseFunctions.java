public class UseFunctions {
    public static boolean isPrime(int num) {
        if(num == 2) {
            return true;
        }
        for(int i=2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeRange(int n) {
        for(int i=2; i <= n ; i++) {
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void binaryToDecimal(int num) {
        int n = num;
        int pow = 0;
        int dec = 0;

        while(num > 0) {
            int lastDigit = num % 10;
            dec = dec + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            num = num / 10;
        }
        System.out.println("Decimal of " + n + ": " + dec);
    }

    public static void decimalToBinary(int num) {
        int n = num;
        int pow = 0;
        int bin = 0;

        while(num > 0) {
            int rem = num % 2;
            bin = bin + (rem * (int)Math.pow(10, pow));
            pow++;
            num /= 2;
        }
       System.out.println("Binary of " + n + ": " + bin);
    }
    public static void main(String[] args) {
        decimalToBinary(5);
        binaryToDecimal(101);
    }
}