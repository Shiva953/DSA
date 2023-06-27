//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

package DSA.Practice;

public class Leet2 {
    public static void main(String[] args) {
        
    }

    static int[] searchRange(int[] nums, int target){
        int arr[] = {-1,-1};
        int findex = search(nums, target, true);
        int lindex = search(nums, target, false);
        arr[0] = findex;
        arr[1] = lindex;
        return arr;
    }

    public static int search(int[] nums, int target, boolean findStartIndex) {
        int start = 0;
        int end = nums.length - 1;
        int ans=-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target > nums[mid]){
                start = mid + 1;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else{
                ans = mid;
                if(findStartIndex == true){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            }
            return ans;
        }
    }
