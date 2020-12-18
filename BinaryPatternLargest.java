import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BinaryPatternLargest {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String str = Integer.toBinaryString(n);
        System.out.println(str);
        char arr [] = str.toCharArray();
        int count = 0;
        ArrayList<Integer> result = new ArrayList<Integer>();
    
       for(int i=0 ; i<arr.length;i++){
            if(arr[i]=='1'){
                count++;
            }
            else if(arr[i]=='0'){
                        result.add(count);
                        count=0;
                }
        }
        int temp = 0;
        for(int j= 0; j<result.size(); j++){
            
            if(result.get(j)>temp){
                temp= result.get(j);
            }
        }
         System.out.println(temp);
    }
       

       
    }

