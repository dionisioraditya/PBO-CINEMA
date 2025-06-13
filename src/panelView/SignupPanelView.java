/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panelView;

import java.awt.Color;
import view.Main;

/**
 *
 * @author Dionisio Raditya Prasmada - 230712370
 */
public class SignupPanelView extends javax.swing.JPanel {
    private Main mainFrame;
    /**
     * Creates new form signupPanelView
     */
    private void setColorComponent() {
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel2.setForeground(new Color(255, 255, 255));
        usernameInputField.setBackground(new Color(26, 32, 44));
        usernameInputField.setForeground(new Color(255, 255, 255));
        passwordInputField.setBackground(new Color(26, 32, 44));
        passwordInputField.setForeground(new Color(255, 255, 255));
    }
    public SignupPanelView(Main mainFrame) {
        this.mainFrame = mainFrame;
        initComponents();
        setColorComponent();
    }
    public SignupPanelView() {
        this(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formSignin = new componentUI.RoundedTransparentPanel();
        jLabel1 = new javax.swing.JLabel();
        usernameInputField = new javax.swing.JTextField();
        passwordInputField = new javax.swing.JTextField();
        signUpButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        signInButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(26, 32, 44));
        setMaximumSize(new java.awt.Dimension(1280, 720));

        formSignin.setBackground(new java.awt.Color(69, 71, 74));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 32)); // NOI18N
        jLabel1.setText("Sign Up");

        usernameInputField.setFont(new java.awt.Font("Dialog", 0, 32)); // NOI18N
        usernameInputField.setForeground(new java.awt.Color(26, 32, 44));
        usernameInputField.setText("username");
        usernameInputField.setCaretColor(new java.awt.Color(26, 32, 44));
        usernameInputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameInputFieldActionPerformed(evt);
            }
        });
        usernameInputField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameInputFieldKeyPressed(evt);
            }
        });

        passwordInputField.setFont(new java.awt.Font("Dialog", 0, 32)); // NOI18N
        passwordInputField.setForeground(new java.awt.Color(26, 32, 44));
        passwordInputField.setText("password");
        passwordInputField.setCaretColor(new java.awt.Color(26, 32, 44));
        passwordInputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordInputFieldActionPerformed(evt);
            }
        });
        passwordInputField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordInputFieldKeyPressed(evt);
            }
        });

        signUpButton.setBackground(new java.awt.Color(99, 179, 237));
        signUpButton.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        signUpButton.setText("Sign Up");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 32)); // NOI18N
        jLabel2.setText("Or");

        signInButton.setBackground(new java.awt.Color(99, 179, 237));
        signInButton.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        signInButton.setText("Sign In");
        signInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout formSigninLayout = new javax.swing.GroupLayout(formSignin);
        formSignin.setLayout(formSigninLayout);
        formSigninLayout.setHorizontalGroup(
            formSigninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formSigninLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formSigninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameInputField)
                    .addComponent(passwordInputField, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                    .addGroup(formSigninLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(signUpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(signInButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(formSigninLayout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        formSigninLayout.setVerticalGroup(
            formSigninLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formSigninLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(usernameInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(passwordInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(signInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(369, Short.MAX_VALUE)
                .addComponent(formSignin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(426, 426, 426))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(formSignin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void usernameInputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameInputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameInputFieldActionPerformed

    private void usernameInputFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameInputFieldKeyPressed

    }//GEN-LAST:event_usernameInputFieldKeyPressed

    private void passwordInputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordInputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordInputFieldActionPerformed

    private void passwordInputFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordInputFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordInputFieldKeyPressed

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpButtonActionPerformed

    private void signInButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInButtonMouseClicked
        if (mainFrame != null) {
            SigninPanelView signinPanel = new SigninPanelView(mainFrame);
            mainFrame.setPanel(signinPanel);
        }
    }//GEN-LAST:event_signInButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentUI.RoundedTransparentPanel formSignin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField passwordInputField;
    private javax.swing.JButton signInButton;
    private javax.swing.JButton signUpButton;
    private javax.swing.JTextField usernameInputField;
    // End of variables declaration//GEN-END:variables
}
