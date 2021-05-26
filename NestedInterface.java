//Nested Interface in interface
interface Showable{
    void display_showable();
    interface Drawable{
        void display_drawable();
    }
}

public class NestedInterface implements Showable.Drawable{
    public void display_drawable(){
        System.out.println("Drawable method is displayed.");
    }
    public static void main(String args []){
        Showable.Drawable obj  = new NestedInterface();
        obj.display_drawable();
    }
    
}
