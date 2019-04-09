package accounts;

import dbservice.DCService;
import dbservice.SQLUsers;

import java.sql.SQLException;

public class AccountService {

    private static DCService dcs;
    private SQLUsers userTab;

    public AccountService() throws SQLException {
        dcs = new DCService();
        userTab = new SQLUsers();
    }

    public void addNewUser(String login, String pass) throws SQLException {
        userTab.createTable();
        userTab.addUser(login, pass);
    }

    public UserProfile getUserByLogin(String login) throws SQLException {
        return userTab.getUser(login);
    }

}
