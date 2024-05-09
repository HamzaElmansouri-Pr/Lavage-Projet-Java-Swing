package raven.application.form.other;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.util.Formatter;
import com.github.weisj.jsvg.nodes.Path;
import java.awt.Dimension;
import java.io.File;
import java.io.PrintWriter;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import java.nio.charset.StandardCharsets;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import raven.application.Application;


public class FormBooking extends javax.swing.JPanel {
   


    public FormBooking() {
        initComponents();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bookingAdd = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        bookingTable = new javax.swing.JTable();
        bookingEdit = new javax.swing.JButton();
        bookingDelete = new javax.swing.JButton();
        bookingImport = new javax.swing.JButton();
        bookingExport = new javax.swing.JButton();
        lb1 = new javax.swing.JLabel();

        bookingAdd.setText("Ajouter");
        bookingAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingAddActionPerformed(evt);
            }
        });

        bookingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Client", "Employee", "Description", "Price", "Status", "Action"
            }
        ));
        bookingTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                bookingTableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        bookingTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookingTableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bookingTableMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(bookingTable);

        bookingEdit.setText("Edit");
        bookingEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingEditActionPerformed(evt);
            }
        });

        bookingDelete.setText("Delete");
        bookingDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingDeleteActionPerformed(evt);
            }
        });

        bookingImport.setText("Import data ");
        bookingImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingImportActionPerformed(evt);
            }
        });

        bookingExport.setText("Export data");
        bookingExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingExportActionPerformed(evt);
            }
        });

        lb1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb1.setText("Bookings");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(bookingAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(bookingImport, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(bookingExport, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(bookingEdit)
                        .addGap(217, 217, 217)
                        .addComponent(bookingDelete))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookingImport)
                    .addComponent(bookingExport)
                    .addComponent(bookingAdd))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookingEdit)
                    .addComponent(bookingDelete))
                .addContainerGap(201, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bookingAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingAddActionPerformed
       Application.showForm(new FormAddBooking());
    }//GEN-LAST:event_bookingAddActionPerformed

    private void bookingTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_bookingTableAncestorAdded
        // TODO add your handling code here:
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/jaava_db";
        String user = "root";
        String pass = "";
        Connection con = DriverManager.getConnection(url, user, pass);

      String query = "SELECT b.id, CONCAT(c.prenom, ' ', c.nom) AS client_name, e.fname AS employee_name, b.description, b.price, " +
               "CASE " +
               "    WHEN DATE(b.booking_date) = CURDATE() THEN 'Today' " +
               "    WHEN DATE(b.booking_date) > CURDATE() THEN 'Upcoming' " +
               "    ELSE 'Done or Canceled' " +
               "END AS status " +
               "FROM booking b " +
               "INNER JOIN Client c ON b.client_id = c.id " +
               "INNER JOIN Employee e ON b.employee_id = e.id";

        PreparedStatement statement = con.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Client Name");
        model.addColumn("Employee Name");
        model.addColumn("Description");
        model.addColumn("Price");
        model.addColumn("Status");
        model.addColumn("Action");

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String clientName = resultSet.getString("client_name");
            String employeeName = resultSet.getString("employee_name");
            String description = resultSet.getString("description");
            double price = resultSet.getDouble("price");
            String status = resultSet.getString("status");
            String action = "<html><body> <a href=\"view:" + id + "\">View</a></body></html>";
            model.addRow(new Object[]{id, clientName, employeeName, description, price, status, action});
        }

        resultSet.close();
        statement.close();
        con.close();

        bookingTable.setModel(model);
    } catch (ClassNotFoundException | SQLException ex) {
        ex.printStackTrace();
    }
    }//GEN-LAST:event_bookingTableAncestorAdded
    private void bookingDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingDeleteActionPerformed
        // TODO add your handling code here:
         // Get the selected row index
    int selectedRow = bookingTable.getSelectedRow();
    
    // Check if a row is selected
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a booking to delete.", "No booking Selected", JOptionPane.WARNING_MESSAGE);
        return; // Exit the method if no row is selected
    }
    
    // Get the ID of the booking to delete from the selected row
    int bookingId = (int) bookingTable.getValueAt(selectedRow, 0); // Assuming the ID is in the first column
    
    // Confirm deletion with the user
    int confirmation = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this booking?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
    
    if (confirmation == JOptionPane.YES_OPTION) {
        // Perform the deletion in the database
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jaava_db";
            String user = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, user, pass);
            
            PreparedStatement statement = con.prepareStatement("DELETE FROM booking WHERE id = ?");
            statement.setInt(1, bookingId);
            
            int rowsAffected = statement.executeUpdate();
            
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "booking deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                // Refresh the table to reflect the changes
                refreshbookingTable();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to delete booking.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            statement.close();
            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "An error occurred while deleting booking.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

