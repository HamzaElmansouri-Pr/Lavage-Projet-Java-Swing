package raven.application.form.other;

import com.formdev.flatlaf.FlatClientProperties;
import com.mysql.cj.xdevapi.Table;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raven
 */
public class FormAddBooking extends javax.swing.JPanel {

    public FormAddBooking() {
       initComponents();
        lb.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:$h1.font");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookingDescription = new javax.swing.JTextArea();
        bookingValidate = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        bookingPrice = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        bookingDate = new com.toedter.calendar.JDateChooser();

        lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setText("Client");

        jLabel2.setText("employee");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jComboBox1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jComboBox2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Choose date ");

        jLabel4.setText("Description");

        bookingDescription.setColumns(20);
        bookingDescription.setRows(5);
        bookingDescription.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                bookingDescriptionAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(bookingDescription);

        bookingValidate.setText("Validate");
        bookingValidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingValidateActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        bookingPrice.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                bookingPriceAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel5.setText("Price(DH)");

        lb1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb1.setText("ADD Booking");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(464, 464, 464)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bookingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bookingDate, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(123, 123, 123)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(47, 47, 47))
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(bookingValidate)
                        .addGap(257, 257, 257)
                        .addComponent(jButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                .addComponent(lb, javax.swing.GroupLayout.DEFAULT_SIZE, 13, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bookingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bookingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(bookingValidate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lb, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
  
     
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    
  
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void bookingValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingValidateActionPerformed
        // TODO add your handling code here:

        int selectedClientId = jComboBox1.getSelectedIndex() + 1; // Assuming IDs start from 1

// Get the selected employee ID from the combo box
int selectedEmployeeId = jComboBox2.getSelectedIndex() + 1; // Assuming IDs start from 1

// Assuming bookingPrice is the JSpinner component
int price = (int) bookingPrice.getValue();

// Get the selected booking date
SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
String selectedDate = dateFormat.format(bookingDate.getDate());

// Get the description from the text area
String description = bookingDescription.getText();

if ("".equals(description) || price == 0) {
   bookingDate.setDate(new Date()); 
// Sets the default date to the current date

    JOptionPane.showMessageDialog(null, "Please fill in all fields.", "Missing Information", JOptionPane.WARNING_MESSAGE);
    System.err.println("error fl5wa");
    return; // Exit the method without proceeding further
}
// Count the number of bookings on the selected date
int bookingCount = 0;
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    
    String url = "jdbc:mysql://localhost:3306/jaava_db";
    String user = "root";
    String pass = "";
    Connection con = DriverManager.getConnection(url, user, pass);
    PreparedStatement countStatement = con.prepareStatement("SELECT COUNT(*) AS count FROM booking WHERE booking_date = ?");
    countStatement.setString(1, selectedDate);
    ResultSet countResultSet = countStatement.executeQuery();
    
    if (countResultSet.next()) {
        bookingCount = countResultSet.getInt("count");
    }
    
    countResultSet.close();
    countStatement.close();
    con.close();
} catch (ClassNotFoundException | SQLException ex) {
    // Handle exceptions
     // Print the stack trace for debugging purposes
System.out.println("error hna 1");
}

int confirmation = JOptionPane.showConfirmDialog(null, "Booking Information:\n" +
            "Client ID: " + selectedClientId + "\n" +
            "Employee ID: " + selectedEmployeeId + "\n" +
            "Booking Date: " + selectedDate + "\n" +
            "Description: " + description + "\n" +
            "Price: " + price + "\n\n" +
            "Are you sure you want to submit this booking?", "Confirm Booking", JOptionPane.YES_NO_OPTION);

    if (confirmation == JOptionPane.YES_OPTION) {
// Check if the booking count exceeds the limit
if (bookingCount >= 10) {
    JOptionPane.showMessageDialog(null, "The selected date is saturated. Please choose another date.", "Saturated Date", JOptionPane.WARNING_MESSAGE);
} else {
    // Insert the booking into the database
   try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    
    String url = "jdbc:mysql://localhost:3306/jaava_db";
    String user = "root";
    String pass = "";
    Connection con = DriverManager.getConnection(url, user, pass);
    
    PreparedStatement statement = con.prepareStatement("INSERT INTO Booking (client_id, employee_id, booking_date, description, price) VALUES (?, ?, ?, ?, ?)");
    statement.setInt(1, selectedClientId);
    statement.setInt(2, selectedEmployeeId);
    statement.setString(3, selectedDate);
    statement.setString(4, description);
    statement.setInt(5, price); // Adjust index to 5 for the price column
    
    int rowsAffected = statement.executeUpdate();
    
    if (rowsAffected > 0) {
        JOptionPane.showMessageDialog(null, "Booking added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, "Failed to add booking.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    statement.close();
    con.close();
} catch (ClassNotFoundException | SQLException ex) {
    // Handle exceptions
    System.out.println("error hna 2"); // Print the stack trace for debugging purposes
}
}
  
    }//GEN-LAST:event_bookingValidateActionPerformed
    }
    private void bookingDateAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_bookingDateAncestorAdded
        // TODO add your handling code here:
         bookingDate.setDate(new Date()); 
    }//GEN-LAST:event_bookingDateAncestorAdded

    private void bookingDescriptionAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_bookingDescriptionAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_bookingDescriptionAncestorAdded

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        // Clear client and employee combo boxes
    jComboBox1.setSelectedIndex(-1); // Clear client combo box selection
    jComboBox2.setSelectedIndex(-1); // Clear employee combo box selection
    
    // Clear date chooser
    bookingDate.setDate(null);
    
    // Clear description text area
    bookingDescription.setText("");
    
 bookingPrice.setValue(0.0); // Assuming you want to set the initial value to 0.0

    }//GEN-LAST:event_jButton2ActionPerformed

