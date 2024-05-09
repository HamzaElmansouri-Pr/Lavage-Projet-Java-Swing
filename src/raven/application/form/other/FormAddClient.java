package raven.application.form.other;

import com.formdev.flatlaf.FlatClientProperties;
import com.mysql.cj.xdevapi.Table;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import raven.toast.Notifications;


public class FormAddClient extends javax.swing.JPanel {

    public FormAddClient() {
       initComponents();
        lb.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:$h1.font");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nomT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mailT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        telpT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        detailT = new javax.swing.JTextField();
        addbtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Ajouter Client");

        pnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnomActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Prénom");

        nomT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomTActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nom");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Email");

        mailT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailTActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Téléphone");

        telpT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telpTActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Détaills");

        detailT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailTActionPerformed(evt);
            }
        });

        addbtn.setText("Ajouter");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lbLayout = new javax.swing.GroupLayout(lb);
        lb.setLayout(lbLayout);
        lbLayout.setHorizontalGroup(
            lbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(lbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lbLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(lbLayout.createSequentialGroup()
                        .addGroup(lbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomT, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnom, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(lbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(telpT, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                            .addComponent(mailT, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(144, 144, 144))
                    .addGroup(lbLayout.createSequentialGroup()
                        .addGroup(lbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(detailT, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        lbLayout.setVerticalGroup(
            lbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(lbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(lbLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mailT, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telpT, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lbLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnom, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomT, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detailT, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnomActionPerformed

    private void nomTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomTActionPerformed

    private void mailTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailTActionPerformed

    private void telpTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telpTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telpTActionPerformed

    private void detailTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_detailTActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
       String prenom=pnom.getText();
       String nom = nomT.getText();
       String mail = mailT.getText();
       String telp= telpT.getText();
       String detail = detailT.getText();
        try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          
          String url= "jdbc:MySQL://localhost:3306/jaava_db";
          String user= "root";
          String pass= "";
          Connection con = DriverManager.getConnection(url,user,pass);
          Statement st = con.createStatement();
       
      if("".equals(prenom)){
             
                JOptionPane.showMessageDialog(new JFrame(), "First Name is require", "Dialog",
                                     JOptionPane.ERROR_MESSAGE);
            }else if("".equals(nom)){
             
                JOptionPane.showMessageDialog(new JFrame(), "Last Name is require", "Dialog",
                                     JOptionPane.ERROR_MESSAGE);
            }else if("".equals(mail)){
             
                JOptionPane.showMessageDialog(new JFrame(), "Email Adress is require", "Dialog",
                                     JOptionPane.ERROR_MESSAGE);
            }else {
                
               String query = "INSERT INTO client (prenom, nom, email, telephone, description) " +
               "VALUES ('" + prenom + "','" + nom + "','" + mail + "','" + telp + "','" + detail + "')";

               
               st.executeUpdate(query);
               pnom.setText("");
               nomT.setText("");
               mailT.setText("");
               telpT.setText("");
               detailT.setText("");
                       Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.TOP_CENTER, "Client Ajouter Avec Succès");

             //  showMessageDialog(null, "Successfully registered.");
              // loadData();
               con.close();
            } 
    
        }catch(Exception e){
            System.out.println("Error "+ e.getMessage());
            
        }
    }//GEN-LAST:event_addbtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JTextField detailT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel lb;
    private javax.swing.JTextField mailT;
    private javax.swing.JTextField nomT;
    private javax.swing.JTextField pnom;
    private javax.swing.JTextField telpT;
    // End of variables declaration//GEN-END:variables
}
