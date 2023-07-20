package DSA.Practice;

import java.util.ArrayList;

public class Prac7 {
    public static void main(String[] args) {
        int[] arr = {23,-1,13,900,338,900,3412,1218,2530,3412,3412};
        int target = 3412;
        ArrayList<Integer> req_list = new ArrayList<>();
        System.out.println(search(arr, target, 0, req_list));
    }

    private static ArrayList<Integer> search(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return search(arr, target, index+1, list);
    }

    private static ArrayList<Integer> search2(int[] arr, int target, int index){
        ArrayList<Integer> l = new ArrayList<>();
        if(index==arr.length){
            return l;
        }
        if(arr[index] == target){
            l.add(index);
        }

        //main part
        ArrayList<Integer> ansFromBelowCalls = search2(arr, target, index+1);
        l.addAll(ansFromBelowCalls);
        return l;
    }
}
