package accounts;

public class AccountService {

    private String login;
    private String password;

    public AccountService() {
        login = new String();
        password = new String();
    }

    public AccountService(String login, String pass) {
        this.login = login;
        this.password = pass;
    }

    public AccountService(String login) {
        this.login = login;
        this.password = login;
    }

    public void setLogin(String login) { this.login = login; }
    public void setPassword(String password) { this.password = password; }

    public String getLogin() { return login; }
    public String getPass() { return password; }

}
