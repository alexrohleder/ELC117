
package fuelstation;

import fuelstation.database.connectors.AbstractConnector;
import fuelstation.database.connectors.SQLiteConnector;
import fuelstation.views.MainView;
import java.sql.SQLException;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

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
        
        init();
        
        conn.disconnect();
    }
    
    protected static void init()
    {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName()); break;
                }
            }
            
            SwingUtilities.invokeLater(() -> {
                new MainView().setVisible(true);
            });
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
