/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.gui;

import is.controller.Controller;
import is.controller.ListItem;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JList;

/**
 *
 * @author svalan
 */
public class MainWindow extends javax.swing.JFrame implements ActionListener {

    Controller controller;
    BoatFrame boatFrame;
    CustomerFrame customerFrame;
    GoodsFrame goodsFrame;
    OrderFrame orderFrame;

    public MainWindow() {


        initComponents();
        setIcon();

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
        jPanelBåtar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstBoat = new javax.swing.JList();
        jPanel3 = new javax.swing.JPanel();
        jPanelEditCustomer2 = new javax.swing.JPanel();
        btnAddBoat = new javax.swing.JButton();
        btnEditBoat = new javax.swing.JButton();
        btnRemoveBoat = new javax.swing.JButton();
        jPanelOrdrar = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstOrders = new javax.swing.JList();
        jPanelEditCustomer1 = new javax.swing.JPanel();
        btnRemoveOrder = new javax.swing.JButton();
        btnEditOrder = new javax.swing.JButton();
        jPanelOrderFilters = new javax.swing.JPanel();
        rbtnOrderBuy = new javax.swing.JRadioButton();
        rbtnOrderSell = new javax.swing.JRadioButton();
        jPanelTillbehör = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstGoods = new javax.swing.JList();
        pnlGoods = new javax.swing.JPanel();
        btnAddGoods = new javax.swing.JButton();
        btnEditGoods = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seghel & Bååth");

        tabbedPaneMainWindow.setName("asdds"); // NOI18N

        jPanelCustomers.setName(""); // NOI18N

        lstCustomer.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
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
                    .addComponent(btnNewOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemoveCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jPanelCustomersLayout = new javax.swing.GroupLayout(jPanelCustomers);
        jPanelCustomers.setLayout(jPanelCustomersLayout);
        jPanelCustomersLayout.setHorizontalGroup(
            jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustomersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelEditCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelCustomersLayout.setVerticalGroup(
            jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustomersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                    .addGroup(jPanelCustomersLayout.createSequentialGroup()
                        .addComponent(jPanelEditCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tabbedPaneMainWindow.addTab("Kunder", jPanelCustomers);

        lstBoat.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lstBoat.setModel(new javax.swing.AbstractListModel() {
            String[] strings = {  };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstBoat);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
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
        btnEditBoat.setMaximumSize(new java.awt.Dimension(75, 23));
        btnEditBoat.setMinimumSize(new java.awt.Dimension(75, 23));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEditCustomer2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEditCustomer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEditBoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddBoat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemoveBoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelEditCustomer2Layout.setVerticalGroup(
            jPanelEditCustomer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditCustomer2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnEditBoat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddBoat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRemoveBoat)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelBåtarLayout = new javax.swing.GroupLayout(jPanelBåtar);
        jPanelBåtar.setLayout(jPanelBåtarLayout);
        jPanelBåtarLayout.setHorizontalGroup(
            jPanelBåtarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBåtarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelBåtarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBåtarLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelBåtarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelEditCustomer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelBåtarLayout.setVerticalGroup(
            jPanelBåtarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBåtarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBåtarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                    .addGroup(jPanelBåtarLayout.createSequentialGroup()
                        .addComponent(jPanelEditCustomer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        tabbedPaneMainWindow.addTab("Båtar", jPanelBåtar);

        lstOrders.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jScrollPane3.setViewportView(lstOrders);

        jPanelEditCustomer1.setBorder(javax.swing.BorderFactory.createTitledBorder("Verktyg"));

        btnRemoveOrder.setText("Ta bort order");

        btnEditOrder.setText("Redigera order");

        javax.swing.GroupLayout jPanelEditCustomer1Layout = new javax.swing.GroupLayout(jPanelEditCustomer1);
        jPanelEditCustomer1.setLayout(jPanelEditCustomer1Layout);
        jPanelEditCustomer1Layout.setHorizontalGroup(
            jPanelEditCustomer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditCustomer1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEditCustomer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(btnRemoveOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelEditCustomer1Layout.setVerticalGroup(
            jPanelEditCustomer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditCustomer1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemoveOrder)
                .addContainerGap())
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

        javax.swing.GroupLayout jPanelOrdrarLayout = new javax.swing.GroupLayout(jPanelOrdrar);
        jPanelOrdrar.setLayout(jPanelOrdrarLayout);
        jPanelOrdrarLayout.setHorizontalGroup(
            jPanelOrdrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOrdrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelOrdrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelOrderFilters, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelEditCustomer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelOrdrarLayout.setVerticalGroup(
            jPanelOrdrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOrdrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOrdrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                    .addGroup(jPanelOrdrarLayout.createSequentialGroup()
                        .addComponent(jPanelEditCustomer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelOrderFilters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tabbedPaneMainWindow.addTab("Ordrar", jPanelOrdrar);

        lstGoods.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lstGoods.setModel(new javax.swing.AbstractListModel() {
            String[] strings = {  };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(lstGoods);

        pnlGoods.setBorder(javax.swing.BorderFactory.createTitledBorder("Verktyg"));

        btnAddGoods.setText("Lägg till vara");
        btnAddGoods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddGoodsActionPerformed(evt);
            }
        });

        btnEditGoods.setText("Redigera vara");
        btnEditGoods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditGoodsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlGoodsLayout = new javax.swing.GroupLayout(pnlGoods);
        pnlGoods.setLayout(pnlGoodsLayout);
        pnlGoodsLayout.setHorizontalGroup(
            pnlGoodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGoodsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGoodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditGoods, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(btnAddGoods, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlGoodsLayout.setVerticalGroup(
            pnlGoodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGoodsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddGoods)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditGoods)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelTillbehörLayout = new javax.swing.GroupLayout(jPanelTillbehör);
        jPanelTillbehör.setLayout(jPanelTillbehörLayout);
        jPanelTillbehörLayout.setHorizontalGroup(
            jPanelTillbehörLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTillbehörLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlGoods, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTillbehörLayout.setVerticalGroup(
            jPanelTillbehörLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTillbehörLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTillbehörLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                    .addGroup(jPanelTillbehörLayout.createSequentialGroup()
                        .addComponent(pnlGoods, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tabbedPaneMainWindow.addTab("Varor", jPanelTillbehör);

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
        goodsFrame = new GoodsFrame(this);

    }

    public void setController(Controller controller) {

        this.controller = controller;
        customerFrame.setController(controller);
        boatFrame.setController(controller);
        orderFrame.setController(controller);
        goodsFrame.setController(controller);

    }

    private Controller getController() {

        return controller;

    }

    public void updateLists() {

        System.out.println("Updating JLists.");
        this.lstCustomer.setModel(getController().getCustomerListModel());
        this.lstGoods.setModel(getController().getGoodsListModel());
        this.lstBoat.setModel(getController().getBoatListModel());
        this.lstOrders.setModel(getController().getOrderListModel());

    }

    private void addActionListenerToButtons() {

        //Boats
        this.btnAddBoat.addActionListener(this);
        this.btnEditBoat.addActionListener(this);
        this.btnRemoveBoat.addActionListener(this);

        //Customer
        this.btnAddCustomer.addActionListener(this);
        this.btnEditCustomer.addActionListener(this);
        this.btnRemoveCustomer.addActionListener(this);
        //Order i Customer
        this.btnNewOrder.addActionListener(this);

        //Goods
        this.btnAddGoods.addActionListener(this);
        this.btnEditGoods.addActionListener(this);

        //Order
        this.btnEditOrder.addActionListener(this);
        this.btnRemoveOrder.addActionListener(this);
    }

    /**
     * Denna metod hämtar valt ListItem och returnerar den nyckel som finns i
     * objektet.
     */
    private int getSelectedKey(JList jlist) {

        int key;

        ListItem li;
        li = (ListItem) jlist.getSelectedValue();

        key = li.getID();

        return key;



    }

    //Actionlistener, sköter alla knappar.
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() instanceof JButton) {
            JButton btn = (JButton) e.getSource();
            String btnName = btn.getText();
            System.out.println("Du tryckte på knappen " + btnName + ".");

        }


        //Kunder
        if (e.getSource() == this.btnAddCustomer) {
            customerFrame.clearTextFields();
            customerFrame.setNewCustomer(true);
            customerFrame.setTitle("Lägg till kund");
            customerFrame.setVisible(true);
        }//if

        if (this.lstCustomer.getSelectedValue() instanceof ListItem) {

            int customerID = this.getSelectedKey(this.lstCustomer);

            if (e.getSource() == this.btnEditCustomer) {


                this.customerFrame.setNewCustomer(false);
                this.customerFrame.setCustomerKey(customerID);
                ArrayList<String> customerData = this.getController().getCustomerData(customerID);
                this.customerFrame.fillTextBoxes(customerData);

                this.customerFrame.setVisible(true);

            } else if (e.getSource() == this.btnRemoveCustomer) {

                getController().removeCustomer(customerID);

                this.updateLists();


            } else if (e.getSource() == this.btnNewOrder) {

                orderFrame.newOrderMode(customerID);

            }//else if

        }

        //Orderdel (Lägg till order finns i kunddelen)
        if (this.lstOrders.getSelectedValue() instanceof ListItem) {

            int orderID = this.getSelectedKey(this.lstOrders);

            if (e.getSource() == this.btnEditOrder) {

                orderFrame.editOrderMode(orderID);

                orderFrame.setVisible(true);




            } else if (e.getSource() == this.btnRemoveOrder) {

                controller.removeBuyOrder(orderID);
                this.updateLists();
            }
        }

        //Hantering av knappar i båtdelen
        if (e.getSource() == this.btnAddBoat) {
            boatFrame.clearTextFields();
            boatFrame.setNewBoat(true);
            boatFrame.setTitle("Lägg till båt");
            boatFrame.setVisible(true);
        }

        if (this.lstBoat.getSelectedValue() instanceof ListItem) {

            int boatID = this.getSelectedKey(this.lstBoat);

            if (e.getSource() == this.btnEditBoat) {


                this.boatFrame.setNewBoat(false);
                this.boatFrame.setBoatKey(boatID);
                ArrayList<String> boatData = this.getController().getBoatData(boatID);
                this.boatFrame.fillTextBoxes(boatData);

                this.boatFrame.setVisible(true);

            } else if (e.getSource() == this.btnRemoveBoat) {

                getController().removeBoat(boatID);

                this.updateLists();


            }

        }

        //Hantering av knappar i tillbehörsdelen
        if (e.getSource() == this.btnAddGoods) {

            goodsFrame.newGoodsMode();
            goodsFrame.setVisible(true);

        }


        if (this.lstGoods.getSelectedValue() instanceof ListItem) {

            int goodsID = this.getSelectedKey(this.lstGoods);

            if (e.getSource() == this.btnEditGoods) {

                goodsFrame.editGoodsMode(goodsID);
                goodsFrame.setVisible(true);

            }
        }
    }

    private void btnAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustomerActionPerformed
    }//GEN-LAST:event_btnAddCustomerActionPerformed

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

    private void btnAddGoodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddGoodsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddGoodsActionPerformed

    private void btnEditGoodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditGoodsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditGoodsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBoat;
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JButton btnAddGoods;
    private javax.swing.JButton btnEditBoat;
    private javax.swing.JButton btnEditCustomer;
    private javax.swing.JButton btnEditGoods;
    private javax.swing.JButton btnEditOrder;
    private javax.swing.JButton btnNewOrder;
    private javax.swing.JButton btnRemoveBoat;
    private javax.swing.JButton btnRemoveCustomer;
    private javax.swing.JButton btnRemoveOrder;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelBåtar;
    private javax.swing.JPanel jPanelCustomers;
    private javax.swing.JPanel jPanelEditCustomer;
    private javax.swing.JPanel jPanelEditCustomer1;
    private javax.swing.JPanel jPanelEditCustomer2;
    private javax.swing.JPanel jPanelOrderFilters;
    private javax.swing.JPanel jPanelOrdrar;
    private javax.swing.JPanel jPanelTillbehör;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList lstBoat;
    private javax.swing.JList lstCustomer;
    private javax.swing.JList lstGoods;
    private javax.swing.JList lstOrders;
    private javax.swing.JPanel pnlGoods;
    private javax.swing.JRadioButton rbtnOrderBuy;
    private javax.swing.JRadioButton rbtnOrderSell;
    private javax.swing.JTabbedPane tabbedPaneMainWindow;
    // End of variables declaration//GEN-END:variables

    //Väljer ikon för det övre vänstra hörnet
    private void setIcon() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("boat.png")));
    }
}
