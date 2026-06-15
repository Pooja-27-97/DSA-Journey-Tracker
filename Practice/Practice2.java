public class Practice2 {
    public static void invertedUpperTriangle(int row) {
        for(int i=1; i <= row; i++) {
            for(int j=1; j <= row; j++) {
                if((i+j) <= row+1) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void invertedLowerTriangle(int row) {
        for(int i=1; i <= row; i++) {
            // int count = 1;
            for(int j=1; j <= row; j++) {
                if((i+j) >= row+1) {
                    // System.out.print(count + " ");
                    // count++;
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void lowerTriangle(int row) {
        for(int i=1; i <= row; i++) {
            for(int j=1; j <= row; j++) {
                if((i-j) >= 0) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void upperTriangle(int row) {
        for(int i=1; i <= row; i++) {
            for(int j=1; j <= row; j++) {
                if((i-j) <= 0) {
                    System.out.print( j + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        // invertedUpperTriangle(5);
        // invertedLowerTriangle(5);
        // lowerTriangle(5);
        // upperTriangle(5);
    }
}
