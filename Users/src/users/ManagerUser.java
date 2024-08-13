
package users;


class ManagerUser extends AdminUser {
    public ManagerUser(String username) {
        super(username);
    }

    public void manageUsers() {
        System.out.println("Users managed by " + username + ".");
    }
}
