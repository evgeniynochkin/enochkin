import java.sql.SQLException;

public class main {

    public static void main(String[] args) throws SQLException {

        DBService dbs = new DBService();
        SQLUser userTab = new SQLUser();

        String login;
        String pass;

         userTab.createTable();
         userTab.addUser("testlogin", "testpass");
    }
}
