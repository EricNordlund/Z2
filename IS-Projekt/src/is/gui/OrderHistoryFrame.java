package is.gui;

import is.controller.Controller;
import is.model.listitems.ListItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author Eric, Viktor, Anna
 */
public class OrderHistoryFrame extends javax.swing.JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private MainWindow parent;
    private int customerID;
    private Controller controller;

    public OrderHistoryFrame(MainWindow parent) {
        initComponents();
        addActionListenerToButtons();
        this.parent = parent;
        this.setLocationRelativeTo(null);

    }

    void setController(Controller controller) {
        this.controller = controller;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void initFrame(int customerID) {
        ListModel<ListItem> lm = controller.getOrderListByCustomer(customerID);
        this.lstOrderHistory.setModel(lm);
        this.setTitle("Orderhistorik för kundnummer: " + customerID);
    }

    private void addActionListenerToButtons() {
        this.btnOpen.addActionListener(this);
        this.btnRemove.addActionListener(this);
        this.btnCancel.addActionListener(this);
    }

    private int getSelectedKey(JList<ListItem> jlist) {

        int key;

        ListItem li;
        li = jlist.getSelectedValue();

        key = li.getID();

        return key;

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (this.lstOrderHistory.getSelectedValue() instanceof ListItem) {
            int orderID = this.getSelectedKey(this.lstOrderHistory);

            if (ae.getSource() == btnOpen) {

                parent.editOrder(orderID);

            }

            if (ae.getSource() == btnRemove) {
                int confirmButton = JOptionPane.showConfirmDialog(this, "Bekräfta borttagnig av order", "Ta bort order",
                        JOptionPane.YES_NO_OPTION);

                if (confirmButton == JOptionPane.YES_OPTION) {


                    controller.removeBuyOrder(orderID);
                    ListModel<ListItem> lm = controller.getOrderListByCustomer(customerID);
                    this.lstOrderHistory.setModel(lm);
                    this.parent.updateLists();
                }
            }

        }

        if (ae.getSource() == btnCancel) {
            this.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        customerOrderHistory = new javax.swing.JPanel();
        customerOrderPane = new javax.swing.JScrollPane();
        lstOrderHistory = new javax.swing.JList<ListItem>();
        customerOrderTools = new javax.swing.JPanel();
        btnOpen = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnCancel = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Orderhistorik för");

        customerOrderPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        customerOrderPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        customerOrderPane.setViewportView(lstOrderHistory);

        customerOrderTools.setBorder(javax.swing.BorderFactory.createTitledBorder("Verktyg"));

        btnOpen.setText("Öppna");

        btnRemove.setText("Ta bort");

        javax.swing.GroupLayout customerOrderToolsLayout = new javax.swing.GroupLayout(customerOrderTools);
        customerOrderTools.setLayout(customerOrderToolsLayout);
        customerOrderToolsLayout.setHorizontalGroup(
            customerOrderToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerOrderToolsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(customerOrderToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOpen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                .addContainerGap())
        );
        customerOrderToolsLayout.setVerticalGroup(
            customerOrderToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerOrderToolsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOpen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemove)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancel.setText("Avbryt");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(btnCancel))
        );

        javax.swing.GroupLayout customerOrderHistoryLayout = new javax.swing.GroupLayout(customerOrderHistory);
        customerOrderHistory.setLayout(customerOrderHistoryLayout);
        customerOrderHistoryLayout.setHorizontalGroup(
            customerOrderHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerOrderHistoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customerOrderPane, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(customerOrderHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(customerOrderTools, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        customerOrderHistoryLayout.setVerticalGroup(
            customerOrderHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerOrderHistoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(customerOrderHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customerOrderPane, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .addGroup(customerOrderHistoryLayout.createSequentialGroup()
                        .addComponent(customerOrderTools, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addContainerGap())
        );

        customerOrderTools.getAccessibleContext().setAccessibleName("Verktyg");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customerOrderHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customerOrderHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // <editor-fold defaultstate="collapsed" desc="Genererade variabler">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnRemove;
    private javax.swing.JPanel customerOrderHistory;
    private javax.swing.JScrollPane customerOrderPane;
    private javax.swing.JPanel customerOrderTools;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JList<ListItem> lstOrderHistory;
    // End of variables declaration//GEN-END:variables
// </editor-fold>
}
