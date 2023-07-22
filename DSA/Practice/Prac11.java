package DSA.Practice;

public class Prac11 {
    public static void main(String[] args) {
        System.out.println(removeA("neutronaafda", "", 0));
        System.out.println(removeAsecond("hasti", 0));
        // removeAthird("", "some");
        System.out.println(skipApple("shiva"));
    }

    private static String removeA(String s, String ans,int index){
        if(index == s.length()){
            return ans;
        }
        if(s.charAt(index) != 'a'){
            ans += s.charAt(index);
        }
        return removeA(s, ans, index+1);
    }
    private static String removeAsecond(String s, int index){
        String ans = "";
        if(index == s.length()){
            return ans;
        }
        if(s.charAt(index) != 'a'){
            ans += s.charAt(index);
        }
        String ansfromBelowCalls = removeAsecond(s, index+1);
        ans += ansfromBelowCalls;
        return ans;
    }

    static void removeAthird(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if (ch == 'a') {
            removeAthird(p, up.substring(1));
        } else {
            removeAthird(p + ch, up.substring(1));
        }
    }
    private static String skipApple(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("apple")){
            return skipApple(s.substring(5));
        }
        else{
            return s.charAt(0) + skipApple(s.substring(1));
        }
    }
}
