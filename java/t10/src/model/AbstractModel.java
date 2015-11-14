package model;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Alex Rohleder
 */
public abstract class AbstractModel
{
    private static EntityManagerFactory emf;
    
    protected EntityManager getEntityManager()
    {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("FuelStationManagerPU");
        }
        
        return emf.createEntityManager();
    }
    
    protected void beginTransaction()
    {
        this.getEntityManager().getTransaction().begin();
    }
    
    protected void endTransaction()
    {
        this.getEntityManager().getTransaction().commit();
        this.getEntityManager().close();
    }
}
