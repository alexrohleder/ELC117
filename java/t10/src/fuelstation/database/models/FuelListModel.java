package fuelstation.database.models;

import fuelstation.database.models.dao.FuelDao;
import fuelstation.database.models.domain.Fuel;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class FuelListModel extends AbstractListModel implements ComboBoxModel
{
    private Object selected;
    private ArrayList<Fuel> fuels;
    
    public FuelListModel()
    {
        try {
            FuelDao dao = new FuelDao();
            fuels = (ArrayList) dao.all();
        } catch (SQLException e) {
            fuels = new ArrayList<>();
        }
    }
    
    @Override
    public int getSize() {
        return fuels.size();
    }

    @Override
    public Object getElementAt(int i) {
        return fuels.get(i);
    }

    @Override
    public void setSelectedItem(Object o) {
        selected = o;
    }

    @Override
    public Object getSelectedItem() {
        return selected;
    }
}