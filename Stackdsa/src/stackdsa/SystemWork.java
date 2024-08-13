
package stackdsa;

public class SystemWork 
{
  public static void main (String []args )
  {
	  Stack stack = new Stack();
	  
	  stack.push(10).push(20).push(30).push(40).push(50).push(60).pop();
	  
	  stack.displayStack();
  }
}
