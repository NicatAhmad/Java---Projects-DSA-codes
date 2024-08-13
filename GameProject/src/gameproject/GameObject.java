
package gameproject;


public class GameObject 
{
    
    private String  name ;
    
    public GameObject(String name ) 
    {
        this.name= name ;
        
    }
    public void displayInfo()
    {
        System.out.print("Name: " + name  + "\n");
    }
}
