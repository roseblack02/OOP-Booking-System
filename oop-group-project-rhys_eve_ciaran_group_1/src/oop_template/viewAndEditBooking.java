package oop_template;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 * @author evest
 */

//--------------- imports ---------------
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
//------------- imports end --------------


public class viewAndEditBooking extends javax.swing.JFrame {

    /**
     * Creates new form BookingViewEdit
     */
    public viewAndEditBooking() {
        initComponents();
        //load the booking info to list
        loadList();   
        //centers the window
        setLocationRelativeTo(null);
    }
    
        //Load List
        public void loadList(){
        //line variable used to read each line in list
        String line;
        
        //create new list model
        DefaultListModel listModel = new javax.swing.DefaultListModel();
        
        try {
            //create new reader
            FileReader fileR = new FileReader("storage\\bookings.txt");
            
            //create buffer reader to extend reader
            BufferedReader buffR = new BufferedReader(fileR);
            
            //read until line is empty
            while ((line = buffR.readLine()) != null) {
                //add line to list model
                listModel.addElement(line);
            }
            
            //close file
            buffR.close();
            fileR.close();
            
        } catch (FileNotFoundException fnfEx) {
            //show error window
            JOptionPane.showMessageDialog(null,"There was an error reading the file.\n" + fnfEx,"Error",0);
            
        } catch (IOException ex) {
            //show error window
            JOptionPane.showMessageDialog(null,"There was an error reading the file.\n" + ex,"Error",0);
            
        }
        //lists all Booking Info
        lstBookings.setModel(listModel);
        
    }
        //End of Load List + reading file
        
        // Validation
    /*price value check
    * @author: E.Price
    */
    //public boolean priceCheck(String str){
        //return str.matches();
    //}
        //End of Validation


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContentPanel2 = new javax.swing.JPanel();
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
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstBookings = new javax.swing.JList<>();
        jTxtTime = new javax.swing.JFormattedTextField();
        cmbLengthEst = new javax.swing.JComboBox<>();
        jTxtPrice = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ContentPanel2.setBackground(new java.awt.Color(241, 240, 255));
        ContentPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View and Edit Booking", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(191, 167, 250))); // NOI18N
        ContentPanel2.setForeground(new java.awt.Color(241, 240, 255));
        ContentPanel2.setMaximumSize(new java.awt.Dimension(900, 500));
        ContentPanel2.setMinimumSize(new java.awt.Dimension(900, 500));
        ContentPanel2.setPreferredSize(new java.awt.Dimension(900, 500));

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

        btnUpdate.setBackground(new java.awt.Color(191, 167, 250));
        btnUpdate.setForeground(new java.awt.Color(48, 41, 66));
        btnUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUpdate.setLabel("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
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

        lstBookings.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lstBookings.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lstBookings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstBookingsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstBookings);

        jTxtTime.setText("00:00");

