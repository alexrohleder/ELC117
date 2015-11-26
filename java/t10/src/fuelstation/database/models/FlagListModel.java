package fuelstation.database.models;

import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class FlagListModel extends AbstractListModel implements ComboBoxModel
{
    private Object selected;
    private ArrayList<Flag> flags;
    
    public FlagListModel()
    {
        flags = new ArrayList<>();
    }
    
    @Override
    public int getSize() {
        return flags.size();
    }

    @Override
    public Object getElementAt(int i) {
        return flags.get(i);
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