public class DivideConquer {
    public static void mergeSort(int arr[], int si, int ei) {
        if(si >= ei) return;

        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid); //left
        mergeSort(arr, mid+1, ei); //right
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei-si+1];
        int i = si; //iterate for left
        int j = mid+1; //iterate for right
        int k = 0; //iterate temp arr

        while(i <= mid && j <= ei) {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //left
        while(i <= mid) {
            temp[k++]= arr[i++];
        }

        //right
        while(j <= ei) {
            temp[k++] = arr[j++];
        }

        //copy temp -> original
        for(k=0, i=si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
    public static void printArray(int arr[]) {
        for(int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {
        if(si >= ei) return;
        int pidx = partition(arr, si, ei); //return pivot elt position
        quickSort(arr, si, pidx-1); //left
        quickSort(arr, pidx+1, ei); //right
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si-1; //make place for smaller elts than pivot
        for(int j=si; j <ei; j++) {
            if(arr[j] <= pivot) {
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static int search(int arr[], int tar, int si, int ei) {
        if(si > ei) return -1;
        int mid = si + (ei - si)/2;
        if(arr[mid] == tar) return mid;

        //mid on L1
        if(arr[si] <= arr[mid]) {
            if(arr[si] <= tar && tar <= arr[mid]) {
                //left
                return search(arr, tar, si, mid-1);
            } else {
                //right
                return search(arr, tar, mid+1, ei);
            }
        }

        //mid on L2
        else {
            if(arr[mid] <= tar && tar <= arr[ei]) {
                //right
                return search(arr, tar, mid+1, ei);
            } else {
                //left
                return search(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        // int arr[] = {6, 3, 9, 5, 2, 4, 8};
        // // mergeSort(arr, 0, arr.length-1);
        // quickSort(arr, 0, arr.length-1);
        // printArray(arr);

        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 6;
        int tarIdx = search(arr, target, 0, arr.length-1);
        System.out.println(tarIdx);
    }
}
