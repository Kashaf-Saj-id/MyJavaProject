package ExceptionHandling.CheckedExceptions;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//This exception occurs when there’s an issue
// with database access.
public class SQLExceptionExample {

    public static void main(String[] args) {

        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "Password");
            Statement stmt = conn.createStatement();
            stmt.execute ("Select*from employee");

        }catch(SQLException e){
            System.out.println("Database error: "+e.getMessage());

        }
    }
}
