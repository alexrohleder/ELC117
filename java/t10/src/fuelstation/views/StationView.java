package fuelstation.views;

import fuelstation.controllers.StationController;
import fuelstation.database.models.FuelTableModel;
import fuelstation.database.models.dao.FuelDao;
import fuelstation.database.models.domain.Station;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import java.awt.Frame;
import java.awt.Image;
import java.sql.SQLException;

public class StationView extends JDialog
{
    private Frame frame;
    private StationController controller;
    private Station station;

    public StationView(Frame parent, boolean modal, Station station, StationController controller) {
        super(parent, modal);
        
        this.frame = parent;
        this.controller = controller;
        this.station = station;
        
        initComponents();
        
        try {
            ImageIcon image = new ImageIcon(station.getImage());
            Image resized = image.getImage().getScaledInstance(
                    StationImageField.getWidth(), 
                    StationImageField.getHeight(), 
                    java.awt.Image.SCALE_SMOOTH
            );
            StationImageField.setIcon(new ImageIcon(resized));
        } catch (Exception e) {
            // ...
        } finally {
            StationNameField.setText(station.getName());
            
            try {
                StationFuelTable.setModel(
                        new FuelTableModel(
                                new FuelDao().where("id_station = " + station.getId())
                        )
                );
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StationImageField = new javax.swing.JLabel();
        StationNameField = new javax.swing.JButton();
        StationGraphButton = new javax.swing.JButton();
        StationMapButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        StationFuelTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        StationImageField.setBackground(new java.awt.Color(51, 51, 51));
        StationImageField.setMaximumSize(new java.awt.Dimension(120, 120));
        StationImageField.setMinimumSize(new java.awt.Dimension(120, 120));
        StationImageField.setPreferredSize(new java.awt.Dimension(120, 120));

        StationNameField.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        StationNameField.setEnabled(false);

        StationGraphButton.setText("ver gráfico");
        StationGraphButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StationGraphButtonActionPerformed(evt);
            }
        });

        StationMapButton.setText("ver no maps");
        StationMapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StationMapButtonActionPerformed(evt);
            }
        });

        StationFuelTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(StationFuelTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StationImageField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(StationNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StationGraphButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StationMapButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StationImageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StationMapButton)
                    .addComponent(StationNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StationGraphButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StationGraphButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StationGraphButtonActionPerformed
        
    }//GEN-LAST:event_StationGraphButtonActionPerformed

    private void StationMapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StationMapButtonActionPerformed
        
    }//GEN-LAST:event_StationMapButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable StationFuelTable;
    private javax.swing.JButton StationGraphButton;
    private javax.swing.JLabel StationImageField;
    private javax.swing.JButton StationMapButton;
    private javax.swing.JButton StationNameField;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
