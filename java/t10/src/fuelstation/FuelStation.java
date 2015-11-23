
package fuelstation;

import fuelstation.database.connectors.AbstractConnector;
import fuelstation.database.connectors.SQLiteConnector;
import fuelstation.views.MainView;
import java.sql.SQLException;
import javax.swing.SwingUtilities;

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
        
        SwingUtilities.invokeLater(() -> {
            new MainView().setVisible(true);
        });
        
        conn.disconnect();
    }
}
