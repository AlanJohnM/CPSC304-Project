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
import model.Reservation;

public class Rental extends javax.swing.JFrame {


    DataBaseHandler database;
    String name;
    String dlicense;
    String type;
    String loc;
    String pdate;
    String ptime;
    String rdate;
    String rtime;
    String rid;
    String cardNo;
    String cardExp;
    String cardType;
    Reservation r;


    /**
     * Creates new form Rental
     */
    public Rental(DataBaseHandler db, String name, String dlicense, String type, String loc, String pdate, String ptime, String rdate, String rtime, String rid) {
        database = db;
        initComponents();
        this.name = name.trim();
        this.dlicense = dlicense.trim();
        this.type = type.trim();
        this.loc = loc.trim();
        this.pdate = pdate.trim();
        this.ptime = ptime.trim();
        this.rdate = rdate.trim();
        this.rtime = rtime.trim();
        this.rid = rid.trim();
        setValues();
        this.setVisible(true);
    }

    private void setValues() {
        RDName.setText(this.name);
        RDDLicense.setText(this.dlicense);
        RDType.setText(this.type);
        RDLocation.setText(this.loc);
        RDPDATE.setText(this.pdate);
        RDPTime.setText(this.ptime);
        RDRDate.setText(this.rdate);
        RDRTIME.setText(this.rtime);
        RDRID.setText(this.rid);
    }

    public Rental(DataBaseHandler db, String confNo, String location) {
        database = db;
        initComponents();
        try {
            Reservation r = db.findReservation(Integer.valueOf(confNo));
            this.r = r;
            System.out.println(r);
            this.name = "";
            this.type = r.getVtname();
            this.dlicense = r.getDlicense();
            System.out.println(dlicense);
            String[] pdatetime = String.valueOf(r.getFromDate()).split(" ");
            this.pdate = pdatetime[0];
            this.ptime = pdatetime[1];
            String[] rdatetime = String.valueOf(r.getToDate()).split(" ");
            this.rdate = rdatetime[0];
            this.rtime = rdatetime[1];
            this.loc = location;
            this.rid = String.valueOf(db.currRent);
            setValues();
            jLabel2.setText("");
        } catch (InputException e) {
            ErrorTemplate er = new ErrorTemplate("No Reservation Found!");
        }
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RDName = new javax.swing.JLabel();
        RDDLicense = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        RDType = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        RDLocation = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        RDPDATE = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        RDPTime = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        RDRDate = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        RDRID = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        RDRTIME = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        CreditCardNumberIO = new javax.swing.JTextField();
        CreditCardExpIO = new javax.swing.JTextField();
        ConfirmRentalButton = new javax.swing.JButton();
        RentalCreditCard = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Rental Details");

        jLabel2.setText("Name");

        jLabel3.setText("Drivers Licence");

        RDName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        RDName.setText("<NAME>");

        RDDLicense.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        RDDLicense.setText("<DLICENSE>");

        jLabel8.setText("Car Type");

        RDType.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        RDType.setText("<TYPE>");

        jLabel9.setText("Location");

        RDLocation.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        RDLocation.setText("<LOCATION>");

        jLabel10.setText("Pickup Date");

        RDPDATE.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        RDPDATE.setText("<PDATE>");

        jLabel11.setText("Pickup Time");

        RDPTime.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        RDPTime.setText("<PTIME>");

        jLabel12.setText("Return Date");

        RDRDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        RDRDate.setText("<RDATE>");

        jLabel4.setText("Rental ID");

        RDRID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        RDRID.setText("<RID>");

        jLabel13.setText("Return Time");

        RDRTIME.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        RDRTIME.setText("<RTIME>");

        jLabel20.setText("Credit Card Number");

        jLabel21.setText("Credit Card Expiry [MMYY]");

        jLabel22.setText("Card Name");

        ConfirmRentalButton.setText("Confirm Rental");
        ConfirmRentalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    ConfirmRentalButtonActionPerformed(evt);
                } catch (InputException e) {
                    try {
                        throw new InputException(e.getMessage());
                    } catch (InputException ex) {
                        ErrorTemplate et = new ErrorTemplate(ex.getMessage());
                    }
                }
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(132, 132, 132)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addGap(86, 86, 86)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)))
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGap(45, 45, 45)
                                                                .addComponent(jLabel13)))
                                                .addGap(52, 52, 52)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(RDName, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(RDLocation, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(RDType, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(RDPDATE, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(RDPTime, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(RDRDate, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(RDDLicense, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(RDRTIME, javax.swing.GroupLayout.Alignment.LEADING)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(38, 38, 38)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel20)
                                                                        .addComponent(jLabel21)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel22)
                                                                                .addGap(14, 14, 14))))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel4)))
                                                .addGap(52, 52, 52)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(CreditCardNumberIO, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                                                .addComponent(CreditCardExpIO)
                                                                .addComponent(RentalCreditCard))
                                                        .addComponent(RDRID)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(94, 94, 94)
                                                .addComponent(ConfirmRentalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(RDName))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(RDDLicense))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel8)
                                                        .addComponent(RDType))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel9)
                                                        .addComponent(RDLocation))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel10)
                                                        .addComponent(RDPDATE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel11)
                                                        .addComponent(RDPTime))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel12)
                                                        .addComponent(RDRDate))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(RDRTIME)
                                                        .addComponent(jLabel13))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(RDRID))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel20)
                                                        .addComponent(CreditCardNumberIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(22, 22, 22))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(CreditCardExpIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel21)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel22)
                                        .addComponent(RentalCreditCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(ConfirmRentalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void ConfirmRentalButtonActionPerformed(java.awt.event.ActionEvent evt) throws InputException {
        this.cardExp = CreditCardExpIO.getText();
        this.cardNo = CreditCardNumberIO.getText();
        this.cardType = RentalCreditCard.getText();

        if (this.cardExp.equals("") || this.cardNo.equals("") || this.cardType.equals("")) {
            throw new InputException("Please enter all the fields!");
        }

        if(jLabel2.getText().isEmpty()) {database.makeRent(r, cardType, Integer.parseInt(cardNo), Integer.parseInt(cardExp), loc);}
        else {database.makeRentNoReservation(name, dlicense, type, pdate, ptime, rdate, rtime, cardType, Integer.parseInt(this.cardNo), Integer.parseInt(this.cardExp), loc);}
        this.dispose();
    }



    private javax.swing.JButton ConfirmRentalButton;
    private javax.swing.JTextField CreditCardExpIO;
    private javax.swing.JTextField CreditCardNumberIO;
    private javax.swing.JTextField RentalCreditCard;
    private javax.swing.JLabel RDDLicense;
    private javax.swing.JLabel RDLocation;
    private javax.swing.JLabel RDName;
    private javax.swing.JLabel RDPDATE;
    private javax.swing.JLabel RDPTime;
    private javax.swing.JLabel RDRDate;
    private javax.swing.JLabel RDRID;
    private javax.swing.JLabel RDRTIME;
    private javax.swing.JLabel RDType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
}
