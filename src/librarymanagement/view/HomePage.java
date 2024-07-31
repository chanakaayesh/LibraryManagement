/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarymanagement.view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import librarymanagement.alert.AlertMessage;
import librarymanagement.commmonUiMethods.CommandUIMethods;
import librarymanagement.dto.UserDto;
import librarymanagement.enumContainer.EnumContainer;

/**
 *
 * @author ayesh
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    
    private UserDto userDto;
    public HomePage(UserDto userDto) {
        initComponents();
        this.userDto = userDto;
         AlertMessage.getInstance().printMessage("HomePage:constructor  success: user "+userDto);
         
         loadMembser();
         
          jp_mainpanel.setLayout(new BorderLayout());

        // Add button panel and main panel to the frame
        setLayout(new BorderLayout());
       // add(pj_button, BorderLayout.NORTH);
        showView(new MemberView(EnumContainer.RegistrationPanel.SHOW));
      
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
        pj_button = new javax.swing.JPanel();
        btn_book = new javax.swing.JButton();
        btn_member = new javax.swing.JButton();
        btn_borrow = new javax.swing.JButton();
        btn_category = new javax.swing.JButton();
        jp_mainpanel = new javax.swing.JPanel();
        lbl_title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_book.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_book.setText("Book");
        btn_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bookActionPerformed(evt);
            }
        });

        btn_member.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_member.setText("Members");
        btn_member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_memberActionPerformed(evt);
            }
        });

        btn_borrow.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_borrow.setText("Borrow");
        btn_borrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrowActionPerformed(evt);
            }
        });

        btn_category.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_category.setText("Category");
        btn_category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_categoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pj_buttonLayout = new javax.swing.GroupLayout(pj_button);
        pj_button.setLayout(pj_buttonLayout);
        pj_buttonLayout.setHorizontalGroup(
            pj_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pj_buttonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pj_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pj_buttonLayout.createSequentialGroup()
                        .addComponent(btn_borrow, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_category, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(btn_book, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pj_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pj_buttonLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btn_member, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pj_buttonLayout.setVerticalGroup(
            pj_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pj_buttonLayout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addComponent(btn_book)
                .addGap(57, 57, 57)
                .addComponent(btn_category)
                .addGap(61, 61, 61)
                .addComponent(btn_borrow)
                .addGap(17, 17, 17))
            .addGroup(pj_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pj_buttonLayout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(btn_member)
                    .addContainerGap(271, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jp_mainpanelLayout = new javax.swing.GroupLayout(jp_mainpanel);
        jp_mainpanel.setLayout(jp_mainpanelLayout);
        jp_mainpanelLayout.setHorizontalGroup(
            jp_mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 823, Short.MAX_VALUE)
        );
        jp_mainpanelLayout.setVerticalGroup(
            jp_mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );

        lbl_title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title.setText("Members");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pj_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jp_mainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_title, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pj_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jp_mainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_bookActionPerformed

    private void btn_borrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_borrowActionPerformed

    private void btn_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_categoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_categoryActionPerformed

    private void btn_memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_memberActionPerformed
        // TODO add your handling code here:
       // showView(new MemberView());
        CommandUIMethods.getInstance().showView(jp_mainpanel, new MemberView(EnumContainer.RegistrationPanel.SHOW));
    }//GEN-LAST:event_btn_memberActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_book;
    private javax.swing.JButton btn_borrow;
    private javax.swing.JButton btn_category;
    private javax.swing.JButton btn_member;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jp_mainpanel;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JPanel pj_button;
    // End of variables declaration//GEN-END:variables

    private void loadMembser() {
   
//      jp_mainpanel.add(new MemberView(), BorderLayout.CENTER);
//      jp_mainpanel.setVisible(true);
//
//        getContentPane().add(jp_mainpanel);
        //showView(new MemberView());
      CommandUIMethods.getInstance().showView(jp_mainpanel, new MemberView(EnumContainer.RegistrationPanel.SHOW));
    }
    
       public void showMemberView(JPanel memberView) {
        jp_mainpanel.removeAll();
        jp_mainpanel.add(memberView, BorderLayout.CENTER);
        jp_mainpanel.revalidate();
        jp_mainpanel.repaint();
    }
       
       private void showView(JPanel view) {
        jp_mainpanel.removeAll();
        jp_mainpanel.add(view, BorderLayout.CENTER);
        jp_mainpanel.revalidate();
        jp_mainpanel.repaint();
    }
}
