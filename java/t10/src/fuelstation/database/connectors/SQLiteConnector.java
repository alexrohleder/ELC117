package fuelstation.database.connectors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteConnector implements ConectorInterface
{
    private Connection conn;
    
    @Override
    public Connection getConnection()
    {
        if (conn == null) {
            try {
                Class.forName("org.sqlite.JDBC");
                conn = DriverManager.getConnection("jdbc:sqlite:fuelstation.sqlite");
            } catch (SQLException | ClassNotFoundException e) {
                // 
            }
        }
        
        return conn;
    }
    
    @Override
    public String getMigrationCheckSql()
    {
        return "SELECT name FROM sqlite_master WHERE name = 'Stations'";
    }
}
