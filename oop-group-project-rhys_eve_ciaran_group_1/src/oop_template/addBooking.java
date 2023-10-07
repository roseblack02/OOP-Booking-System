package oop_template;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 * @author evest
 * TBL = TO BE LOOKED AT
 */

///imports
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
//imports end

public class addBooking extends javax.swing.JFrame {

    /**
     * Creates new form AddBooking
     */
    public addBooking() {
        initComponents();
        //centers the window
        setLocationRelativeTo(null);
        
        //formWindowOpened();
    }

    /**
     * 
     */
    
    // --------------- AutoFill ID ---------------
    
        // --------------- AutoFill ID ---------------
    
        public static String autofillID(){
        //get id number from text file
        //read lines in textfile and add 1
        int lineNum = 0;
        String line = "";

        try {
            //create new reader
            FileReader fileR = new FileReader("storage\\bookings.txt");

            //create buffer reader to extend reader
            BufferedReader buffR= new BufferedReader(fileR);

            //read until empty line
            while ((line = buffR.readLine()) != null) {
                //increment lineNum
                lineNum += 1;

            }

            //close file
            buffR.close();
            fileR.close();
        } catch (FileNotFoundException fnfEx) {
            //show error window
            JOptionPane.showMessageDialog(null,"There was an error writing to the file.\n Please try again." + fnfEx,"Error",0);

        } catch (IOException ex) {
            //show error window
            JOptionPane.showMessageDialog(null,"There was an error writing to the file.\n Please try again." + ex,"Error",0);
        }

        //add 1 to lineNum for next id num
        lineNum += 1;

        return String.valueOf(lineNum);
    }
        // ----------- End -----------
        
        // --------------- Validation ---------------
    /*price value check
    * @author: E.Price
    */
    //public boolean priceCheck(String str){
        //return str.matches();
    //}
    
        // ----------- End of Validation ------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContentPanel = new javax.swing.JPanel();
        lblDate = new javax.swing.JLabel();
        lblBookingID = new javax.swing.JLabel();
        lblCustomerID = new javax.swing.JLabel();
        lblStaffID = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblLengthEstimate = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        txtStaffID = new javax.swing.JTextField();
        txtBookingID = new javax.swing.JTextField();
        txtCustomerID = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        btnMenu = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jTxtTime = new javax.swing.JFormattedTextField();
        jTxtPrice = new javax.swing.JFormattedTextField();
        cmbLengthEst = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ContentPanel.setBackground(new java.awt.Color(241, 240, 255));
        ContentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Booking", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(191, 167, 250))); // NOI18N
        ContentPanel.setForeground(new java.awt.Color(241, 240, 255));
        ContentPanel.setMaximumSize(new java.awt.Dimension(900, 500));
        ContentPanel.setMinimumSize(new java.awt.Dimension(900, 500));

        lblDate.setBackground(new java.awt.Color(191, 167, 250));
        lblDate.setForeground(new java.awt.Color(48, 41, 66));
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDate.setText("Date");

        lblBookingID.setForeground(new java.awt.Color(48, 41, 66));
        lblBookingID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBookingID.setText("BookingID");
        lblBookingID.setToolTipText("");

        lblCustomerID.setForeground(new java.awt.Color(48, 41, 66));
        lblCustomerID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCustomerID.setText("CustomerID");

        lblStaffID.setForeground(new java.awt.Color(48, 41, 66));
        lblStaffID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStaffID.setText("StaffID");

        lblTime.setForeground(new java.awt.Color(48, 41, 66));
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTime.setText("Time");
        lblTime.setToolTipText("");

        lblLengthEstimate.setForeground(new java.awt.Color(48, 41, 66));
        lblLengthEstimate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLengthEstimate.setText("Length estimate");

        lblPrice.setForeground(new java.awt.Color(48, 41, 66));
        lblPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrice.setText("Price");

        txtStaffID.setText("S:");
        txtStaffID.setToolTipText("Enter the Staff member's ID");

        txtBookingID.setText("B:");
        txtBookingID.setToolTipText("Enter a BookingID");

        txtCustomerID.setText("C:");
        txtCustomerID.setToolTipText("Enter the CustomerID");

        txtDate.setText("00/00/0000");
        txtDate.setToolTipText("Add a Date");

