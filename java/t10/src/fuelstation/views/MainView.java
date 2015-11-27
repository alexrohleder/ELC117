package fuelstation.views;

import fuelstation.controllers.FuelController;
import fuelstation.controllers.StationController;
import fuelstation.database.models.FlagListModel;
import fuelstation.database.models.FuelListModel;
import fuelstation.database.models.FuelTableModel;
import fuelstation.database.models.Station;
import fuelstation.database.models.StationListModel;
import fuelstation.database.models.StationTableModel;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MainView extends javax.swing.JFrame 
{
    private StationTableModel stationTableModel;
    private StationController stationController;
    private FuelTableModel fuelTableModel;
    private FuelController fuelController;
    
    public MainView() {
        initComponents();

        stationTableModel = new StationTableModel();
        stationController = new StationController(this, stationTableModel);
        StationTable.setModel(stationTableModel);
        StationFlagField.setModel(new FlagListModel());
        
        fuelTableModel = new FuelTableModel();
        fuelController = new FuelController(this, fuelTableModel);
        FuelTable.setModel(fuelTableModel);
        FuelStationField.setModel(new StationListModel());
        FuelTypeField.setModel(new FuelListModel());
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabs = new javax.swing.JTabbedPane();
        StationTab = new javax.swing.JPanel();
        StationCnpjLabel = new javax.swing.JLabel();
        StationNameLabel = new javax.swing.JLabel();
        StationCompanyLabel = new javax.swing.JLabel();
        StationFlagLabel = new javax.swing.JLabel();
        StationAddressLabel = new javax.swing.JLabel();
        StationCepLabel = new javax.swing.JLabel();
        StationImageLabel = new javax.swing.JLabel();
        StationCnpjField = new javax.swing.JFormattedTextField(fuelstation.views.helpers.FieldMask.getMaskFormatter("##.###.###/####-##"));
        StationNameField = new javax.swing.JTextField();
        StationCompanyField = new javax.swing.JTextField();
        StationFlagField = new javax.swing.JComboBox();
        StationAddressField = new javax.swing.JTextField();
        StationCepField = new javax.swing.JFormattedTextField(fuelstation.views.helpers.FieldMask.getMaskFormatter("##.###-###"));
        StationImageField = new javax.swing.JTextField();
        StationInsertButton = new javax.swing.JButton();
        StationRemoveButton = new javax.swing.JButton();
        StationUpdateButton = new javax.swing.JButton();
        StationClearButton = new javax.swing.JButton();
        StationSearchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        StationTable = new javax.swing.JTable();
        FuelTab = new javax.swing.JPanel();
        FuelStationLabel = new javax.swing.JLabel();
        FuelTypeLabel = new javax.swing.JLabel();
        FuelPriceLabel = new javax.swing.JLabel();
        FuelDateLabel = new javax.swing.JLabel();
        FuelStationField = new javax.swing.JComboBox();
        FuelTypeField = new javax.swing.JComboBox();
        FuelPriceField = new javax.swing.JFormattedTextField(fuelstation.views.helpers.FieldMask.getMaskFormatter("R$##,###"));
        FuelDateField = new javax.swing.JFormattedTextField(fuelstation.views.helpers.FieldMask.getMaskFormatter("##/##/####"));
        FuelInsertButton = new javax.swing.JButton();
        FuelRemoveButton = new javax.swing.JButton();
        FuelUpdateButton = new javax.swing.JButton();
        FuelClearButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        FuelTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        StationTab.setBackground(new java.awt.Color(255, 255, 255));

        StationCnpjLabel.setText("cnpj");

        StationNameLabel.setText("nome social");

        StationCompanyLabel.setText("nome fantasia");

        StationFlagLabel.setText("bandeira");

        StationAddressLabel.setText("endereço");

        StationCepLabel.setText("cep");

        StationImageLabel.setText("imagem");

        StationFlagField.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        StationImageField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                StationImageFieldFocusGained(evt);
            }
        });

        StationInsertButton.setText("inserir");
        StationInsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StationInsertButtonActionPerformed(evt);
            }
        });

        StationRemoveButton.setText("remover");
        StationRemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StationRemoveButtonActionPerformed(evt);
            }
        });

        StationUpdateButton.setText("alterar");
        StationUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StationUpdateButtonActionPerformed(evt);
            }
        });

        StationClearButton.setText("limpar");
        StationClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StationClearButtonActionPerformed(evt);
            }
        });

        StationSearchButton.setText("pesquisar");
        StationSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StationSearchButtonActionPerformed(evt);
            }
        });

        StationTable.setModel(new javax.swing.table.DefaultTableModel(
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
        StationTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StationTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(StationTable);

        javax.swing.GroupLayout StationTabLayout = new javax.swing.GroupLayout(StationTab);
        StationTab.setLayout(StationTabLayout);
        StationTabLayout.setHorizontalGroup(
            StationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StationTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, StationTabLayout.createSequentialGroup()
                        .addGroup(StationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StationCompanyLabel)
                            .addComponent(StationFlagLabel)
                            .addComponent(StationAddressLabel)
                            .addComponent(StationCepLabel)
                            .addComponent(StationImageLabel))
                        .addGap(7, 7, 7)
                        .addGroup(StationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StationAddressField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(StationCompanyField)
                            .addComponent(StationFlagField, 0, 314, Short.MAX_VALUE)
                            .addComponent(StationCepField)
                            .addComponent(StationImageField, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, StationTabLayout.createSequentialGroup()
                        .addGroup(StationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StationNameLabel)
                            .addComponent(StationCnpjLabel))
                        .addGap(20, 20, 20)
                        .addGroup(StationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StationNameField)
                            .addComponent(StationCnpjField)))
                    .addGroup(StationTabLayout.createSequentialGroup()
                        .addComponent(StationClearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StationSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StationUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StationRemoveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StationInsertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        StationTabLayout.setVerticalGroup(
            StationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StationTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StationCnpjLabel)
                    .addComponent(StationCnpjField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(StationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StationNameLabel)
                    .addComponent(StationNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(StationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StationCompanyLabel)
                    .addComponent(StationCompanyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(StationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StationFlagLabel)
                    .addComponent(StationFlagField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(StationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StationAddressLabel)
                    .addComponent(StationAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(StationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StationCepLabel)
                    .addComponent(StationCepField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(StationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StationImageLabel)
                    .addComponent(StationImageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(StationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StationInsertButton)
                    .addComponent(StationRemoveButton)
                    .addComponent(StationUpdateButton)
                    .addComponent(StationClearButton)
                    .addComponent(StationSearchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("Postos", StationTab);

        FuelTab.setBackground(new java.awt.Color(255, 255, 255));

        FuelStationLabel.setText("posto");

        FuelTypeLabel.setText("tipo");

        FuelPriceLabel.setText("preço");

        FuelDateLabel.setText("coleta");

        FuelStationField.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        FuelTypeField.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        FuelInsertButton.setText("inserir");
        FuelInsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuelInsertButtonActionPerformed(evt);
            }
        });

        FuelRemoveButton.setText("remover");
        FuelRemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuelRemoveButtonActionPerformed(evt);
            }
        });

        FuelUpdateButton.setText("alterar");
        FuelUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuelUpdateButtonActionPerformed(evt);
            }
        });

        FuelClearButton.setText("limpar");
        FuelClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuelClearButtonActionPerformed(evt);
            }
        });

        jButton2.setText("pesquisar");
        jButton2.setEnabled(false);

        FuelTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(FuelTable);

        javax.swing.GroupLayout FuelTabLayout = new javax.swing.GroupLayout(FuelTab);
        FuelTab.setLayout(FuelTabLayout);
        FuelTabLayout.setHorizontalGroup(
            FuelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FuelTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FuelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                    .addGroup(FuelTabLayout.createSequentialGroup()
                        .addGroup(FuelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FuelPriceLabel)
                            .addComponent(FuelDateLabel)
                            .addComponent(FuelTypeLabel))
                        .addGap(8, 8, 8)
                        .addGroup(FuelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FuelPriceField)
                            .addComponent(FuelTypeField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FuelDateField, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FuelTabLayout.createSequentialGroup()
                        .addComponent(FuelClearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FuelUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FuelRemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FuelInsertButton))
                    .addGroup(FuelTabLayout.createSequentialGroup()
                        .addComponent(FuelStationLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FuelStationField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        FuelTabLayout.setVerticalGroup(
            FuelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FuelTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FuelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FuelStationLabel)
                    .addComponent(FuelStationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FuelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FuelTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FuelTypeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FuelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FuelPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FuelPriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(FuelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FuelDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FuelDateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FuelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FuelInsertButton)
                    .addComponent(FuelRemoveButton)
                    .addComponent(FuelUpdateButton)
                    .addComponent(jButton2)
                    .addComponent(FuelClearButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabs.addTab("Combustiveís", FuelTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabs)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabs)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StationInsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StationInsertButtonActionPerformed
        stationController.insert();
    }//GEN-LAST:event_StationInsertButtonActionPerformed

    private void StationRemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StationRemoveButtonActionPerformed
        stationController.remove();
    }//GEN-LAST:event_StationRemoveButtonActionPerformed

    private void StationUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StationUpdateButtonActionPerformed
        stationController.update();
    }//GEN-LAST:event_StationUpdateButtonActionPerformed

    private void StationClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StationClearButtonActionPerformed
        stationController.clear();
    }//GEN-LAST:event_StationClearButtonActionPerformed

    private void FuelInsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FuelInsertButtonActionPerformed
        fuelController.insert();
    }//GEN-LAST:event_FuelInsertButtonActionPerformed

    private void FuelRemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FuelRemoveButtonActionPerformed
        fuelController.remove();
    }//GEN-LAST:event_FuelRemoveButtonActionPerformed

    private void FuelUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FuelUpdateButtonActionPerformed
        fuelController.update();
    }//GEN-LAST:event_FuelUpdateButtonActionPerformed

    private void FuelClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FuelClearButtonActionPerformed
        fuelController.clear();
    }//GEN-LAST:event_FuelClearButtonActionPerformed

    private void StationTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StationTableMouseClicked
        Station station = (Station) StationTable.getValueAt(StationTable.getSelectedRow(), -1);
        new StationView(this, false, station, stationController).setVisible(true);
    }//GEN-LAST:event_StationTableMouseClicked

    private void StationSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StationSearchButtonActionPerformed
        stationController.search();
    }//GEN-LAST:event_StationSearchButtonActionPerformed

    private void StationImageFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_StationImageFieldFocusGained
        if (StationImageField.getText().equals("")) {
            JFileChooser fc = new JFileChooser();
            fc.setFileFilter(new FileNameExtensionFilter("Image Files", ImageIO.getReaderFileSuffixes()));
            if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                StationImageField.setText(file.getPath());
            }
        }
    }//GEN-LAST:event_StationImageFieldFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FuelClearButton;
    private javax.swing.JFormattedTextField FuelDateField;
    private javax.swing.JLabel FuelDateLabel;
    private javax.swing.JButton FuelInsertButton;
    private javax.swing.JFormattedTextField FuelPriceField;
    private javax.swing.JLabel FuelPriceLabel;
    private javax.swing.JButton FuelRemoveButton;
    private javax.swing.JComboBox FuelStationField;
    private javax.swing.JLabel FuelStationLabel;
    private javax.swing.JPanel FuelTab;
    private javax.swing.JTable FuelTable;
    private javax.swing.JComboBox FuelTypeField;
    private javax.swing.JLabel FuelTypeLabel;
    private javax.swing.JButton FuelUpdateButton;
    private javax.swing.JTextField StationAddressField;
    private javax.swing.JLabel StationAddressLabel;
    private javax.swing.JFormattedTextField StationCepField;
    private javax.swing.JLabel StationCepLabel;
    private javax.swing.JButton StationClearButton;
    private javax.swing.JFormattedTextField StationCnpjField;
    private javax.swing.JLabel StationCnpjLabel;
    private javax.swing.JTextField StationCompanyField;
    private javax.swing.JLabel StationCompanyLabel;
    private javax.swing.JComboBox StationFlagField;
    private javax.swing.JLabel StationFlagLabel;
    private javax.swing.JTextField StationImageField;
    private javax.swing.JLabel StationImageLabel;
    private javax.swing.JButton StationInsertButton;
    private javax.swing.JTextField StationNameField;
    private javax.swing.JLabel StationNameLabel;
    private javax.swing.JButton StationRemoveButton;
    private javax.swing.JButton StationSearchButton;
    private javax.swing.JPanel StationTab;
    private javax.swing.JTable StationTable;
    private javax.swing.JButton StationUpdateButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane tabs;
    // End of variables declaration//GEN-END:variables

    public JComboBox getFuelStationField() {
        return FuelStationField;
    }
    
    public JComboBox getFuelTypeField() {
        return FuelTypeField;
    }
    
    public JFormattedTextField getFuelDateField() {
        return FuelDateField;
    }

    public JFormattedTextField getFuelPriceField() {
        return FuelPriceField;
    }

    public JTextField getStationAddressField() {
        return StationAddressField;
    }

    public JFormattedTextField getStationCepField() {
        return StationCepField;
    }

    public JFormattedTextField getStationCnpjField() {
        return StationCnpjField;
    }

    public JTextField getStationCompanyField() {
        return StationCompanyField;
    }

    public JComboBox getStationFlagField() {
        return StationFlagField;
    }

    public JTextField getStationImageField() {
        return StationImageField;
    }

    public JTextField getStationNameField() {
        return StationNameField;
    }
}
