import java.sql.*;

public class Database {
    public static Connection getConnection () {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection
                        //Need to edit the values below
                      ("jdbc:mysql://localhost:3306/defecttracker", 
                      "root", "pencil");
                      return connection;
        } catch (SQLException e) {
            System.out.println("Cannot connect to database: " + e);
            return null;
        } catch (Exception e) {
          System.out.println("An error occured: " + e);
          return null;
        }
    }

    public static void close(Connection connection) {
      try {
          connection.close();
      } catch (Exception e) {
          e.printStackTrace();
      }
    }
} //end of Class
