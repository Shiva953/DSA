//https://leetcode.com/problems/sorting-the-sentence/

package DSA.Practice;

public class Leet8 {
    public static void main(String[] args) {
        System.out.println(sortSentence("is2 ok5 sentence4 This1 a3"));
    }
    static String sortSentence(String s) {
        String[] str = s.split(" ");                // Since the String contains only whitespaces, it's safe to split the String at them
        String[] bucket = new String[str.length];      // This String array will hold the rearranged words
        StringBuilder sb = new StringBuilder();     // Instead of using '+' operator to concat repeatedly, I have created a StringBuilder object which is more efficient
        int i = 0;                          
        for (String elem : str) {
            i = (int) (elem.charAt(elem.length() - 1) - '0');  // This  will extract the digit pbucketent at the end of each String and store it in i (i = index of the word in bucket[])
            bucket[i - 1] = elem.substring(0, elem.length() - 1); // This gives the substring of each String except for the digit in the end and stobucket the word at an appropriate index (i - 1) in bucket[]
        }
        //append the words from bucket[] to StringBuilder object to form a sentence
        for (i = 0; i < bucket.length - 1; i++)
            sb.append(bucket[i]).append(" ");
        sb.append(bucket[i]);
        return sb.toString();
    }
}
