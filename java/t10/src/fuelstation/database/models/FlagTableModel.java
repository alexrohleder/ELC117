package fuelstation.database.models;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class FlagTableModel extends AbstractTableModel
{
    private static final String[] columnNames = {"id", "nome"};
    private ArrayList<Flag> flags;
    
    @Override
    public int getColumnCount()
    {
        return columnNames.length;
    }
    
    @Override
    public String getColumnName(int columnIndex)
    {
        return columnNames[columnIndex];
    }
    
    @Override
    public int getRowCount()
    {
        return flags.size();
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        switch (columnIndex) {
            case 0: return flags.get(rowIndex).getId();
            case 1: return flags.get(rowIndex).getName();

            default: return null;
        }
    }
}
