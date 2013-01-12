/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.gui;

import is.controller.BoatListItem;
import is.controller.Controller;
import is.controller.GoodsListItem;
import is.controller.ListItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 *
 * @author Viktor Voigt
 */
public class OrderFrame extends javax.swing.JFrame implements ActionListener {

    Controller controller;
    private MainWindow parent;
    private int customerID;
    private int orderID;
    private boolean boatMode = false;
    private boolean newOrder;

    protected OrderFrame(MainWindow parent) {

        //Anropar netbeans autogenererade kod
        initComponents();

        //Fönstret registrerar sig själv som ActionListener
        addActionListenerToButtons();

        this.parent = parent;

        //Placerar fönstret mitt på skärmen
        this.setLocationRelativeTo(null);

    }

    private void addActionListenerToButtons() {
        this.btnAddProduct.addActionListener(this);
        this.btnRemoveProduct.addActionListener(this);

        this.btnSaveOrder.addActionListener(this);
        this.btnCancel.addActionListener(this);

        this.rbtnBoat.addActionListener(this);
        this.rbtnGoods.addActionListener(this);
        
        this.rbtnBuyOrder.addActionListener(this);
        this.rbtnSellOrder.addActionListener(this);

    }

    private void initInterface() {

        //Hämtar kundens namn
        String[] customerData = getController().getCustomerData(customerID);
        this.txtCustomer.setText(customerData[0]);

        //Kontrollerar om ordern skall redigeras eller läggas till. Uppdaterar sedan användargränssnittet. 
        if (!newOrder) {

            String[] orderData = getController().getOrderData(orderID);
            
            this.txtBillingDate.setText(orderData[0]);
            this.txtOrderNr.setText(Integer.toString(orderID));

            this.txtStreet.setText(orderData[2]);
            this.txtPostCode.setText(orderData[3]);
            this.txtCity.setText(orderData[4]);

            ListModel<ListItem> lm = controller.getOrderRowListModel(orderID);

            this.lstOrderRows.setModel(lm);
            
            if (this.getController().isBuyorder(orderID))
            {
                this.rbtnBuyOrder.setSelected(true);
            }
            else {
                this.rbtnSellOrder.setSelected(true);
            }
            this.rbtnBuyOrder.setEnabled(false);
            this.rbtnSellOrder.setEnabled(false);

        } else if (newOrder) {

            this.txtOrderNr.setText(null);
            this.txtBillingDate.setText(null);
            this.txtStreet.setText(customerData[3]);
            this.txtPostCode.setText(customerData[4]);
            this.txtCity.setText(customerData[5]);
            this.txtBillingDate.setText("130112");

            this.lstOrderRows.setModel(new DefaultListModel<ListItem>());
            
            this.rbtnBuyOrder.setEnabled(true);
            this.rbtnSellOrder.setEnabled(true);

        }

    }

    protected void setController(Controller controller) {
        this.controller = controller;
    }

    private Controller getController() {

        return this.controller;
    }
    
    //Setters för customerID och orderID
    void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    //Efter att en produkt lagts till eller tagis bort uppdateras listorna beroende på om man är i båtläge eller tillbehörsläge
    public void updateProductList() {


        if (boatMode) {

            lstProducts.setModel(getController().getBoatListModel());

        } else {

            this.lstProducts.setModel(getController().getGoodsListModel());
        }

        this.lstOrderRows.repaint();

    }

