package fuelstation.controllers;

import fuelstation.database.models.StationListModel;
import fuelstation.database.models.StationTableModel;
import fuelstation.database.models.domain.Station;
import fuelstation.database.models.dao.StationDao;
import fuelstation.views.ApplicationView;
import java.sql.SQLException;

public class StationController extends AbstractController<StationDao>
{
    private ApplicationView view;
    private StationDao model;
    
    public StationController(ApplicationView view)
    {
        this.view = view;
        this.model = new StationDao();
    }
    
    @Override
    public void insert() {
        if (checkForNullFields()) {
            this.view.getStationError().setText("nenhum campo pode estar vazio.");
        } else {
            try {
                Station station = new Station(
                    null,
                    this.view.getStationCnpjField().getText(),
                    this.view.getStationNameField().getText(),
                    this.view.getStationCompanyField().getText(),
                    this.view.getStationFlagField().getSelectedItem().toString(),
                    this.view.getStationAddressField().getText(),
                    this.view.getStationCepField().getText(),
                    this.view.getStationImageField().getText()
                );

                this.model.create(station);
                this.clear();
                this.reloadStationTable();
                this.reloadFuelStationList();
            } catch (SQLException e) {
                this.view.getStationError().setText(e.toString());
            }
        }
    }

    @Override
    public void update() {
        if (this.view.getStationTable().getSelectedRow() == -1) {
            this.view.getStationError().setText("antes de alterar um posto você seleciona-lo na tabela.");
        } else {
            if (checkForNullFields()) {
                this.view.getStationError().setText("nenhum campo pode estar vazio.");
            } else {
                try {
                    Station station = new Station(
                        this.view.getStationTableSelectedId(),
                        this.view.getStationCnpjField().getText(),
                        this.view.getStationNameField().getText(),
                        this.view.getStationCompanyField().getText(),
                        this.view.getStationFlagField().getSelectedItem().toString(),
                        this.view.getStationAddressField().getText(),
                        this.view.getStationCepField().getText(),
                        this.view.getStationImageField().getText()
                    );

                    this.model.update(station);
                    this.reloadStationTable();
                    this.reloadFuelStationList();
                } catch (SQLException e) {
                    this.view.getStationError().setText(e.toString());
                }
            }
        }
    }

    @Override
    public void remove() {
        if (this.view.getStationTable().getSelectedRow() == -1) {
            this.view.getStationError().setText("antes de remover um posto você seleciona-lo na tabela.");
        } else {
            try {
                this.model.delete(this.view.getStationTableSelectedId());
                this.reloadStationTable();
                this.reloadFuelStationList();
            } catch (SQLException e) {
                this.view.getStationError().setText(e.toString());
            }
        }
    }

    @Override
    public void clear() {
        this.view.getStationCnpjField().setText("");
        this.view.getStationNameField().setText("");
        this.view.getStationCompanyField().setText("");
        this.view.getStationAddressField().setText("");
        this.view.getStationCepField().setText("");
        this.view.getStationImageField().setText("");
        this.view.getStationTable().setModel(new StationTableModel());
    }

    public void search() {
        if (this.view.getStationAddressField().getText().equals("")) {
            this.view.getStationError().setText("Você deve preencher o campo endereço.");
        } else {
            try {
                this.view.getStationTable().setModel(
                        new StationTableModel(
                            this.model.find(this.view.getStationAddressField().getText())
                        )
                );
            } catch (SQLException e) {
                this.view.getStationError().setText(e.toString());
            }
        }
    }
    
    private boolean checkForNullFields()
    {
        return this.view.getStationCnpjField().getText().equals("")
                || this.view.getStationNameField().getText().equals("")
                || this.view.getStationCompanyField().getText().equals("")
                || this.view.getStationAddressField().getText().equals("")
                || this.view.getStationImageField().getText().equals("");
    }
    
    private void reloadStationTable()
    {
        this.view.getStationTable().setModel(new StationTableModel());
    }

    private void reloadFuelStationList() {
        this.view.getFuelStationField().setModel(new StationListModel());
    }
}
