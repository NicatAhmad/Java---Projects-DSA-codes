
package users;


class ModeratorUser extends AdminUser {
    public ModeratorUser(String username) {
        super(username);
    }

    public void moderateContent() {
        System.out.println("Content moderated by " + username + ".");
    }
}



