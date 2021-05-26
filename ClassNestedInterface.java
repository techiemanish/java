//Nested Interface in interface
class Showable{
    interface Drawable{
        void display_drawable();
    }
}

public class ClassNestedInterface implements Showable.Drawable{
    public void display_drawable(){
        System.out.println("Hello Nested Interface. Drawable method is displayed.");
    }
    public static void main(String args []){
        Showable.Drawable obj  = new ClassNestedInterface();
        obj.display_drawable();
    }
    
}
