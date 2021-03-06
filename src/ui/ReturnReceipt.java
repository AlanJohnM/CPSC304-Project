/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alansmacbook
 */

package ui;


import database.DataBaseHandler;
import exceptions.InputException;

public class ReturnReceipt extends javax.swing.JFrame {

    DataBaseHandler database;

    /**
     * Creates new form ReturnReceipt
     */
    public ReturnReceipt(DataBaseHandler db, String rentid, String date, String odometer, String gas) throws InputException {
        initComponents();
        //db.query to prove existence, if not then throw here
        //do db stuff to fix statuses and stuff, and get additional data needed
        database = db;
        if (rentid.equals("") || date.equals("") || odometer.equals("") || gas.equals("")) {throw new InputException("Missing inputs!");}

        String[] receiptInfo = db.handleReturn(Integer.parseInt(rentid), date, Integer.parseInt(odometer), Boolean.parseBoolean(gas));

        RRRID.setText(receiptInfo[0]);
        RRRDATE.setText(receiptInfo[1]);
        RRVehicleType.setText(receiptInfo[2]);
        RRKMRate.setText(receiptInfo[3]);
        RROdometerDiff.setText(receiptInfo[4]);
        RRTankFee.setText(receiptInfo[5]);
        RRCalculation.setText(receiptInfo[6]);
        RRTOTAL.setText(receiptInfo[7]);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        RRRID = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        RRRDATE = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        RRTOTAL = new javax.swing.JLabel();
        RRClose = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        RRVehicleType = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        RRKMRate = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        RROdometerDiff = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        RRTankFee = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        RRCalculation = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("Return Receipt");

        jLabel2.setText("Rent ID");

        RRRID.setText("<RID>");

        jLabel4.setText("Return Date");

        RRRDATE.setText("<RDATE>");

        jLabel20.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel20.setText("Total Cost");

        RRTOTAL.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        RRTOTAL.setText("<TOTAL>");

        RRClose.setText("Close");
        RRClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RRCloseActionPerformed(evt);
            }
        });

        jLabel7.setText("Vehicle Type");

        RRVehicleType.setText("<RTIME>");

        jLabel9.setText("KM Rate");

        RRKMRate.setText("<RTIME>");

        jLabel11.setText("Odometer Difference");

        RROdometerDiff.setText("<RTIME>");

        jLabel12.setText("Gas Tank Fee");

        RRTankFee.setText("<RTIME>");

        jLabel15.setText("Calculation");

        RRCalculation.setText("<CALC>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabel11)
                                                        .addComponent(jLabel12)
                                                        .addComponent(jLabel15)
                                                        .addComponent(RRCalculation))
                                                .addGap(38, 38, 38)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(RRRID)
                                                        .addComponent(RRRDATE)
                                                        .addComponent(RRVehicleType)
                                                        .addComponent(RRKMRate)
                                                        .addComponent(RROdometerDiff)
                                                        .addComponent(RRTankFee)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(32, 32, 32))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(RRTOTAL, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(jLabel20)
                                                                .addGap(98, 98, 98))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(RRClose)
                                                                .addGap(44, 44, 44)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(RRRID))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(RRRDATE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(RRVehicleType))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(RRKMRate))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(RROdometerDiff))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12)
                                        .addComponent(RRTankFee))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RRCalculation)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel20)
                                        .addComponent(RRTOTAL))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RRClose)
                                .addGap(156, 156, 156))
        );

        pack();
    }// </editor-fold>

    private void RRCloseActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }


    // Variables declaration - do not modify
    private javax.swing.JLabel RRCalculation;
    private javax.swing.JButton RRClose;
    private javax.swing.JLabel RRKMRate;
    private javax.swing.JLabel RROdometerDiff;
    private javax.swing.JLabel RRRDATE;
    private javax.swing.JLabel RRRID;
    private javax.swing.JLabel RRTOTAL;
    private javax.swing.JLabel RRTankFee;
    private javax.swing.JLabel RRVehicleType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration
}
