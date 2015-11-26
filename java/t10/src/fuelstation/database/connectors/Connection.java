package fuelstation.database.connectors;

import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection
{
    protected static Statement stmt;
    protected static ConectorInterface conn;
    
    public static void connect(ConectorInterface connector)
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
        return stmt.executeQuery(sql);
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
        migrateFlagsTable();
        migrateStationsTable();
        migrateFuelsTable();
        migrateStationFuelsTable();
    }
    
    private static void migrateFlagsTable() throws SQLException
    {
        stmt.executeUpdate(
                "CREATE TABLE Flags (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "name VARCHAR(80) NOT NULL" +
                ")"
        );
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
                    "name VARCHAR(80) NOT NULL" +
                ")"
        );
    }
    
    private static void migrateStationFuelsTable() throws SQLException
    {
        stmt.executeUpdate(
                "CREATE TABLE StationFuels (" +
                    "station_id INTEGER NOT NULL," +
                    "fuel_id INTEGER NOT NULL," +
                    "collect DATE NOT NULL," +
                    "price DECIMAL NOT NULL" +
                ")"
        );
    }
}
