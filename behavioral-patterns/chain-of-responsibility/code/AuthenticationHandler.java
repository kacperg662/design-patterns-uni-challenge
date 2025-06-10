public interface AuthenticationHandler {
    void setNext(AuthenticationHandler handler);
    void authenticate(User user);
}
