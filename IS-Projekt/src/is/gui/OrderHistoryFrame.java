
package is.gui;

import is.controller.Controller;
import is.controller.ListItem;
import javax.swing.ListModel;


/**
 *
 * @author Eric, Viktor, Anna
 */
public class OrderHistoryFrame extends javax.swing.JFrame {

    private MainWindow parent;
    private int customerID;
    Controller controller;
    
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    
    public OrderHistoryFrame(MainWindow parent) {
        initComponents();
        addActionListenerToButtons();
        this.parent = parent;
        this.setLocationRelativeTo(null);
        
        

    }
    // TODO: Få funktionen att hämta korrekt list-model. 
    public void initFrame(int customerID) {
        ListModel<ListItem> lm = controller.getOrderListByCustomer(customerID); 
        this.lstOrderHistory.setModel(lm);
    }
    
private void addActionListenerToButtons() 
{
    
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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        customerOrderPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        customerOrderPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        customerOrderPane.setViewportView(lstOrderHistory);

        jButton2.setText("Öppna");

        jButton3.setText("Ta bort");

        javax.swing.GroupLayout customerOrderToolsLayout = new javax.swing.GroupLayout(customerOrderTools);
        customerOrderTools.setLayout(customerOrderToolsLayout);
        customerOrderToolsLayout.setHorizontalGroup(
            customerOrderToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerOrderToolsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(customerOrderToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                .addContainerGap())
        );
        customerOrderToolsLayout.setVerticalGroup(
            customerOrderToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerOrderToolsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout customerOrderHistoryLayout = new javax.swing.GroupLayout(customerOrderHistory);
        customerOrderHistory.setLayout(customerOrderHistoryLayout);
        customerOrderHistoryLayout.setHorizontalGroup(
            customerOrderHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerOrderHistoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customerOrderPane, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(customerOrderTools, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        customerOrderHistoryLayout.setVerticalGroup(
            customerOrderHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerOrderHistoryLayout.createSequentialGroup()
                .addComponent(customerOrderTools, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerOrderHistoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customerOrderPane, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel customerOrderHistory;
    private javax.swing.JScrollPane customerOrderPane;
    private javax.swing.JPanel customerOrderTools;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<ListItem> lstOrderHistory;
    // End of variables declaration//GEN-END:variables

    void setController(Controller controller) {
        this.controller = controller;
    }
}
