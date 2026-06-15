public class Patterns {
    public static void hallowRectangle(int row, int col) {
        for(int i = 1; i <= row; i++) {
            for(int j=1; j <= col; j++) {
                if(i==1||i==row||j==1||j==col) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void invRotatedHalfPy(int row) {
        for(int i=1; i <= row; i++) {
            for(int j = row-1; j >= i; j--) { //space
                System.out.print("  ");
            }
            for(int j=1; j <= i; j++) { //stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void invHalfPy(int row) {
        for(int i=1; i <= row; i++) {
            for(int j=1; j <= (row-i+1); j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void FloydsTriangle(int row) {
        int count = 1;
        for(int i=1; i <= row; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public static void zeroOneTriangle(int row) {
        for(int i=1; i <= row; i++) {
            for(int j =1; j <= i; j++) {
                if((i+j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    public static void Butterfly(int row) {
        for(int i=1; i <= row; i++) {
            for(int j =1; j <= i; j++) {
                System.out.print("* ");
            }
            for(int j = 1; j <= (row-i)*2; j++) {
                System.out.print("  ");
            }
            for(int j =1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=row-1; i >= 1; i--) {
            for(int j =1; j <= i; j++) {
                System.out.print("* ");
            }
            for(int j = 1; j <= (row-i)*2; j++) {
                System.out.print("  ");
            }
            for(int j =1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void solidRhombus(int row) {
        for(int i=1; i <= row; i++) {
            for(int j =1; j <= (row-i); j++) {
                System.out.print("  ");
            }
            for(int j = 1; j <= row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hallowRhombus(int row) {
        for(int i=1; i <= row; i++) {
            for(int j =1; j <= (row-i); j++) {
                System.out.print("  ");
            }
            for(int j = 1; j <= row; j++) {
                if(i==1||i==row||j==1||j==row) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void Diamond(int row) {
        for(int i=1; i <= row; i++) {
            for(int j =1; j <= (row-i); j++) {
                System.out.print("  ");
            }
            for(int j =1; j <= i; j++) {
                System.out.print("* ");
            }
            for(int j =2; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=row; i >= 1; i--) {
            for(int j =1; j <= (row-i); j++) {
                System.out.print("  ");
            }
            for(int j =1; j <= i; j++) {
                System.out.print("* ");
            }
            for(int j =2; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void numberPyramid(int row) {
        for(int i=1; i <= row; i++) {
            for(int j=1; j <= (row-i); j++) {
                System.out.print("   ");
            }
            for(int j=1; j <= i; j++) {
                System.out.print(i+ "       ");
            }
            System.out.println();
        }
    }

    public static void Palindrome(int row) {
        for(int i=1; i <= row; i++) {
            for(int j=1; j <= (row-i); j++) {
                System.out.print("  ");
            }
            for(int j =i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for(int j=2; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // hallowRectangle(4, 5);
        // invRotatedHalfPy(4);
        // invHalfPy(5);
        // FloydsTriangle(5);
        // zeroOneTriangle(5);
        // Butterfly(4);
        // solidRhombus(5);
        // hallowRhombus(5);
        // Diamond(4);
        // numberPyramid(5);
        // Palindrome(5);
    }
}