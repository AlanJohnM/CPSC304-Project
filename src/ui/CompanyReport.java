
package ui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alansmacbook
 */
public class CompanyReport extends javax.swing.JFrame {

    /**
     * Creates new form ReportTemplate
     */
    public CompanyReport() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        ReportLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DetailsTable = new javax.swing.JTable();
        CloseReport = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TypeCountTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        LocationCountTable = new javax.swing.JTable();
        TotalTransactions = new javax.swing.JLabel();
        TotalRevenue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ReportLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        ReportLabel.setText("Company Report");

        DetailsTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null, null, null}
                },
                new String [] {
                        "RID", "License Plate", "V. Type", "Drivers Licence", "From", "To", "Odometer", "Card #", "Card Name", "Expiration", "Location", "City", "Conf. Number"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(DetailsTable);
        if (DetailsTable.getColumnModel().getColumnCount() > 0) {
            DetailsTable.getColumnModel().getColumn(0).setResizable(false);
            DetailsTable.getColumnModel().getColumn(1).setResizable(false);
            DetailsTable.getColumnModel().getColumn(2).setResizable(false);
            DetailsTable.getColumnModel().getColumn(3).setResizable(false);
            DetailsTable.getColumnModel().getColumn(4).setResizable(false);
            DetailsTable.getColumnModel().getColumn(5).setResizable(false);
            DetailsTable.getColumnModel().getColumn(6).setResizable(false);
            DetailsTable.getColumnModel().getColumn(7).setResizable(false);
            DetailsTable.getColumnModel().getColumn(8).setResizable(false);
            DetailsTable.getColumnModel().getColumn(9).setResizable(false);
            DetailsTable.getColumnModel().getColumn(10).setResizable(false);
            DetailsTable.getColumnModel().getColumn(11).setResizable(false);
            DetailsTable.getColumnModel().getColumn(12).setResizable(false);
        }

        CloseReport.setText("Close");
        CloseReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseReportActionPerformed(evt);
            }
        });

        TypeCountTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null}
                },
                new String [] {
                        "Vehicle Type", "Count", "Revenue"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TypeCountTable);
        if (TypeCountTable.getColumnModel().getColumnCount() > 0) {
            TypeCountTable.getColumnModel().getColumn(0).setResizable(false);
            TypeCountTable.getColumnModel().getColumn(1).setResizable(false);
            TypeCountTable.getColumnModel().getColumn(2).setResizable(false);
        }

        LocationCountTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Location", "City", "Count", "Revenue"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(LocationCountTable);
        if (LocationCountTable.getColumnModel().getColumnCount() > 0) {
            LocationCountTable.getColumnModel().getColumn(0).setResizable(false);
            LocationCountTable.getColumnModel().getColumn(1).setResizable(false);
            LocationCountTable.getColumnModel().getColumn(2).setResizable(false);
            LocationCountTable.getColumnModel().getColumn(3).setResizable(false);
        }

        TotalTransactions.setText("Total <TYPE>: <NUMBER>");

        TotalRevenue.setText("<TOTAL REVENUE>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(ReportLabel)
                                                .addGap(322, 322, 322))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(TotalTransactions)
                                                                        .addComponent(TotalRevenue))
                                                                .addGap(24, 24, 24)))
                                                .addContainerGap())))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CloseReport)
                                .addGap(354, 354, 354))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ReportLabel)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(65, 65, 65)
                                                .addComponent(TotalTransactions)
                                                .addGap(28, 28, 28)
                                                .addComponent(TotalRevenue)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CloseReport)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void CloseReportActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }


    // Variables declaration - do not modify
    private javax.swing.JButton CloseReport;
    private javax.swing.JTable DetailsTable;
    private javax.swing.JTable LocationCountTable;
    private javax.swing.JLabel ReportLabel;
    private javax.swing.JLabel TotalRevenue;
    private javax.swing.JLabel TotalTransactions;
    private javax.swing.JTable TypeCountTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration
}
