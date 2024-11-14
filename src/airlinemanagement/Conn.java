package airlinemanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection conn;
    Statement s;

    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinemanagementsystem", "root", "shivah@45678");
            s = conn.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
