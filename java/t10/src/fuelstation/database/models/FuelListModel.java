package fuelstation.database.models;

import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class FuelListModel extends AbstractListModel implements ComboBoxModel
{
    private Object selected;
    private ArrayList<Flag> fuels;
    
    public FuelListModel()
    {
        fuels = new ArrayList<>();
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