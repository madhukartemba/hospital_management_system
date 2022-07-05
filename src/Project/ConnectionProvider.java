
package Project;
import java.sql.*;


public class ConnectionProvider
{
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "kmy2016");
            return con;
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println("Connection error in Connection Provider");
            return null;
        }
    }
    
}
