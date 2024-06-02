/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.hexallake.rfid.components;

import com.hexallake.rfid.entities.Users;
import com.hexallake.rfid.repo.UserRepo;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author avinash
 */
@Component
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    UserRepo usrRepo;
    public LoginFrame() {
        initComponents();
    }

    public LoginFrame(UserRepo usrRepo) {
       
         this.usrRepo = usrRepo;
         initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginPanel = new javax.swing.JPanel();
        usernametxt = new javax.swing.JTextField();
        passwordtxt = new javax.swing.JPasswordField();
        usernamelbl = new javax.swing.JLabel();
        passwordlbl = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        responseLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome");
        setAlwaysOnTop(true);
        setPreferredSize(new java.awt.Dimension(800, 400));
        setResizable(false);

        LoginPanel.setBackground(new java.awt.Color(102, 0, 102));
        LoginPanel.setPreferredSize(new java.awt.Dimension(800, 400));

        usernametxt.setToolTipText("email");

        passwordtxt.setToolTipText("password");

        usernamelbl.setForeground(new java.awt.Color(255, 255, 255));
        usernamelbl.setText("Username");

        passwordlbl.setForeground(new java.awt.Color(255, 255, 255));
        passwordlbl.setText("Password");

        jButton1.setText("Login");
        jButton1.setActionCommand("submitAction");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        responseLbl.setForeground(new java.awt.Color(255, 255, 255));
        responseLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usernamelbl, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(passwordlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(responseLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(usernametxt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                .addContainerGap(399, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(341, 341, 341))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usernamelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usernametxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwordtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(passwordlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(responseLbl)
                .addContainerGap(215, Short.MAX_VALUE))
        );

        jButton1.getAccessibleContext().setAccessibleName("submit");
        jButton1.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        Optional<Users> u = usrRepo.findByEmailAndPassword(usernametxt.getText(), passwordtxt.getText());
        if(u.isPresent()){
            responseLbl.setText("Login Success");
            this.dispose();
            WorkspaceForm ws = new WorkspaceForm();
            ws.setVisible(true);
            ws.setLocationRelativeTo(null);
        }else{
            responseLbl.setText("Invalid User");
        }
    }//GEN-LAST:event_submitActionPerformed


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel passwordlbl;
    private javax.swing.JPasswordField passwordtxt;
    private javax.swing.JLabel responseLbl;
    private javax.swing.JLabel usernamelbl;
    private javax.swing.JTextField usernametxt;
    // End of variables declaration//GEN-END:variables
}