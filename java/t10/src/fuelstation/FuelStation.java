
package fuelstation;

import fuelstation.database.connectors.Connector;
import fuelstation.database.connectors.strategy.SQLiteStrategyConnector;
import fuelstation.views.MainView;
import java.sql.SQLException;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class FuelStation
{
    public static void main(String[] args)
    {
        Connector.connect(new SQLiteStrategyConnector());
        
        try {
            if (Connector.migrated() == false) {
                Connector.migrate();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        init();
        
        Connector.disconnect();
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
