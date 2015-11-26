package fuelstation.database.models;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class StationTableModel extends AbstractTableModel
{
    private static final String[] columnNames = {"id", "cnpj", "nome", "nome social", "bandeira", "endereço", "cep"};
    private ArrayList<Station> stations;
    
    public StationTableModel()
    {
        stations = new ArrayList<>();
        stations.add(new Station(1, 99999999, "teste", "huhu", new Flag(3, "Texaco"), "rua tal", 9803894));
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
        return stations.size();
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        switch (columnIndex) {
            case 0: return stations.get(rowIndex).getId();
            case 1: return stations.get(rowIndex).getCnpj();
            case 2: return stations.get(rowIndex).getName();
            case 3: return stations.get(rowIndex).getCompanyName();
            case 4: return stations.get(rowIndex).getFlag().getName();
            case 5: return stations.get(rowIndex).getAddress();
            case 6: return stations.get(rowIndex).getCep();

            default: return null;
        }
    }
}
