public class BitManipulation {
    public static void checkOddEven(int bit) {
        if((bit & 1) != 0) System.out.println("Odd");
        else System.out.println("Even");
    }

    public static int getIthBit(int bit, int i) {
        int bitMask = 1 << i;
        if((bit & bitMask) == 0) return 0;
        else return 1;
    }

    public static int setIthBit(int bit, int i) {
        int bitmask = 1<<i;
        return (bit | bitmask);
    }

    public static int clearIthBit(int bit, int i) {
        int bitmask = ~(1<<i);
        return (bit & bitmask);
    }

    public static int updateIthBit(int bit,int i, int newBit) {
        // if(newBit == 0) return clearIthBit(bit, i);
        // else return setIthBit(bit, i);

        //or
        bit = clearIthBit(bit, i);
        int bitMask = newBit << i;
        return (bit | bitMask);
    }

    public static int clearIBits(int n, int i) {
        int bitMask = (~0)<<i;
        return (n & bitMask);
    }

    public static int clearRangeBits(int n, int i, int j) {
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitMask = a|b;
        return (n & bitMask);
    }

    public static boolean isPowerOfTwo(int n) {
        return (n & (n-1)) == 0;
    }

    public static int countSetBits(int n) {
        int count = 0;
        while(n > 0) {
            if((n & 1) != 0) count++;
            n = n >> 1;
        }
        return count;
    }

    public static int fastExpo(int a, int n) {
        int ans = 1;

        while(n > 0) {
            if((n & 1) != 0) ans = ans*a;
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        // checkOddEven(10);
        // System.out.println(getIthBit(8, 3));
        // System.out.println(setIthBit(9, 2));
        // System.out.println(clearIthBit(9, 3));
        // System.out.println(updateIthBit(10, 2, 1));
        // System.out.println(clearIBits(15, 2));
        // System.out.println(clearRangeBits(10, 2, 7));
        // System.out.println(isPowerOfTwo(4));
        // System.out.println(countSetBits(15));
        System.out.println(fastExpo(3, 5));
    }
}
