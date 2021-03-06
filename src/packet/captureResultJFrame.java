/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packet;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import jpcap.packet.Packet;

/**
 *
 * @author xxx
 */
public class captureResultJFrame extends javax.swing.JFrame {

    /**
     * Creates new form captureResultJFrame
     */
    public captureResultJFrame() {
        initComponents();
        captureResultJFrame.jLabel2.setVisible(false);
        captureResultJFrame.fileNamejTextField1.setVisible(false);
        captureResultJFrame.oKjButton1.setVisible(false);
        capjLabel3.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        numOfpacketsTextField1 = new javax.swing.JTextField();
        capButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        oKjButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        fileNamejTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        capjLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("nunber of packets");

        capButton1.setText("Capture & Show");
        capButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SOURCE IP", "DST IP", "SOURCE PORT", "DST PORT", "LENGTH", "PROTOCOL"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        oKjButton1.setText("ok");
        oKjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oKjButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter File Name");

        fileNamejTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileNamejTextField1ActionPerformed(evt);
            }
        });

        jButton2.setText("Save & Query");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Query with out Saving");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        capjLabel3.setText("Capturing....");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addComponent(numOfpacketsTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(capButton1)
                        .addGap(93, 93, 93)
                        .addComponent(capjLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(fileNamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(oKjButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jButton3))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(numOfpacketsTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(capButton1)
                    .addComponent(capjLabel3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oKjButton1)
                    .addComponent(fileNamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void capButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capButton1ActionPerformed
        try {
            // TODO add your handling code here:
            
           // ArrayList<Packet> captuerdPacket= packet.LoadPacketfile.Loadfile();
            ArrayList<Packet> captuerdPacket= packet.Infotable.getPacketArray();
            Tempfile t= new Tempfile();
            t.tf= captuerdPacket;
            t.name= "sanj";
            Infotable.ShowDetail1(captuerdPacket);
            
            
            //jTable1.setValueAt("Sanjaya", i, 0);
        } catch (IOException ex) {
            System.out.println(ex);
            
            //Logger.getLogger(captureResultJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_capButton1ActionPerformed

    private void oKjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oKjButton1ActionPerformed
        try{
                /*String filename= packet.captureResultJFrame.fileNamejTextField1.getText();
                FileOutputStream fos= new FileOutputStream(filename);
                ObjectOutputStream oos= new ObjectOutputStream(fos);
                //duplicate
                ArrayList<Packet> obj_copy= Tempfile.tf;

                oos.writeObject(obj_copy);
                oos.close();
                fos.close();*/
            Tempfile.Savefile();
                
                countJFrame frame1=new countJFrame();
                captureResultJFrame.this.setVisible(false);
                frame1.setVisible(true);
                
            }catch(IOException ioe){
                 ioe.printStackTrace();
             }
    }//GEN-LAST:event_oKjButton1ActionPerformed

    private void fileNamejTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileNamejTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileNamejTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        countJFrame frame1 = new  countJFrame();
        captureResultJFrame.this.setVisible(false);
        frame1.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        captureResultJFrame.jLabel2.setVisible(true);
        captureResultJFrame.fileNamejTextField1.setVisible(true);
        captureResultJFrame.oKjButton1.setVisible(true);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(captureResultJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(captureResultJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(captureResultJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(captureResultJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new captureResultJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton capButton1;
    public static javax.swing.JLabel capjLabel3;
    public static javax.swing.JTextField fileNamejTextField1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable1;
    public static javax.swing.JTextField numOfpacketsTextField1;
    public static javax.swing.JButton oKjButton1;
    // End of variables declaration//GEN-END:variables
}
