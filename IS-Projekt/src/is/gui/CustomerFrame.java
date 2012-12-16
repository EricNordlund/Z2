/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.gui;

import is.controller.Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Först konstruktor, sist autogenrerad kod.
 *
 * @author svalan
 */
public class CustomerFrame extends javax.swing.JFrame implements ActionListener {

    private Controller controller;
    private MainWindow parent;
    private int customerKey;
    private boolean newCustomer;

    public CustomerFrame(MainWindow parent) {

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

    private void addActionListenerToButtons() {
        this.btnSave.addActionListener(this);
        this.btnCancel.addActionListener(this);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("ActionEvent from " + e.getSource().getClass().getSimpleName());

        if (e.getSource() == this.btnSave) {

            if (newCustomer) {

                getController().addCustomer(
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
        }//if e.getSource() == this.btnSave

        if (e.getSource() == this.btnCancel) {

            this.setVisible(false);

        }//if e.getSource() == this.btnCancel

    }

    void fillTextBoxes(ArrayList<String> customerData) {
        this.txtCustomerName.setText(customerData.get(0));
        this.txtCustomerPhone.setText(customerData.get(1));
        this.txtCustomerMail.setText(customerData.get(2));
        this.txtCustomerStreet.setText(customerData.get(3));
        this.txtCustomerPostCode.setText(customerData.get(4));
        this.txtCustomerCity.setText(customerData.get(5));

    }

    void setCustomerKey(Integer key) {
        this.customerKey = key;
        this.txtCustomerNumber.setText(Integer.toString(key));
    }

    void setNewCustomer(boolean b) {
        this.newCustomer = b;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        lblCustomerMail.setText("Mail:");

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
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, lblCustomerPostCode, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, lblCustomerCity, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jLabel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(txtCustomerPostCode, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .add(txtCustomerStreet)
                    .add(txtCustomerCity))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblCustomerCity, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtCustomerCity, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
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
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .add(btnSave, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 105, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnCancel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 105, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void txtCustomerNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerNumberActionPerformed

    private void txtCustomerPostCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerPostCodeActionPerformed
    }//GEN-LAST:event_txtCustomerPostCodeActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
    }//GEN-LAST:event_btnSaveActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
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
}
