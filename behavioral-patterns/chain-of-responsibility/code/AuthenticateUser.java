public class AuthenticateUser implements AuthenticationHandler{
    private AuthenticationHandler next;

    @Override
    public void setNext(AuthenticationHandler handler) {
        this.next = handler;
    }

    @Override
    public void authenticate(User user) {
        if (user.hasUserPermission()) {
            System.out.println("Authenticated as User.");
        } else if (next != null) {
            next.authenticate(user);
        } else {
            System.out.println("Authentication failed.");
        }
    }
}
