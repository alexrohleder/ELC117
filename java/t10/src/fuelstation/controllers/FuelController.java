package fuelstation.controllers;

import fuelstation.database.models.Fuel;
import fuelstation.database.models.FuelTableModel;
import fuelstation.views.MainView;

public class FuelController extends AbstractController<Fuel>
{
    private MainView view;
    private FuelTableModel model;
    
    public FuelController(MainView view, FuelTableModel model)
    {
        this.view = view;
        this.model = model;
    }
    
    @Override
    public void insert()
    {
        Fuel fuel = make();
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
    
    public Fuel make()
    {
        try {
            Fuel fuel = new Fuel();
                 fuel.setType(view.getFuelTypeField().getSelectedItem().toString());
                 fuel.setPrice(Float.parseFloat(view.getFuelPriceField().getText()));
            return fuel;
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
