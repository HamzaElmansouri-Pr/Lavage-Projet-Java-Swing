package raven.application.form.other;

import java.awt.Dimension;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import raven.application.Application;

public class GestionClients extends javax.swing.JPanel {

    private JTextField nomField;
    private JTextField prenomField;
    private JTextField telephoneField;
    private JTextField emailField;

    public GestionClients() {
        initComponents();
        populateTable();
    }

    private void initComponents() {
        // Initialize components
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addbtn = new javax.swing.JButton();

        // Set table model
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "ID", "Nom", "Prénom", "Email", "Téléphone", "Detaille", "Action"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, true // Action column is editable
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        // Set row height
        jTable1.setRowHeight(35);

        // Add table to scroll pane
        jScrollPane1.setViewportView(jTable1);

        // Add button text and action listener
        addbtn.setText("Ajouter");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        // Layout
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(194, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addbtn)
                                .addGap(39, 39, 39)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(261, 261, 261))
        );

        // Add fields for Nom, Prénom, Téléphone, and Email
        JLabel nomLabel = new JLabel("Nom:");
        nomField = new JTextField();
        JLabel prenomLabel = new JLabel("Prénom:");
        prenomField = new JTextField();
        JLabel telephoneLabel = new JLabel("Téléphone:");
        telephoneField = new JTextField();
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();

        // Layout for fields
        JPanel fieldsPanel = new JPanel();
        GroupLayout fieldsLayout = new GroupLayout(fieldsPanel);
        fieldsPanel.setLayout(fieldsLayout);
        fieldsLayout.setAutoCreateGaps(true);
        fieldsLayout.setAutoCreateContainerGaps(true);
        fieldsLayout.setHorizontalGroup(
                fieldsLayout.createSequentialGroup()
                        .addGroup(fieldsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(nomLabel)
                                .addComponent(prenomLabel)
                                .addComponent(telephoneLabel)
                                .addComponent(emailLabel))
                        .addGroup(fieldsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(nomField)
                                .addComponent(prenomField)
                                .addComponent(telephoneField)
                                .addComponent(emailField))
        );
        fieldsLayout.setVerticalGroup(
                fieldsLayout.createSequentialGroup()
                        .addGroup(fieldsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(nomLabel)
                                .addComponent(nomField))
                        .addGroup(fieldsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(prenomLabel)
                                .addComponent(prenomField))
                        .addGroup(fieldsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(telephoneLabel)
                                .addComponent(telephoneField))
                        .addGroup(fieldsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(emailLabel)
                                .addComponent(emailField))
        );

        // Add the fields panel below the table
        JScrollPane fieldsScrollPane = new JScrollPane(fieldsPanel);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fieldsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(194, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addbtn)
                                .addGap(39, 39, 39)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fieldsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(261, 261, 261))
        );

        // Add action listener to table rows
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = jTable1.rowAtPoint(evt.getPoint());
                int col = jTable1.columnAtPoint(evt.getPoint());
                if (row >= 0 && col >= 0) {
                    // Populate fields with selected client's information
                    nomField.setText(jTable1.getValueAt(row, 1).toString());
                    prenomField.setText(jTable1.getValueAt(row, 2).toString());
                    telephoneField.setText(jTable1.getValueAt(row, 4).toString());
                    emailField.setText(jTable1.getValueAt(row, 3).toString());
                }
            }
        });
    }

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {
        Application.showForm(new FormAddClient());
    }

    private void populateTable() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jaava_db", "root", "");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM clients");

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            while (resultSet.next()) {
                Object[] row = new Object[resultSet.getMetaData().getColumnCount() + 1];
                for (int i = 0; i < row.length - 1; i++) {
                    row[i] = resultSet.getObject(i + 1);
                }
                // Add delete and update buttons to the last column
                row[row.length - 1] = new JButton("Delete");
                model.addRow(row);
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration
    private javax.swing.JButton addbtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration
}
