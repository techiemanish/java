import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      int arr[] = {12, 2, 1, 35, 34, 1};
      System.out.println(Arrays.toString(arr));

      int max = Integer.MIN_VALUE;
      int max2 = Integer.MIN_VALUE;
      for(int i = 0; i < arr.length; i++){
          if(arr[i] > max){
              //max2 = max; //12,35
              max = arr[i];
          }
          else{//2,1,34
             if(arr[i] > max2){
                max2 =  arr[i];
             }
              
          }
      }
      System.out.println(max2);
      
    }
}
