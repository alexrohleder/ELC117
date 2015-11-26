package fuelstation.views;

public class MainView extends javax.swing.JFrame 
{
    public MainView() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        StationTable = new javax.swing.JTable();
        FuelTab = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        StationTab.setBackground(new java.awt.Color(255, 255, 255));

        StationCnpjLabel.setText("cnpj");

        StationNameLabel.setText("nome social");

        StationCompanyLabel.setText("nome fantasia");

        StationFlagLabel.setText("bandeira");

        StationAddressLabel.setText("endereço");

        StationCepLabel.setText("cep");

        StationImageLabel.setText("imagem");

        StationFlagField.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        StationInsertButton.setText("inserir");

        StationRemoveButton.setText("remover");

        StationUpdateButton.setText("alterar");

        StationClearButton.setText("limpar");

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
        jScrollPane1.setViewportView(StationTable);

        javax.swing.GroupLayout StationTabLayout = new javax.swing.GroupLayout(StationTab);
        StationTab.setLayout(StationTabLayout);
        StationTabLayout.setHorizontalGroup(
            StationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StationTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StationTabLayout.createSequentialGroup()
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
                            .addComponent(StationFlagField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(StationCepField)
                            .addComponent(StationImageField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StationTabLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(StationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StationTabLayout.createSequentialGroup()
                                .addComponent(StationClearButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(StationUpdateButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(StationRemoveButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(StationInsertButton))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(StationTabLayout.createSequentialGroup()
                        .addGroup(StationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StationNameLabel)
                            .addComponent(StationCnpjLabel))
                        .addGap(20, 20, 20)
                        .addGroup(StationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StationNameField)
                            .addComponent(StationCnpjField))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(StationTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StationInsertButton)
                    .addComponent(StationRemoveButton)
                    .addComponent(StationUpdateButton)
                    .addComponent(StationClearButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("Postos", StationTab);

        javax.swing.GroupLayout FuelTabLayout = new javax.swing.GroupLayout(FuelTab);
        FuelTab.setLayout(FuelTabLayout);
        FuelTabLayout.setHorizontalGroup(
            FuelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );
        FuelTabLayout.setVerticalGroup(
            FuelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );

        tabs.addTab("Combustiveís", FuelTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tabs)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tabs)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FuelTab;
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
    private javax.swing.JPanel StationTab;
    private javax.swing.JTable StationTable;
    private javax.swing.JButton StationUpdateButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane tabs;
    // End of variables declaration//GEN-END:variables
}
