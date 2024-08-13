
package stackdsa;


public class Stack 
{ 
	int size ;
	Node top;
	
	public Stack push (int data )
	{
		Node newNode = new Node (data);
		
		if (top==null)
		{
			top= newNode;
			return this;
		}
		
		Node current = top;
		
		while(current.next!= null)
		{
			
			current = current.next;
			
		}
		current.next = newNode ;
		
		return this;
		
	}
	public boolean isEmpty()
	{
		return (top==null);
	}
	
	public void displayStack ()
	{
		if (isEmpty())
		{
			System.out.print("Stack is Empty");
			return ; 
		}
		
		Node current = top ;
		
		if (current.next==null)
		{
			System.out.print("[ " + current.data + "]");
			return ;
		}
		
		while (current.next != null)
		{
			System.out.println("[" + current.data + "]" );
			current = current.next;
			
		}
		System.out.println("[" + current.data + "]" );
		
	}
	
	public Stack pop ()
	{
		if (top==null)
		{
			System.out.println("Stack is Empty");
			return this ;
		} 
		
		Node current = top;
		if (current.next==null)
		{
			top = null;
			return this ;
			
		}
		
		while (current.next.next != null)
		{
			current = current.next ;
			
		}
		current.next = null;
		
		return this ;
		
		
		
	}

}
