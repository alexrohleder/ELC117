package fuelstation.controllers;

import fuelstation.database.models.FuelTableModel;
import fuelstation.database.models.domain.Fuel;
import fuelstation.database.models.dao.FuelDao;
import fuelstation.database.models.domain.Station;
import fuelstation.views.ApplicationView;
import java.sql.SQLException;

public class FuelController extends AbstractController<FuelDao>
{
    private ApplicationView view;
    private FuelDao model;
    
    public FuelController(ApplicationView view)
    {
        this.model = new FuelDao();
        this.view  = view;
    }
    
    @Override
    public void insert()
    {
        if (checkForNullFields()) {
            this.view.getFuelError().setText("nenhum campo pode estar vazio.");
        } else {
            try {
                Station station = (Station) this.view.getFuelStationField().getSelectedItem();
                Fuel fuel = new Fuel(
                        null,
                        station.getId(),
                        this.view.getFuelTypeField().getSelectedItem().toString(),
                        this.view.getFuelPriceField().getText(),
                        this.view.getFuelDateField().getText()
                );

                this.model.create(fuel);
                this.clear();
                this.reloadFuelTable();
            } catch (SQLException e) {
                this.view.getFuelError().setText(e.toString());
            }
        }
    }

    @Override
    public void update() {
    
    }

    @Override
    public void remove() {
        
    }

    @Override
    public void clear() {
        this.view.getFuelDateField().setText("");
        this.view.getFuelPriceField().setText("");
    }
    
    private boolean checkForNullFields()
    {
        return this.view.getFuelDateField().getText().equals("")
                || this.view.getFuelPriceField().getText().equals("");
    }
    
    private void reloadFuelTable()
    {
        this.view.getFuelTable().setModel(new FuelTableModel());
    }
}
