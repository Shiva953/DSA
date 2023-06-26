package neutron.shiva;


public class BinSearch {
    public static void main(String[] args) {
        int[] arrr = {3,56,84,222,244,700,900,8987}; //already strictly increasing array
        int[] ar = {52335,1323,934,700,324,200,1};
        int target = 700;
        int ans = binsearch(arrr,target);
        int ans2 = orderAgnosticBinarySearch(ar, target);
        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(orderAgnosticBinarySearch(arrr, target));
    }

    static private int binsearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            //mid = (start+end)/2; //might be possible that (start+end) exceeds the range of int
            int mid  = start + (end-start)/2 ;
            if(target > arr[mid]){
                start = mid + 1;
                
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{ //this condition SHOULD hit for a value to return[if target exists in arr]
                return mid;
            }
        }
        return -1; //only executed with nothing returned from the while loop
    }

    //order-agnostic binary search
    static private int orderAgnosticBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAscending = arr[start]<arr[end];

         while(start<=end){
            //mid = (start+end)/2; //might be possible that (start+end) exceeds the range of int
            int mid  = start + (end-start)/2 ;

            if(arr[mid]==target){
                return mid;
            }

            if(isAscending){
                if(target > arr[mid]){
                    start = mid + 1;
                    
                }
                else if(target < arr[mid]){
                    end = mid - 1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid - 1;
                    
                }
                else if(target < arr[mid]){
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    
}
