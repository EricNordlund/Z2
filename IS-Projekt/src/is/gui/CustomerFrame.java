/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.gui;

import is.controller.Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Först våra egna metoder. Sedan hantering av Action Events. Sist autogenererad
 * kod.
 *
 * @author Viktor Voigt
 */
public class CustomerFrame extends javax.swing.JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private Controller controller;
    private MainWindow parent;
    private int customerKey;
    private boolean newCustomer;

    /**
     * @param parent Det fönster som är logiskt överordnat detta fönster.
     */
    protected CustomerFrame(MainWindow parent) {

        initComponents();//Autogenererad metod

        addActionListenerToButtons();

        this.parent = parent;

        this.setLocationRelativeTo(null);

    }

    public void setController(Controller controller) {

        this.controller = controller;

    }

    private Controller getController() {

        return controller;

    }//Metod

    void setCustomerKey(int key) {

        this.customerKey = key;
        this.txtCustomerNumber.setText(Integer.toString(key));

    }

    void setNewCustomer(boolean b) {

        this.newCustomer = b;

    }

    private void addActionListenerToButtons() {

        this.btnSave.addActionListener(this);
        this.btnCancel.addActionListener(this);

        this.btnInputConfirm.addActionListener(this);

    }//Metod

    public void clearTextFields() {

        this.txtCustomerNumber.setText("");
        this.txtCustomerName.setText("");
        this.txtCustomerPhone.setText("");
        this.txtCustomerMail.setText("");
        this.txtCustomerStreet.setText("");
        this.txtCustomerPostCode.setText("");
        this.txtCustomerCity.setText("");

    }//Metod

    void fillTextBoxes(String[] customerData) {

        this.txtCustomerName.setText(customerData[0]);
        this.txtCustomerPhone.setText(customerData[1]);
        this.txtCustomerMail.setText(customerData[2]);
        this.txtCustomerStreet.setText(customerData[3]);
        this.txtCustomerPostCode.setText(customerData[4]);
        this.txtCustomerCity.setText(customerData[5]);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("ActionEvent from " + e.getSource().getClass().getSimpleName());

        if (e.getSource() == this.btnSave) {

            if (this.controller.inputCheckString(this.txtCustomerName.getText())
                    && this.controller.inputCheckString(this.txtCustomerStreet.getText())
                    && this.controller.inputCheckString(this.txtCustomerPostCode.getText())
                    && this.controller.inputCheckString(this.txtCustomerCity.getText())
                    && this.controller.inputCheckString(this.txtCustomerPhone.getText())
                    && this.controller.inputCheckString(this.txtCustomerMail.getText())) {

                if (newCustomer) {

                    getController().addNewCustomer(
                            this.txtCustomerName.getText(),
                            this.txtCustomerStreet.getText(),
                            this.txtCustomerPostCode.getText(),
                            this.txtCustomerCity.getText(),
                            this.txtCustomerPhone.getText(),
                            this.txtCustomerMail.getText());
                } else {
                    getController().editCustomer(
                            this.customerKey,
                            this.txtCustomerName.getText(),
                            this.txtCustomerStreet.getText(),
                            this.txtCustomerPostCode.getText(),
                            this.txtCustomerCity.getText(),
                            this.txtCustomerPhone.getText(),
                            this.txtCustomerMail.getText());
                }//else

                parent.updateLists();

                this.setVisible(false);

            } else if (!inputConfirm.isVisible()) {
                inputConfirm.setBounds(0, 0, 300, 125);
                inputConfirm.setVisible(true);
                //inputConfirm.setLocationRelativeTo(null);
            }


        }//if e.getSource() == this.btnSave

        if (e.getSource() == this.btnCancel) {

            this.setVisible(false);

        }//if e.getSource() == this.btnCancel

        if (e.getSource() == this.btnInputConfirm) {

            inputConfirm.setVisible(false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputConfirm = new javax.swing.JDialog();
        infoText = new javax.swing.JLabel();
        btnInputConfirm = new javax.swing.JButton();
        lblCustomerPhoneNumber = new javax.swing.JLabel();
        lblCustomerNumber = new javax.swing.JLabel();
        lclCustomerName = new javax.swing.JLabel();
        txtCustomerNumber = new javax.swing.JTextField();
        txtCustomerName = new javax.swing.JTextField();
        txtCustomerMail = new javax.swing.JTextField();
        txtCustomerPhone = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblCustomerMail = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtCustomerCity = new javax.swing.JTextField();
        txtCustomerStreet = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblCustomerPostCode = new javax.swing.JLabel();
        lblCustomerCity = new javax.swing.JLabel();
        txtCustomerPostCode = new javax.swing.JTextField();

        inputConfirm.setTitle("Ogiltig data");

        infoText.setText("All text är inte korrekt inmatad");

        btnInputConfirm.setText("Ok");
        btnInputConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputConfirmActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout inputConfirmLayout = new org.jdesktop.layout.GroupLayout(inputConfirm.getContentPane());
        inputConfirm.getContentPane().setLayout(inputConfirmLayout);
        inputConfirmLayout.setHorizontalGroup(
            inputConfirmLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(inputConfirmLayout.createSequentialGroup()
                .add(inputConfirmLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(inputConfirmLayout.createSequentialGroup()
                        .add(86, 86, 86)
                        .add(btnInputConfirm, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(inputConfirmLayout.createSequentialGroup()
                        .add(71, 71, 71)
                        .add(infoText)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        inputConfirmLayout.setVerticalGroup(
            inputConfirmLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(inputConfirmLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .add(infoText)
                .add(18, 18, 18)
                .add(btnInputConfirm)
                .add(22, 22, 22))
        );

        setAlwaysOnTop(true);

        lblCustomerPhoneNumber.setText("Telenr:");

        lblCustomerNumber.setText("Nummer:");

        lclCustomerName.setText("Namn:");

        txtCustomerNumber.setEnabled(false);
        txtCustomerNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerNumberActionPerformed(evt);
            }
        });

        btnSave.setText("Spara");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("Avbryt");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblCustomerMail.setText("Email:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Adress"));

        jLabel4.setText("Gatuadress:");

        lblCustomerPostCode.setText("Postnummer:");

        lblCustomerCity.setText("Stad:");

        txtCustomerPostCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerPostCodeActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, lblCustomerCity, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jLabel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, lblCustomerPostCode, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .add(12, 12, 12)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, txtCustomerPostCode, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 198, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, txtCustomerStreet, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 198, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, txtCustomerCity, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 198, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtCustomerStreet, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblCustomerPostCode, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtCustomerPostCode, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblCustomerCity, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtCustomerCity, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(2, 2, 2))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, lblCustomerPhoneNumber, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, lblCustomerNumber, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, lclCustomerName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .add(lblCustomerMail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(txtCustomerName)
                            .add(txtCustomerNumber)
                            .add(txtCustomerPhone, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .add(txtCustomerMail)))
                    .add(layout.createSequentialGroup()
                        .add(btnSave, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 105, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnCancel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 105, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblCustomerNumber, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtCustomerNumber, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lclCustomerName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtCustomerName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblCustomerPhoneNumber, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtCustomerPhone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtCustomerMail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblCustomerMail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnSave)
                    .add(btnCancel))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Autogenererade ActionEvent-metoder"> 
    private void txtCustomerNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerNumberActionPerformed
    }//GEN-LAST:event_txtCustomerNumberActionPerformed

    private void txtCustomerPostCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerPostCodeActionPerformed
    }//GEN-LAST:event_txtCustomerPostCodeActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnInputConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputConfirmActionPerformed
    }//GEN-LAST:event_btnInputConfirmActionPerformed
    //</editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Autogenererade deklarationer"> 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnInputConfirm;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel infoText;
    private javax.swing.JDialog inputConfirm;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCustomerCity;
    private javax.swing.JLabel lblCustomerMail;
    private javax.swing.JLabel lblCustomerNumber;
    private javax.swing.JLabel lblCustomerPhoneNumber;
    private javax.swing.JLabel lblCustomerPostCode;
    private javax.swing.JLabel lclCustomerName;
    private javax.swing.JTextField txtCustomerCity;
    private javax.swing.JTextField txtCustomerMail;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtCustomerNumber;
    private javax.swing.JTextField txtCustomerPhone;
    private javax.swing.JTextField txtCustomerPostCode;
    private javax.swing.JTextField txtCustomerStreet;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}
