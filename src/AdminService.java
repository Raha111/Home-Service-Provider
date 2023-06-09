
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author rubai
 */
public class AdminService extends javax.swing.JFrame {

    /**
     * Creates new form AdminService
     */
        public void clear()
    {
        service.setText("");
        charge.setText("");
        service1.setText("");
        charge1.setText("");
        description.setText("");
    }
    public void showtable()
    {
        try {
            // TODO add your handling code here:

           Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/sp","root","15177");
           String sql = "select *from services";
           PreparedStatement ptst = c.prepareStatement(sql);
           ResultSet rs = ptst.executeQuery();
           DefaultTableModel model = (DefaultTableModel)table.getModel();
           model.setRowCount(0);
           while(rs.next()){
            model.addRow(new String[] {rs.getString(2),rs.getString(3)});
        }
           c.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(AdminService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
    }
    public AdminService() {
        initComponents();
        showtable();
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
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new rojeru_san.complementos.RSTableMetro();
        jLabel5 = new javax.swing.JLabel();
        service = new app.bolivia.swing.JCTextField();
        charge = new app.bolivia.swing.JCTextField();
        update = new rojerusan.RSMaterialButtonCircle();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        service1 = new app.bolivia.swing.JCTextField();
        charge1 = new app.bolivia.swing.JCTextField();
        add = new rojerusan.RSMaterialButtonCircle();
        description = new app.bolivia.swing.JCTextField();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(101, 8, 84));
        jLabel3.setText(" Service Details:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 163, 258, 67));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Service", "Service Charge"
            }
        ));
        table.setColorBackgoundHead(new java.awt.Color(101, 8, 84));
        table.setColorBordeFilas(new java.awt.Color(206, 197, 197));
        table.setColorBordeHead(new java.awt.Color(101, 8, 84));
        table.setColorFilasBackgound2(new java.awt.Color(206, 197, 197));
        table.setColorFilasForeground1(new java.awt.Color(101, 8, 84));
        table.setColorFilasForeground2(new java.awt.Color(101, 8, 84));
        table.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        table.setFuenteFilas(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        table.setFuenteFilasSelect(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        table.setGridColor(new java.awt.Color(255, 255, 255));
        table.setRowHeight(60);
        table.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 236, -1, 538));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(101, 8, 84));
        jLabel5.setText("Update Service Charge: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 170, 390, 67));

        service.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        service.setForeground(new java.awt.Color(101, 8, 84));
        service.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        service.setPlaceholder("Enter service name");
        jPanel1.add(service, new org.netbeans.lib.awtextra.AbsoluteConstraints(1086, 280, 365, 58));

        charge.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        charge.setForeground(new java.awt.Color(101, 8, 84));
        charge.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        charge.setPlaceholder("Service Charge");
        jPanel1.add(charge, new org.netbeans.lib.awtextra.AbsoluteConstraints(1086, 367, 365, 56));

        update.setBackground(new java.awt.Color(101, 8, 84));
        update.setText("Update");
        update.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 460, 373, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic2/carpenter (1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1054, 646, 147, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic2/paint-roller.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1252, 646, 137, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic2/plumbing.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(859, 646, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic2/idea.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 646, -1, -1));

        jPanel2.setBackground(new java.awt.Color(101, 8, 84));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 60)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" At Your Service");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setText("<");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(578, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(486, 486, 486)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(101, 8, 84));
        jLabel8.setText("Add Service :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 173, 353, 67));

        service1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        service1.setForeground(new java.awt.Color(101, 8, 84));
        service1.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        service1.setPlaceholder("Enter service name");
        jPanel1.add(service1, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 252, 366, 58));

        charge1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        charge1.setForeground(new java.awt.Color(101, 8, 84));
        charge1.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        charge1.setPlaceholder("Service Charge");
        jPanel1.add(charge1, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 316, 366, 56));

        add.setBackground(new java.awt.Color(101, 8, 84));
        add.setText("Add");
        add.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 460, 386, -1));

        description.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        description.setForeground(new java.awt.Color(101, 8, 84));
        description.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        description.setPlaceholder("Description");
        jPanel1.add(description, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 378, 366, 56));

        jPanel3.setBackground(new java.awt.Color(101, 8, 84));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1031, 170, 10, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 924, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        new AdminHome().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
         try {
           Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/sp","root","15177");
           String sql = "update services set service_charge=? where service_name=?";
           PreparedStatement ptst = c.prepareStatement(sql);
           ptst.setString(1, charge.getText());
           ptst.setString(2, service.getText());
           ptst.executeUpdate();
           JOptionPane.showMessageDialog(this, "Data updated");
           showtable();
           clear();
           c.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(AdminService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        try {
           Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/sp","root","15177");
           String sql = "insert into services (service_name, service_charge, details) value(?,?,?)";
           PreparedStatement ptst = c.prepareStatement(sql);
           ptst.setString(1, service1.getText());
           ptst.setString(2, charge1.getText());
           ptst.setString(3, description.getText());
           ptst.executeUpdate();
           JOptionPane.showMessageDialog(this, "Service added!");
           showtable();
           clear();
           c.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(AdminService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addActionPerformed

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
            java.util.logging.Logger.getLogger(AdminService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminService().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonCircle add;
    private app.bolivia.swing.JCTextField charge;
    private app.bolivia.swing.JCTextField charge1;
    private app.bolivia.swing.JCTextField description;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private app.bolivia.swing.JCTextField service;
    private app.bolivia.swing.JCTextField service1;
    private rojeru_san.complementos.RSTableMetro table;
    private rojerusan.RSMaterialButtonCircle update;
    // End of variables declaration//GEN-END:variables
}
