package DSA.src.neutron.shiva;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(fibo(9));
        int[] arr = {-7,6,23,210,1004};
        System.out.println(search(arr, 210, 0, arr.length-1));
    }

    static int fibo(int n) {
        // base condition
        if (n < 2) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (target < arr[m]) {
            return search(arr, target, s, m - 1);
        }
        return search(arr, target, m + 1, e);
    }
}
