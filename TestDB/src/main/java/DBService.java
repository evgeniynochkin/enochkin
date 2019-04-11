import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBService {

    public static final String DB_UR = "jdbc:h2:/c:/projects/db";
    public static final String DB_Driver = "org.h2.Driver";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName(DB_Driver);
            return DriverManager.getConnection(DB_UR);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