// Method to refresh the booking table after deletion
private void refreshbookingTable() {
    DefaultTableModel model = (DefaultTableModel) bookingTable.getModel();
    model.setRowCount(0); // Clear the existing rows
    
    // Call the method to populate the table again
    bookingTableAncestorAdded(null);
    // Implement the logic to refresh the booking table, similar to the logic in bookingTableAncestorAdded
    // You can call this method after adding, updating, or deleting a booking

    }//GEN-LAST:event_bookingDeleteActionPerformed

    private void bookingEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingEditActionPerformed
        // TODO add your handling code here:
// Get the selected row index
    int selectedRow = bookingTable.getSelectedRow();
    
    // Check if a row is selected
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a booking to edit.", "No booking Selected", JOptionPane.WARNING_MESSAGE);
        return; 
    // Exit the method if no row is selected
    }

    // Allow editing of the selected row in the table
   bookingTable.editCellAt(selectedRow, 3); 
    bookingTable.editCellAt(selectedRow, 4);
    
    // Save the changes made by the user to the database
    saveChangesToDatabase();
}

private void saveChangesToDatabase() {
    // Iterate over the table rows to update the database with the edited data
    for (int row = 0; row < bookingTable.getRowCount(); row++) {
        int bookingId = (int) bookingTable.getValueAt(row, 0); // Assuming the ID is in the first column
        String description = (String) bookingTable.getValueAt(row, 3);
        int price = Integer.parseInt(bookingTable.getValueAt(row, 4).toString()) ; // Assuming price is in the fifth column

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/jaava_db";
            String user = "root";
            String pass = "";
            Connection con = DriverManager.getConnection(url, user, pass);
            
            PreparedStatement statement = con.prepareStatement("UPDATE booking SET description=? , price = ? WHERE id = ?");
          
            statement.setString(1, description);
            statement.setInt(2, price);
            statement.setInt(3, bookingId);

           
            statement.executeUpdate();
            
            statement.close();
            con.close();
             JOptionPane.showMessageDialog(null, "Data has been edited.", "Data edit", JOptionPane.INFORMATION_MESSAGE);

        } catch (ClassNotFoundException | SQLException ex) {
           
           
            JOptionPane.showMessageDialog(this, "An error occurred while updating booking.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_bookingEditActionPerformed

    private void bookingTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingTableMouseClicked

       
    }//GEN-LAST:event_bookingTableMouseClicked

    private void bookingImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingImportActionPerformed
        // TODO add your handling code here:
          // TODO add your handling code here:
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Import XML File");
    
    int result = fileChooser.showOpenDialog(this);
    if (result == JFileChooser.APPROVE_OPTION) {
        File file = fileChooser.getSelectedFile();
        importbookingsFromXML(file);
    }
        
    }//GEN-LAST:event_bookingImportActionPerformed
private void importbookingsFromXML(File file) {
    try {
        // Establish database connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jaava_db", "root", "");
        
        // Parse XML file
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(file);
        
        // Normalize the document
        doc.getDocumentElement().normalize();
        
        // Get the root element
        Element rootElement = doc.getDocumentElement();
        
        // Get a list of booking elements
        NodeList bookingList = rootElement.getElementsByTagName("booking");
        
        // Iterate over the booking elements
        for (int i = 0; i < bookingList.getLength(); i++) {
            Node bookingNode = bookingList.item(i);
            if (bookingNode.getNodeType() == Node.ELEMENT_NODE) {
                Element bookingElement = (Element) bookingNode;
                
                // Extract booking attributes
                String clientId = bookingElement.getAttribute("client_id");
                String employeeId = bookingElement.getAttribute("employee_id");
                String bookingDate = bookingElement.getAttribute("booking_date");
                String description = bookingElement.getAttribute("description");
                String price = bookingElement.getAttribute("price");
                
                // Insert the booking into the database
                String insertQuery = "INSERT INTO booking (client_id, employee_id, booking_date, description, price) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement statement = con.prepareStatement(insertQuery);
                statement.setString(1, clientId);
                statement.setString(2, employeeId);
                statement.setString(3, bookingDate);
                statement.setString(4, description);
                statement.setString(5, price);
                statement.executeUpdate();
            }
        }
        
        // Show success message
        JOptionPane.showMessageDialog(this, "bookings imported successfully from XML file.", "Success", JOptionPane.INFORMATION_MESSAGE);
        
        // Close resources
        con.close();
    } catch (Exception ex) {
        ex.printStackTrace();
        // Show error message if an exception occurs
        JOptionPane.showMessageDialog(this, "Error importing bookings from XML file.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    private void bookingExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingExportActionPerformed
        // TODO add your handling code here:
           // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Save As XML");
    
    int result = fileChooser.showSaveDialog(this);
    if (result == JFileChooser.APPROVE_OPTION) {
        File file = fileChooser.getSelectedFile();
        exportbookingsToXML(file);
    }
    }//GEN-LAST:event_bookingExportActionPerformed

    private void bookingTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingTableMousePressed
  
         int columnIndex = bookingTable.columnAtPoint(evt.getPoint());
    
    // Check if the clicked column is the one you want to trigger the printing action
    int targetColumnIndex = 6;
    if (columnIndex == targetColumnIndex) {
        int selectedRow = bookingTable.getSelectedRow();
    
    if (selectedRow >= 0) {
        try {
            // Get the booking details from the selected row
            String clientID = bookingTable.getValueAt(selectedRow, 1).toString();
            String employeeID = bookingTable.getValueAt(selectedRow, 2).toString();
            String bookingDate = bookingTable.getValueAt(selectedRow, 3).toString();
            String description = bookingTable.getValueAt(selectedRow, 4).toString();
            String price = bookingTable.getValueAt(selectedRow, 5).toString();
            
            // Create HTML content with booking details
            StringBuilder htmlContent = new StringBuilder();
            try (Formatter formatter = new Formatter(htmlContent)) {
              formatter.format("<html><body>");
formatter.format("<h1>booking Details</h1>");
formatter.format("<p><strong>Client :</strong> %s</p>", clientID);
formatter.format("<p><strong>Employee:</strong> %s</p>", employeeID);
formatter.format("<p><strong>Description:</strong> %s</p>", bookingDate);
formatter.format("<p><strong>price:</strong> %s</p>", description);

// Add the print button
formatter.format("<button onclick=\"window.print()\" style=\"background-color: green; color: white;\">Print</button>");
formatter.format("</body></html>");   }
            
            // Write HTML content to a temporary file
            File tempFile = File.createTempFile("booking_details", ".html");
            try (FileWriter writer = new FileWriter(tempFile)) {
                writer.write(htmlContent.toString());
            }
            
            // Open the temporary HTML file in the default web browser
            Desktop.getDesktop().open(tempFile);
        } catch (IOException ex) {
            // Handle any exceptions
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error opening HTML page", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        // Show a message if no row is selected
        JOptionPane.showMessageDialog(this, "Please select a booking", "No booking Selected", JOptionPane.WARNING_MESSAGE);
    }
               
    }//GEN-LAST:event_bookingTableMousePressed
    }
    private void exportbookingsToXML(File file) {
    try {
        // Establish database connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jaava_db", "root", "");
        
        // Create SQL statement to fetch booking data
        String query = "SELECT * FROM booking";
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        
        // Create XML document
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.newDocument();
        
        // Create root element
        Element rootElement = doc.createElement("bookings");
        doc.appendChild(rootElement);
        
        // Iterate over the result set and create XML elements for each booking
        while (resultSet.next()) {
            Element bookingElement = doc.createElement("booking");
            rootElement.appendChild(bookingElement);
            
            // Add attributes for each booking element
            bookingElement.setAttribute("client_id", resultSet.getString("client_id"));
            bookingElement.setAttribute("employee_id", resultSet.getString("employee_id"));
            bookingElement.setAttribute("booking_date", resultSet.getString("booking_date"));
            bookingElement.setAttribute("description", resultSet.getString("description"));
            bookingElement.setAttribute("price", resultSet.getString("price"));
        }
        
        // Write XML document to the file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(file);
        transformer.transform(source, result);
        
        // Show success message
        JOptionPane.showMessageDialog(this, "bookings exported successfully to XML file.", "Success", JOptionPane.INFORMATION_MESSAGE);
        
        // Close resources
        resultSet.close();
        statement.close();
        con.close();
    } catch (Exception ex) {
        ex.printStackTrace();
        // Show error message if an exception occurs
        JOptionPane.showMessageDialog(this, "Error exporting bookings to XML file.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookingAdd;
    private javax.swing.JButton bookingDelete;
    private javax.swing.JButton bookingEdit;
    private javax.swing.JButton bookingExport;
    private javax.swing.JButton bookingImport;
    private javax.swing.JTable bookingTable;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb1;
    // End of variables declaration//GEN-END:variables
}
