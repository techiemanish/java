public class CallByValue {
    int a = 12;
    
    static int myfunc(int a){
        a += 5;
        return a;
    }
    public static void main(String args[]) {
        System.out.println(myfunc(10));
        CallByValue a1 = new CallByValue();
        System.out.println(a1.a);
        System.out.println(myfunc(a1.a));
        System.out.println(a1.a);
        
    }
}
