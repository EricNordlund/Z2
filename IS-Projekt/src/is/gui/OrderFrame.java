/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.gui;

import is.controller.BoatListItem;
import is.controller.Controller;
import is.controller.ListItem;
import is.controller.GoodsListItem;
import is.projekt.Customer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JList;

/**
 *
 * @author Viktor Voigt
 */
public class OrderFrame extends javax.swing.JFrame implements ActionListener {
    
    Controller controller;
    private MainWindow parent;
    private Integer customerID;
    private Integer orderID = -1; 
    private boolean boatMode = false;
    
    OrderFrame(MainWindow parent) {
        
        initComponents();
        
        addActionListenerToButtons(this);
        
        this.parent = parent;
        
        this.setLocationRelativeTo(null);
        
    }
    
    public Controller getController() {
        
        return this.controller;
    }
    
    public void initInterface() {

        //Hämtar relevant info från Customer och ordern
        ArrayList<String> customerData = getController().getCustomerData(customerID);
        
        //Kontrollerar om ordern skall redigeras eller läggas till. Uppdaterar sedan interfacen. 
        if(orderID >= 0) {
        ArrayList<String> orderData = getController().getOrderData(orderID);
        this.txtBillingDate.setText(orderData.get(0));
        this.txtOrderNr.setText(Integer.toString(orderID));
        
        this.txtStreet.setText(orderData.get(1));
        this.txtPostCode.setText(orderData.get(3));
        this.txtCity.setText(orderData.get(4));
        
        }
        
        else 
            
        {
            this.txtOrderNr.setText(null);
            this.txtBillingDate.setText(null);
            this.txtStreet.setText(customerData.get(3));
            this.txtPostCode.setText(customerData.get(4));
            this.txtCity.setText(customerData.get(5));
        }
        
        
        this.txtCustomer.setText(customerData.get(0));
        
        this.lstOrderRows.setModel(new DefaultListModel());
        
        
    }
    
    void setController(Controller controller) {
        this.controller = controller;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        System.out.println("ActionEvent.");
        
        if (e.getSource() instanceof JButton) {
            JButton btn = (JButton) e.getSource();
            String btnName = btn.getText();
            System.out.println("Du tryckte på " + btnName + ".");
            
        }
        
        //Stänger ner rutan
        if (e.getSource() == this.btnCancel) {
            
            this.setVisible(false);
            orderID = -1;
            
       //Stänger ner rutan och sparar ändringar.
        } else if (e.getSource() == this.btnSaveOrder) {
            
            saveOrder();
            this.setVisible(false);
            orderID = -1;
        }
        
        
        
        //Ändrar mellan båtlistan och tillbehörslistan. 
        if (e.getSource() == this.rbtnBoat) {
            
            this.boatMode = true;
            
        } else if (e.getSource() == this.rbtnGoods) {
            
            this.boatMode = false;
        }
        
        
        //Kontrollerar om ett listvärde är markerat och möjliggör att flytta över det. 
        if (lstProducts.getSelectedValue() instanceof ListItem) {
            
            if (e.getSource() == this.btnAdd) {
                
                ListItem selectedProduct = (ListItem) lstProducts.getSelectedValue();
                
                int productID = selectedProduct.getKey();
                
                if (boatMode) {
                    
                    this.addBoatListItem(productID);
                    
                } else {
                    
                    if (!lstOrderRowsHasGoods(productID)) {
                        
                        this.addNewGoodsListItem(productID);
                        
                    } else {
                        
                        addGoodsListItem(productID, 1);
                        
                    }
                    
                }
                
                
            }
            
            
            
        }
        
        updateLists();
    }
    
    //Efter att en produkt lagts till eller tagis bort uppdateras listorna beroende på om man är i båtläge eller tillbehörsläge
    public void updateLists() {
        
        
        if (boatMode) {
            
            lstProducts.setModel(getController().getBoatListModel());
            
        } else {
            this.lstProducts.setModel(getController().getGoodsListModel());
        }
        
        this.lstOrderRows.repaint();
        
    }
    
