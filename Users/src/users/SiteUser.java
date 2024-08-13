
package users;


class SiteUser extends User {
    public SiteUser(String username) {
        super(username);
    }

    public void setUserType() {
        System.out.println("Setting user type for SiteUser: " + username);
    }

    @Override
    public void performAction() {
        System.out.println("Site user action performed by " + username);
    }

    public void postComment() {
        System.out.println("Comment posted by " + username + ".");
    }
}
