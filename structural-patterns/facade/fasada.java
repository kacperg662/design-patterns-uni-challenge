class AuthenticationService {
    public boolean authenticate(String username, String password) {
        return "admin".equals(username) && "admin123".equals(password);
    }
}

class AuthorizationService {
    public boolean checkPermissions(String username) {
        return true;
    }
}

class LoginSystem {
    private AuthenticationService authService;
    private AuthorizationService authzService;
    
    public LoginSystem() {
        this.authService = new AuthenticationService();
        this.authzService = new AuthorizationService();
    }
    
    public boolean login(String username, String password) {
        if (!authService.authenticate(username, password)) {
            System.out.println("Nieudana próba logowania dla użytkownika: " + username);
            return false;
        }
        if (!authzService.checkPermissions(username)) {
            System.out.println("Brak uprawnień dla użytkownika: " + username);
            return false;
        }
        System.out.println("Użytkownik " + username + " zalogowany pomyślnie");
        return true;
    }
}

public class Client {
        private String username;
        private String password;
        private LoginSystem loginSystem;

        public Client() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter username: ");
            this.username = input.nextLine();
            System.out.println("Enter password: ");
            this.password = input.nextLine();
            this.loginSystem = new LoginSystem();
        }
        
        public run() {
            boolean result = loginSystem.login(username, password);
            System.out.println("Wynik logowania: " + result);
        } 
    }
}