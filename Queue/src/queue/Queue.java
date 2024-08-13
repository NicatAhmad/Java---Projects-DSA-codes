
package queue;


public class Queue 
{
  int size ;
  Node front ;
  Node rear;
  
  public Queue()
  {
	  this.size =0;
	  this.front= null;
	  this.rear =null;
  }
  
  int size()
  {
	  return this.size;
	  
  }
  boolean isEmpty ()
  {
	  return (this.front == null);
  }
  int peek ()
  {
	  return (isEmpty()) ? 0 : this.front.data;
  }
  
  Queue enqueue (int data )
  {
	  Node newNode = new Node(data);
	 
	  
	  if (this.rear==null)
	  {
		  this.front = newNode;
		  this.rear = newNode;
		  
	  }
	  else {
		  newNode.next = this.rear;
		  this.rear.prev = newNode;
		  this.rear = newNode ;
	  }
	  
	  this.size++;
	  return this ;
	  
	  
  }
  
  public Queue dequeue( )
  {
	if (isEmpty())
	{
		System.out.println("Queue is empty");
	}
	else 
	{
		if (this.rear==this.front)
		{
			this.rear=null;
			this.front= null;
		}
		else 
		{
			Node temp = this.front ;
			this.front = this.front.prev;
			this.front.next = null;
			
			temp = null;
		}
		
		
	}
	this.size--;
	
	  return this ;
  }
  
  public void displayQueue()
  {
	  if (this.rear==null)
	  {
		  System.out.println("Rear:  [null | " + this.rear + "]");
          System.out.println("Front: [null | " + this.front + "]");
	  }
	  else 
	  {
		  Node current = this.rear ;
		  
		  while (current != null)
		  {
			  if (current == this.rear)
			  {
				  System.out.print("Rear: [" + current.data + " | " + current.next + (current.next == null ? "] :Front\n" : "] -> "));
				  
			  }
			  else if (current.next == null)
			  {
				  System.out.println("[" + this.front.data + " | " + this.front.next + "] :Front");
			  }
			  else {
                  System.out.print("[" + current.data + " | " + current.next + "] -> ");
              }
			  current = current.next;
			  
		  }
	  }
  }
}
