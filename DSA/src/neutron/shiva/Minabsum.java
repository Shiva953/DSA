package neutron.shiva;

public class Minabsum {
    public static void main(String[] args) {
        
    }
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int n = nums1.length,s,min=2147483647,temp;
        for(int i=0;i<n;i++){
            s=0;
            for(int j=0;j<n;j++){
                temp = nums1[j];
                nums1[j] = nums1[i];
                s = absoluteSumDiff(nums1,nums2);
                if(min>s){
                    min = s;
                }
                nums1[j] = temp;
            }
        }
        return min%(((int)Math.pow(10,9)) + 7);
    }
    private int absoluteSumDiff(int[] arr1, int[] arr2){
        int n = arr1.length, s = 0;
        for(int i=0;i<n;i++){
            s += Math.abs(arr1[i]-arr2[i]);
        }
        return s;
    }
}