    //Om inte tillbehöret int redan finns i listan läggs det till som nytt. 
    private void addNewGoodsListItem(int goodsID) {

        GoodsListItem gli;
        
        DefaultListModel<ListItem> lm;

        lm = (DefaultListModel<ListItem>) this.lstOrderRows.getModel();

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

                if (goodsID == li.getID()) {
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

                if (goodsID == li.getID()) {

                    li.addQuantity(toAdd);
                    System.out.println(li.toString() + " added " + toAdd);


                }


            }

        }


    }

    //Lägger till båt i orderrad
    private void addBoatListItem(int productID) {
        
        DefaultListModel<ListItem> lm = (DefaultListModel<ListItem>) lstOrderRows.getModel();

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

        if (!newOrder) {

            this.getController().editBuyOrder(billingDate, billingAddressStreet, billingAddressPostCode, billingAddressCity, customerID, true, orderID);

        } else if (newOrder) {
            
            if(this.rbtnBuyOrder.isSelected() == true){

            this.orderID = this.getController().addBuyOrder(customerID, billingDate, billingAddressStreet, billingAddressPostCode, billingAddressCity);
            
            } else {
                
                this.orderID = this.getController().addSellOrder(customerID, billingDate, billingAddressStreet, billingAddressPostCode, billingAddressCity);
                
            }
            
            

        }

        parent.updateLists();

    }

    /**
     * Rensar alla OrderRows från en order. Skriver därefter in nya rader.
     *
     */
    private void saveOrderRows(int orderID) {

        this.getController().clearOrderRows(orderID);

        DefaultListModel lm = (DefaultListModel) this.lstOrderRows.getModel();

        Object[] lmArray = lm.toArray();

        for (Object o : lmArray) {

            if (o instanceof GoodsListItem) {

                GoodsListItem gli = (GoodsListItem) o;

                double price = gli.getPrice();
                int quantity = gli.getQuantity();
                int productID = gli.getID();

                controller.addGoodsOrderRow(orderID, price, quantity, productID);

            }

            if (o instanceof BoatListItem) {

                BoatListItem bli = (BoatListItem) o;

                double price = bli.getPrice();
                int productID = bli.getID();

                controller.addBoatOrderRow(orderID, price, productID);

            }

        }


    }

    void newOrderMode(int customerID) {

        this.newOrder = true;
        setTitle("Skapa order");
        setCustomerID(customerID);
        initInterface();
        updateProductList();
        setVisible(true);

    }

    void editOrderMode(int orderID) {

        this.newOrder = false;

        setTitle("Ändra order");

        //Hämtar CustomerID från order
        String[] orderData = controller.getOrderData(orderID);
        setCustomerID(Integer.valueOf(orderData[1]));

        setOrderID(orderID);

        initInterface();

        updateProductList();

        System.out.println("Öppnar order för kund ID: " + orderID);

    }
    
     @Override
    public void actionPerformed(ActionEvent e) {

        //Stänger ner rutan
        if (e.getSource() == this.btnCancel) {

            this.setVisible(false);

            //Stänger ner rutan och sparar ändringar.
        } else if (e.getSource() == this.btnSaveOrder) {

            //Kontrollerar input och öppnar annars ett felmeddelande
            if (this.controller.inputCheckDate(this.txtBillingDate.getText())
                    && this.controller.inputCheckString(this.txtCity.getText())
                    && this.controller.inputCheckString(this.txtStreet.getText())
                    && this.controller.inputCheckString(this.txtPostCode.getText())) {
                saveOrder();
                saveOrderRows(this.orderID);
                this.setVisible(false);

            } //Öppnar felmeddelandet om det inte redan är öppet. 
            else if (!inputConfirm.isVisible()) {
                inputConfirm.setBounds(0, 0, 300, 125);
                inputConfirm.setVisible(true);
                inputConfirm.setLocationRelativeTo(null);

            }

        }

        if (e.getSource() == this.btnInputConfirm) {
            System.out.println("OK tryckt");
            this.inputConfirm.setVisible(false);
        }



        //Ändrar mellan båtlistan och tillbehörslistan. 
        if (e.getSource() == this.rbtnBoat) {

            this.boatMode = true;
            updateProductList();

        } else if (e.getSource() == this.rbtnGoods) {

            this.boatMode = false;
            updateProductList();
        }


        //Kontrollerar om ett listvärde är markerat och möjliggör att flytta över det. 
        if (lstProducts.getSelectedValue() instanceof ListItem) {

            if (e.getSource() == this.btnAddProduct) {

                ListItem selectedProduct = (ListItem) lstProducts.getSelectedValue();

                int productID = selectedProduct.getID();

                if (boatMode) {

                    this.addBoatListItem(productID);

                } else if (!boatMode) {

                    if (!lstOrderRowsHasGoods(productID)) {

                        this.addNewGoodsListItem(productID);

                    } else {

                        addGoodsListItem(productID, 1);

                    }
                }
            }

            updateProductList();
        }

        if (this.lstOrderRows.getSelectedValue() instanceof ListItem) {

            if (e.getSource() == this.btnRemoveProduct) {

                int index = this.lstOrderRows.getSelectedIndex();

                DefaultListModel lm = (DefaultListModel) this.lstOrderRows.getModel();

                lm.remove(index);

                updateProductList();

            }

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupProducts = new javax.swing.ButtonGroup();
        inputConfirm = new javax.swing.JDialog();
        infoText = new javax.swing.JLabel();
        btnInputConfirm = new javax.swing.JButton();
        btnGroupOrderType = new javax.swing.ButtonGroup();
        jScrollPanelProducts = new javax.swing.JScrollPane();
        lstProducts = new javax.swing.JList<ListItem>();
        btnSaveOrder = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnAddProduct = new javax.swing.JButton();
        btnRemoveProduct = new javax.swing.JButton();
        jScrollPanelOrderRows = new javax.swing.JScrollPane();
        lstOrderRows = new javax.swing.JList<ListItem>();
        jPanelOrderInfo = new javax.swing.JPanel();
        lblBillingDate = new javax.swing.JLabel();
        lblCustomer = new javax.swing.JLabel();
        lblOrderNr = new javax.swing.JLabel();
        txtCustomer = new javax.swing.JTextField();
        txtOrderNr = new javax.swing.JTextField();
        txtBillingDate = new javax.swing.JTextField();
        rbtnBuyOrder = new javax.swing.JRadioButton();
        rbtnSellOrder = new javax.swing.JRadioButton();
        pnlAddress = new javax.swing.JPanel();
        lblStreetAddress = new javax.swing.JLabel();
        lblPostCode = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        txtStreet = new javax.swing.JTextField();
        txtPostCode = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        pnlTools = new javax.swing.JPanel();
        rbtnGoods = new javax.swing.JRadioButton();
        rbtnBoat = new javax.swing.JRadioButton();

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

        jScrollPanelProducts.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        lstProducts.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        jScrollPanelProducts.setViewportView(lstProducts);

        btnSaveOrder.setText("Spara order");

        btnCancel.setText("Avbryt");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnAddProduct.setText("<<");
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        btnRemoveProduct.setText(">>");
        btnRemoveProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveProductActionPerformed(evt);
            }
        });

        jScrollPanelOrderRows.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPanelOrderRows.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        lstOrderRows.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
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

        btnGroupOrderType.add(rbtnBuyOrder);
        rbtnBuyOrder.setText("Köporder");

        btnGroupOrderType.add(rbtnSellOrder);
        rbtnSellOrder.setSelected(true);
        rbtnSellOrder.setText("Säljorder");

        javax.swing.GroupLayout jPanelOrderInfoLayout = new javax.swing.GroupLayout(jPanelOrderInfo);
        jPanelOrderInfo.setLayout(jPanelOrderInfoLayout);
        jPanelOrderInfoLayout.setHorizontalGroup(
            jPanelOrderInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOrderInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOrderInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelOrderInfoLayout.createSequentialGroup()
                        .addGroup(jPanelOrderInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBillingDate)
                            .addComponent(lblOrderNr, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(lblCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelOrderInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtOrderNr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(txtCustomer, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBillingDate))
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(jPanelOrderInfoLayout.createSequentialGroup()
                        .addComponent(rbtnSellOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnBuyOrder)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelOrderInfoLayout.setVerticalGroup(
            jPanelOrderInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOrderInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelOrderInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnBuyOrder)
                    .addComponent(rbtnSellOrder)))
        );

        pnlAddress.setBorder(javax.swing.BorderFactory.createTitledBorder("Faktureringsadress"));

        lblStreetAddress.setText("Gatuadress:");

        lblPostCode.setText("Postnummer:");

        lblCity.setText("Stad:");

        javax.swing.GroupLayout pnlAddressLayout = new javax.swing.GroupLayout(pnlAddress);
        pnlAddress.setLayout(pnlAddressLayout);
        pnlAddressLayout.setHorizontalGroup(
            pnlAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddressLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblStreetAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPostCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(pnlAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtStreet)
                    .addComponent(txtPostCode)
                    .addComponent(txtCity, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlAddressLayout.setVerticalGroup(
            pnlAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddressLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStreetAddress)
                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPostCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPostCode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTools.setBorder(javax.swing.BorderFactory.createTitledBorder("Verktyg"));

        btnGroupProducts.add(rbtnGoods);
        rbtnGoods.setSelected(true);
        rbtnGoods.setText("Visa tillbehör");
        rbtnGoods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnGoodsActionPerformed(evt);
            }
        });

        btnGroupProducts.add(rbtnBoat);
        rbtnBoat.setText("Visa båtar");
        rbtnBoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnBoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlToolsLayout = new javax.swing.GroupLayout(pnlTools);
        pnlTools.setLayout(pnlToolsLayout);
        pnlToolsLayout.setHorizontalGroup(
            pnlToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlToolsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnGoods)
                    .addComponent(rbtnBoat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlToolsLayout.setVerticalGroup(
            pnlToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlToolsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnGoods)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnBoat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jPanelOrderInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlTools, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPanelOrderRows, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAddProduct)
                                    .addComponent(btnRemoveProduct))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPanelProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelOrderInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTools, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPanelOrderRows, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPanelProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(btnAddProduct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoveProduct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveOrder)
                    .addComponent(btnCancel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed

    }//GEN-LAST:event_btnAddProductActionPerformed

    private void btnRemoveProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveProductActionPerformed

    }//GEN-LAST:event_btnRemoveProductActionPerformed

    private void txtCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerActionPerformed

    }//GEN-LAST:event_txtCustomerActionPerformed

    private void txtBillingDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBillingDateActionPerformed

    }//GEN-LAST:event_txtBillingDateActionPerformed

    private void txtOrderNrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrderNrActionPerformed

    }//GEN-LAST:event_txtOrderNrActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed

    }//GEN-LAST:event_btnCancelActionPerformed

    private void rbtnBoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnBoatActionPerformed

    }//GEN-LAST:event_rbtnBoatActionPerformed

    private void btnInputConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputConfirmActionPerformed
        inputConfirm.setVisible(false);
    }//GEN-LAST:event_btnInputConfirmActionPerformed

    private void rbtnGoodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnGoodsActionPerformed

    }//GEN-LAST:event_rbtnGoodsActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnCancel;
    private javax.swing.ButtonGroup btnGroupOrderType;
    private javax.swing.ButtonGroup btnGroupProducts;
    private javax.swing.JButton btnInputConfirm;
    private javax.swing.JButton btnRemoveProduct;
    private javax.swing.JButton btnSaveOrder;
    private javax.swing.JLabel infoText;
    private javax.swing.JDialog inputConfirm;
    private javax.swing.JPanel jPanelOrderInfo;
    private javax.swing.JScrollPane jScrollPanelOrderRows;
    private javax.swing.JScrollPane jScrollPanelProducts;
    private javax.swing.JLabel lblBillingDate;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCustomer;
    private javax.swing.JLabel lblOrderNr;
    private javax.swing.JLabel lblPostCode;
    private javax.swing.JLabel lblStreetAddress;
    private javax.swing.JList<ListItem> lstOrderRows;
    private javax.swing.JList<ListItem> lstProducts;
    private javax.swing.JPanel pnlAddress;
    private javax.swing.JPanel pnlTools;
    private javax.swing.JRadioButton rbtnBoat;
    private javax.swing.JRadioButton rbtnBuyOrder;
    private javax.swing.JRadioButton rbtnGoods;
    private javax.swing.JRadioButton rbtnSellOrder;
    private javax.swing.JTextField txtBillingDate;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCustomer;
    private javax.swing.JTextField txtOrderNr;
    private javax.swing.JTextField txtPostCode;
    private javax.swing.JTextField txtStreet;
    // End of variables declaration//GEN-END:variables
}
