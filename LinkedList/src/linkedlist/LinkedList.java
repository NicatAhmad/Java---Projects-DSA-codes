
package linkedlist;

public class LinkedList 
{
  Node head ;
  
  
	 public LinkedList ()
	 {
		 this.head= null;
		 
	 }
	 
	 public void add (int data)
	 {
		 Node newNode = new Node(data);
		 
		 if (head ==null)
		 {
			 head = newNode;
			 
		 }
		 else 
		 {
			 Node current = head ;
			 
			 while (current.next != null)
			 {
				 current = current.next;
			 }
			 current.next = newNode;
			 
		 }
	 }
	 
	 public void printList()
	 {
		 Node current = head;
		 
		 while (current!=null)
		 {
			 System.out.print(current.data +" ");
			 current = current.next;
			 
		 }
		 System.out.println();
	 }
	 
	 public void addFirst(int data )
	 {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;	 
	 }
	 
	
	 
	 public void delete (int data )
	 {
		if (head == null)
		{
			return ;
		}
	
		if (head.data == data )
		{
			head = head.next ;
				return ;
				
		}
		
		Node current = head;
		
		while (current.next!= null)
		{
			if (current.next.data == data)
			{
				Node currentNext = current.next.next;
				current.next = currentNext;
				
			}
			current = current.next;
		}
		
	 }
	 
	}
