package fuelstation.controllers;

import fuelstation.database.models.StationTableModel;
import fuelstation.views.MainView;

public class StationController extends AbstractController
{
    private MainView view;
    private StationTableModel model;
    
    public StationController(MainView view, StationTableModel model)
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
}
