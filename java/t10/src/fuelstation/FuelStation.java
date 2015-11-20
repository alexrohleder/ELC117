
package fuelstation;

import fuelstation.database.connectors.AbstractConnector;
import fuelstation.database.connectors.SQLiteConnector;
import java.sql.SQLException;

public class FuelStation
{
    protected static AbstractConnector conn = new SQLiteConnector();
    
    public static void main(String[] args)
    {
        conn.connect();
        
        try {
            if (conn.migrated() == false) {
                conn.migrate();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        conn.disconnect();
    }
}
