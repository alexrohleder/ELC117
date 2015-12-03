package fuelstation.database.models.dao;

import fuelstation.database.models.domain.Fuel;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FuelDao extends AbstractDao <Fuel, Integer>
{
    @Override
    protected String getInsertDml(Fuel t) {
        return "insert into Fuels values ("
            + "NULL,"
            + "'" + t.getIdStation() + "',"
            + "'" + t.getType() + "',"
            + "'" + t.getPrice() + "',"
            + "'" + t.getDate() + "'"
        + ")";
    }

    @Override
    protected String getSelectDml(Integer id) {
        return "select * from Fuels where id = " + id;
    }

    @Override
    protected String getUpdateDml(Fuel t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected String getDeleteDml(Integer id) {
        return "delete from Fuels where id = " + id;
    }

    @Override
    protected String getAllDml() {
        return "select * from Fuels";
    }

    @Override
    protected String getWhereDml(String where) {
        return "select * from Fuels where " + where;
    }

    @Override
    protected Fuel from(ResultSet rs) throws SQLException {
        Fuel fuel = new Fuel();
        
        fuel.setId(rs.getInt("id"));
        fuel.setIdStation(rs.getInt("id_station"));
        fuel.setPrice(rs.getString("price"));
        fuel.setType(rs.getString("type"));
        fuel.setDate(rs.getString("date"));
        
        return fuel;
    }
}
