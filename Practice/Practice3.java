public class Practice3 {
    public static boolean countValues(int arr[]) {
        for(int i=0; i < arr.length; i++) {
            for(int j=i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    return true; 
                }
            }
        }
        return false; 
    }

    public int search(int[] nums, int target) { 
        //min will have index of minimum element of nums 
        int min = minSearch(nums); 
        //find in sorted left 
        if(nums[min] <= target && target <= nums[nums.length-1]){ //find in sorted right 
            return search(nums,min,nums.length-1,target); 
        } else{ 
            return search(nums,0,min,target); 
        } 
    } 

    //binary search to find target in left to right boundary 
    public int search(int[] nums,int left,int right,int target){ 
        int l = left; 
        int r = right; 
        // System.out.println(left+" "+right); 
        while(l <= r){ 
            int mid = l + (r - l)/2; 
            if(nums[mid] == target){ 
                return mid; 
            } else if(nums[mid] > target){ 
                r = mid-1; 
            } else{ 
                l = mid+1; 
            } 
        } 
        return -1; 
    } 

    //smallest element index 
    public int minSearch(int[] nums){ 
        int left = 0; 
        int right = nums.length-1; 
        while(left < right){ 
            int mid = left + (right - left)/2; 
            if(mid > 0 && nums[mid-1] > nums[mid]){ 
                return mid; 
            } else if(nums[left] <= nums[mid] && nums[mid] > nums[right]){ 
                left = mid+1; 
            } else{ 
                right = mid-1; 
            } 
        } 
        return left; 
    } 
    public static void main(String[] args) {
        int arr[] = {1, 8, 9, 6, 2};
        // System.out.println(countValues(arr));
        // System.out.println(search(arr, 2));
    }
}
