package oop_template;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author E. Price
 */

//imports
//import java.text.SimpleDateFormat;
//import java.util.Date;
//end of imports

public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContentPanel = new javax.swing.JPanel();
        lblStock = new javax.swing.JLabel();
        lblCustomer = new javax.swing.JLabel();
        lblStaff = new javax.swing.JLabel();
        lblBooking = new javax.swing.JLabel();
        btnViewEditStock = new javax.swing.JButton();
        btnViewEditCust = new javax.swing.JButton();
        btnAddCust = new javax.swing.JButton();
        btnViewEditStaff = new javax.swing.JButton();
        btnAddStaff = new javax.swing.JButton();
        btnAddBook = new javax.swing.JButton();
        btnViewEditBook = new javax.swing.JButton();
        lblScissorSisters = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Scissor Sisters");
        setBackground(new java.awt.Color(241, 240, 255));
        setForeground(new java.awt.Color(241, 240, 255));
        setSize(new java.awt.Dimension(0, 0));

        ContentPanel.setBackground(new java.awt.Color(241, 240, 255));
        ContentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(191, 167, 250))); // NOI18N
        ContentPanel.setForeground(new java.awt.Color(241, 240, 255));
        ContentPanel.setMaximumSize(new java.awt.Dimension(900, 500));
        ContentPanel.setMinimumSize(new java.awt.Dimension(900, 500));
        ContentPanel.setPreferredSize(new java.awt.Dimension(900, 500));

        lblStock.setBackground(new java.awt.Color(191, 167, 250));
        lblStock.setForeground(new java.awt.Color(48, 41, 66));
        lblStock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStock.setText("Stock");

        lblCustomer.setForeground(new java.awt.Color(48, 41, 66));
        lblCustomer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCustomer.setText("Customer");
        lblCustomer.setToolTipText("");

        lblStaff.setForeground(new java.awt.Color(48, 41, 66));
        lblStaff.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStaff.setText("Staff");

        lblBooking.setForeground(new java.awt.Color(48, 41, 66));
        lblBooking.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBooking.setText("Booking");

        btnViewEditStock.setBackground(new java.awt.Color(191, 167, 250));
        btnViewEditStock.setForeground(new java.awt.Color(48, 41, 66));
        btnViewEditStock.setText("View/Edit Stock");
        btnViewEditStock.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnViewEditStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEditStockActionPerformed(evt);
            }
        });

        btnViewEditCust.setBackground(new java.awt.Color(191, 167, 250));
        btnViewEditCust.setForeground(new java.awt.Color(48, 41, 66));
        btnViewEditCust.setText("View/Edit Customer");
        btnViewEditCust.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnViewEditCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEditCustActionPerformed(evt);
            }
        });

        btnAddCust.setBackground(new java.awt.Color(191, 167, 250));
        btnAddCust.setForeground(new java.awt.Color(48, 41, 66));
        btnAddCust.setText("Add Customer");
        btnAddCust.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAddCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustActionPerformed(evt);
            }
        });

        btnViewEditStaff.setBackground(new java.awt.Color(191, 167, 250));
        btnViewEditStaff.setForeground(new java.awt.Color(48, 41, 66));
        btnViewEditStaff.setText("View/Edit Staff");
        btnViewEditStaff.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnViewEditStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEditStaffActionPerformed(evt);
            }
        });

        btnAddStaff.setBackground(new java.awt.Color(191, 167, 250));
        btnAddStaff.setForeground(new java.awt.Color(48, 41, 66));
        btnAddStaff.setText("Add Staff");
        btnAddStaff.setToolTipText("");
        btnAddStaff.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAddStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStaffActionPerformed(evt);
            }
        });

        btnAddBook.setBackground(new java.awt.Color(191, 167, 250));
        btnAddBook.setForeground(new java.awt.Color(48, 41, 66));
        btnAddBook.setText("Add Booking");
        btnAddBook.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBookActionPerformed(evt);
            }
        });

        btnViewEditBook.setBackground(new java.awt.Color(191, 167, 250));
        btnViewEditBook.setForeground(new java.awt.Color(48, 41, 66));
        btnViewEditBook.setText("View/Edit Booking");
        btnViewEditBook.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnViewEditBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEditBookActionPerformed(evt);
            }
        });

        lblScissorSisters.setFont(new java.awt.Font("Segoe UI Light", 3, 36)); // NOI18N
        lblScissorSisters.setForeground(new java.awt.Color(48, 41, 66));
        lblScissorSisters.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblScissorSisters.setText("Scissor Sisters");

        jLabel1.setForeground(new java.awt.Color(191, 167, 250));
        jLabel1.setText("✂ - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        javax.swing.GroupLayout ContentPanelLayout = new javax.swing.GroupLayout(ContentPanel);
        ContentPanel.setLayout(ContentPanelLayout);
        ContentPanelLayout.setHorizontalGroup(
            ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPanelLayout.createSequentialGroup()
                .addGroup(ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentPanelLayout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(lblCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContentPanelLayout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(lblScissorSisters, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ContentPanelLayout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addGroup(ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentPanelLayout.createSequentialGroup()
                                .addComponent(btnViewEditCust, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddCust, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContentPanelLayout.createSequentialGroup()
                                .addComponent(btnViewEditStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContentPanelLayout.createSequentialGroup()
                                .addComponent(btnViewEditBook, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnViewEditStock, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStock, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(288, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(270, 270, 270))
        );
        ContentPanelLayout.setVerticalGroup(
            ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblScissorSisters, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewEditCust, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddCust, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblStaff)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewEditStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblBooking)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewEditBook, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblStock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewEditStock, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //--------------- * Redirection Buttons * ---------------
        //--------------- Add Booking
    private void btnAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBookActionPerformed

        //> opens add Booking frame
        addBooking ab = new addBooking();
        //>shows the frame
        ab.show();
        //>disposes the last frame
        dispose();
        
    }//GEN-LAST:event_btnAddBookActionPerformed
        //--------------- End of Add Booking
        //--------------- View and Edit Customer
    private void btnViewEditCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEditCustActionPerformed

        //> opens View/Edit Customer frame
        viewAndEditCustomer cve = new viewAndEditCustomer();
        //> shows the frame
         cve.show();
        //> disposes the last frame
         dispose();
        
    }//GEN-LAST:event_btnViewEditCustActionPerformed
        //--------------- End of View and Edit Customer
        //--------------- Add Customer
    private void btnAddCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustActionPerformed

        //> opens Add Customer frame
        addCustomer ca = new addCustomer();
        //> shows the frame
        ca.show();
        //> disposes the last frame
        dispose();
    }//GEN-LAST:event_btnAddCustActionPerformed
        //--------------- End of Add Customer
        //--------------- View and Edit Staff
    private void btnViewEditStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEditStaffActionPerformed

        //> opens View Edit Staff frame
        viewAndEditStaff sve = new viewAndEditStaff();
        //> shows the frame
        sve.show();
        //> disposes the last frame
        dispose();

    }//GEN-LAST:event_btnViewEditStaffActionPerformed
        //--------------- End of View and Edit Staff
        //--------------- Add Staff
    private void btnAddStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStaffActionPerformed

        //> opens Add Staff frame
        addStaff sa = new addStaff();
        //> shows the frame
        sa.show();
        //> disposes the last frame
        dispose();
    }//GEN-LAST:event_btnAddStaffActionPerformed
        //--------------- End of Add Staff
        //--------------- View and Edit Booking
    private void btnViewEditBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEditBookActionPerformed

        //> opens view edit booking frame
        viewAndEditBooking bve = new viewAndEditBooking();
        //>shows the frame
        bve.show();
        //>disposes the last frame
        dispose();
        
    }//GEN-LAST:event_btnViewEditBookActionPerformed
        //--------------- End of View and Edit Booking
        //--------------- View and Edit Stock
    private void btnViewEditStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEditStockActionPerformed

        //> opens view edit stock frame
        viewAndEditStock stock = new viewAndEditStock();
        //> shows the frame
        stock.show();
        //> disposes the last frame
        dispose();
    }//GEN-LAST:event_btnViewEditStockActionPerformed
        //--------------- End of View and Edit Stock    
//--------------- *  End of redirection Buttons *  ---------------
    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContentPanel;
    private javax.swing.JButton btnAddBook;
    private javax.swing.JButton btnAddCust;
    private javax.swing.JButton btnAddStaff;
    private javax.swing.JButton btnViewEditBook;
    private javax.swing.JButton btnViewEditCust;
    private javax.swing.JButton btnViewEditStaff;
    private javax.swing.JButton btnViewEditStock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBooking;
    private javax.swing.JLabel lblCustomer;
    private javax.swing.JLabel lblScissorSisters;
    private javax.swing.JLabel lblStaff;
    private javax.swing.JLabel lblStock;
    // End of variables declaration//GEN-END:variables
}
