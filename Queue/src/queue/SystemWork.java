
package queue;


public class SystemWork {

	public static void main(String[] args) {
		
		Queue queue = new Queue();
		
		queue.enqueue(5).enqueue(15).enqueue(10);
		queue.displayQueue();
		
		queue.dequeue().dequeue().dequeue();
		queue.displayQueue();
		
		
	      System.out.println();
	        System.out.println("Size:     " + queue.size());
	        System.out.println("Front:    " + queue.peek());

	        queue.dequeue();
	        System.out.println("Is Empty: " + queue.isEmpty());
	        System.out.println("Front:    " + queue.peek());

	        queue.dequeue();
	        System.out.println("Is Empty: " + queue.isEmpty());
	        System.out.println("Front:    " + queue.peek());

	        queue.dequeue();  
	        System.out.println("Is Empty: " + queue.isEmpty());
	        System.out.println();

	}

}
