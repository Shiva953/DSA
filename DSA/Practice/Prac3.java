package DSA.Practice;

public class Prac3 {
    public static void main(String[] args) {
        int n = 2783050;
        System.out.println(reverse(n));
        reverse2(n);
        System.out.println(s);
    }
    private static int reverse(int n){
        if(n==0){
            return 0;
        }
        // int x = Integer.toString(n).length();
        return (n%10)* (int)Math.pow(10, (int)(Math.log10(n))) + reverse(n/10);
    }
    static int s = 0; //accessible by other methods;
    private static void reverse2(int n){
        if(n==0){
            return;
        }
        s = s*10 + n%10;
        reverse2(n/10);
    }
}
