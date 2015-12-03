package fuelstation.database.connectors.strategy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteStrategyConnector implements ConectorStrategyInterface
{
    @Override
    public Connection getConnection()
    {
        try {
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection("jdbc:sqlite:fuelstation.sqlite");
        } catch (SQLException | ClassNotFoundException e) {
            // 
        }

        return null;
    }
    
    @Override
    public String getMigrationCheckSql()
    {
        return "SELECT name FROM sqlite_master WHERE name = 'Stations'";
    }
}
