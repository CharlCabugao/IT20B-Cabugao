
package simplequeue;
    import java.util.LinkedList;
    import java.util.Queue;

public class SimpleQueue {


    public static void main(String[] args) {
        
        Queue<String> queue = new LinkedList<>();

            queue.add("Gtr");
            queue.add("Supra");
            queue.add("Bmw");

            queue.poll();  
            queue.poll();  
            System.out.println("Remaining elements in the queue: " + queue);  

            queue.add("Lamborghini");
            queue.add("Ferrari");

            queue.poll(); 
            System.out.println("Remaining elements in the queue: " + queue);
        
    
    }
    
}
