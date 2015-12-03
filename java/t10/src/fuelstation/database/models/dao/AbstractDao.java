package fuelstation.database.models.dao;

import fuelstation.database.connectors.Connector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDao <T, PK>
{    
    public void create(T t) throws SQLException {
        Connector.execute(getInsertDml(t));
    }

    public T get(PK id) throws SQLException {
        ResultSet rs = Connector.execute(getSelectDml(id));
        List<T> results = results(rs);
        return results.size() > 0 ? results.get(0) : null;
    }
    
    public List<T> all() throws SQLException {
        return results(Connector.execute(getAllDml()));
    }
    
    public void update(T t) throws SQLException {
        Connector.execute(getUpdateDml(t));
    }

    public void delete(PK id) throws SQLException {
        Connector.execute(getDeleteDml(id));
    }
    
    public List<T> where(String where) throws SQLException {
        ResultSet rs = Connector.execute(getWhereDml(where));
        return results(rs);
    }
    
    protected List<T> results(ResultSet rs) throws SQLException {
        List<T> results = new ArrayList<>();
        
        while (rs.next()) {
           T t = from(rs);
           results.add(t);
        }
        
        return results;
    }
    
    protected abstract String getInsertDml(T t);
    protected abstract String getSelectDml(PK id);
    protected abstract String getUpdateDml(T t);
    protected abstract String getDeleteDml(PK id);
    protected abstract String getAllDml();
    protected abstract String getWhereDml(String where);
    protected abstract T from(ResultSet rs) throws SQLException;
}
