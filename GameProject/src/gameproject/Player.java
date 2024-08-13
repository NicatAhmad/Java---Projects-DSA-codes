
package gameproject;


public class Player extends GameObject
{

    private  int health;
    
    public Player (String name , int health )
    {
        super(name);
        this.health = health ;
    }
    public void displayInfoPlayer()
    {
        displayInfo();
        System.out.print("Health: " + health +"\n");
    }
}
