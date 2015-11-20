package fuelstation.database.connectors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteConnector extends AbstractConnector
{
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
    protected String getMigrationCheckSql()
    {
        return "SELECT name FROM sqlite_master WHERE name = 'Stations'";
    }
}
