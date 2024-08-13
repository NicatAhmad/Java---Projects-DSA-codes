
package mathoperations;

public class MathOperations {

   
  	public static void main(String[] args) {
		Operations math = new Operations(10);
		int a = math.add(10).subtract(3).multiply(4).divided(17).getResult();
		
		System.out.println(a);

	}
    
}
