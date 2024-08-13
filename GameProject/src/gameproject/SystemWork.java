
package gameproject;


public class SystemWork {

   
    public static void main(String[] args) 
    {
        Player player = new Player("Hero" , 100);
        Enemy enemy = new Enemy("Goblin" , 20);
        Character character = new Character("Adventurer", 5, 60);
        Weapon sword = new Weapon("Excalibur", 50);
        
        player.displayInfoPlayer();
        System.out.println("");
        
        enemy.displayInfoEnemy();
        System.out.println("");
        
        character.displayInfoCharacter();
        System.out.println("");
        
        sword.displayInfoWeapon();
    }
    
}
