package fuelstation.database.models;

import fuelstation.database.models.dao.StationDao;
import fuelstation.database.models.domain.Station;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class StationTableModel extends AbstractTableModel
{
    private static final String[] columnNames = {"id", "cnpj", "nome", "nome social", "bandeira", "endereço", "cep"};
    private List<Station> stations;
    
    public StationTableModel(List<Station> stations) {
        this.stations = stations;
    }
    
    public StationTableModel()
    {
        try {
            StationDao dao = new StationDao();
            stations = (ArrayList) dao.all();
        } catch (SQLException e) {
            stations = new ArrayList<>();
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
        return stations.size();
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        switch (columnIndex) {
            case -1: return stations.get(rowIndex);
            case  0: return stations.get(rowIndex).getId();
            case  1: return stations.get(rowIndex).getCnpj();
            case  2: return stations.get(rowIndex).getName();
            case  3: return stations.get(rowIndex).getCompanyName();
            case  4: return stations.get(rowIndex).getFlag();
            case  5: return stations.get(rowIndex).getAddress();
            case  6: return stations.get(rowIndex).getCep();

            default: return null;
        }
    }
}
