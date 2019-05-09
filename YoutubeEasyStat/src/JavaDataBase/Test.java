
package JavaDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class Test {
    
    public static List<String> getData(Connection connection) {
        List<String> list = new ArrayList<String>();
        Statement st = null;
        ResultSet rs = null;
        try {
            st = connection.createStatement();
            rs = st.executeQuery("SELECT * FROM login");
            while (rs.next()) {
                list.add(rs.getString("username") + " " + rs.getString("password"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }
    
    public static void main(String[] args) {
        String dbName = "easystat";
        Conector connectionCls = new Conector();
        Connection connection = connectionCls.getConnection(dbName);
        
        System.out.println(getData(connection));
    }
}


