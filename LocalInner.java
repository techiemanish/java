//Local Inner Class

public class LocalInner{
    private int x = 5;
    void display(){
        class local{
            int x = 10;
            public void msg(){
                System.out.println("Local class method is executed. The Value of x: " + x);
            }
        }
        local loc = new local();
        loc.msg();
    }
    
    public static void main(String args []){
        LocalInner obj = new LocalInner();
        obj.display();
    }
}
