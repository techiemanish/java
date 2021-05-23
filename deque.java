import java.util.*;

public class deque {
    public static void main(String args[]) {
      Deque <Integer> d1 = new ArrayDeque <Integer>();
      d1.add(5);
      d1.add(15);
      d1.add(20);
      d1.add(25);
      d1.addFirst(55);
      d1.add(30);
      d1.addLast(50);
      d1.addFirst(45);
      Deque <Integer> d2 = new ArrayDeque <Integer>();
      d2.push(10);
      d2.push(20);
      d2.push(30);
      d2.push(40);
      d2.push(50);
      d2.push(60);
      d2.push(70);
      d2.push(80);
      System.out.println(d1);
      System.out.println(d2);
      
      System.out.println("Peek: " + d1.peek());
      System.out.println("Peek: " + d2.peek());
      
      System.out.println("PeekFirst: " + d1.peekFirst());
      System.out.println("PeekFirst: " + d2.peekFirst());
      
      System.out.println("PeekLast: " + d1.peekLast());
      System.out.println("PeekLast: " + d2.peekLast());
      
      System.out.println("GetFirst: " + d1.getFirst());
      System.out.println("GetFirst: " + d2.getFirst());
      
      System.out.println("GetLast: " + d1.getLast());
      System.out.println("GetLast: " + d2.getLast());
      
      System.out.println("Poll: " + d1.poll());
      System.out.println("Poll: " + d2.poll());
      
      System.out.println("PollFirst: " + d1.pollFirst());
      System.out.println("PollFirst: " + d2.pollFirst());
      
      System.out.println("PollLast: " + d1.pollLast());
      System.out.println("PollLast: " + d2.pollLast());
      
      System.out.println("Remove: " + d1.remove());
      System.out.println("Remove: " + d2.remove());
      
      System.out.println("RemoveFirst: " + d1.removeFirst());
      System.out.println("RemoveFirst: " + d2.removeFirst());
      
      System.out.println("RemoveLast: " + d1.removeLast());
      System.out.println("RemoveLast: " + d2.removeLast());
      
      System.out.println(d1);
      System.out.println(d2);
      
      
    }
}