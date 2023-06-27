//https://leetcode.com/problems/peak-index-in-a-mountain-array/

package DSA.Practice;

public class Leet3 {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start<end){
            int mid  = start + (end-start)/2 ;
            if(arr[mid]>arr[mid+1]){
                // this might itself be the possible ans, therefore end != mid - 1
                end = mid;
            }
            else if(arr[mid]<arr[mid+1]){
                start = mid + 1;
            }
        }
        //at the end, the start and end element both become same and point to the same(maximum element)
        return end;
    }
}
