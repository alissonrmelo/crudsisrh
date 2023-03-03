package VIEW;

import java.sql.*;
import javax.swing.JOptionPane;

import DAO.ConnectionControler;
import java.awt.Font;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;



public class TelaLogin extends javax.swing.JFrame {   
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public TelaLogin() {
    	getContentPane().setEnabled(false);
    	getContentPane().setBackground(new Color(255, 255, 255));
    	getContentPane().setFont(new Font("Arial", Font.PLAIN, 12));
        initComponents();      
        conexao = ConnectionControler.conector();
        if (conexao != null) {
            lblStatusMsg.setText("Banco conectado.");
            lblStatusImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/img/dbok.png")));
            TESTE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/img/cloud-conn.png")));
        } else {
            lblStatusMsg.setText("Bando desconectado...");
            lblStatusImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/img/dberro.png")));
            TESTE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/img/cloud-disc.png")));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel1.setFont(new Font("Arial", Font.PLAIN, 12));
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        lblStatusMsg = new javax.swing.JLabel();
        lblStatusImg = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        TESTE = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);

        jPanel1.setBackground(new Color(204, 204, 204));
        jPanel1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/img/user.png"))); // NOI18N

        txtUsuario.setFont(new Font("Arial", Font.PLAIN, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/img/key.png"))); // NOI18N

        txtSenha.setFont(new Font("Arial", Font.PLAIN, 14));
        
        JTextArea txtrLogin = new JTextArea();
        txtrLogin.setSelectionColor(new Color(204, 204, 204));
        txtrLogin.setDisabledTextColor(new Color(0, 0, 0));
        txtrLogin.setBorder(null);
        txtrLogin.setEnabled(false);
        txtrLogin.setEditable(false);
        txtrLogin.setFont(new Font("Arial", Font.PLAIN, 14));
        txtrLogin.setBackground(new Color(204, 204, 204));
        txtrLogin.setSelectedTextColor(new Color(204, 204, 204));
        txtrLogin.setText("Login:");
        
        txtrPassword = new JTextArea();
        txtrPassword.setSelectedTextColor(new Color(204, 204, 204));
        txtrPassword.setDisabledTextColor(new Color(0, 0, 0));
        txtrPassword.setBorder(null);
        txtrPassword.setEnabled(false);
        txtrPassword.setEditable(false);
        txtrPassword.setFont(new Font("Arial", Font.PLAIN, 14));
        txtrPassword.setBackground(new Color(204, 204, 204));
        txtrPassword.setText("Password:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel1)
        				.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(txtrLogin, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        				.addComponent(txtrPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(txtSenha)
        				.addComponent(txtUsuario, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel3)
        			.addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel3)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(txtrLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addComponent(txtUsuario, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
        						.addComponent(jLabel1))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(txtrPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addComponent(txtSenha, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
        						.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))))
        			.addGap(44))
        );
        jPanel1.setLayout(jPanel1Layout);

        btnLogin.setFont(new Font("Arial", Font.PLAIN, 18)); // NOI18N
        btnLogin.setForeground(new Color(102, 102, 102));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblStatusMsg.setFont(new Font("Arial", Font.PLAIN, 14)); // NOI18N
        lblStatusMsg.setForeground(new java.awt.Color(0, 0, 153));
        lblStatusMsg.setText("lblStatusMsg");

        lblStatusImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/img/dberro.png"))); // NOI18N

        btnSair.setFont(new Font("Arial", Font.PLAIN, 18)); // NOI18N
        btnSair.setForeground(new Color(102, 102, 102));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        TESTE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/img/cloud-disc.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(52, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblStatusMsg)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(lblStatusImg)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(TESTE, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
        							.addGap(44)
        							.addComponent(btnLogin)
        							.addGap(10)
        							.addComponent(btnSair)))
        					.addPreferredGap(ComponentPlacement.RELATED))
        				.addComponent(jPanel1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 299, GroupLayout.PREFERRED_SIZE))
        			.addGap(47))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(36)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createParallelGroup(Alignment.LEADING)
        					.addComponent(TESTE)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(btnLogin)
        						.addComponent(btnSair)))
        				.addComponent(lblStatusImg, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(lblStatusMsg)
        			.addGap(32))
        );
        getContentPane().setLayout(layout);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        logar();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        TelaLogin.this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TESTE;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblStatusImg;
    private javax.swing.JLabel lblStatusMsg;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    private JTextArea txtrPassword;
    // End of variables declaration//GEN-END:variables

    private void logar() {
        String sql = "SELECT * FROM administradores where login=? AND password=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtUsuario.getText());
            pst.setString(2, txtSenha.getText());

            rs = pst.executeQuery();

            if (rs.next()) {
                Principal principal = new Principal();
                principal.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não encontrado!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
