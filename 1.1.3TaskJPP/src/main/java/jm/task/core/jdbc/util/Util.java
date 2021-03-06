
package jm.task.core.jdbc.util;



import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

        private static Connection connection;
        private static final String URL = "jdbc:mysql://localhost:3306/mydb";
        private static final String USER = "root";
        private static final String PASS = "root";

        public static Connection getConnection() {
            try {
                connection = DriverManager.getConnection(URL, USER, PASS);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            return connection;
        }
}
