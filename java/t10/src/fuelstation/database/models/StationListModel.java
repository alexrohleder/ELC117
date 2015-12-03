package fuelstation.database.models;

import fuelstation.database.models.dao.StationDao;
import fuelstation.database.models.domain.Station;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class StationListModel extends AbstractListModel implements ComboBoxModel
{
    private Object selected;
    private ArrayList<Station> stations;
    
    public StationListModel()
    {
        try {
            StationDao dao = new StationDao();
            stations = (ArrayList) dao.all();
        } catch (SQLException e) {
            stations = new ArrayList<>();
        }
    }
    
    @Override
    public int getSize() {
        return stations.size();
    }

    @Override
    public Object getElementAt(int i) {
        return stations.get(i);
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