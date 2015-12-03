package fuelstation.controllers;

import javax.swing.table.AbstractTableModel;
import fuelstation.views.ApplicationView;

public abstract class AbstractController<Model>
{
    private ApplicationView view;
    private AbstractTableModel model;

    public ApplicationView getView() {
        return view;
    }

    public void setView(ApplicationView view) {
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
    public abstract void clear();
    public abstract Model make();
}
