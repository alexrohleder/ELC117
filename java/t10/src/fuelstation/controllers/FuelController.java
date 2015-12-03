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
        if (this.view.getFuelTable().getSelectedRow() == -1) {
            this.view.getFuelError().setText("antes de alterar um combustivel você seleciona-lo na tabela.");
        } else {
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

                    this.model.update(fuel);
                    this.reloadFuelTable();
                } catch (SQLException e) {
                    this.view.getFuelError().setText(e.toString());
                }
            }
        }
    }

    @Override
    public void remove() {
        if (this.view.getFuelTable().getSelectedRow() == -1) {
            this.view.getFuelError().setText("antes de remover um combustivel você seleciona-lo na tabela.");
        } else {
            try {
                this.model.delete(this.view.getFuelTableSelectedId());
                this.reloadFuelTable();
            } catch (SQLException e) {
                this.view.getFuelError().setText(e.toString());
            }
        }
    }

    @Override
    public void clear() {
        this.view.getFuelDateField().setText("");
        this.view.getFuelPriceField().setText("");
    }
    
    private boolean checkForNullFields()
    {
        return this.view.getFuelStationField().getSelectedIndex() == -1
                || this.view.getFuelDateField().getText().equals("")
                || this.view.getFuelPriceField().getText().equals("");
    }
    
    private void reloadFuelTable()
    {
        this.view.getFuelTable().setModel(new FuelTableModel());
    }
}
