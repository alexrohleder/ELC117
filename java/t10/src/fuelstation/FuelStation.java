
package fuelstation;

import fuelstation.database.connectors.Connector;
import fuelstation.database.connectors.strategy.SQLiteStrategyConnector;
import javax.swing.UnsupportedLookAndFeelException;
import fuelstation.views.ApplicationView;
import java.sql.SQLException;
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
            
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName()); break;
                }
            }
            
            new ApplicationView().setVisible(true);
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            System.out.println(e.getMessage());
        }
        
        Connector.disconnect();
    }
}
