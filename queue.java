import java.util.*;
public class queue {
    public static void main(String args[]) {
      Queue<Integer> q1 = new LinkedList<Integer>();
      System.out.println("Queue using LinkedList Implementation");
      // Operations on Queue 1
      //Adding element using add() method
      q1.add(1);
      q1.add(2);
      q1.add(3);
      System.out.print("Queue after add() method opertaion: ");
      System.out.println(q1);
      //Adding element using offer() method
      q1.offer(4);
      q1.offer(5);
      q1.offer(6);
      System.out.print("Queue after offer() method opertaion: ");
      System.out.println(q1);
      
      //Delete Operation using remove() method
      q1.remove();
      q1.remove();
      System.out.print("Queue after remove() method opertaion: ");
      System.out.println(q1);
      //Delete Operation using poll() method
      q1.poll();
      q1.poll();
      System.out.print("Queue after poll() method opertaion: ");
      System.out.println(q1);
      
      //Peek operation using peek() method
      System.out.println("Peek element using peek() method: " + q1.peek());
      //Peek operation using element() method
      System.out.println("Peek element using element() method: " + q1.element());
      
      //Contain method of Collection
      System.out.println("Queue contains the element: " + q1.contains(5));
      
      System.out.println();
      //Queue using PriorityQueue
      System.out.println("Queue using PriorityQueue Implementation");
      Queue<Integer> q2 = new PriorityQueue<Integer>();
      // Operations on Queue 2
      //Adding element using add() method
      q2.add(1);
      q2.add(2);
      q2.add(3);
      System.out.print("Queue after add() method opertaion: ");
      System.out.println(q2);
      //Adding element using offer() method
      q2.offer(4);
      q2.offer(5);
      q2.offer(6);
      System.out.print("Queue after offer() method opertaion: ");
      System.out.println(q2);
      
      //Delete Operation using remove() method
      q2.remove();
      q2.remove();
      System.out.print("Queue after remove() method opertaion: ");
      System.out.println(q2);
      //Delete Operation using poll() method
      q2.poll();
      q2.poll();
      System.out.print("Queue after poll() method opertaion: ");
      System.out.println(q2);
      
      //Peek operation using peek() method
      System.out.println("Peek element using peek() method: " + q2.peek());
      //Peek operation using element() method
      System.out.println("Peek element using element() method: " + q2.element());
      
      //Contain method of Collection
      System.out.println("Queue contains the element: " + q2.contains(5));
    }
}
