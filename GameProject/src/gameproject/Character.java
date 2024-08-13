
package gameproject;


public class Character extends GameObject
{

    private  int experience;
    private  int level;
    
    public Character(String name , int level , int experience )
    {
        super(name);
        this.level = level ;
        this.experience = experience ;
        
    }
    public void displayInfoCharacter ()
    {
        displayInfo();
        System.out.print("Level: " + level + "\n" );
        System.out.print("Experience : " + experience + "\n");
    }
}
