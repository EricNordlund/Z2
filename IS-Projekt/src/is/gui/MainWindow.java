/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.gui;

import is.projekt.Model;
import java.util.List;

/**
 *
 * @author svalan
 */
public class MainWindow extends javax.swing.JFrame {

    Model model;
    CustomerFrame customerFrame;
    BoatFrame boatFrame;
    OrderFrame orderFrame;

    public MainWindow(Model model) {


        initComponents();

        this.setLocationRelativeTo(null);
    }

    public Model getModel() {

        return model;

    }

    public List bindOrderList() {


        return getModel().getOrderRegistry().getOrderList();
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPaneMainWindow = new javax.swing.JTabbedPane();
        jPanelCustomers = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstCustomer = new javax.swing.JList();
        jPanelEditCustomer = new javax.swing.JPanel();
        btnAddCustomer = new javax.swing.JButton();
        btnShowCustomer = new javax.swing.JButton();
        btnEditCustomer = new javax.swing.JButton();
        jPanelSearchCustomer = new javax.swing.JPanel();
        btnSearchCustomer = new javax.swing.JButton();
        txtSearchCustomer = new javax.swing.JTextField();
        jPanelBåtar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstBoats = new javax.swing.JList();
        jPanel1 = new javax.swing.JPanel();
        txtSearchBoat = new javax.swing.JTextField();
        btnSearchBoat = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnEditBoat = new javax.swing.JButton();
        btnAddBoat = new javax.swing.JButton();
        btnShowBoat = new javax.swing.JButton();
        jPanelTillbehör = new javax.swing.JPanel();
        jPanelOrdrar = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstOrders = new javax.swing.JList();
        jPanelEditCustomer1 = new javax.swing.JPanel();
        btnAddOrder = new javax.swing.JButton();
        btnShowOrder = new javax.swing.JButton();
        btnEditOrder = new javax.swing.JButton();
        jPanelOrderFilters = new javax.swing.JPanel();
        rbtnOrderBuy = new javax.swing.JRadioButton();
        rbtnOrderSell = new javax.swing.JRadioButton();
        jPanelOrderSearch = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        btnOrderSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabbedPaneMainWindow.setName("asdds"); // NOI18N

        jPanelCustomers.setName(""); // NOI18N

        jScrollPane2.setViewportView(lstCustomer);

        btnAddCustomer.setText("Lägg till");
        btnAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustomerActionPerformed(evt);
            }
        });

        btnShowCustomer.setText("Visa");
        btnShowCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowCustomerActionPerformed(evt);
            }
        });

        btnEditCustomer.setText("Redigera");

        javax.swing.GroupLayout jPanelEditCustomerLayout = new javax.swing.GroupLayout(jPanelEditCustomer);
        jPanelEditCustomer.setLayout(jPanelEditCustomerLayout);
        jPanelEditCustomerLayout.setHorizontalGroup(
            jPanelEditCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEditCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(btnShowCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(btnEditCustomer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelEditCustomerLayout.setVerticalGroup(
            jPanelEditCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditCustomerLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnShowCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddCustomer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSearchCustomer.setText("Sök");

        txtSearchCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSearchCustomerLayout = new javax.swing.GroupLayout(jPanelSearchCustomer);
        jPanelSearchCustomer.setLayout(jPanelSearchCustomerLayout);
        jPanelSearchCustomerLayout.setHorizontalGroup(
            jPanelSearchCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSearchCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSearchCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearchCustomer)
                    .addComponent(btnSearchCustomer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelSearchCustomerLayout.setVerticalGroup(
            jPanelSearchCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSearchCustomerLayout.createSequentialGroup()
                .addComponent(txtSearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchCustomer)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelCustomersLayout = new javax.swing.GroupLayout(jPanelCustomers);
        jPanelCustomers.setLayout(jPanelCustomersLayout);
        jPanelCustomersLayout.setHorizontalGroup(
            jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustomersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelEditCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelSearchCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCustomersLayout.setVerticalGroup(
            jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustomersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                    .addGroup(jPanelCustomersLayout.createSequentialGroup()
                        .addComponent(jPanelSearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelEditCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        tabbedPaneMainWindow.addTab("Kunder", jPanelCustomers);

        lstBoats.setModel(new javax.swing.AbstractListModel() {
            String[] strings = {  };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstBoats);

        txtSearchBoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchBoatActionPerformed(evt);
            }
        });

        btnSearchBoat.setText("Sök");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearchBoat)
                    .addComponent(btnSearchBoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtSearchBoat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchBoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        btnEditBoat.setText("Redigera");

        btnAddBoat.setText("Lägg till");

        btnShowBoat.setText("Visa");
        btnShowBoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowBoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditBoat, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(btnAddBoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnShowBoat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnShowBoat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditBoat, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddBoat, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanelBåtarLayout = new javax.swing.GroupLayout(jPanelBåtar);
        jPanelBåtar.setLayout(jPanelBåtarLayout);
        jPanelBåtarLayout.setHorizontalGroup(
            jPanelBåtarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBåtarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBåtarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelBåtarLayout.setVerticalGroup(
            jPanelBåtarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBåtarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBåtarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                    .addGroup(jPanelBåtarLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        tabbedPaneMainWindow.addTab("Båtar", jPanelBåtar);

        javax.swing.GroupLayout jPanelTillbehörLayout = new javax.swing.GroupLayout(jPanelTillbehör);
        jPanelTillbehör.setLayout(jPanelTillbehörLayout);
        jPanelTillbehörLayout.setHorizontalGroup(
            jPanelTillbehörLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 676, Short.MAX_VALUE)
        );
        jPanelTillbehörLayout.setVerticalGroup(
            jPanelTillbehörLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
        );

        tabbedPaneMainWindow.addTab("Tillbehör", jPanelTillbehör);

        jScrollPane3.setViewportView(lstOrders);

        jPanelEditCustomer1.setBorder(javax.swing.BorderFactory.createTitledBorder("Verktyg"));

        btnAddOrder.setText("Lägg till");
        btnAddOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrderActionPerformed(evt);
            }
        });

        btnShowOrder.setText("Visa");
        btnShowOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowOrderActionPerformed(evt);
            }
        });

        btnEditOrder.setText("Redigera");

        javax.swing.GroupLayout jPanelEditCustomer1Layout = new javax.swing.GroupLayout(jPanelEditCustomer1);
        jPanelEditCustomer1.setLayout(jPanelEditCustomer1Layout);
        jPanelEditCustomer1Layout.setHorizontalGroup(
            jPanelEditCustomer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditCustomer1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEditCustomer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(btnShowOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(btnEditOrder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelEditCustomer1Layout.setVerticalGroup(
            jPanelEditCustomer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditCustomer1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnShowOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddOrder)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelOrderFilters.setBorder(javax.swing.BorderFactory.createTitledBorder("Filter"));

        rbtnOrderBuy.setText("Köp");

        rbtnOrderSell.setText("Sälj");
        rbtnOrderSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnOrderSellActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelOrderFiltersLayout = new javax.swing.GroupLayout(jPanelOrderFilters);
        jPanelOrderFilters.setLayout(jPanelOrderFiltersLayout);
        jPanelOrderFiltersLayout.setHorizontalGroup(
            jPanelOrderFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOrderFiltersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOrderFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnOrderBuy)
                    .addComponent(rbtnOrderSell))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelOrderFiltersLayout.setVerticalGroup(
            jPanelOrderFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOrderFiltersLayout.createSequentialGroup()
                .addComponent(rbtnOrderBuy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnOrderSell))
        );

        jPanelOrderSearch.setBorder(javax.swing.BorderFactory.createTitledBorder("Sök"));

        btnOrderSearch.setText("Sök");

        javax.swing.GroupLayout jPanelOrderSearchLayout = new javax.swing.GroupLayout(jPanelOrderSearch);
        jPanelOrderSearch.setLayout(jPanelOrderSearchLayout);
        jPanelOrderSearchLayout.setHorizontalGroup(
            jPanelOrderSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOrderSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOrderSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addComponent(btnOrderSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelOrderSearchLayout.setVerticalGroup(
            jPanelOrderSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOrderSearchLayout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOrderSearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelOrdrarLayout = new javax.swing.GroupLayout(jPanelOrdrar);
        jPanelOrdrar.setLayout(jPanelOrdrarLayout);
        jPanelOrdrarLayout.setHorizontalGroup(
            jPanelOrdrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOrdrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelOrdrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelEditCustomer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelOrderFilters, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelOrderSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelOrdrarLayout.setVerticalGroup(
            jPanelOrdrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOrdrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOrdrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelOrdrarLayout.createSequentialGroup()
                        .addComponent(jPanelOrderSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelOrderFilters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelEditCustomer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabbedPaneMainWindow.addTab("Ordrar", jPanelOrdrar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPaneMainWindow)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPaneMainWindow)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchCustomerActionPerformed

    private void btnAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustomerActionPerformed

        customerFrame = new CustomerFrame(getModel(), "Lägg till kund", GUIMode.ADD);// TODO add your handling code here:
        customerFrame.setVisible(true);
    }//GEN-LAST:event_btnAddCustomerActionPerformed

    private void txtSearchBoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchBoatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchBoatActionPerformed

    private void btnShowBoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowBoatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnShowBoatActionPerformed

    private void btnShowCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnShowCustomerActionPerformed

    private void btnAddOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddOrderActionPerformed

    private void btnShowOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnShowOrderActionPerformed

    private void rbtnOrderSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnOrderSellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnOrderSellActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBoat;
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JButton btnAddOrder;
    private javax.swing.JButton btnEditBoat;
    private javax.swing.JButton btnEditCustomer;
    private javax.swing.JButton btnEditOrder;
    private javax.swing.JButton btnOrderSearch;
    private javax.swing.JButton btnSearchBoat;
    private javax.swing.JButton btnSearchCustomer;
    private javax.swing.JButton btnShowBoat;
    private javax.swing.JButton btnShowCustomer;
    private javax.swing.JButton btnShowOrder;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelBåtar;
    private javax.swing.JPanel jPanelCustomers;
    private javax.swing.JPanel jPanelEditCustomer;
    private javax.swing.JPanel jPanelEditCustomer1;
    private javax.swing.JPanel jPanelOrderFilters;
    private javax.swing.JPanel jPanelOrderSearch;
    private javax.swing.JPanel jPanelOrdrar;
    private javax.swing.JPanel jPanelSearchCustomer;
    private javax.swing.JPanel jPanelTillbehör;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JList lstBoats;
    private javax.swing.JList lstCustomer;
    private javax.swing.JList lstOrders;
    private javax.swing.JRadioButton rbtnOrderBuy;
    private javax.swing.JRadioButton rbtnOrderSell;
    private javax.swing.JTabbedPane tabbedPaneMainWindow;
    private javax.swing.JTextField txtSearchBoat;
    private javax.swing.JTextField txtSearchCustomer;
    // End of variables declaration//GEN-END:variables

}
