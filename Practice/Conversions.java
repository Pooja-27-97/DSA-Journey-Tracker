public class Conversions {
    public static int binaryToDecimal(int binary) {
        double decimal = 0;
        int pow = 0;

        while(binary > 0) {
            int lastDigit = binary % 10;
            decimal = decimal + lastDigit * Math.pow(2, pow);
            pow++;
            binary /= 10;
        }
        return (int)decimal;
    }

    public static int decimalToBinary(int decimal) {
        int pow = 0;
        double binary = 0;

        while(decimal > 0) {
            int rem = decimal % 2;
            binary = binary + rem * Math.pow(10, pow);
            pow++;
            decimal /= 2;
        }
        return (int)binary;
    }
    public static void main(String[] args) {
        // int binary = 1101;
        // System.out.println("Binary " + binary + " to decimal -> " + binaryToDecimal(binary));

        // int decimal = 4;
        // System.out.println("Decimal " + decimal + " to binary -> " + decimalToBinary(decimal));
    }
}