    //Setters för customerID och orderID
    void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }
    
    void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupProducts = new javax.swing.ButtonGroup();
        jScrollPanelProducts = new javax.swing.JScrollPane();
        lstProducts = new javax.swing.JList();
        btnSaveOrder = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jScrollPanelOrderRows = new javax.swing.JScrollPane();
        lstOrderRows = new javax.swing.JList();
        jPanelOrderInfo = new javax.swing.JPanel();
        lblBillingDate = new javax.swing.JLabel();
        lblCustomer = new javax.swing.JLabel();
        lblOrderNr = new javax.swing.JLabel();
        txtCustomer = new javax.swing.JTextField();
        txtOrderNr = new javax.swing.JTextField();
        txtBillingDate = new javax.swing.JTextField();
        jPanelAddress = new javax.swing.JPanel();
        lblStreetAddress = new javax.swing.JLabel();
        lblPostCode = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        txtStreet = new javax.swing.JTextField();
        txtPostCode = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        rbtnGoods = new javax.swing.JRadioButton();
        rbtnBoat = new javax.swing.JRadioButton();

        jScrollPanelProducts.setViewportView(lstProducts);

        btnSaveOrder.setText("Spara order");

        btnCancel.setText("Avbryt");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnAdd.setText("<<");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setText(">>");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        jScrollPanelOrderRows.setViewportView(lstOrderRows);

        jPanelOrderInfo.setBorder(javax.swing.BorderFactory.createTitledBorder("Orderinfo"));

        lblBillingDate.setText("Fakturadatum (ÅÅMMDD):");

        lblCustomer.setText("Kund:");

        lblOrderNr.setText("Ordernummer:");

        txtCustomer.setEditable(false);
        txtCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerActionPerformed(evt);
            }
        });

        txtOrderNr.setEditable(false);
        txtOrderNr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrderNrActionPerformed(evt);
            }
        });

        txtBillingDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBillingDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelOrderInfoLayout = new javax.swing.GroupLayout(jPanelOrderInfo);
        jPanelOrderInfo.setLayout(jPanelOrderInfoLayout);
        jPanelOrderInfoLayout.setHorizontalGroup(
            jPanelOrderInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOrderInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOrderInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBillingDate)
                    .addComponent(lblOrderNr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelOrderInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtOrderNr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(txtCustomer, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBillingDate))
                .addGap(0, 7, Short.MAX_VALUE))
        );
        jPanelOrderInfoLayout.setVerticalGroup(
            jPanelOrderInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOrderInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOrderInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelOrderInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOrderNr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOrderNr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelOrderInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBillingDate)
                    .addComponent(txtBillingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanelAddress.setBorder(javax.swing.BorderFactory.createTitledBorder("Faktureringsadress"));

        lblStreetAddress.setText("Gatuadress:");

        lblPostCode.setText("Postnummer:");

        lblCity.setText("Stad:");

        javax.swing.GroupLayout jPanelAddressLayout = new javax.swing.GroupLayout(jPanelAddress);
        jPanelAddress.setLayout(jPanelAddressLayout);
        jPanelAddressLayout.setHorizontalGroup(
            jPanelAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddressLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblStreetAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPostCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanelAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtStreet)
                    .addComponent(txtPostCode)
                    .addComponent(txtCity, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelAddressLayout.setVerticalGroup(
            jPanelAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddressLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStreetAddress)
                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPostCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPostCode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btnGroupProducts.add(rbtnGoods);
        rbtnGoods.setSelected(true);
        rbtnGoods.setText("Tillbehör");

        btnGroupProducts.add(rbtnBoat);
        rbtnBoat.setText("Båtar");
        rbtnBoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnBoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSaveOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancel)
                        .addGap(78, 78, 78))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelOrderInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPanelOrderRows, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAdd)
                                    .addComponent(btnRemove))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbtnGoods)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbtnBoat)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPanelProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelOrderInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtnGoods)
                            .addComponent(rbtnBoat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPanelOrderRows)
                            .addComponent(jScrollPanelProducts, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemove)
                        .addGap(101, 101, 101)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnSaveOrder))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed
    
    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoveActionPerformed
    
    private void txtCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerActionPerformed
    
    private void txtBillingDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBillingDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBillingDateActionPerformed
    
    private void txtOrderNrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrderNrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrderNrActionPerformed
    
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed
    
    private void rbtnBoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnBoatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnBoatActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.ButtonGroup btnGroupProducts;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSaveOrder;
    private javax.swing.JPanel jPanelAddress;
    private javax.swing.JPanel jPanelOrderInfo;
    private javax.swing.JScrollPane jScrollPanelOrderRows;
    private javax.swing.JScrollPane jScrollPanelProducts;
    private javax.swing.JLabel lblBillingDate;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCustomer;
    private javax.swing.JLabel lblOrderNr;
    private javax.swing.JLabel lblPostCode;
    private javax.swing.JLabel lblStreetAddress;
    private javax.swing.JList lstOrderRows;
    private javax.swing.JList lstProducts;
    private javax.swing.JRadioButton rbtnBoat;
    private javax.swing.JRadioButton rbtnGoods;
    private javax.swing.JTextField txtBillingDate;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCustomer;
    private javax.swing.JTextField txtOrderNr;
    private javax.swing.JTextField txtPostCode;
    private javax.swing.JTextField txtStreet;
    // End of variables declaration//GEN-END:variables

    private void addActionListenerToButtons(ActionListener a) {
        this.btnAdd.addActionListener(a);
        this.btnRemove.addActionListener(a);
        this.btnSaveOrder.addActionListener(a);
        this.btnCancel.addActionListener(a);
        
        this.rbtnBoat.addActionListener(a);
        this.rbtnGoods.addActionListener(a);
        
    }
    
    
   
    //Om inte tillbehöret redan finns i listan läggs det till som nytt. 
    private void addNewGoodsListItem(int goodsID) {
        
        GoodsListItem gli;
        DefaultListModel lm;
        
        lm = (DefaultListModel) this.lstOrderRows.getModel();
        
        gli = this.getController().getGoodsListItem(goodsID);
        
        lm.addElement(gli);
    }
    
    
    //Kontrollerar om tillbehöret redan finns som Orderrad. Antalet finns lagrat i GoodsListItem-objektet
    private boolean lstOrderRowsHasGoods(int goodsID) {
        
        boolean hasItem = false;
        
        DefaultListModel lm = (DefaultListModel) lstOrderRows.getModel();
        
        Object[] lmArray = lm.toArray();
        
        for (Object o : lmArray) {
            
            if (o instanceof GoodsListItem) {
                
                GoodsListItem li = (GoodsListItem) o;
                
                if (goodsID == li.getKey()) {
                    hasItem = true;
                }
                
                
            }
            
        }
        
        return hasItem;
    }
    
    //Om tillbehöret redan finns läggs det till. 
    private void addGoodsListItem(int goodsID, int toAdd) {
        
        DefaultListModel lm = (DefaultListModel) lstOrderRows.getModel();
        
        Object[] lmArray = lm.toArray();
        
        for (Object o : lmArray) {
            
            if (o instanceof GoodsListItem) {
                
                GoodsListItem li = (GoodsListItem) o;
                
                if (goodsID == li.getKey()) {
                    
                    li.addQuantity(toAdd);
                    System.out.println(li.toString() + " added " + toAdd);
                    
                    
                }
                
                
            }
            
        }
        
        
    }
    
    //Lägger till båt i orderrad
    private void addBoatListItem(int productID) {
        
        DefaultListModel lm = (DefaultListModel) lstOrderRows.getModel();
        
        BoatListItem bli;
        
        bli = getController().getBoatListItem(productID);
        
        lm.addElement(bli);
        
        
    }
    
    //Sparar och lägger till en ny order till slut. 
    private void saveOrder() {
        
        
        int billingDate = Integer.valueOf(this.txtBillingDate.getText());
        String billingAddressStreet = this.txtStreet.getText();
        String billingAddressCity = this.txtCity.getText();
        String billingAddressPostCode = this.txtPostCode.getText();

        if (orderID >= 0) {

            controller.editBuyOrder(billingDate, billingAddressStreet, billingAddressPostCode, billingAddressCity, customerID, true, orderID);

            parent.updateLists();
            
        } else {
            
            controller.addBuyOrder(billingDate, billingAddressStreet, billingAddressPostCode, billingAddressCity, null, customerID, true, null);
            parent.updateLists();
        }

    }
}
