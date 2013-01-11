/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.gui;

import is.controller.Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Viktor
 */
public class GoodsFrame extends javax.swing.JFrame implements ActionListener {

    private Controller controller;
    private MainWindow parent;
    private int goodsID;
    private boolean newGoods;

    /**
     * Creates new form GoodsFrame
     */
    public GoodsFrame(MainWindow parent) {


        initComponents();
        addActionListenerToButton();

        this.parent = parent;
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputConfirm = new javax.swing.JDialog();
        infoText = new javax.swing.JLabel();
        btnInputConfirm = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jScrollPaneDescription = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();

        inputConfirm.setTitle("Ogiltig data");

        infoText.setText("All text är inte korrekt inmatad");

        btnInputConfirm.setText("Ok");
        btnInputConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inputConfirmLayout = new javax.swing.GroupLayout(inputConfirm.getContentPane());
        inputConfirm.getContentPane().setLayout(inputConfirmLayout);
        inputConfirmLayout.setHorizontalGroup(
            inputConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputConfirmLayout.createSequentialGroup()
                .addGroup(inputConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputConfirmLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(btnInputConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inputConfirmLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(infoText)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        inputConfirmLayout.setVerticalGroup(
            inputConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputConfirmLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(infoText)
                .addGap(18, 18, 18)
                .addComponent(btnInputConfirm)
                .addGap(22, 22, 22))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSave.setText("Spara");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("Avbryt");

        lblName.setText("Namn:");

        lblPrice.setText("Pris:");

        lblDescription.setText("Beskrivning:");

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPaneDescription.setViewportView(txtDescription);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName)
                    .addComponent(lblPrice)
                    .addComponent(lblDescription))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel))
                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addComponent(txtPrice)
                    .addComponent(jScrollPaneDescription))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescription)
                    .addComponent(jScrollPaneDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave)
                    .addComponent(btnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnInputConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputConfirmActionPerformed
        inputConfirm.setVisible(false);
    }//GEN-LAST:event_btnInputConfirmActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnInputConfirm;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel infoText;
    private javax.swing.JDialog inputConfirm;
    private javax.swing.JScrollPane jScrollPaneDescription;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.btnCancel) {

            this.setVisible(false);
        } else if (e.getSource() == this.btnSave) {

            
            if(this.controller.inputCheckString(this.txtPrice.getText())
              && this.controller.inputCheckString(this.txtDescription.getText())
              && this.controller.inputCheckString(this.txtName.getText())
              )
                
            {
            
                String name = this.txtName.getText();
                double price = Double.valueOf(this.txtPrice.getText());
                String description = this.txtDescription.getText();
                if (newGoods) {

                    controller.addGoods(name, price, description);
                } else if (!newGoods) {

                    controller.editGoods(goodsID, name, price, description);
                }
                this.setVisible(false);
                parent.updateLists();
            
            } //Öppnar felmeddelandet om det inte redan är öppet. 
            else if (!inputConfirm.isVisible()) {
                inputConfirm.setBounds(0, 0, 300, 125);
                inputConfirm.setVisible(true);
                inputConfirm.setLocationRelativeTo(null);

            }
            
            

        }

        
    }

    void setController(Controller controller) {
        this.controller = controller;
    }

    void clearTextFields() {
        this.txtName.setText("");
        this.txtPrice.setText("");
        this.txtDescription.setText("");
    }

    private void addActionListenerToButton() {
        this.btnCancel.addActionListener(this);
        this.btnSave.addActionListener(this);
    }

    void fillTextFields(String[] goodsData) {
        this.txtName.setText(goodsData[0]);
        this.txtPrice.setText(goodsData[1]);
        this.txtDescription.setText(goodsData[2]);
    }

    void newGoodsMode() {
        setTitle("Lägg till tillbehör");
        clearTextFields();
        this.newGoods = true;
    }

    void editGoodsMode(int goodsID) {

        this.goodsID = goodsID;

        this.setTitle("Redigera tillbehör");
        String[] goodsData = controller.getGoodsData(goodsID);
        fillTextFields(goodsData);
        this.newGoods = false;
    }
}
