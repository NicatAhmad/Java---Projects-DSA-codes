package users;



class User {
    protected String username;

    public User(String username) {
        this.username = username;
    }

    public void login() {
        System.out.println(username + " has logged in.");
    }

    public void logout() {
        System.out.println(username + " has logged out.");
    }

    public void performAction() {
        System.out.println("User action performed by " + username);
    }

    public void viewProfile() {
        System.out.println("Viewing the profile of " + username + ".");
    }
}