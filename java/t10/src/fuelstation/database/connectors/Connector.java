package fuelstation.database.connectors;

import fuelstation.database.connectors.strategy.ConectorStrategyInterface;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;

public class Connector
{
    protected static Statement stmt;
    protected static ConectorStrategyInterface conn;
    
    public static void connect(ConectorStrategyInterface connector)
    {
        try {
            conn = connector;
            stmt = conn.getConnection().createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void disconnect()
    {
        try {
            stmt.close();
            conn.getConnection().close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static ResultSet execute(String sql) throws SQLException
    {
        if (!sql.contains("insert") && !sql.contains("delete") && !sql.contains("update")) {
            return stmt.executeQuery(sql);
        } else stmt.executeUpdate(sql);
        return null;
    }
    
    public static boolean migrated() throws SQLException
    {
        if (stmt == null) {
            throw new SQLDataException("A conexão deve primeiramente ser estabelecida.");
        }
        
        ResultSet result = execute(conn.getMigrationCheckSql());
        
        while (result.next()) {
            return true;
        }
        
        return false;
    }
    
    public static void migrate() throws SQLException
    {
        migrateStationsTable();
        migrateFuelsTable();
    }
    
    private static void migrateStationsTable() throws SQLException
    {
        stmt.executeUpdate(
                "CREATE TABLE Stations (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "id_flag INTEGER NOT NULL," +
                    "cnpj INTEGER NOT NULL," +
                    "name VARCHAR(80) NOT NULL," +
                    "companyName VARCHAR(80) NOT NULL," +
                    "address VARCHAR(80) NOT NULL," +
                    "cep INTEGER NOT NULL," +
                    "image VARCHAR(255) NOT NULL" +
                ")"
        );
    }
    
    private static void migrateFuelsTable() throws SQLException
    {
        stmt.executeUpdate(
                "CREATE TABLE Fuels (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "id_station INTEGER NOT NULL," +
                    "type VARCHAR(80) NOT NULL," +
                    "price VARCHAR(10) NOT NULL," +
                    "date VARCHAR(10) NOT NULL" +
                ")"
        );
    }
}