        btnMenu.setBackground(new java.awt.Color(191, 167, 250));
        btnMenu.setForeground(new java.awt.Color(48, 41, 66));
        btnMenu.setText("Menu");
        btnMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnEnter.setBackground(new java.awt.Color(191, 167, 250));
        btnEnter.setForeground(new java.awt.Color(48, 41, 66));
        btnEnter.setText("Enter");
        btnEnter.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(191, 167, 250));
        btnClear.setForeground(new java.awt.Color(48, 41, 66));
        btnClear.setText("Clear");
        btnClear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jTxtTime.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        jTxtTime.setText("00:00");

        jTxtPrice.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¤##0.00"))));
        jTxtPrice.setText("£00.00");
        jTxtPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtPriceFocusLost(evt);
            }
        });

        cmbLengthEst.setMaximumRowCount(10);
        cmbLengthEst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "30 minutes", "1 hr", "1hr30", "2hr", "2hr30", "3hr", "undecided" }));

        javax.swing.GroupLayout ContentPanelLayout = new javax.swing.GroupLayout(ContentPanel);
        ContentPanel.setLayout(ContentPanelLayout);
        ContentPanelLayout.setHorizontalGroup(
            ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentPanelLayout.createSequentialGroup()
                        .addGroup(ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContentPanelLayout.createSequentialGroup()
                                .addComponent(lblBookingID, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBookingID, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContentPanelLayout.createSequentialGroup()
                                .addComponent(lblCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContentPanelLayout.createSequentialGroup()
                                .addComponent(lblStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ContentPanelLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTxtTime))
                            .addGroup(ContentPanelLayout.createSequentialGroup()
                                .addGroup(ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLengthEstimate, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbLengthEst, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(70, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        ContentPanelLayout.setVerticalGroup(
            ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPanelLayout.createSequentialGroup()
                .addGroup(ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContentPanelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBookingID)
                            .addComponent(lblDate)
                            .addComponent(lblTime)
                            .addComponent(txtBookingID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jTxtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerID)
                    .addComponent(lblLengthEstimate)
                    .addComponent(txtCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbLengthEst, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStaffID)
                    .addComponent(lblPrice)
                    .addComponent(txtStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addGroup(ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed

        //> opens View/Edit Customer frame
        Menu cve = new Menu();
        //> shows the frame
        cve.show();
        //> disposes the last frame
        dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed

        // values pulled from textbox
        String bookID = txtBookingID.getText().strip();
        String custID = txtCustomerID.getText().strip();
        String staffID = txtStaffID.getText().strip();
        String date = txtDate.getText().strip();
        String time = jTxtTime.getText().strip();
        String lengthEst = cmbLengthEst.getSelectedItem().toString();
        String price = jTxtPrice.getText().strip();

        //error boolean to check validation of text pulled
        boolean error = false;

        //validation

            //empty field check
            if(bookID.strip().equals("") 
                    || custID.strip().equals("") 
                    || staffID.strip().equals("") 
                    || date.strip().equals("00/00/0000") || date.strip().equals("")
                    || time.strip().equals("00:00") || time.strip().equals("")  
                    || price.strip().equals("£00.00") || price.strip().equals("£0.00") || price.strip().equals("") ){
                error = true;
                        JOptionPane.showMessageDialog(null, "Please fill in all fields."
                                ,"Empty Fields Error",0);   
            }
            //ID Checkers
                //Booking ID must start with B:
            else if(!bookID.strip().startsWith("B:",0) /* && staffID.strip().startsWith(":",1)*/) {
               error = true;
              JOptionPane.showMessageDialog(null, "Please include ID Identification \n B: \n \n Example: B:1 ", "Booking ID Error",0);
              txtBookingID.grabFocus();
            }
            //length of ID (B:000)
            else if(bookID.length() > 5 || (bookID.length() < 4)){
                error = true;
                JOptionPane.showMessageDialog(null,"ID must be inserted + limited to 3 digits.", "Booking ID Error",0);
                txtBookingID.grabFocus();
            }
            
            else if(bookID.matches("[0-9]*$") && bookID.matches("^B")){
                error = true;
                JOptionPane.showMessageDialog(null,"ID must be numerical", "ID Contents Error",0);
                txtBookingID.grabFocus();
                }    
                //Customer ID must start with C:
            else if(!custID.strip().startsWith("C:",0) /*&& (!custID.strip().startsWith(":",1))*/) {
               error = true;
              JOptionPane.showMessageDialog(null, "Please include ID Identification \n C: \n \n Example: C:1 ", "Customer ID Error",0);
              txtCustomerID.grabFocus();
            }
            
            //length of ID (C:000)
            else if(custID.length() > 5 || (custID.length() < 4)) {
                error = true;
                JOptionPane.showMessageDialog(null,"ID must be inserted + limited to 3 digits.", "Customer ID Error",0);
                txtCustomerID.grabFocus();
            }
            
                            //Staff ID must start with S:
            else if(!staffID.strip().startsWith("S:",0) /* && staffID.strip().startsWith(":",1)*/) {
               error = true;
              JOptionPane.showMessageDialog(null, "Please include ID Identification \n S: \n \n Example: S:1 ", "Staff ID Error",0);
              txtStaffID.grabFocus();
            }
            
            //length of ID (S:000)
            else if(staffID.length() > 5 || (staffID.length() < 4)){
                error = true;
                JOptionPane.showMessageDialog(null,"ID must be inserted + limited to 3 digits.", "Staff ID Error",0);
                txtStaffID.grabFocus();
            }
            //end of ID Checkers
            
            //PRICE (tbl price checker)
            //else if(price.strip().startsWith("£",0)) {
               //error = true;
              //JOptionPane.showMessageDialog(null, "Please include £ within price. \n \n Example: £00.00 ", "Price Error",0);
            //}
            // length + is numeric + allows "." and "£" TBL
            else if(/*!price.matches("^[0-9]*$") && price.matches("[£]*$") &&*/ price.length() > 7){
            error = true;
              JOptionPane.showMessageDialog(null, "Value to be between £0.00 and £999.00", "Price Error",0); 
              jTxtPrice.grabFocus();
            } //end of price
            
            //else if(lengthEst.length() > 25){
                //error = true;
            //JOptionPane.showMessageDialog(null,"25 Character Limit","Length Esitmate Char Limit",0);
            //}
            
            //date
            else if(!date.matches("\\d{2}/\\d{2}/\\d{4}")){
                error = true;
            JOptionPane.showMessageDialog(null,"Incorrect Date Format \n 00/00/0000","Date Format Error",0);
            txtDate.grabFocus();
            }
            
            //time
            //else if(!time.matches("00.00"))
                //error = true;
            //JOptionPane.showMessageDialog(null,"Incorrect Time Format \n 00.00","Time Format Error",0);
        //end of validation
        
        //if error is true

        if(!error) {
            //puts all text into one line
            String newRecord = (bookID + ", " + custID + ", " + staffID + ", " + date + ", " + time
                + ", " + lengthEst + ", " + price);
            //writes to file
            try{
                //creates file writer with select file path
                // append = true causes no overwrite of current text
                FileWriter filew = new FileWriter("Storage\\bookings.txt", true);

                //bufferedWriter for new line
                BufferedWriter buffw = new BufferedWriter(filew);

                //writing a new record
                buffw.write(newRecord);
                //new line
                buffw.newLine();

                //close file
                filew.flush();
                buffw.flush();
            }
            //if writing fails
            catch(IOException ex){
                //error popup
                JOptionPane.showMessageDialog(null,"There was an error writing to the file. \n" + ex,"Error",0);
            }

            //inserting data into a new instance of booking
            appData.currentBooking.setBookingID(bookID);
            appData.currentBooking.setCustomerID(custID);
            appData.currentBooking.setStaffID(staffID);
            appData.currentBooking.setDate(date);
            appData.currentBooking.setTime(time);
            appData.currentBooking.setLengthEstimate(lengthEst);
            appData.currentBooking.setPrice(price);

            //debug
            System.out.println("Data wrote to file succesffuly:");
            System.out.println("DEBUG: " + appData.currentBooking.getBookingID() );
            System.out.println("DEBUG: " + appData.currentBooking.getCustomerID());
            System.out.println("DEBUG: " + appData.currentBooking.getStaffID());
            System.out.println("DEBUG: " + appData.currentBooking.getDate());
            System.out.println("DEBUG: " + appData.currentBooking.getTime());
            System.out.println("DEBUG: " + appData.currentBooking.getLengthEstimate());
            System.out.println("DEBUG: " + appData.currentBooking.getPrice());
            System.out.println("Finished.");

            //success mesage
            JOptionPane.showMessageDialog(null, "Entry succesfully made.", "Success",1);

            //clear fields

            //Sets the text box to " " (blank)
            txtCustomerID.setText("C: ");
            txtStaffID.setText("S: ");
            txtDate.setText("00/00/0000");
            cmbLengthEst.setSelectedItem("30 minutes");
            jTxtPrice.setText("£00.00");
            jTxtTime.setText("00:00");
            //end of clear
            //onto autofill the next id
            txtBookingID.setText("B: " + autofillID());
        }

    }//GEN-LAST:event_btnEnterActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        //Clear button: Sets the text box to " " (blank)
        txtBookingID.setText("B: " + autofillID());
        txtCustomerID.setText("C: ");
        txtStaffID.setText("S: ");
        txtDate.setText("00/00/0000");
        cmbLengthEst.setSelectedItem("30 minutes");
        jTxtPrice.setText("£00.00");
        jTxtTime.setText("00:00");
        //end of clear

    }//GEN-LAST:event_btnClearActionPerformed

    private void jTxtPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtPriceFocusLost
        if (jTxtPrice.equals("")){
              JOptionPane.showMessageDialog(null, "Please insert price \n format: £00.00", "Price Error",0); 
            }
    }//GEN-LAST:event_jTxtPriceFocusLost

    //private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        //autofill id with new id num
        //txtBookingID.setText("B: "+autofillID());
        
        //set focus to first 
        //txtCustomerID.grabFocus();
    //}    
    
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
            java.util.logging.Logger.getLogger(addBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContentPanel;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnMenu;
    private javax.swing.JComboBox<String> cmbLengthEst;
    private javax.swing.JFormattedTextField jTxtPrice;
    private javax.swing.JFormattedTextField jTxtTime;
    private javax.swing.JLabel lblBookingID;
    private javax.swing.JLabel lblCustomerID;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblLengthEstimate;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblStaffID;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTextField txtBookingID;
    private javax.swing.JTextField txtCustomerID;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtStaffID;
    // End of variables declaration//GEN-END:variables
}
