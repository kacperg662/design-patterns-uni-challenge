public class User {
    private boolean userPermission;
    private boolean userPlusPermission;
    private boolean superUserPermission;

    public User(boolean user, boolean userPlus, boolean superUser) {
        this.userPermission = user;
        this.userPlusPermission = userPlus;
        this.superUserPermission = superUser;
    }

    public boolean hasUserPermission() {
        return userPermission;
    }

    public boolean hasUserPlusPermission() {
        return userPlusPermission;
    }

    public boolean hasSuperUserPermission() {
        return superUserPermission;
    }
}
