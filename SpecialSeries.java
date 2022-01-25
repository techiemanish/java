//Logic to generate special series of n numbers
//1,2,5,6,9,10,....n

//1,2,3,4,5,6,.....n
//1,3,1,3,1,3,.....n

import java.util.*;
public class MyClass {
    
    static boolean even(int a){
        if(a % 2 == 0){
            return true;
        }
        return false;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        int res = 1;
        System.out.print(res+" ");
        
        for(int i = 1; i <= a; i++){
            if(!even(i)){
                res += 1;
                System.out.print(res + " ");
            }
            else{
                res += 3;
                System.out.print(res + " ");
            }
        }
    }
}
