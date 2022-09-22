package newstart;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.Timer;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vivek
 */
public class LOGIN_VOS extends javax.swing.JFrame {

    /**
     * Creates new form LOGIN_VOS
     */
    public LOGIN_VOS() {
        initComponents();
         
        date1();
        time();
         }     
     public void date1(){
        String txtDate=new SimpleDateFormat("dd/MM/yyyy",Locale.FRANCE).format(new java.util.Date());
         date.setText("DATE:"+txtDate);
        }
     public void time(){
         new Timer (0,new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent e) {
                 java.text.SimpleDateFormat self =new java.text.SimpleDateFormat("HH:mm:ss");
                    String texte_date=self.format(new java.util.Date());
             time.setText("TIME:"+texte_date);
             }

            
                
         }).start();
       
             }


    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        passTF = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        jLabel2.setText("NAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 175, 53));

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        jLabel3.setText("password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 280, 47));

        userTF.setBackground(new java.awt.Color(204, 204, 255));
        userTF.setFont(new java.awt.Font("Monotype Corsiva", 3, 36)); // NOI18N
        userTF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 1, true));
        userTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTFActionPerformed(evt);
            }
        });
        getContentPane().add(userTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 230, -1));

        jButton1.setFont(new java.awt.Font("Niagara Engraved", 1, 54)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newstart/tick_red (1).png"))); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 270, 70));

        jButton3.setFont(new java.awt.Font("Niagara Engraved", 1, 54)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newstart/x-mark-3-xxl (1).png"))); // NOI18N
        jButton3.setText("EXIT");
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, 230, 70));

        passTF.setBackground(new java.awt.Color(204, 204, 255));
        passTF.setFont(new java.awt.Font("Monotype Corsiva", 3, 36)); // NOI18N
        passTF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 1, true));
        passTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTFActionPerformed(evt);
            }
        });
        getContentPane().add(passTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 230, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newstart/user7.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));

        jLabel1.setFont(new java.awt.Font("Algerian", 2, 64)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText(" HELLOW!!\" lite dragon\"USER!");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setDoubleBuffered(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 950, 80));

        time.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        getContentPane().add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 250, 40));

        date.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 250, 45));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newstart/21_yaroslavosetrov-waves.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTFActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 if (JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0); }      
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 String user = null;
 String pass = null;
 { try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/vivek", "root", "root");
            Statement stmt = con.createStatement();
            String query = "Select * from login";
            ResultSet rs = stmt.executeQuery(query);
            if (rs.first()) {
                 user = rs.getString(1);
                 pass = rs.getString(2);
            }
        }catch (Exception e) {
            System.out.println("Error");
        }
 String username = userTF.getText();
 String apass = new String(passTF.getPassword()); 
        
        if (username.equals(user) && apass.equals(pass)) {
            JOptionPane.showMessageDialog(this,"You have been successfully logged in." );
            home form=new home();
            this.dispose();
           form.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Password and User ID do not match. Please try again.", "Incorrect username or password", JOptionPane.ERROR_MESSAGE);
        }}

    }//GEN-LAST:event_jButton1ActionPerformed

    private void passTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passTFActionPerformed

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
            java.util.logging.Logger.getLogger(LOGIN_VOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN_VOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN_VOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN_VOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN_VOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField passTF;
    private javax.swing.JLabel time;
    private javax.swing.JTextField userTF;
    // End of variables declaration//GEN-END:variables
}
