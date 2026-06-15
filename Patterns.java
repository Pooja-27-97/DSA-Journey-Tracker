public class Patterns {
    public static void hallowRect(int row, int col) {
        for(int i=1; i <= row; i++) {
            for(int j=1; j <= col; j++) {
                if(i == 1||i == row||j == 1||j == col) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void halfPyramid(int row) {
        for(int i=1; i <= row; i++) {
            for(int j=1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void invRotatedPy(int row) {
        for(int i=1; i <= row; i++) {
            for(int j=1; j <= (row-i); j++) {
                System.out.print("  ");
            }
            for(int j=1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void inHalfPyNum(int row) {
        for(int i=row; i >= 1; i--) {
            for(int j=1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void floyd(int row) {
        int num = 1;
        for(int i=1; i <= row; i++) {
            for(int j=1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void zeroOne(int row) {
        for(int i=1; i <= row; i++) {
            for(int j=1; j <= i; j++) {
                if((i+j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int row) {
        for(int i=1; i <= row; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for(int j=1; j <= (row-i)*2; j++) {
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=row; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for(int j=1; j <= (row-i)*2; j++) {
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++) {
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
            for(int j=1; j <= row; j++) {
                if(i == 1||i == row||j==1||j == row) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int row) {
        for(int i=1; i <= row; i++) {
            for(int j =1; j <= (row-i); j++) {
                System.out.print("  ");
            }
            for(int j=1; j <= (i*2-1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=row; i >= 1; i--) {
            for(int j =1; j <= (row-i); j++) {
                System.out.print("  ");
            }
            for(int j=1; j <= (i*2-1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // hallowRect(4, 5);
        // halfPyramid(4);
        // invRotatedPy(4);
        // inHalfPyNum(5);
        // floyd(5);
        // zeroOne(5);
        // butterfly(4);
        // solidRhombus(5);
        diamond(4);
    }
}