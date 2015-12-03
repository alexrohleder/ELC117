package fuelstation.controllers;

import fuelstation.database.models.Station;
import fuelstation.database.models.StationTableModel;
import fuelstation.views.ApplicationView;

public class StationController extends AbstractController
{
    private ApplicationView view;
    private StationTableModel model;
    
    public StationController(ApplicationView view, StationTableModel model)
    {
        this.view = view;
        this.model = model;
    }
    
    @Override
    public void insert() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void select() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void search() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Station make()
    {
        try {
            Station station = new Station();
            // ...
            return station;
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
