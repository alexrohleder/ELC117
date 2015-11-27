package fuelstation.views;

import fuelstation.controllers.StationController;
import fuelstation.database.models.Station;
import javax.swing.JDialog;
import java.awt.Frame;
import javax.swing.ImageIcon;

public class StationView extends JDialog
{
    private StationController controller;
    private Station station;
    
    public StationView(Frame parent, boolean modal, Station station, StationController controller) {
        super(parent, modal);
        
        this.controller = controller;
        this.station = station;
        
        initComponents();
        initImage();
    }
    
    private void initImage()
    {
        try {
            image.setIcon(new ImageIcon(station.getImage()));
        } catch (Exception e) {
            // ...
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image)
                .addContainerGap(390, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image)
                .addContainerGap(289, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel image;
    // End of variables declaration//GEN-END:variables
}
