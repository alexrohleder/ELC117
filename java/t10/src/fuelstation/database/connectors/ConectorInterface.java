package fuelstation.database.connectors;

public interface ConectorInterface {
    public java.sql.Connection getConnection();
    public String getMigrationCheckSql();
}
