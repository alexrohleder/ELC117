
package fuelstation;

import fuelstation.database.connectors.Connection;
import fuelstation.database.connectors.SQLiteConnector;
import fuelstation.views.MainView;
import java.sql.SQLException;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class FuelStation
{
    public static void main(String[] args)
    {
        Connection.connect(new SQLiteConnector());
        
        try {
            if (Connection.migrated() == false) {
                Connection.migrate();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        init();
        
        Connection.disconnect();
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
