package raven.application.form.other;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.table.TableColumn;
import raven.application.Application;
import raven.application.form.other.*;


public class GestionClients extends javax.swing.JPanel {
   


    public GestionClients() {
        initComponents();
        addRowClickListener(); //add row click listener
        makeTableNonEditable(); // make table non-editable
       hideFormComponents();
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jaava_db", "root", "");

            // Create a statement
            Statement statement = connection.createStatement();

            // Execute the query
            ResultSet resultSet = statement.executeQuery("SELECT * FROM client WHERE deleted_at is NULL");

            // Create a TableModel to hold your data
                        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
           

               // Clear existing data from the table (optional)
            model.setRowCount(0);
            
            // Populate the table with data from the ResultSet
            while (resultSet.next()) {
                Object[] row = new Object[resultSet.getMetaData().getColumnCount()];
                for (int i = 0; i < row.length; i++) {
                    row[i] = resultSet.getObject(i + 1);
                }
               
                model.addRow(row);
                  // Dynamically adjust the height of the table
            int height = jTable1.getRowCount() * jTable1.getRowHeight();
            jScrollPane1.setPreferredSize(new Dimension(jScrollPane1.getPreferredSize().width, height));
            }
            // Close the connection
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
  private void addRowClickListener() {

        jTable1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int row = jTable1.getSelectedRow();
                if (row != -1) { // Check if a row is selected
                    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                    // Retrieve data from selected row and populate form fields
                    nomF.setText(model.getValueAt(row, 1).toString());
                    pnomF.setText(model.getValueAt(row, 2).toString());
                    mailF.setText(model.getValueAt(row, 3).toString());
                    teleT.setText(model.getValueAt(row, 4).toString());
                    detailF.setText(model.getValueAt(row, 5).toString());
                  idLabel.setText(model.getValueAt(row, 0).toString());
                    showFormComponents();
                }
            }
        });
    }
  
  
private void deleteClient(int index) {
    try {
        // Establish connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jaava_db", "root", "");
        
        // Create a statement
        Statement statement = connection.createStatement();
        
        // Execute the query to delete the client
 String query = "UPDATE client SET deleted_at = NOW() WHERE ID = " + index;
 int rowsAffected = statement.executeUpdate(query);
        
        if (rowsAffected > 0) {
            System.out.println("Client with ID " + index + " deleted successfully.");
        } else {
            System.out.println("No client found with ID " + index + ".");
        }
        
        // Close connection
        connection.close();
    } catch (Exception e) {
        e.printStackTrace(); // Handle the exception properly in your application
    }
}

private void updateClient(int index) {
    try {
        // Establish connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jaava_db", "root", "");
        
        // Create a statement
        Statement statement = connection.createStatement();
        
        // Retrieve values from text fields
        String nom = nomF.getText();
        String pnom = pnomF.getText();
        String mail = mailF.getText();
        String tele = teleT.getText();
        String detail = detailF.getText();
        
        // Execute the query to update the client
        String query = "UPDATE client SET nom = '" + nom + "', prenom = '" + pnom + "', email = '" + mail + "', telephone = '" + tele + "', description = '" + detail + "' WHERE ID = " + index;
        int rowsAffected = statement.executeUpdate(query);
        
        if (rowsAffected > 0) {
            System.out.println("Client with ID " + index + " updated successfully.");
        } else {
            System.out.println("No client found with ID " + index + ".");
        }
        
        // Close connection
        connection.close();
    } catch (Exception e) {
        e.printStackTrace(); // Handle the exception properly in your application
    }
}





    private void makeTableNonEditable() {
        for (int i = 0; i < jTable1.getColumnCount(); i++) {
            TableColumn column = jTable1.getColumnModel().getColumn(i);
            column.setCellEditor(null); // Set cell editor to null to make it non-editable
        }
    }
    
     private void hideFormComponents() {
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        nomF.setVisible(false);
        pnomF.setVisible(false);
        mailF.setVisible(false);
        teleT.setVisible(false);
        detailF.setVisible(false);
        updateBtn.setVisible(false);
        deleteBtn.setVisible(false);
        idLabel.setVisible(false);
        
    }
    
    // Method to show form components
    private void showFormComponents() {
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(true);
        nomF.setVisible(true);
        pnomF.setVisible(true);
        mailF.setVisible(true);
        teleT.setVisible(true);
        detailF.setVisible(true);
        updateBtn.setVisible(true);
        deleteBtn.setVisible(true);
        idLabel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nomF = new javax.swing.JTextField();
        pnomF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        mailF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        teleT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        detailF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        idLabel = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nom", "Prénom", "Email", "Téléphone", "Detaille"
            }
        ));
        jTable1.setRowHeight(35);
        jScrollPane1.setViewportView(jTable1);

        addbtn.setText("Ajouter");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setText("Nom");

        nomF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nomF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomFActionPerformed(evt);
            }
        });

        pnomF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setText("Prénom");

        mailF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setText("Email");

        teleT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setText("Mobile");

        detailF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setText("Détaile");

        updateBtn.setBackground(new java.awt.Color(0, 255, 0));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(255, 0, 0));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(393, 393, 393)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nomF, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(teleT, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnomF, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(mailF, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(detailF, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(addbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnomF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mailF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teleT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detailF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
       Application.showForm(new FormAddClient());
    }//GEN-LAST:event_addbtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
       int id = Integer.parseInt(idLabel.getText());
        updateClient(id);
         Application.showForm(new GestionClients());
    }//GEN-LAST:event_updateBtnActionPerformed

    private void nomFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomFActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
int id = Integer.parseInt(idLabel.getText());
        deleteClient(id);
        Application.showForm(new GestionClients());
    }//GEN-LAST:event_deleteBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField detailF;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField mailF;
    private javax.swing.JTextField nomF;
    private javax.swing.JTextField pnomF;
    private javax.swing.JTextField teleT;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
