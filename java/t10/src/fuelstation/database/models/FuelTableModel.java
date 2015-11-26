package fuelstation.database.models;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class FuelTableModel extends AbstractTableModel
{
    private static final String[] columnNames = {"id", "nome", "preço"};
    private ArrayList<Fuel> fuels;
    
    public FuelTableModel()
    {
        fuels = new ArrayList<>();
    }
    
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
        return fuels.size();
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        switch (columnIndex) {
            case 0: return fuels.get(rowIndex).getId();
            case 1: return fuels.get(rowIndex).getName();
            case 2: return fuels.get(rowIndex).getPrice();

            default: return null;
        }
    }
}
