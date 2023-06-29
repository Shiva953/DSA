package DSA.Practice;

public class Leet4 {
    public static void main(String[] args) {
        
    }
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        if(end==1){
            if(target==nums[0]){
                return 0;
            }
            else if(target==nums[1]){
                return 1;
            }
            else{
                return -1;
            }
        }
        //finding pivot
        while(start<end){
            int mid = start + (end-start)/2; 
            if(nums[mid]>nums[mid+1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        if(nums.length>=2 && nums[0]>nums[1]){
            end = 0;
        }
        int x = binSearch(nums,target,0,end+1);
        int y = binSearch(nums,target,end+1,nums.length-1);
        if(x!=-1){
            return x;
        }
        else if(y!=-1){
            return y;
        }
        else{
            return -1;
        }
    }

    private static int binSearch(int[] arr, int target, int start, int end){
        if(arr.length==2){
            if(target==arr[0]){
                return 0;
            }
            else if(target==arr[1]){
                return 1;
            }
            else{
                return -1;
            }
        }
        while(start<=end){
            int mid  = start + (end-start)/2 ;
            if(target > arr[mid]){
                start = mid + 1;
                
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
