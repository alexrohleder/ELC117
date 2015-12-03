package fuelstation.database.models.dao;

import fuelstation.database.models.domain.Station;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StationDao extends AbstractDao <Station, Integer>
{
    @Override
    protected String getInsertDml(Station t) {
        return "insert into Stations values (" +
            "NULL," +
            "'" + t.getFlag() + "'," +
            "'" + t.getCnpj() + "'," +
            "'" + t.getName() + "'," +
            "'" + t.getCompanyName() + "'," +
            "'" + t.getAddress() + "'," +
            "'" + t.getCep() + "'," +
            "'" + t.getImage() + "'"
        + ")";
    }

    @Override
    protected String getSelectDml(Integer id) {
        return "select * from Stations where id = " + id;
    }

    @Override
    protected String getUpdateDml(Station t) {
        return "update Stations set " +
                "id_flag = '" + t.getFlag() + "'," +
                "cnpj = '" + t.getCnpj() + "'," +
                "name = '" + t.getName() + "'," +
                "companyName = '" + t.getCompanyName() + "'," +
                "address = '" + t.getAddress() + "'," +
                "cep = '" + t.getCep() + "'," +
                "image = '" + t.getImage() + "'" +
            " where id = " + t.getId();    
    }

    @Override
    protected String getDeleteDml(Integer id) {
        return "delete from Stations where id = " + id;
    }
    
    @Override
    protected String getAllDml() {
        return "SELECT * FROM Stations";
    }

    @Override
    protected Station from(ResultSet rs) throws SQLException {
        Station station = new Station();
        
        station.setId(rs.getInt("id"));
        station.setCnpj(rs.getString("cnpj"));
        station.setName(rs.getString("name"));
        station.setCompanyName(rs.getString("companyName"));
        station.setAddress(rs.getString("address"));
        station.setCep(rs.getString("cep"));
        station.setImage(rs.getString("image"));
        
        return station;
    }
}
