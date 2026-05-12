package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
   private static final String URL = "jdbc:mysql://localhost:3306/MiniBankingApp";
    private static final String USER = "root";
    private static final String PASSWERD = "1111";

    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USER ,PASSWERD );
            con.setAutoCommit(false);
            System.out.println("Connected to database successfully");

            con.close();

        }catch(SQLException e){
            e.printStackTrace();
        }
        return con;
    }
}
