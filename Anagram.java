import java.util.*;

public class Solution {

    static boolean isAnagram(String a, String b) {
        String s1= a.toLowerCase();
        String s2= b.toLowerCase();
        char x[]=s1.toCharArray();
        char y[]=s2.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        String s3=new String(x);
        String s4=new String(y);
        
        System.out.println(s3);
        System.out.println(s4);
        
        if(s3.equalsIgnoreCase(s4)){
            return true;
        }
        else{
            return false;
        }
        
        
        
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
