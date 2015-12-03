package fuelstation.database.models;

import fuelstation.database.models.dao.FuelDao;
import fuelstation.database.models.domain.Fuel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class FuelTableModel extends AbstractTableModel
{
    private static final String[] columnNames = {"id", "nome", "preço"};
    private List<Fuel> fuels;
    
    public FuelTableModel(List<Fuel> fuels)
    {
        this.fuels = fuels;
    }
    
    public FuelTableModel()
    {
        try {
            FuelDao dao = new FuelDao();
            fuels = (ArrayList) dao.all();
        } catch (SQLException e) {
            fuels = new ArrayList<>();
        }
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
            case -1: return fuels.get(rowIndex);
            case  0: return fuels.get(rowIndex).getId();
            case  1: return fuels.get(rowIndex).getType();
            case  2: return fuels.get(rowIndex).getPrice();

            default: return null;
        }
    }
}
