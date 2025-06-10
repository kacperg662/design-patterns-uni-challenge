public class Main {
    public static void main(String[] args) {
        AuthenticationHandler userHandler = new AuthenticateUser();
        AuthenticationHandler userPlusHandler = new AuthenticateUserPlus();
        AuthenticationHandler superUserHandler = new AuthenticateSuperUser();

        userHandler.setNext(userPlusHandler);
        userPlusHandler.setNext(superUserHandler);

        User regularUser = new User(true, false, false);
        User plusUser = new User(false, true, false);
        User adminUser = new User(false, false, true);
        User unknownUser = new User(false, false, false);

        userHandler.authenticate(regularUser);
        userHandler.authenticate(plusUser);
        userHandler.authenticate(adminUser);
        userHandler.authenticate(unknownUser);

        FileOperations ops = new FileOperations();
        ops.readFile("data.txt", regularUser);
        ops.writeFile("data.txt", regularUser);
        ops.deleteFile("data.txt", regularUser);
    }
}
