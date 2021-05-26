//Static Nested Class
public class StaticNested{
    static int data = 50;
    static class Nested{
        void display(){
            System.out.println("The value of data is: " + data);
        }
        static void static_display(){
            System.out.println("Static method of Nested class is invoked without need to create any object.");
        }
    }
    
    public static void main(String args []){
        StaticNested.Nested obj = new StaticNested.Nested();
        obj.display();
        StaticNested.Nested.static_display();
    }
}
