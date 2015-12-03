package fuelstation.controllers;

import javax.swing.table.AbstractTableModel;
import fuelstation.views.ApplicationView;

public abstract class AbstractController<Model>
{
    private ApplicationView view;
    private Model model;

    public ApplicationView getView() {
        return view;
    }

    public void setView(ApplicationView view) {
        this.view = view;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }
    
    public abstract void insert();
    public abstract void update();
    public abstract void remove();
    public abstract void clear();
}
