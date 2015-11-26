package fuelstation.database.models;

import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class StationListModel extends AbstractListModel implements ComboBoxModel
{
    private Object selected;
    private ArrayList<Station> stations;
    
    public StationListModel()
    {
        stations = new ArrayList<>();
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