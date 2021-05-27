public class Min_Finder {
    public static void main(String args[]) {
      int min = Integer.MAX_VALUE;
      int arr [] = {2,3,4,4,5,1};
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
      System.out.println(min);
    }
}