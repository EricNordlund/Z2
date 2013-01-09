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
 *
 * @author svalan
 */
public class BoatFrame extends javax.swing.JFrame implements ActionListener {

    private Controller controller;
    private MainWindow parent;
    private int boatKey;
    private boolean newBoat;

    /**
     * Creates new form EditBoat
     */
    protected BoatFrame(MainWindow parent) {

        initComponents();//Autogenererad metod

        addActionListenerToButtons();

        this.parent = parent;

        this.setLocationRelativeTo(null);

    }

    protected void setController(Controller controller) {

        this.controller = controller;
    }

    private Controller getController() {

        return controller;
    }

    private void addActionListenerToButtons() {
        this.btnSaveBoat.addActionListener(this);
        this.btnExitBoat.addActionListener(this);
    }

    protected void clearTextFields() {


        this.txtBoatRegNumber.setText("");
        this.txtBoatModel.setText("");
        this.txtBoatDestination.setText("");
        this.txtBoatPrice.setText("");
        this.txtBoatIdNumber.setText("");
        this.txaBoatDesprection.setText("");

    }
    
        void setBoatKey(int key) {
        this.boatKey = key;
        this.txtBoatRegNumber.setText(Integer.toString(key));
    }

    protected void setNewBoat(boolean b) {
        this.newBoat = b;
    }
    
    
    protected void fillTextBoxes(String[] boatData) {
        this.txtBoatIdNumber.setText(boatData[0]);
        this.txtBoatRegNumber.setText(boatData[1]);
        this.txtBoatModel.setText(boatData[2]);
        this.txtBoatDestination.setText(boatData[3]);
        this.txaBoatDesprection.setText(boatData[4]);
        this.txtBoatPrice.setText(boatData[5]);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("ActionEvent from " + e.getSource().getClass().getSimpleName());

        if (e.getSource() == this.btnSaveBoat) {

            if (newBoat) {

                getController().addBoat(
                        this.txtBoatRegNumber.getText(),
                        this.txtBoatModel.getText(),
                        this.txtBoatDestination.getText(),
                        this.txaBoatDesprection.getText(),
                        Double.valueOf(this.txtBoatPrice.getText()));


            } else {
                getController().editBoat(
                        this.boatKey,
                        this.txtBoatRegNumber.getText(),
                        this.txtBoatModel.getText(),
                        this.txtBoatDestination.getText(),
                        this.txaBoatDesprection.getText(),
                        Double.valueOf(this.txtBoatPrice.getText()));

            }

            parent.updateLists();

            this.setVisible(false);
        }//if e.getSource() == this.btnSaveBoat

        if (e.getSource() == this.btnExitBoat) {

            this.setVisible(false);

        }//if e.getSource() == this.btnCancel

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSaveBoat = new javax.swing.JButton();
        btnExitBoat = new javax.swing.JButton();
        lblBoatRegNumber = new javax.swing.JLabel();
        lblBoatModel = new javax.swing.JLabel();
        lblBoatDestination = new javax.swing.JLabel();
        lblBoatPrice = new javax.swing.JLabel();
        lblBoatDescription = new javax.swing.JLabel();
        lblBoatIdNumber = new javax.swing.JLabel();
        txtBoatRegNumber = new javax.swing.JTextField();
        txtBoatModel = new javax.swing.JTextField();
        txtBoatDestination = new javax.swing.JTextField();
        txtBoatPrice = new javax.swing.JTextField();
        txtBoatIdNumber = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaBoatDesprection = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSaveBoat.setText("Spara");
        btnSaveBoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveBoatActionPerformed(evt);
            }
        });

        btnExitBoat.setText("Avbryt");

        lblBoatRegNumber.setText("Reg. nummer:");

        lblBoatModel.setText("Modell:");

        lblBoatDestination.setText("Destination:");

        lblBoatPrice.setText("Pris:");

        lblBoatDescription.setText("Beskrivning:");

        lblBoatIdNumber.setText("ID. nummer:");

        txtBoatPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBoatPriceActionPerformed(evt);
            }
        });

        txtBoatIdNumber.setEditable(false);

        txaBoatDesprection.setColumns(20);
        txaBoatDesprection.setLineWrap(true);
        txaBoatDesprection.setRows(5);
        jScrollPane1.setViewportView(txaBoatDesprection);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(23, 23, 23)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblBoatDescription)
                    .add(lblBoatRegNumber)
                    .add(lblBoatModel)
                    .add(lblBoatDestination)
                    .add(lblBoatIdNumber)
                    .add(lblBoatPrice))
                .add(40, 40, 40)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(txtBoatPrice, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, txtBoatIdNumber)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, txtBoatDestination)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, txtBoatModel)
                        .add(org.jdesktop.layout.GroupLayout.LEADING, txtBoatRegNumber, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(btnSaveBoat)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnExitBoat)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(24, 24, 24)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblBoatRegNumber)
                    .add(txtBoatRegNumber, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(6, 6, 6)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblBoatModel)
                    .add(txtBoatModel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtBoatDestination, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblBoatDestination))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblBoatPrice)
                    .add(txtBoatPrice, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(2, 2, 2)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblBoatIdNumber)
                    .add(txtBoatIdNumber, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblBoatDescription)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnSaveBoat)
                    .add(btnExitBoat))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveBoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveBoatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveBoatActionPerformed

    private void txtBoatPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBoatPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBoatPriceActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExitBoat;
    private javax.swing.JButton btnSaveBoat;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBoatDescription;
    private javax.swing.JLabel lblBoatDestination;
    private javax.swing.JLabel lblBoatIdNumber;
    private javax.swing.JLabel lblBoatModel;
    private javax.swing.JLabel lblBoatPrice;
    private javax.swing.JLabel lblBoatRegNumber;
    private javax.swing.JTextArea txaBoatDesprection;
    private javax.swing.JTextField txtBoatDestination;
    private javax.swing.JTextField txtBoatIdNumber;
    private javax.swing.JTextField txtBoatModel;
    private javax.swing.JTextField txtBoatPrice;
    private javax.swing.JTextField txtBoatRegNumber;
    // End of variables declaration//GEN-END:variables
}