    private void bookingPriceAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_bookingPriceAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_bookingPriceAncestorAdded

    private void jComboBox1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jComboBox1AncestorAdded
        // TODO add your handling code here:
           try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    String url = "jdbc:mysql://localhost:3306/jaava_db"; // Corrected database name
    String user = "root";
    String pass = "";
    Connection con = DriverManager.getConnection(url, user, pass);
    Statement statement = con.createStatement();
    ResultSet resultSet = statement.executeQuery("SELECT * FROM Client");

    DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(); // Create a new model

    while (resultSet.next()) {
        String fullName = resultSet.getString("prenom") + " " + resultSet.getString("nom");
        model.addElement(fullName);
    }

    jComboBox1.setModel(model); // Set the model to the combo box

    // Correct approach to handle selection:
   jComboBox1.addItemListener(new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                String selected = (String) jComboBox1.getSelectedItem();
                System.out.println("Selected item: " + selected);
                // No need to setSelectedItem again, it's already selected
            }
        }
    });

    resultSet.close();
    statement.close();
    con.close(); // Close the connection when done

} catch (ClassNotFoundException | SQLException ex) {
    ex.printStackTrace(); // Print the stack trace for debugging
}

    }//GEN-LAST:event_jComboBox1AncestorAdded

    private void jComboBox2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jComboBox2AncestorAdded
        // TODO add your handling code here:
         try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    
    String url = "jdbc:mysql://localhost:3306/jaava_db";
    String user = "root";
    String pass = "";
    Connection con = DriverManager.getConnection(url, user, pass);
    
    Statement statement = con.createStatement();
    ResultSet resultSet = statement.executeQuery("SELECT fname FROM employee");
    
    DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(); // Create a new model
    
    while (resultSet.next()) {
        String fullName = resultSet.getString("fname");
        model.addElement(fullName);
    }
    
    jComboBox2.setModel(model); // Set the model to the combo box
    
    resultSet.close();
    statement.close();
    con.close(); // Close the connection when done
} catch (ClassNotFoundException | SQLException ex) {
    // Handle exceptions
    ex.printStackTrace(); // Print the stack trace for debugging purposes
}
    }//GEN-LAST:event_jComboBox2AncestorAdded

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser bookingDate;
    private javax.swing.JTextArea bookingDescription;
    private javax.swing.JSpinner bookingPrice;
    private javax.swing.JButton bookingValidate;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lb1;
    // End of variables declaration//GEN-END:variables
}
