
package users;


class AdminUser extends User {
    public AdminUser(String username) {
        super(username);
    }

    public void setPermissions() {
        System.out.println("Setting permissions for AdminUser: " + username);
    }

    @Override
    public void performAction() {
        System.out.println("Admin action performed by " + username);
    }
}