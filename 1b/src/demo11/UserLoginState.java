package demo11;
public class UserLoginState {
    private static UserLoginState instance;
    private boolean loggedIn;

    // Private constructor to prevent instantiation
    private UserLoginState() {
        loggedIn = false;
    }

    // Public method to provide access to the instance
    public static UserLoginState getInstance() {
        if (instance == null) {
            instance = new UserLoginState();
        }
        return instance;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void login() {
        loggedIn = true;
    }

    public void logout() {
        loggedIn = false;
    }
}
