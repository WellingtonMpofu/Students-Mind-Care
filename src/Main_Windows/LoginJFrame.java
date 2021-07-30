

package Main_Windows;

import java.sql.*;
import javax.swing.JOptionPane;

public class LoginJFrame extends javax.swing.JFrame {

    
    public LoginJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextField_Username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Password = new javax.swing.JPasswordField();
        jButton_Login = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Username");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(690, 260, 150, 30);

        jTextField_Username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Username.setToolTipText("");
        jTextField_Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_UsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_UsernameFocusLost(evt);
            }
        });
        getContentPane().add(jTextField_Username);
        jTextField_Username.setBounds(690, 300, 280, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Password");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(690, 350, 160, 30);

        jTextField_Password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextField_Password);
        jTextField_Password.setBounds(690, 390, 280, 40);

        jButton_Login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_Login.setText("LOGIN");
        jButton_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Login);
        jButton_Login.setBounds(690, 450, 280, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Click here if you are a new user!");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(690, 500, 280, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Wellington\\Pictures\\Psychology Reference\\New folder\\Student Mind Care.png")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1370, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        setSize(1366,768);  
    }//GEN-LAST:event_formWindowActivated

    private void jTextField_UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_UsernameFocusGained
        //        if(this.jTextField_Username.getText().equals("Enter your username")){
            //            this.jTextField_Username.setText("");
            //            this.jTextField_Username.setForeground(Color.black);
            //        }
    }//GEN-LAST:event_jTextField_UsernameFocusGained

    private void jTextField_UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_UsernameFocusLost
        //        if(this.jTextField_Username.getText().equals("")){
            //            this.jTextField_Username.setText("Enter your username");
            //            this.jTextField_Username.setForeground(new Color(153,153,153));
            //        }
    }//GEN-LAST:event_jTextField_UsernameFocusLost

    private void jButton_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LoginActionPerformed
        String username;
        username = this.jTextField_Username.getText();
        String password = this.jTextField_Password.getText();

        try{
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\Wellington\\Documents\\Microsoft Office Files\\Access\\Java Login_db.accdb");

            PreparedStatement pst = conn.prepareStatement("Select * from Table1 where password=? and username=?");
            pst.setString(1, password);
            pst.setString(2, username);
            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                JOptionPane.showMessageDialog(rootPane, "Login successful, Welcome '"+username+"' " , "Logged in", JOptionPane.INFORMATION_MESSAGE);
                Main_Menu obj = new Main_Menu();
                obj.setVisible(true);
                setVisible(false);

            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Incorrect login credentials", "ERROR", JOptionPane.ERROR_MESSAGE);
                this.jTextField_Username.setText("");
                this.jTextField_Password.setText("");
                // jTextField_UsernameFocusGained();
            }
        }
        catch(Exception e){
            System.out.println("Error in database connection");
        }
    }//GEN-LAST:event_jButton_LoginActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        SignUpJFrame main = new SignUpJFrame();
        main.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jTextField_Password;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables
}
