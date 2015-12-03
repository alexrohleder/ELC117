package fuelstation.database.connectors.strategy;

public interface ConectorStrategyInterface {
    public java.sql.Connection getConnection();
    public String getMigrationCheckSql();
}
