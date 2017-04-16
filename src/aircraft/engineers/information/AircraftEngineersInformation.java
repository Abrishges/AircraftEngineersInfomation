/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aircraft.engineers.information;
import java.sql.*;

/**
 *
 * @author tsegazababraha
 */
public class AircraftEngineersInformation {

    /**
     * @param args the command line arguments
     */
    public static void main( String args[] )
  {
    Connection c = null;
    Statement stmt = null;
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:test.db");
      
      
      stmt = c.createStatement();
      String sql = "CREATE TABLE Users " +
                   "(ID INT PRIMARY KEY     NOT NULL," +
                   " username           VARCHAR    NOT NULL, " + 
                   " password            VARCHAR     NOT NULL, " + 
                   " position        VARCHAR, " + 
                   " SALARY         REAL)"; 
      stmt.executeUpdate(sql);
      stmt.close();
      c.close();
      
      
      
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    System.out.println("Opened database successfully");
  }
    
}
