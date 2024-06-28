//Binary Search using recursion
public class MyClass {
    static int binarySearch(int arr[],int left, int right, int val){
        if(left<=right){
            int mid = (left + right)/2;
            if(arr[mid] == val){
                return mid;
            }else if(val < arr[mid]){
                return binarySearch(arr,left,mid-1, val);
            }else if(val > arr[mid]){
                return binarySearch(arr,mid+1,right, val);
            }
        }
        return -1;
    }
    public static void main(String args[]) {
      int arr []= {1,3,5,7,9,11,15,17};
      int index = binarySearch(arr, 0, arr.length-1, 15);
      System.out.println("Binary Search index is " + index);
    }
}

//Binary Search without recursion
public class MyClass {
    static int binarySearch(int arr[],int val){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = (left + right)/2;
            if(arr[mid] == val){
                return mid;
            }else if(val < arr[mid]){
                right = mid-1;
            }else if(val > arr[mid]){
                left = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
      int arr []= {1,3,5,7,9,11,15,17};
      int index = binarySearch(arr, 9);
      System.out.println("Binary Search index is " + index);
    }
}
