public class JavaBasics {
    public static int calculateProduct(int a, int b) {
        int product = a * b;
        return product;
    }

    public static int factorial(int num) {
        int fact = 1;
        for(int i=1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int binomialCoeff(int n , int r) {
        int factN = factorial(n);
        int factR = factorial(r);
        int factNR = factorial(n-r);
        int result = factN / (factR * factNR);
        return result;
    }

    public static int sum(int a, int b) {
        return a+b;
    }

    public static float sum(float a, float b) {
        return a+b;
    }

    // public static int sum(int a, int b, int c) {
    //     return a+b+c;
    // }
    
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int r = sc.nextInt();
        // System.out.println("Factorial: " + factorial(n));
        // System.out.println("Binomial Coefficient: " + binomialCoeff(n, r));
        System.out.println(sum(10, 50));
        System.out.println(sum(10.24f, 20.97f));
    }
}