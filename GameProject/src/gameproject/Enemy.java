
package gameproject;


public class Enemy extends GameObject
{

    private  int damage;
    public Enemy(String Name , int damage )
    {
        super(Name);
        this.damage = damage;
    }
    
    public void displayInfoEnemy()
    {
        displayInfo();
        System.out.print("Damage " + damage +"\n");
    }
}
