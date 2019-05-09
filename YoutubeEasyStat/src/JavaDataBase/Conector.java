
package JavaDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {
    private static final String DB_CONNECTION = "jdbc:mysql://localhost/";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";
    
    public Connection getConnection(String dbName) {
        Connection connection = null;
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DB_CONNECTION+dbName, DB_USER, DB_PASSWORD);
        } catch (Exception e) {
            System.out.println(e);
        }
        return connection;
    }
}
