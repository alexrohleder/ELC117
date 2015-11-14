package model;

/**
 *
 * @author Alex Rohleder
 */
public class Station extends AbstractModel
{
    public void save(migrations.Station station)
    {
        this.beginTransaction();
        
        if (station.getId() != null) {
            station = this.getEntityManager().merge(station);
        }
        
        this.getEntityManager().persist(station);
        this.endTransaction();
    }
}
