
package users;


public class SystemWork {

    public static void main(String[] args) {
               User user1 = new ModeratorUser("ModUser123");
        User user2 = new ManagerUser("ManagerUser456");

        user1.login();
        user1.performAction();
        user1.viewProfile();
        user1.logout();

        user2.login();
        user2.performAction();
        user2.viewProfile();
        user2.logout();

       
        if (user1 instanceof ModeratorUser) {
            ModeratorUser modUser = (ModeratorUser) user1;
            modUser.moderateContent();
        }

        if (user2 instanceof ManagerUser) {
            ManagerUser managerUser = (ManagerUser) user2;
            managerUser.manageUsers();
        }
    }
    
}
