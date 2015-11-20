package fuelstation.database.connectors;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class AbstractConnector
{
    protected Statement stmt;
    protected Connection conn = getConnection();
    protected abstract Connection getConnection();
    protected abstract String getMigrationCheckSql();
    
    public void connect()
    {
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void disconnect()
    {
        try {
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public ResultSet execute(String sql) throws SQLException
    {
        return stmt.executeQuery(sql);
    }
    
    public boolean migrated() throws SQLException
    {
        if (stmt == null) {
            throw new SQLDataException("A conexão deve primeiramente ser estabelecida.");
        }
        
        ResultSet result = execute(getMigrationCheckSql());
        
        while (result.next()) {
            return true;
        }
        
        return false;
    }
    
    public void migrate() throws SQLException
    {
        migrateFlagsTable();
        migrateStationsTable();
        migrateFuelsTable();
        migrateStationFuelsTable();
    }
    
    private void migrateFlagsTable() throws SQLException
    {
        stmt.executeUpdate(
                "CREATE TABLE Flags (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "name VARCHAR(80) NOT NULL" +
                ")"
        );
    }
    
    private void migrateStationsTable() throws SQLException
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
    
    private void migrateFuelsTable() throws SQLException
    {
        stmt.executeUpdate(
                "CREATE TABLE Fuels (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "name VARCHAR(80) NOT NULL" +
                ")"
        );
    }
    
    private void migrateStationFuelsTable() throws SQLException
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
