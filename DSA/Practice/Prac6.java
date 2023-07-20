package DSA.Practice;

import java.util.ArrayList;

public class Prac6 {
    public static void main(String[] args) {
        int[] arr = {-31,32,3,19};
        int target = 19;
        boolean found = linSearch(arr, target, 0);
        linSearchMultiOccurenceIndex(arr, target, 0);
        System.out.println(list);
        if(found){
            System.out.println(linSearchIndex(arr, target, 0));
        }
        else{
            System.out.println("Not found.");
        }

    }

    private static boolean linSearch(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return linSearch(arr, target, index + 1) || arr[index]==target;
    }

    private static int linSearchIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return linSearchIndex(arr, target, index + 1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void linSearchMultiOccurenceIndex(int[] arr, int target, int index){
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(arr[index]);
        }
        linSearchIndex(arr, target, index + 1);
    }
}
