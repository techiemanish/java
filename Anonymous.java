//Anonymous class Implementation using Class
abstract class Person{
    void info(){
    }
}

public class Anonymous {
    public static void main(String args[]){
        Person p = new Person(){
            void info(){
                System.out.println("Person info is displayed.");
            }
        };
    p.info();
    }
}