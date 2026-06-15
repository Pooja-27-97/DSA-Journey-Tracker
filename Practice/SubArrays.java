public class SubArrays {
    public static void subArraySum(int num[]) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i < num.length; i++){
            int start = i;
            for(int j=i; j < num.length; j++) {
                int end = j;
                int sum = 0;
                for(int k = start; k <= end; k++) {
                    System.out.print(num[k] + ",");
                    sum += num[k];
                }
                if(sum > max) max = sum;
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("Max sum : " + max);
    }

    public static void prefixSubArraySum(int arr[]) {
        int max = Integer.MIN_VALUE;
        int curr = 0;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        for(int i=1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0; i < arr.length; i++) {
            int start = i;
            for(int j=i; j < arr.length; j++) {
                int end = j;

                curr = start == 0? prefix[end]: prefix[end] - prefix[start - 1];
                
                if(curr > max) max = curr;
            }
        }
        System.out.println("Max Sum: " + max);
    }
    public static void KadanesAlgm(int marks[]) {
        int curr = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0; i < marks.length; i++) {
            curr += marks[i];
            if(curr < 0) curr = 0;
            if(curr > max) max = curr;
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int marks[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        // subArraySum(marks);
        // prefixSubArraySum(marks);
        // KadanesAlgm(marks);
    }
}
