package fuelstation.controllers;

import javax.swing.table.AbstractTableModel;
import fuelstation.views.MainView;

public abstract class AbstractController
{
    private MainView view;
    private AbstractTableModel model;

    public MainView getView() {
        return view;
    }

    public void setView(MainView view) {
        this.view = view;
    }

    public AbstractTableModel getModel() {
        return model;
    }

    public void setModel(AbstractTableModel model) {
        this.model = model;
    }
    
    public abstract void insert();
    public abstract void update();
    public abstract void remove();
    public abstract void select();
}
