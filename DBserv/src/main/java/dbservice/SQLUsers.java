package dbservice;

import accounts.UserProfile;

import java.sql.*;

public class SQLUsers {

    Connection connection;
    private ResultSet rs;

    public SQLUsers() throws SQLException {
        this.connection = DCService.getConnection();
    }

    public void reopenConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DCService.getConnection();
        }
    }

    public void createTable() throws SQLException {
        reopenConnection();
        Statement statement = connection.createStatement();
        statement.execute("CREATE TABLE IF NOT EXISTS USERS(" +
                "ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY, " +
                "LOG VARCHAR(255) NOT NULL, " +
                "PASS VARCHAR(255) NOT NULL)");
    }

    public void addUser(String login, String pass) throws SQLException {
        reopenConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO USERS(LOG, PASS) VALUES(login, pass)");
            statement.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public UserProfile getUser(String login) throws SQLException {
        Statement statement = connection.createStatement();
        rs = statement.executeQuery("SELECT Login, Pass");
        while (rs.next()) {
            String l = rs.getString(2);
            String p = rs.getString(3);
            if (l.equals(login)) { return new UserProfile(l, p); }
        }
        return null;
    }
}
