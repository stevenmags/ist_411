package IST_411_GIT;

import javax.swing.JOptionPane;

/**
 *
 * @author Nathan
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main1
     */
    public main() {
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

        jPanel1 = new javax.swing.JPanel();
        jtfNameToSearch = new javax.swing.JTextField();
        jlbName = new javax.swing.JLabel();
        jbtNameSearch = new javax.swing.JButton();
        jbtAddRestaurantName = new javax.swing.JButton();
        jbtAdvancedSearch = new javax.swing.JButton();
        jlbAppName = new javax.swing.JLabel();
        jlbRestaurant = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbName.setText("Name:");

        jbtNameSearch.setText("Search");
        jbtNameSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtNameSearchActionPerformed(evt);
            }
        });

        jbtAddRestaurantName.setText("Add Restaurant");
        jbtAddRestaurantName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAddRestaurantNameActionPerformed(evt);
            }
        });

        jbtAdvancedSearch.setText("Adv Search...");
        jbtAdvancedSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAdvancedSearchActionPerformed(evt);
            }
        });

        jlbAppName.setText("Restaurant Wait Time App");

        jlbRestaurant.setText("Restaurant");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jbtAddRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jbtAdvancedSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jlbName)
                            .addGap(27, 27, 27)
                            .addComponent(jtfNameToSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbtNameSearch))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(82, 82, 82)
                            .addComponent(jlbAppName))
                        .addComponent(jlbRestaurant)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbAppName)
                .addGap(18, 18, 18)
                .addComponent(jlbRestaurant)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbName)
                    .addComponent(jtfNameToSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtNameSearch))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtAddRestaurantName)
                    .addComponent(jbtAdvancedSearch))
                .addContainerGap(423, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtNameSearchActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jbtNameSearchActionPerformed
    {//GEN-HEADEREND:event_jbtNameSearchActionPerformed
        String restaurant_result = FUNCTIONS.INTERFACE_REQUEST("1100","Restaurant_Name", jtfNameToSearch.getText());
        System.out.println(restaurant_result);
        if(restaurant_result.equals("") || restaurant_result.equals("<br />")){
            JOptionPane.showMessageDialog(this, "Sorry, No Restaurants were found");
        }else{
            search_results results = new search_results(restaurant_result);
            results.setVisible(true);
            this.dispose();
        }        
    }//GEN-LAST:event_jbtNameSearchActionPerformed

    private void jbtAddRestaurantNameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jbtAddRestaurantNameActionPerformed
    {//GEN-HEADEREND:event_jbtAddRestaurantNameActionPerformed
        add_restaurant_information addRestaurant = new add_restaurant_information();
        addRestaurant.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtAddRestaurantNameActionPerformed

    private void jbtAdvancedSearchActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jbtAdvancedSearchActionPerformed
    {//GEN-HEADEREND:event_jbtAdvancedSearchActionPerformed
        AdvancedSearch AdvSearch = new AdvancedSearch();
        AdvSearch.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtAdvancedSearchActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtAddRestaurantName;
    private javax.swing.JButton jbtAdvancedSearch;
    private javax.swing.JButton jbtNameSearch;
    private javax.swing.JLabel jlbAppName;
    private javax.swing.JLabel jlbName;
    private javax.swing.JLabel jlbRestaurant;
    private javax.swing.JTextField jtfNameToSearch;
    // End of variables declaration//GEN-END:variables
}
