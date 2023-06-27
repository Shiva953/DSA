// maximum-count-of-positive-integer-and-negative-integer
// https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/
package DSA.Practice;


public class Leet {
    public static void main(String[] args) {
        int[] arr1 = {-2,-1,-1,1,2,3};
        int[] arr2 = {-122,-64,-3,-2,-1,0,1,2,3,4,5,6};
        int[] arr3 = {-5,-4,-2,0,2,3,4,6,60,600,6000,60000};
        System.out.println(maximumCount(arr1));
        System.out.println(maximumCount(arr2));
        System.out.println(maximumCount(arr3));
    }

    private static int maximumCount(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int neg=0,pos=0;
        if(nums[0]==0 && nums[end]==0){
          return 0;
        }
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]>0){
                pos += (end - mid + 1);
                end = mid - 1;
            }
            else if(nums[mid]<0){
                neg += (mid - start + 1);
                start = mid + 1;
            }
            else{
                pos += (end - mid);
                neg += (mid - start);
                if(nums[mid]==nums[mid-1]){
                    return (pos > neg) ? (pos) : (neg-1);
                }
                else if(nums[mid]==nums[mid+1]){
                    return (pos > neg) ? (pos-1) : (neg);
                }
                else{
                return (pos > neg) ? (pos) : (neg);
                }
            }
        }
        int max = Math.max(pos,neg);
        return max;
    }
}
