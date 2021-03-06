/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.gui;

import is.controller.Controller;
import is.model.listitems.ListItem;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author svalan
 */
public class MainWindow extends javax.swing.JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private Controller controller;
    private BoatFrame boatFrame;
    private CustomerFrame customerFrame;
    private GoodsFrame goodsFrame;
    private OrderFrame orderFrame;
    private OrderHistoryFrame orderHistoryFrame;

    public MainWindow() {


        initComponents();

        setIcon();

        initFrames();

        addActionListenerToButtons();

        this.setLocationRelativeTo(null);
    }

    //Väljer ikon för det övre vänstra hörnet
    private void setIcon() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("boat.png")));
    }

    /**
     * Intialiserar de övriga JFrames som senare kommer att användas och skickat
     * med en referens till den här JFramen.
     */
    private void initFrames() {

        customerFrame = new CustomerFrame(this);
        boatFrame = new BoatFrame(this);
        orderFrame = new OrderFrame(this);
        goodsFrame = new GoodsFrame(this);
        orderHistoryFrame = new OrderHistoryFrame(this);

    }

    public void setController(Controller controller) {

        this.controller = controller;
        this.customerFrame.setController(controller);
        this.boatFrame.setController(controller);
        this.orderFrame.setController(controller);
        this.orderHistoryFrame.setController(controller);
        this.goodsFrame.setController(controller);

    }

    private Controller getController() {

        return controller;

    }

    public void updateLists() {

        this.lstCustomers.setModel(getController().getCustomerListModel());
        this.lstGoods.setModel(getController().getGoodsListModel());
        this.lstBoats.setModel(getController().getBoatListModel());
        this.lstOrders.setModel(getController().getOrderListModel());

    }

    private void addActionListenerToButtons() {

        //Boats
        this.btnAddBoat.addActionListener(this);
        this.btnEditBoat.addActionListener(this);
        this.btnRemoveBoat.addActionListener(this);

        //Customer
        this.btnSearchCustomer.addActionListener(this);
        this.btnAddCustomer.addActionListener(this);
        this.btnEditCustomer.addActionListener(this);
        this.btnRemoveCustomer.addActionListener(this);

        //Order i CustomerFliken
        this.btnNewOrder.addActionListener(this);
        this.btnOrderHistory.addActionListener(this);

        //Goods
        this.btnAddGoods.addActionListener(this);
        this.btnEditGoods.addActionListener(this);
        this.btnRemoveGoods.addActionListener(this);

        //Order
        this.btnEditOrder.addActionListener(this);
        this.btnRemoveOrder.addActionListener(this);
        this.rbtnShowBuyOrders.addActionListener(this);
        this.rbtnShowSellOrders.addActionListener(this);
        this.rbtnShowAllOrders.addActionListener(this);
    }

    /**
     * Denna metod hämtar valt ListItem och returnerar den nyckel som finns i
     * objektet.
     */
    private int getSelectedKey(JList<ListItem> jlist) {

        int key;

        ListItem li;
        li = jlist.getSelectedValue();

        key = li.getID();

        return key;

    }

    protected void editOrder(int orderID) {

        orderFrame.editOrderMode(orderID);
        orderFrame.setVisible(true);

    }

    /**
     * Actionlistener, sköter alla knappar.
     *
     * @param e Händelsen som skickas från den aktuella knappen.
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.btnSearchCustomer) {

            String searchString = this.txtSearchCustomer.getText();

            ListModel<ListItem> lm = this.getController().getCustomerListModel(searchString);

            this.lstCustomers.setModel(lm);

        }

        //Kundknapparna
        if (e.getSource() == this.btnAddCustomer) {
            customerFrame.clearTextFields();
            customerFrame.setNewCustomer(true);
            customerFrame.setTitle("Lägg till kund");
            customerFrame.setVisible(true);
        }//if

        if (this.lstCustomers.getSelectedValue() instanceof ListItem) {

            int customerID = this.getSelectedKey(this.lstCustomers);

            if (e.getSource() == this.btnEditCustomer) {

                this.customerFrame.setNewCustomer(false);
                this.customerFrame.setCustomerKey(customerID);
                String[] customerData = this.getController().getCustomerData(customerID);
                this.customerFrame.fillTextBoxes(customerData);

                this.customerFrame.setVisible(true);

            } else if (e.getSource() == this.btnRemoveCustomer) {

                int confirmButton = JOptionPane.showConfirmDialog(this, "Bekräfta borttagnig av kund?", "Ta bort kund",
                        JOptionPane.YES_NO_OPTION);

                if (confirmButton == JOptionPane.YES_OPTION) {


                    getController().removeCustomer(customerID);

                    this.updateLists();

                }
            } else if (e.getSource() == this.btnNewOrder) {

                orderFrame.newOrderMode(customerID);

            }//else if
            //Öppnar orderhistoriken för en viss kund
            else if (e.getSource() == this.btnOrderHistory && !this.orderFrame.isVisible()) {

                this.orderHistoryFrame.initFrame(customerID);
                this.orderHistoryFrame.setVisible(true);
            }




        }//Slut på "något valt i listan" - if


        //Orderdel (Lägg till order finns i kunddelen)
        if (this.lstOrders.getSelectedValue() instanceof ListItem) {

            int orderID = this.getSelectedKey(this.lstOrders);

            if (e.getSource() == this.btnEditOrder) {

                this.editOrder(orderID);

            } else if (e.getSource() == this.btnRemoveOrder) {

                int confirmButton = JOptionPane.showConfirmDialog(this, "Bekräfta borttagnig av order?", "Ta bort order",
                        JOptionPane.YES_NO_OPTION);

                if (confirmButton == JOptionPane.YES_OPTION) {

                    controller.removeBuyOrder(orderID);
                    this.updateLists();

                }
            }
        }

        if (e.getSource() == this.rbtnShowAllOrders) {

            this.lstOrders.setModel(getController().getOrderListModel());

        } else if (e.getSource() == this.rbtnShowBuyOrders) {

            this.lstOrders.setModel(getController().getBuyOrderListModel());

        } else if (e.getSource() == this.rbtnShowSellOrders) {

            this.lstOrders.setModel(getController().getSellOrderListModel());
        }

        //Hantering av knappar i båtdelen
        if (e.getSource()
                == this.btnAddBoat) {
            boatFrame.clearTextFields();
            boatFrame.setNewBoat(true);
            boatFrame.setTitle("Lägg till båt");
            boatFrame.setVisible(true);
        }

        if (this.lstBoats.getSelectedValue() instanceof ListItem) {

            int boatID = this.getSelectedKey(this.lstBoats);

            if (e.getSource() == this.btnEditBoat) {


                this.boatFrame.setNewBoat(false);
                this.boatFrame.setBoatID(boatID);
                String[] boatData = this.getController().getBoatData(boatID);
                this.boatFrame.fillTextBoxes(boatData);

                this.boatFrame.setVisible(true);

            } else if (e.getSource() == this.btnRemoveBoat) {


                int confirmButton = JOptionPane.showConfirmDialog(this, "Bekräfta borttagnig av båt?", "Ta bort båt",
                        JOptionPane.YES_NO_OPTION);

                if (confirmButton == JOptionPane.YES_OPTION) {

                    getController().removeBoat(boatID);
                    this.updateLists();

                }

            }

        }

        //Hantering av knappar i tillbehörsdelen
        if (e.getSource()
                == this.btnAddGoods) {

            goodsFrame.newGoodsMode();
            goodsFrame.setVisible(true);

        }

        if (this.lstGoods.getSelectedValue() instanceof ListItem) {

            int goodsID = this.getSelectedKey(this.lstGoods);

            if (e.getSource() == this.btnEditGoods) {

                goodsFrame.editGoodsMode(goodsID);
                goodsFrame.setVisible(true);


            } else if (e.getSource() == this.btnRemoveGoods) {


                int confirmButton = JOptionPane.showConfirmDialog(this, "Bekräfta borttagnig av tillbehör?", "Ta bort tillbehör",
                        JOptionPane.YES_NO_OPTION);

                if (confirmButton == JOptionPane.YES_OPTION) {

                    getController().removeGoods(goodsID);
                    this.updateLists();

                }
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupOrderType = new javax.swing.ButtonGroup();
        tabbedPaneMainWindow = new javax.swing.JTabbedPane();
        pnlCustomers = new javax.swing.JPanel();
        jScrollPaneCustomers = new javax.swing.JScrollPane();
        lstCustomers = new javax.swing.JList<ListItem>();
        jPanelCustomerTools = new javax.swing.JPanel();
        btnAddCustomer = new javax.swing.JButton();
        btnEditCustomer = new javax.swing.JButton();
        btnNewOrder = new javax.swing.JButton();
        btnRemoveCustomer = new javax.swing.JButton();
        btnOrderHistory = new javax.swing.JButton();
        pnlSearchCustomer = new javax.swing.JPanel();
        btnSearchCustomer = new javax.swing.JButton();
        txtSearchCustomer = new javax.swing.JTextField();
        pnlBoats = new javax.swing.JPanel();
        jScrollPaneBoats = new javax.swing.JScrollPane();
        lstBoats = new javax.swing.JList<ListItem>();
        jPanelBoatTools = new javax.swing.JPanel();
        btnAddBoat = new javax.swing.JButton();
        btnEditBoat = new javax.swing.JButton();
        btnRemoveBoat = new javax.swing.JButton();
        pnlOrders = new javax.swing.JPanel();
        jScrollPaneOrders = new javax.swing.JScrollPane();
        lstOrders = new javax.swing.JList<ListItem>();
        pnlOrderTools = new javax.swing.JPanel();
        btnRemoveOrder = new javax.swing.JButton();
        btnEditOrder = new javax.swing.JButton();
        pnlOrderFilters = new javax.swing.JPanel();
        rbtnShowBuyOrders = new javax.swing.JRadioButton();
        rbtnShowSellOrders = new javax.swing.JRadioButton();
        rbtnShowAllOrders = new javax.swing.JRadioButton();
        pnlGoods = new javax.swing.JPanel();
        jScrollPaneGoods = new javax.swing.JScrollPane();
        lstGoods = new javax.swing.JList<ListItem>();
        pnlGoodsTools = new javax.swing.JPanel();
        btnAddGoods = new javax.swing.JButton();
        btnEditGoods = new javax.swing.JButton();
        btnRemoveGoods = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seghel & Bååth");

        tabbedPaneMainWindow.setName("asdds"); // NOI18N

        pnlCustomers.setName(""); // NOI18N

        lstCustomers.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jScrollPaneCustomers.setViewportView(lstCustomers);

        jPanelCustomerTools.setBorder(javax.swing.BorderFactory.createTitledBorder("Verktyg"));

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

        btnRemoveCustomer.setText("Ta bort kund");
        btnRemoveCustomer.setName("Ta bort kund"); // NOI18N

        btnOrderHistory.setText("Orderhistorik");

        javax.swing.GroupLayout jPanelCustomerToolsLayout = new javax.swing.GroupLayout(jPanelCustomerTools);
        jPanelCustomerTools.setLayout(jPanelCustomerToolsLayout);
        jPanelCustomerToolsLayout.setHorizontalGroup(
            jPanelCustomerToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustomerToolsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCustomerToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNewOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemoveCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(btnOrderHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelCustomerToolsLayout.setVerticalGroup(
            jPanelCustomerToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustomerToolsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemoveCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNewOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOrderHistory)
                .addContainerGap())
        );

        pnlSearchCustomer.setBorder(javax.swing.BorderFactory.createTitledBorder("Sök"));

        btnSearchCustomer.setText("Sök kund");

        txtSearchCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSearchCustomerLayout = new javax.swing.GroupLayout(pnlSearchCustomer);
        pnlSearchCustomer.setLayout(pnlSearchCustomerLayout);
        pnlSearchCustomerLayout.setHorizontalGroup(
            pnlSearchCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSearchCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSearchCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearchCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(btnSearchCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlSearchCustomerLayout.setVerticalGroup(
            pnlSearchCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSearchCustomerLayout.createSequentialGroup()
                .addComponent(txtSearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSearchCustomer)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlCustomersLayout = new javax.swing.GroupLayout(pnlCustomers);
        pnlCustomers.setLayout(pnlCustomersLayout);
        pnlCustomersLayout.setHorizontalGroup(
            pnlCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCustomersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelCustomerTools, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSearchCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlCustomersLayout.setVerticalGroup(
            pnlCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCustomersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneCustomers, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                    .addGroup(pnlCustomersLayout.createSequentialGroup()
                        .addComponent(pnlSearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelCustomerTools, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tabbedPaneMainWindow.addTab("Kunder", pnlCustomers);

        lstBoats.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jScrollPaneBoats.setViewportView(lstBoats);

        jPanelBoatTools.setBorder(javax.swing.BorderFactory.createTitledBorder("Verktyg"));

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

        javax.swing.GroupLayout jPanelBoatToolsLayout = new javax.swing.GroupLayout(jPanelBoatTools);
        jPanelBoatTools.setLayout(jPanelBoatToolsLayout);
        jPanelBoatToolsLayout.setHorizontalGroup(
            jPanelBoatToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBoatToolsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBoatToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEditBoat, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(btnAddBoat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemoveBoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelBoatToolsLayout.setVerticalGroup(
            jPanelBoatToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBoatToolsLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnEditBoat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddBoat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRemoveBoat)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlBoatsLayout = new javax.swing.GroupLayout(pnlBoats);
        pnlBoats.setLayout(pnlBoatsLayout);
        pnlBoatsLayout.setHorizontalGroup(
            pnlBoatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBoatsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneBoats, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBoatTools, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlBoatsLayout.setVerticalGroup(
            pnlBoatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBoatsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBoatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneBoats, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                    .addGroup(pnlBoatsLayout.createSequentialGroup()
                        .addComponent(jPanelBoatTools, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tabbedPaneMainWindow.addTab("Båtar", pnlBoats);

        lstOrders.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jScrollPaneOrders.setViewportView(lstOrders);

        pnlOrderTools.setBorder(javax.swing.BorderFactory.createTitledBorder("Verktyg"));

        btnRemoveOrder.setText("Ta bort order");

        btnEditOrder.setText("Redigera order");

        javax.swing.GroupLayout pnlOrderToolsLayout = new javax.swing.GroupLayout(pnlOrderTools);
        pnlOrderTools.setLayout(pnlOrderToolsLayout);
        pnlOrderToolsLayout.setHorizontalGroup(
            pnlOrderToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrderToolsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOrderToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(btnRemoveOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlOrderToolsLayout.setVerticalGroup(
            pnlOrderToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrderToolsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemoveOrder)
                .addContainerGap())
        );

        pnlOrderFilters.setBorder(javax.swing.BorderFactory.createTitledBorder("Visningsfilter"));

        btnGroupOrderType.add(rbtnShowBuyOrders);
        rbtnShowBuyOrders.setText("Köp");

        btnGroupOrderType.add(rbtnShowSellOrders);
        rbtnShowSellOrders.setText("Sälj");
        rbtnShowSellOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnShowSellOrdersActionPerformed(evt);
            }
        });

        btnGroupOrderType.add(rbtnShowAllOrders);
        rbtnShowAllOrders.setSelected(true);
        rbtnShowAllOrders.setText("Alla");

        javax.swing.GroupLayout pnlOrderFiltersLayout = new javax.swing.GroupLayout(pnlOrderFilters);
        pnlOrderFilters.setLayout(pnlOrderFiltersLayout);
        pnlOrderFiltersLayout.setHorizontalGroup(
            pnlOrderFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrderFiltersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOrderFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnShowBuyOrders)
                    .addComponent(rbtnShowSellOrders)
                    .addComponent(rbtnShowAllOrders))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        pnlOrderFiltersLayout.setVerticalGroup(
            pnlOrderFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrderFiltersLayout.createSequentialGroup()
                .addComponent(rbtnShowBuyOrders)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnShowSellOrders)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbtnShowAllOrders)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlOrdersLayout = new javax.swing.GroupLayout(pnlOrders);
        pnlOrders.setLayout(pnlOrdersLayout);
        pnlOrdersLayout.setHorizontalGroup(
            pnlOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrdersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlOrderFilters, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlOrderTools, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlOrdersLayout.setVerticalGroup(
            pnlOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOrdersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneOrders, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                    .addGroup(pnlOrdersLayout.createSequentialGroup()
                        .addComponent(pnlOrderTools, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlOrderFilters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tabbedPaneMainWindow.addTab("Ordrar", pnlOrders);

        lstGoods.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jScrollPaneGoods.setViewportView(lstGoods);

        pnlGoodsTools.setBorder(javax.swing.BorderFactory.createTitledBorder("Verktyg"));

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

        btnRemoveGoods.setText("Ta bort vara");

        javax.swing.GroupLayout pnlGoodsToolsLayout = new javax.swing.GroupLayout(pnlGoodsTools);
        pnlGoodsTools.setLayout(pnlGoodsToolsLayout);
        pnlGoodsToolsLayout.setHorizontalGroup(
            pnlGoodsToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGoodsToolsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGoodsToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRemoveGoods, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddGoods, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(btnEditGoods, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlGoodsToolsLayout.setVerticalGroup(
            pnlGoodsToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGoodsToolsLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnAddGoods)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditGoods)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemoveGoods)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlGoodsLayout = new javax.swing.GroupLayout(pnlGoods);
        pnlGoods.setLayout(pnlGoodsLayout);
        pnlGoodsLayout.setHorizontalGroup(
            pnlGoodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGoodsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneGoods, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlGoodsTools, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlGoodsLayout.setVerticalGroup(
            pnlGoodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGoodsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGoodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneGoods, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                    .addGroup(pnlGoodsLayout.createSequentialGroup()
                        .addComponent(pnlGoodsTools, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 378, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tabbedPaneMainWindow.addTab("Varor", pnlGoods);

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

    // <editor-fold defaultstate="collapsed" desc="Genererade ActionEvent-metoder"> 
    private void btnAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustomerActionPerformed
    }//GEN-LAST:event_btnAddCustomerActionPerformed

    private void rbtnShowSellOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnShowSellOrdersActionPerformed
    }//GEN-LAST:event_rbtnShowSellOrdersActionPerformed

    private void btnNewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewOrderActionPerformed
    }//GEN-LAST:event_btnNewOrderActionPerformed

    private void btnEditCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditCustomerActionPerformed
    }//GEN-LAST:event_btnEditCustomerActionPerformed

    private void btnAddBoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBoatActionPerformed
    }//GEN-LAST:event_btnAddBoatActionPerformed

    private void btnEditBoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditBoatActionPerformed
    }//GEN-LAST:event_btnEditBoatActionPerformed

    private void btnAddGoodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddGoodsActionPerformed
    }//GEN-LAST:event_btnAddGoodsActionPerformed

    private void btnEditGoodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditGoodsActionPerformed
    }//GEN-LAST:event_btnEditGoodsActionPerformed

    private void txtSearchCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchCustomerActionPerformed
    }//GEN-LAST:event_txtSearchCustomerActionPerformed
// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Genererade Deklarationer"> 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBoat;
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JButton btnAddGoods;
    private javax.swing.JButton btnEditBoat;
    private javax.swing.JButton btnEditCustomer;
    private javax.swing.JButton btnEditGoods;
    private javax.swing.JButton btnEditOrder;
    private javax.swing.ButtonGroup btnGroupOrderType;
    private javax.swing.JButton btnNewOrder;
    private javax.swing.JButton btnOrderHistory;
    private javax.swing.JButton btnRemoveBoat;
    private javax.swing.JButton btnRemoveCustomer;
    private javax.swing.JButton btnRemoveGoods;
    private javax.swing.JButton btnRemoveOrder;
    private javax.swing.JButton btnSearchCustomer;
    private javax.swing.JPanel jPanelBoatTools;
    private javax.swing.JPanel jPanelCustomerTools;
    private javax.swing.JScrollPane jScrollPaneBoats;
    private javax.swing.JScrollPane jScrollPaneCustomers;
    private javax.swing.JScrollPane jScrollPaneGoods;
    private javax.swing.JScrollPane jScrollPaneOrders;
    private javax.swing.JList<ListItem> lstBoats;
    private javax.swing.JList<ListItem> lstCustomers;
    private javax.swing.JList<ListItem> lstGoods;
    private javax.swing.JList<ListItem> lstOrders;
    private javax.swing.JPanel pnlBoats;
    private javax.swing.JPanel pnlCustomers;
    private javax.swing.JPanel pnlGoods;
    private javax.swing.JPanel pnlGoodsTools;
    private javax.swing.JPanel pnlOrderFilters;
    private javax.swing.JPanel pnlOrderTools;
    private javax.swing.JPanel pnlOrders;
    private javax.swing.JPanel pnlSearchCustomer;
    private javax.swing.JRadioButton rbtnShowAllOrders;
    private javax.swing.JRadioButton rbtnShowBuyOrders;
    private javax.swing.JRadioButton rbtnShowSellOrders;
    private javax.swing.JTabbedPane tabbedPaneMainWindow;
    private javax.swing.JTextField txtSearchCustomer;
    // End of variables declaration//GEN-END:variables
// </editor-fold>
}
