public class MemberInner {
    private int a = 5;
    class A {
        void display(){
            System.out.println("Value of A: " + a);
        }
    }
    
    public static void main(String args[]) {
      MemberInner obj = new MemberInner();
      MemberInner.A a1 = obj.new A();
      a1.display();
    }
}