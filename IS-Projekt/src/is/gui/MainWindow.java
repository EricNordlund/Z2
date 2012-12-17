/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.gui;

import is.controller.Controller;
import is.controller.ListItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

/**
 *
 * @author svalan
 */
public class MainWindow extends javax.swing.JFrame implements ActionListener {

    Controller controller;
    CustomerFrame customerFrame;
    BoatFrame boatFrame;
    OrderFrame orderFrame;

    public MainWindow() {
        

        initComponents();

        initFrames();

        addActionListenerToButtons();
        
        
        
        this.setLocationRelativeTo(null);
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
        btnEditCustomer = new javax.swing.JButton();
        btnNewOrder = new javax.swing.JButton();
        btnRemoveCustomer = new javax.swing.JButton();
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
        jPanelEditCustomer2 = new javax.swing.JPanel();
        btnAddBoat = new javax.swing.JButton();
        btnEditBoat = new javax.swing.JButton();
        btnRemoveBoat = new javax.swing.JButton();
        jPanelOrdrar = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstOrders = new javax.swing.JList();
        jPanelEditCustomer1 = new javax.swing.JPanel();
        btnShowOrder = new javax.swing.JButton();
        btnEditOrder = new javax.swing.JButton();
        jPanelOrderFilters = new javax.swing.JPanel();
        rbtnOrderBuy = new javax.swing.JRadioButton();
        rbtnOrderSell = new javax.swing.JRadioButton();
        jPanelOrderSearch = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        btnOrderSearch = new javax.swing.JButton();
        jPanelTillbehör = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstGoods = new javax.swing.JList();
        txtSearchGoods = new javax.swing.JTextField();
        btnSearchGoods = new javax.swing.JButton();
        jPanelEditCustomer3 = new javax.swing.JPanel();
        btnChangeGoods = new javax.swing.JButton();
        btnAddGoods = new javax.swing.JButton();
        btnRemoveGoods = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seghel & Bååth");

        tabbedPaneMainWindow.setName("asdds"); // NOI18N

        jPanelCustomers.setName(""); // NOI18N

        jScrollPane2.setViewportView(lstCustomer);

        jPanelEditCustomer.setBorder(javax.swing.BorderFactory.createTitledBorder("Verktyg"));

        btnAddCustomer.setText("Lägg till kund");
        btnAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustomerActionPerformed(evt);
            }
        });

        btnEditCustomer.setText("Redigera kund");
        btnEditCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditCustomerActionPerformed(evt);
            }
        });

        btnNewOrder.setText("Skapa order");
        btnNewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewOrderActionPerformed(evt);
            }
        });

        btnRemoveCustomer.setLabel("Ta bort kund");
        btnRemoveCustomer.setName("Ta bort kund"); // NOI18N

        javax.swing.GroupLayout jPanelEditCustomerLayout = new javax.swing.GroupLayout(jPanelEditCustomer);
        jPanelEditCustomer.setLayout(jPanelEditCustomerLayout);
        jPanelEditCustomerLayout.setHorizontalGroup(
            jPanelEditCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEditCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditCustomer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNewOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelEditCustomerLayout.createSequentialGroup()
                        .addComponent(btnRemoveCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelEditCustomerLayout.setVerticalGroup(
            jPanelEditCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEditCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemoveCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNewOrder)
                .addContainerGap())
        );

        jPanelSearchCustomer.setBorder(javax.swing.BorderFactory.createTitledBorder("Sök"));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanelCustomersLayout.setVerticalGroup(
            jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustomersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                    .addGroup(jPanelCustomersLayout.createSequentialGroup()
                        .addComponent(jPanelSearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelEditCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(txtSearchBoat, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(btnSearchBoat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtSearchBoat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchBoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );

        jPanelEditCustomer2.setBorder(javax.swing.BorderFactory.createTitledBorder("Verktyg"));

        btnAddBoat.setText("Lägg till båt");
        btnAddBoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBoatActionPerformed(evt);
            }
        });

        btnEditBoat.setText("Redigera båt");
        btnEditBoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditBoatActionPerformed(evt);
            }
        });

        btnRemoveBoat.setText("Ta bort båt");
        btnRemoveBoat.setName("Ta bort kund"); // NOI18N

        javax.swing.GroupLayout jPanelEditCustomer2Layout = new javax.swing.GroupLayout(jPanelEditCustomer2);
        jPanelEditCustomer2.setLayout(jPanelEditCustomer2Layout);
        jPanelEditCustomer2Layout.setHorizontalGroup(
            jPanelEditCustomer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditCustomer2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEditCustomer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddBoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditBoat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelEditCustomer2Layout.createSequentialGroup()
                        .addComponent(btnRemoveBoat, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelEditCustomer2Layout.setVerticalGroup(
            jPanelEditCustomer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditCustomer2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnEditBoat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddBoat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemoveBoat)
                .addContainerGap(35, Short.MAX_VALUE))
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
                    .addGroup(jPanelBåtarLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jPanelEditCustomer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelBåtarLayout.setVerticalGroup(
            jPanelBåtarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBåtarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBåtarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanelBåtarLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, Short.MAX_VALUE)
                        .addGroup(jPanelBåtarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelEditCustomer2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        tabbedPaneMainWindow.addTab("Båtar", jPanelBåtar);

        jScrollPane3.setViewportView(lstOrders);

        jPanelEditCustomer1.setBorder(javax.swing.BorderFactory.createTitledBorder("Verktyg"));

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
                    .addComponent(btnShowOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(btnEditOrder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelEditCustomer1Layout.setVerticalGroup(
            jPanelEditCustomer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditCustomer1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnShowOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditOrder)
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
                        .addGap(0, 222, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabbedPaneMainWindow.addTab("Ordrar", jPanelOrdrar);

        lstGoods.setModel(new javax.swing.AbstractListModel() {
            String[] strings = {  };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(lstGoods);

        txtSearchGoods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchGoodsActionPerformed(evt);
            }
        });

        btnSearchGoods.setText("Sök");

        jPanelEditCustomer3.setBorder(javax.swing.BorderFactory.createTitledBorder("Verktyg"));

        btnChangeGoods.setText("Ändra order");
        btnChangeGoods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeGoodsActionPerformed(evt);
            }
        });

        btnAddGoods.setText("Lägg order");
        btnAddGoods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddGoodsActionPerformed(evt);
            }
        });

        btnRemoveGoods.setText("Ta bort order");
        btnRemoveGoods.setName("Ta bort kund"); // NOI18N

        javax.swing.GroupLayout jPanelEditCustomer3Layout = new javax.swing.GroupLayout(jPanelEditCustomer3);
        jPanelEditCustomer3.setLayout(jPanelEditCustomer3Layout);
        jPanelEditCustomer3Layout.setHorizontalGroup(
            jPanelEditCustomer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditCustomer3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEditCustomer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnChangeGoods, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddGoods, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelEditCustomer3Layout.createSequentialGroup()
                        .addComponent(btnRemoveGoods, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelEditCustomer3Layout.setVerticalGroup(
            jPanelEditCustomer3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditCustomer3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnAddGoods)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnChangeGoods)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemoveGoods)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelTillbehörLayout = new javax.swing.GroupLayout(jPanelTillbehör);
        jPanelTillbehör.setLayout(jPanelTillbehörLayout);
        jPanelTillbehörLayout.setHorizontalGroup(
            jPanelTillbehörLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTillbehörLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelTillbehörLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearchGoods, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addGroup(jPanelTillbehörLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnSearchGoods, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                    .addComponent(jPanelEditCustomer3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelTillbehörLayout.setVerticalGroup(
            jPanelTillbehörLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
            .addGroup(jPanelTillbehörLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtSearchGoods, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchGoods, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(227, 227, 227)
                .addComponent(jPanelEditCustomer3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        tabbedPaneMainWindow.addTab("Tillbehör", jPanelTillbehör);

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

    private void initFrames() {

        customerFrame = new CustomerFrame(this);
        boatFrame = new BoatFrame(this);
        orderFrame = new OrderFrame(this);

    }

    public void setController(Controller controller) {

        this.controller = controller;
        customerFrame.setController(controller);
        boatFrame.setController(controller);
        orderFrame.setController(controller);

    }

    private Controller getController() {

        return controller;

    }

    public void updateLists() {

        System.out.println("Updating JLists.");
        this.lstCustomer.setModel(getController().getCustomerListModel());


    }

    private void addActionListenerToButtons() {
        //Customer
        this.btnAddCustomer.addActionListener(this);
        this.btnEditCustomer.addActionListener(this);
        this.btnRemoveCustomer.addActionListener(this);
        //Order
        this.btnNewOrder.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("ActionEvent from " + e.getSource().getClass().getSimpleName());

        if (e.getSource() == this.btnAddCustomer) {
            customerFrame.clearTextFields();
            customerFrame.setNewCustomer(true);
            customerFrame.setTitle("Lägg till kund");
            customerFrame.setVisible(true);
        }

        if (e.getSource() == this.btnEditCustomer) {

            if (this.lstCustomer.getSelectedValue() instanceof ListItem) {

                ListItem li;
                li = (ListItem) this.lstCustomer.getSelectedValue();

                this.customerFrame.setNewCustomer(false);
                this.customerFrame.setCustomerKey(li.getKey());
                this.customerFrame.fillTextBoxes(getController().getCustomerData(li.getKey()));

                this.customerFrame.setVisible(true);
            }
             
             

            if (e.getSource() == this.btnNewOrder) {

                orderFrame.setTitle("Skapa order");
                orderFrame.updateList();
                orderFrame.setVisible(true);


            }



        }
    if (e.getSource() == this.btnRemoveCustomer) {
                 
                  ListItem li;
                li = (ListItem) this.lstCustomer.getSelectedValue();
                
                Integer customerID = li.getKey();
                 getController().removeCustomer(customerID);
                 this.updateLists();
             }   
    }// Actionlistner slutar här
    

    //AUTOGENERERAD KOD
    private void txtSearchCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchCustomerActionPerformed
    }//GEN-LAST:event_txtSearchCustomerActionPerformed

    private void btnAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustomerActionPerformed
    }//GEN-LAST:event_btnAddCustomerActionPerformed

    private void txtSearchBoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchBoatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchBoatActionPerformed

    private void btnShowOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnShowOrderActionPerformed

    private void rbtnOrderSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnOrderSellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnOrderSellActionPerformed

    private void btnNewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewOrderActionPerformed

    private void btnEditCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditCustomerActionPerformed

    private void btnAddBoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBoatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddBoatActionPerformed

    private void btnEditBoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditBoatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditBoatActionPerformed

    private void txtSearchGoodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchGoodsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchGoodsActionPerformed

    private void btnChangeGoodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeGoodsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnChangeGoodsActionPerformed

    private void btnAddGoodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddGoodsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddGoodsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBoat;
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JButton btnAddGoods;
    private javax.swing.JButton btnChangeGoods;
    private javax.swing.JButton btnEditBoat;
    private javax.swing.JButton btnEditCustomer;
    private javax.swing.JButton btnEditOrder;
    private javax.swing.JButton btnNewOrder;
    private javax.swing.JButton btnOrderSearch;
    private javax.swing.JButton btnRemoveBoat;
    private javax.swing.JButton btnRemoveCustomer;
    private javax.swing.JButton btnRemoveGoods;
    private javax.swing.JButton btnSearchBoat;
    private javax.swing.JButton btnSearchCustomer;
    private javax.swing.JButton btnSearchGoods;
    private javax.swing.JButton btnShowOrder;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelBåtar;
    private javax.swing.JPanel jPanelCustomers;
    private javax.swing.JPanel jPanelEditCustomer;
    private javax.swing.JPanel jPanelEditCustomer1;
    private javax.swing.JPanel jPanelEditCustomer2;
    private javax.swing.JPanel jPanelEditCustomer3;
    private javax.swing.JPanel jPanelOrderFilters;
    private javax.swing.JPanel jPanelOrderSearch;
    private javax.swing.JPanel jPanelOrdrar;
    private javax.swing.JPanel jPanelSearchCustomer;
    private javax.swing.JPanel jPanelTillbehör;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JList lstBoats;
    private javax.swing.JList lstCustomer;
    private javax.swing.JList lstGoods;
    private javax.swing.JList lstOrders;
    private javax.swing.JRadioButton rbtnOrderBuy;
    private javax.swing.JRadioButton rbtnOrderSell;
    private javax.swing.JTabbedPane tabbedPaneMainWindow;
    private javax.swing.JTextField txtSearchBoat;
    private javax.swing.JTextField txtSearchCustomer;
    private javax.swing.JTextField txtSearchGoods;
    // End of variables declaration//GEN-END:variables
}
