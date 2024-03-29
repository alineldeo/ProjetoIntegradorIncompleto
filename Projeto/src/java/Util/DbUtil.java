

package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbUtil {
     private static Connection connection = null;

    public static Connection getConnection() {
        if (connection != null)
            return connection;
        else {
            try {
                //Properties prop = new Properties();
                
                String user = "root";
                String password = "";
                Class.forName("com.mysql.jdbc.Driver"); // Para quem for usar MySql
                //Class.forName("org.postgresql.Driver");// Para quem for usar Postgres
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetoIntegrador", user, password);// Para quem for usar MySql
                //connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projetoIntegrador",user, password);// Para quem for usar Postgres
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return connection;
        }

    }
}
