package DSA.Practice;

import java.util.ArrayList;

public class Prac13 {
    public static void main(String[] args) {
        // permutation("", "shiva");
        System.out.println(permutationsList("", "shiva"));
    }
    private static void permutation(String p, String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            permutation(first + ch + second, up.substring(1));
        }
    }
    static ArrayList<String> permutationsList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        // local to this call
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutationsList(f + ch + s, up.substring(1)));
        }
        return ans;
    }
}
