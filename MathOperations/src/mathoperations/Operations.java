
package mathoperations;


public class Operations 
{
  private int result ;
  
  public Operations(int initial)
  {
	  this.result = initial ;
	  
  }
  
  public Operations add (int value )
  {
	  result += value ;
	  return this ;
	  
  }
  public Operations subtract (int value )
  {
	  result -= value ;
	  return this ;
	  
  }
  
  public Operations multiply (int value )
  {
	  result *= value ;
	  return this ;
	  
  }
  public Operations divided (int value )
  {
	  if(value!=0)
	  {
	  result /= value ;
	  return this ;
	  }
	  else 
	  {
		  System.out.println("Cant divded zero");
		  return null;
	  }
  }
  
  public int getResult ()
  {
	  return result ;
  }
	  
  
}
