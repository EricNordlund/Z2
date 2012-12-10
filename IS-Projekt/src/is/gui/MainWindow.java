/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.gui;

import is.controller.Controller;

/**
 *
 * @author svalan
 */
public class MainWindow extends javax.swing.JFrame {

    Controller controller;
    
    
    public MainWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        tabbedPaneMainWindow = new javax.swing.JTabbedPane();
        jPanelKunder = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jPanelEditCustomer = new javax.swing.JPanel();
        btnAddCustomer = new javax.swing.JButton();
        btnEditCustomer = new javax.swing.JButton();
        jPanelSearchCustomer = new javax.swing.JPanel();
        btnSearchCustomer = new javax.swing.JButton();
        jPanelBåtar = new javax.swing.JPanel();
        jPanelOrdrar = new javax.swing.JPanel();
        jPanelTillbehör = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabbedPaneMainWindow.setName("asdds"); // NOI18N

        jPanelKunder.setName(""); // NOI18N

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        btnAddCustomer.setText("Lägg till");

        btnEditCustomer.setText("Redigera");

        javax.swing.GroupLayout jPanelEditCustomerLayout = new javax.swing.GroupLayout(jPanelEditCustomer);
        jPanelEditCustomer.setLayout(jPanelEditCustomerLayout);
        jPanelEditCustomerLayout.setHorizontalGroup(
            jPanelEditCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEditCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(btnAddCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelEditCustomerLayout.setVerticalGroup(
            jPanelEditCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAddCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditCustomer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSearchCustomer.setText("Sök");

        javax.swing.GroupLayout jPanelSearchCustomerLayout = new javax.swing.GroupLayout(jPanelSearchCustomer);
        jPanelSearchCustomer.setLayout(jPanelSearchCustomerLayout);
        jPanelSearchCustomerLayout.setHorizontalGroup(
            jPanelSearchCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSearchCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSearchCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelSearchCustomerLayout.setVerticalGroup(
            jPanelSearchCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSearchCustomerLayout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addComponent(btnSearchCustomer)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelKunderLayout = new javax.swing.GroupLayout(jPanelKunder);
        jPanelKunder.setLayout(jPanelKunderLayout);
        jPanelKunderLayout.setHorizontalGroup(
            jPanelKunderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKunderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelKunderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelSearchCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelEditCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelKunderLayout.setVerticalGroup(
            jPanelKunderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKunderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelKunderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanelKunderLayout.createSequentialGroup()
                        .addComponent(jPanelSearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelEditCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 216, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tabbedPaneMainWindow.addTab("Kunder", jPanelKunder);

        javax.swing.GroupLayout jPanelBåtarLayout = new javax.swing.GroupLayout(jPanelBåtar);
        jPanelBåtar.setLayout(jPanelBåtarLayout);
        jPanelBåtarLayout.setHorizontalGroup(
            jPanelBåtarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
        );
        jPanelBåtarLayout.setVerticalGroup(
            jPanelBåtarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
        );

        tabbedPaneMainWindow.addTab("Båtar", jPanelBåtar);

        javax.swing.GroupLayout jPanelOrdrarLayout = new javax.swing.GroupLayout(jPanelOrdrar);
        jPanelOrdrar.setLayout(jPanelOrdrarLayout);
        jPanelOrdrarLayout.setHorizontalGroup(
            jPanelOrdrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
        );
        jPanelOrdrarLayout.setVerticalGroup(
            jPanelOrdrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
        );

        tabbedPaneMainWindow.addTab("Ordrar", jPanelOrdrar);

        javax.swing.GroupLayout jPanelTillbehörLayout = new javax.swing.GroupLayout(jPanelTillbehör);
        jPanelTillbehör.setLayout(jPanelTillbehörLayout);
        jPanelTillbehörLayout.setHorizontalGroup(
            jPanelTillbehörLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
        );
        jPanelTillbehörLayout.setVerticalGroup(
            jPanelTillbehörLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JButton btnEditCustomer;
    private javax.swing.JButton btnSearchCustomer;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelBåtar;
    private javax.swing.JPanel jPanelEditCustomer;
    private javax.swing.JPanel jPanelKunder;
    private javax.swing.JPanel jPanelOrdrar;
    private javax.swing.JPanel jPanelSearchCustomer;
    private javax.swing.JPanel jPanelTillbehör;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane tabbedPaneMainWindow;
    // End of variables declaration//GEN-END:variables

    public void setController(Controller aThis) {
        this.controller = aThis;
    }
}
