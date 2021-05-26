//Anonymous class Implementation using Interface
interface Eatable{
    void eat();
}

public class Anonymous_Interface{
    public static void main(String args []){
        Eatable e1 = new Eatable(){
          public void eat(){
              System.out.println("You can eat this.");
          }  
        };
    e1.eat();
    }
}