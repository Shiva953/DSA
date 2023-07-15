package DSA.Practice;

public class Prac2 {
    public static void main(String[] args) {
        System.out.println(sm(823));
    }
    private static int sm(int n){
        if(n==0){
            return 0;
        }
        return n%10 + sm(n/10);
    }
}