        cmbLengthEst.setMaximumRowCount(10);
        cmbLengthEst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "30 minutes", "1 hr", "1hr30", "2hr", "2hr30", "3hr", "undecided" }));

        jTxtPrice.setText("£0.00");
        jTxtPrice.setToolTipText("Add the total price");

        javax.swing.GroupLayout ContentPanel2Layout = new javax.swing.GroupLayout(ContentPanel2);
        ContentPanel2.setLayout(ContentPanel2Layout);
        ContentPanel2Layout.setHorizontalGroup(
            ContentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
                    .addGroup(ContentPanel2Layout.createSequentialGroup()
                        .addGroup(ContentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContentPanel2Layout.createSequentialGroup()
                                .addComponent(lblStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContentPanel2Layout.createSequentialGroup()
                                .addComponent(lblBookingID, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBookingID, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContentPanel2Layout.createSequentialGroup()
                                .addComponent(lblCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(ContentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContentPanel2Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContentPanel2Layout.createSequentialGroup()
                                .addGroup(ContentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLengthEstimate, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ContentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbLengthEst, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ContentPanel2Layout.createSequentialGroup()
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        ContentPanel2Layout.setVerticalGroup(
            ContentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBookingID)
                    .addComponent(lblDate)
                    .addComponent(lblTime)
                    .addComponent(txtBookingID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(ContentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerID)
                    .addComponent(lblLengthEstimate)
                    .addComponent(txtCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbLengthEst, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(ContentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStaffID)
                    .addComponent(lblPrice)
                    .addComponent(txtStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(ContentPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContentPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed

        //> opens Menu frame
        Menu cve = new Menu();
        //> shows the frame
        cve.show();
        //> disposes the last frame
        dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        //Each line will be a full string
        String line;
        
        //array of each record from the list
        //.getModel()and .getSize() will be used to read how many bookings exist
        String[] data = new String[lstBookings.getModel().getSize()];

        // get values from textbox
        String bookID = txtBookingID.getText().strip();
        String custID = txtCustomerID.getText().strip();
        String staffID = txtStaffID.getText().strip();
        String date = txtDate.getText().strip();
        String time = jTxtTime.getText().strip();
        String lengthEst = cmbLengthEst.getSelectedItem().toString();
        String price = jTxtPrice.getText().strip();
        
        //check if they are valid
        //create an error boolean that will be used to check if 
        //an entry should be written into the text file or not
        boolean error = false;
        
        //validation

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
        
        //NO ERRORS - Confirm box
        if (!error){
            /* Confirmation alert box confirms the users changes 
            *  before writing edits to file
            *  yes = 0 -- no = 1*/
            int confirmchange = JOptionPane.showConfirmDialog(null, 
                    "Are you sure you want to make changes to Booking ID No " 
                            + bookID + "?", "Confirm Booking Changes",
                            JOptionPane.YES_NO_OPTION);
            //if answer == yes
            if(confirmchange == 0){
                String editedData = (bookID + ", " + custID + ", " + staffID + ", " + date + ", " + time
                + ", " + lengthEst + ", " + price);
                
                //selects id and defines it as what will be edited
                for(int i = 0; i < data.length; i++){
                    if(lstBookings.getModel().getElementAt(i).startsWith(bookID))
                    {
                       data[i] = editedData;
                    }
                    else
                    {
                    data[i] = lstBookings.getModel().getElementAt(i);
                    }
                }
            //inserting data into a new instance of booking
            appData.currentBooking.setBookingID(bookID);
            appData.currentBooking.setCustomerID(custID);
            appData.currentBooking.setStaffID(staffID);
            appData.currentBooking.setDate(date);
            appData.currentBooking.setTime(time);
            appData.currentBooking.setLengthEstimate(lengthEst);
            appData.currentBooking.setPrice(price); 
            //debugging-
            
            //end of debugging-
            
            //rewrite file with the edited data
            try {
            //create new writer
                FileWriter fileW = new FileWriter("storage\\bookings.txt");

            //create new writer
                BufferedWriter buffW= new BufferedWriter(fileW);
                
                //loop through array
            for(int i= 0; i < data.length; i ++){
                buffW.write(data[i]);
                buffW.newLine();
            }
                
            //close file
                buffW.flush();
                fileW.flush();
            } 
            catch(IOException ex) {
               //show error window
            JOptionPane.showMessageDialog(null,"There was "
                                        + "an error writing to the file.\n "
                                        + "Please try again. \n" + 
                                        ex,"Error",0);
                
            }
                //show success window
            JOptionPane.showMessageDialog(null,
                               "Edit succesfully made. \n","success",1);
            
            //clear fields
            lstBookings.clearSelection();
            
                txtBookingID.setText("B: ");
                txtCustomerID.setText("C: ");
                txtStaffID.setText("S: ");
                txtDate.setText("00/00/0000");
                jTxtTime.setText("00:00");
                cmbLengthEst.setSelectedItem("30 minutes");
                jTxtPrice.setText("£00.00");
                
                //reload booking list
                loadList();
            }
       
        // if answer == no
        else{
            //na
            }
        }
        //End of Confirm box
    }//GEN-LAST:event_btnUpdateActionPerformed
    //end of Update button
    
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // unselect records
        // DELETE lstBookings.clearSelection();
        //Sets the text box to " " (blank)
        txtBookingID.setText("B: ");
        txtCustomerID.setText("C: ");
        txtStaffID.setText("S: ");
        txtDate.setText("00/00/0000");
        jTxtTime.setText("00:00");
        cmbLengthEst.setSelectedItem("30 minutes");
        jTxtPrice.setText("£00.00");

        
        //reload booking list
        loadList();
        //end of clear
    }//GEN-LAST:event_btnClearActionPerformed

    private void lstBookingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstBookingsMouseClicked
        // TODO add your handling code here:
        //Fill in fields with customer data when a record is clicked
        //split line on every comma e.g. [0] = 1, [1] = Brian, [2] = Anderson
        String [] record = lstBookings.getSelectedValue().toString().split(", ");
        
        //fill in fields
        txtBookingID.setText(record[0]);
        txtCustomerID.setText(record[1]);
        txtStaffID.setText(record[2]);
        txtDate.setText(record[3]);
        jTxtTime.setText(record[4]);
        cmbLengthEst.setSelectedItem(record[5]);
        jTxtPrice.setText(record[6]);
    }//GEN-LAST:event_lstBookingsMouseClicked
    //end of Clear button

    //
    
    
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
            java.util.logging.Logger.getLogger(viewAndEditBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewAndEditBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewAndEditBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewAndEditBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewAndEditBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContentPanel2;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbLengthEst;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTxtPrice;
    private javax.swing.JFormattedTextField jTxtTime;
    private javax.swing.JLabel lblBookingID;
    private javax.swing.JLabel lblCustomerID;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblLengthEstimate;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblStaffID;
    private javax.swing.JLabel lblTime;
    private javax.swing.JList<String> lstBookings;
    private javax.swing.JTextField txtBookingID;
    private javax.swing.JTextField txtCustomerID;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtStaffID;
    // End of variables declaration//GEN-END:variables
}
