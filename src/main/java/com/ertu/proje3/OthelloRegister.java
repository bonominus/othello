/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.ertu.proje3;

import javax.swing.JOptionPane;
import java.util.Arrays;

/**
 *
 * @author ergul
 */
public class OthelloRegister extends javax.swing.JDialog {

    /**
     * Creates new form OthelloRegister
     * @param parent
     * @param modal
     */
    public OthelloRegister(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
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
        jLabel1 = new javax.swing.JLabel();
        usernameRegisterTF = new javax.swing.JTextField();
        emailRegisterTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        passwordRegisterPF = new javax.swing.JPasswordField();
        rePasswordRegisterPF = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Register", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel1.setText("Username");

        jLabel2.setText("Email");

        jLabel3.setText("Password");

        jLabel4.setText("Re-password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rePasswordRegisterPF, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(emailRegisterTF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(usernameRegisterTF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordRegisterPF, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(usernameRegisterTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(emailRegisterTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(passwordRegisterPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rePasswordRegisterPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registerButton)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerButton)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // Form is checked for empty fields
        if (usernameRegisterTF.getText().isBlank() || emailRegisterTF.getText().isBlank() ||
                isCharArrayEmpty(passwordRegisterPF.getPassword()) || isCharArrayEmpty(rePasswordRegisterPF.getPassword())) {
            JOptionPane.showMessageDialog(this, "Fill all area!",
                    "Blank areas", JOptionPane.WARNING_MESSAGE);
            return;
        }
       
        // Password is checked against the repeat for matching
       if (!Arrays.equals(passwordRegisterPF.getPassword(), rePasswordRegisterPF.getPassword())) {
           JOptionPane.showMessageDialog(this, "Passwords do not match!",
                   "Password mismatch", JOptionPane.WARNING_MESSAGE);
           return;
       }
       
       // If the form is filled and passwords match, new user is registered. Null value means that email is taken
       Player registered_user = Database.register(usernameRegisterTF.getText(), emailRegisterTF.getText(), passwordRegisterPF.getPassword());
       if (registered_user == null) {
           JOptionPane.showMessageDialog(this, "This email is already in use",
                   "Email Taken", JOptionPane.WARNING_MESSAGE);
           return;
       } else {
           // In case of success, user is redirected to login
           this.dispose();
       }
    }//GEN-LAST:event_registerButtonActionPerformed

    public static boolean isCharArrayEmpty(char[] value) {
        // This function is for checking emptiness of char[] type since JPasswordField returns the query as char[]
        int length = value.length >> 1;
        int left = 0;
        while (left < length) {
            int codepoint = Character.codePointAt(value, left, length);
            if (codepoint != ' ' && codepoint != '\t' && !Character.isWhitespace(codepoint)) {
                break;
            }
            left += Character.charCount(codepoint);
        }
        return left == value.length;
    }

    public static int indexOfNonWhitespace(char[] value) {
        // This function checks if the password is empty or only consists of blank characters
        int length = value.length >> 1;
        int left = 0;
        while (left < length) {
            int codepoint = Character.codePointAt(value, left, length);
            if (codepoint != ' ' && codepoint != '\t' && !Character.isWhitespace(codepoint)) {
                break;
            }
            left += Character.charCount(codepoint);
        }
        return left;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailRegisterTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordRegisterPF;
    private javax.swing.JPasswordField rePasswordRegisterPF;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField usernameRegisterTF;
    // End of variables declaration//GEN-END:variables
}
