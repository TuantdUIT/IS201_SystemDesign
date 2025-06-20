/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotelmanagement.dashboard_main;

import hotelmanagement.Login_Signup.Client_Login;
import hotelmanagement.Login_Signup.Staff_Login;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 84352
 */
public class Loading extends javax.swing.JFrame {

    /**
     * Creates new form Loading
     */
    private String type;
    public Loading(String type) {
        initComponents();
        this.type = type;
        Thread ob = new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i = 1; i <= 100; ++i){
                    Progress_bar_loading.setValue(i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Loading.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    if(Progress_bar_loading.getString().equals("10%")){
                        Loading_Label.setText("Loading assets...");
                    }
                    if(Progress_bar_loading.getString().equals("25%")){
                        Loading_Label.setText("Initializing modules...");
                    }   
                    if(Progress_bar_loading.getString().equals("40%")){
                        Loading_Label.setText("Connecting database...");
                    }
                    if(Progress_bar_loading.getString().equals("60%")){
                        Loading_Label.setText("Apply configurations...");
                    }
                    if(Progress_bar_loading.getString().equals("80%")){
                        Loading_Label.setText("Starting service...");
                    } 
                    if(Progress_bar_loading.getString().equals("100%")){
                        Loading_Label.setText("Done.");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Loading.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        if(type.equals("client")){
                            new Client_Login().setVisible(true);
                            Loading.this.setVisible(false);
                        }else if(type.equals("manager")){
                            new Staff_Login().setVisible(true);
                            Loading.this.setVisible(false);
                        }
                    }                    
                }
            }
        });
        ob.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Progress_bar_loading = new javax.swing.JProgressBar();
        Loading_Label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Progress_bar_loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 900, 30));

        Loading_Label.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Loading_Label.setForeground(new java.awt.Color(255, 255, 255));
        Loading_Label.setText("Loading...");
        getContentPane().add(Loading_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 530, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Loading_img.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 900, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loading("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Loading_Label;
    private javax.swing.JProgressBar Progress_bar_loading;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
