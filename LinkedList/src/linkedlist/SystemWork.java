
package linkedlist;

public class SystemWork {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.add(10);
		list.add(15);
		list.add(20);
		
		list.addFirst(40);
		list.add(70);
                list.add(90);
                list.delete(10);
		
		
		list.printList();
		
		
	}

}
