package DSA.src.neutron.shiva;
//Maze Problem[Reaching top left to bottom right in a maze board, only going Right(R) or Down(D)]
public class Maze {
    //counting no of possible ways (RRDD,RDRD,etc.)
    static int count(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
        int left = count(r-1,c); //going down 
        int right = count(r, c-1); //going right
        return left+right;
    }
    static int paths(int r, int c, String p){
        if(r==1 || c==1){
            return 1;
        }
        int left = paths(r-1,c); //going down 
        int right = paths(r, c-1); //going right
        return left+right;
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
}
