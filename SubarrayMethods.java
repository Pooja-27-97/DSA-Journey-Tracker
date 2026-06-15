public class SubarrayMethods {
    public static void subArray(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            int start = i;
            for (int j = i; j < marks.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(marks[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void printSubArraySum(int marks[]) {
        int curr = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < marks.length; i++) {
            int start = i;
            for (int j = i; j < marks.length; j++) {
                int end = j;
                curr = 0;
                for (int k = start; k <= end; k++) {
                    curr += marks[k];
                }
                // System.out.println(curr);
                if (max < curr) {
                    max = curr;
                }
            }
            System.out.println();
        }
        System.out.println("Max sum: " + max);
    }

    public static void prefixSubArraySum(int marks[]) {
        int curr = 0;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[marks.length];
        prefix[0] = marks[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + marks[i];
        }

        for (int i = 0; i < marks.length; i++) {
            int start = i;
            for (int j = i; j < marks.length; j++) {
                int end = j;
                curr = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (max < curr) {
                    max = curr;
                }
            }
        }
        System.out.println("Max sum: " + max);
    }

    public static void kadanes(int marks[]) {
        int curr = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < marks.length; i++) {
            curr += marks[i];
            if (curr < 0)
                curr = 0;
            max = Math.max(curr, max);
        }
        System.out.println("Max sum of sub array: " + max);
    }

    public static void main(String[] args) {
        int nums[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        // subArray(marks);
        // printSubArray(marks);
        // prefixSubArraySum(marks);
        kadanes(nums);
    }
}
