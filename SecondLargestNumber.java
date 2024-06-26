import java.util.*;

public class MyClass {
    static int secondLargestNumber(int arr []){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[j]> arr[i]){
                    int temp = arr[j];
                    arr[j]= arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr[1];
    }
    public static void main(String args[]) {
      int arr [] = {2,4,7,1,6,3,8,5,9};
      int res = secondLargestNumber(arr);
      System.out.println("Second largest Number is: " + res);
    }
}
