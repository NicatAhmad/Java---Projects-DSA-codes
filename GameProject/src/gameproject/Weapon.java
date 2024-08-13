
package gameproject;


public class Weapon extends GameObject
{

    private  int damage;
    public Weapon (String name , int damage )
    {
        super(name);
        this.damage = damage ;
        
    }
    void displayInfoWeapon()
    {
        displayInfo();
        System.out.print("Damage: " + damage + "\n");
    }
}
