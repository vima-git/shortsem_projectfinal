/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packet;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import jpcap.packet.Packet;

/**
 *
 * @author xxx
 */
public class countJFrame extends javax.swing.JFrame {
    

    
    private void groupButton( ) {

        ButtonGroup bg1 = new ButtonGroup( );
        ButtonGroup bg2 = new ButtonGroup( );
        ButtonGroup bg3 = new ButtonGroup( );

        bg1.add(and1);
        bg1.add(or1);
        
        bg2.add(and2);
        bg2.add(or2);
        
        bg3.add(and3);
        bg3.add(or3);
        //bg1.add(jRadioButton3);

    }

    
    public static ArrayList<String> collectdata(){
        ArrayList<String> state= new ArrayList<String>();
        
        if(packet.countJFrame.jTextField1.getText().length()!=0){
        state.add((String)packet.countJFrame.jComboBox1.getSelectedItem());
        state.add((String)packet.countJFrame.jComboBox2.getSelectedItem());
        state.add(packet.countJFrame.jTextField1.getText());
        }
        if(packet.countJFrame.jTextField2.getText().length()!=0 &&(packet.countJFrame.and1.isSelected()==true ||packet.countJFrame.or1.isSelected()==true)){
        state.add((String)packet.countJFrame.jComboBox3.getSelectedItem());
        state.add((String)packet.countJFrame.jComboBox4.getSelectedItem());
        state.add(packet.countJFrame.jTextField2.getText());
        }
        if(packet.countJFrame.jTextField3.getText().length()!=0 &&(packet.countJFrame.and2.isSelected()==true ||packet.countJFrame.or2.isSelected()==true)){
        state.add((String)packet.countJFrame.jComboBox5.getSelectedItem());
        state.add((String)packet.countJFrame.jComboBox6.getSelectedItem());
        state.add(packet.countJFrame.jTextField3.getText());
        }
        if(packet.countJFrame.jTextField4.getText().length()!=0 &&(packet.countJFrame.and3.isSelected()==true ||packet.countJFrame.or3.isSelected()==true) ){
        state.add((String)packet.countJFrame.jComboBox7.getSelectedItem());
        state.add((String)packet.countJFrame.jComboBox8.getSelectedItem());
        state.add(packet.countJFrame.jTextField4.getText());
        }
        
        return state;
    }
    public static ArrayList<Packet> condition_list1(ArrayList<Packet> file,int field, Object size) throws UnknownHostException{ 
                    ArrayList<Packet> con1list= new ArrayList<Packet>();
            if(packet.countJFrame.jComboBox2.getSelectedIndex()==0)//EQUAL OPTION
            con1list = packet.LoadPacketfile.Some_eq(file, field, size);

            if(packet.countJFrame.jComboBox2.getSelectedIndex()==1) //GRETER THAN
            con1list = packet.LoadPacketfile.Some_gt(file, field, size);

            if(packet.countJFrame.jComboBox2.getSelectedIndex()==2) //LESS THAN
            con1list = packet.LoadPacketfile.Some_ls(file, field, size);
           
            return con1list;
        }
    public static ArrayList<Packet> condition_list2(ArrayList<Packet> file,int field, Object size) throws UnknownHostException{ 
                    ArrayList<Packet> con1list= new ArrayList<Packet>();
            if(packet.countJFrame.jComboBox4.getSelectedIndex()==0)//EQUAL OPTION
            con1list = packet.LoadPacketfile.Some_eq(file, field, size);

            if(packet.countJFrame.jComboBox4.getSelectedIndex()==1) //GRETER THAN
            con1list = packet.LoadPacketfile.Some_gt(file, field, size);

            if(packet.countJFrame.jComboBox4.getSelectedIndex()==2) //LESS THAN
            con1list = packet.LoadPacketfile.Some_ls(file, field, size);
           
            return con1list;
        }
    public static ArrayList<Packet> condition_list3(ArrayList<Packet> file,int field, Object size) throws UnknownHostException{ 
                    ArrayList<Packet> con1list= new ArrayList<Packet>();
            if(packet.countJFrame.jComboBox6.getSelectedIndex()==0)//EQUAL OPTION
            con1list = packet.LoadPacketfile.Some_eq(file, field, size);

            if(packet.countJFrame.jComboBox6.getSelectedIndex()==1) //GRETER THAN
            con1list = packet.LoadPacketfile.Some_gt(file, field, size);

            if(packet.countJFrame.jComboBox6.getSelectedIndex()==2) //LESS THAN
            con1list = packet.LoadPacketfile.Some_ls(file, field, size);
           
            return con1list;
        }
    public static ArrayList<Packet> condition_list4(ArrayList<Packet> file,int field, Object size) throws UnknownHostException{ 
                    ArrayList<Packet> con1list= new ArrayList<Packet>();
            if(packet.countJFrame.jComboBox8.getSelectedIndex()==0)//EQUAL OPTION
            con1list = packet.LoadPacketfile.Some_eq(file, field, size);

            if(packet.countJFrame.jComboBox8.getSelectedIndex()==1) //GRETER THAN
            con1list = packet.LoadPacketfile.Some_gt(file, field, size);

            if(packet.countJFrame.jComboBox8.getSelectedIndex()==2) //LESS THAN
            con1list = packet.LoadPacketfile.Some_ls(file, field, size);
           
            return con1list;
        }
    
     /* Creates new form countJFrame
     */
    public countJFrame() {
        initComponents();
        groupButton( ) ;
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        backButton1 = new javax.swing.JButton();
        and2 = new javax.swing.JRadioButton();
        or2 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jTextField2 = new javax.swing.JTextField();
        or1 = new javax.swing.JRadioButton();
        and1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox();
        jTextField3 = new javax.swing.JTextField();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox();
        jComboBox8 = new javax.swing.JComboBox();
        jTextField4 = new javax.swing.JTextField();
        and3 = new javax.swing.JRadioButton();
        or3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        countResultLabel6 = new javax.swing.JLabel();
        showjCheckBox1 = new javax.swing.JCheckBox();
        countjCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Query Condition");

        backButton1.setText("Load New File");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });

        and2.setText("and");
        and2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                and2ActionPerformed(evt);
            }
        });

        or2.setText("or");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SOURCE_IP", "DST_IP", "SRC_PORT", "DST_PORT", "LENGTH", "PROTOCOL" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "EQUAL=", "GREATER THAN >", "SMALLER THAN <" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SOURCE_IP", "DST_IP", "SRC_PORT", "DST_PORT", "LENGTH", "PROTOCOL" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "EQUEL =", "GREATER THAN >", "SMALLER THAN <", " " }));

        or1.setText("or");

        and1.setText("and");
        and1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                and1ActionPerformed(evt);
            }
        });

        jLabel1.setText("CONDITON 1");

        jLabel2.setText("CONDITON 2");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "EQUEL =", "GREATER THAN >", "SMALLER THAN <" }));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SOURCE_IP", "DST_IP", "SRC_PORT", "DST_PORT", "LENGTH", "PROTOCOL", " " }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jLabel4.setText("CONDITON 3");

        jLabel5.setText("CONDITON 4");

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SOURCE_IP", "DST_IP", "SRC_PORT", "DST_PORT", "LENGTH", "PROTOCOL" }));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "EQUEL =", "GREATER THAN >", "SMALLER THAN <" }));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        and3.setText("and");
        and3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                and3ActionPerformed(evt);
            }
        });

        or3.setText("or");
        or3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                or3ActionPerformed(evt);
            }
        });

        jButton1.setText("GET RESULT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        showjCheckBox1.setText("show packet detail");

        countjCheckBox2.setText("count");
        countjCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countjCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("SRC_IP");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setText("DST_IP");

        jCheckBox5.setText("SRC_Port");

        jCheckBox6.setText("DST_Port");

        jCheckBox7.setText("LENGTH");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        jCheckBox8.setText("PROTOCOL");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index", "Source IP", "Dst IP", "Source Port", "Dst Port", "Length", "Protocol"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(countjCheckBox2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backButton1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 383, Short.MAX_VALUE)
                                .addComponent(countResultLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 133, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(showjCheckBox1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(120, 120, 120)
                                        .addComponent(jButton1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox6)
                                            .addComponent(jCheckBox3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jCheckBox4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jCheckBox5))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jCheckBox7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCheckBox8)))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(and1)
                                            .addComponent(jLabel1)
                                            .addComponent(and2)
                                            .addComponent(jLabel4)
                                            .addComponent(and3))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(or1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(or2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(or3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(and1)
                            .addComponent(or1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(or2)
                            .addComponent(and2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(and3)
                            .addComponent(or3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showjCheckBox1)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(countjCheckBox2)
                .addGap(25, 25, 25)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(countResultLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(backButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        // TODO add your handling code here:
                Tempfile.tf=null;
            Conditions frame1=new Conditions();
            countJFrame.this.setVisible(false);
            frame1.setVisible(true);
    }//GEN-LAST:event_backButton1ActionPerformed

    private void and1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_and1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_and1ActionPerformed

    private void and2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_and2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_and2ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void and3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_and3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_and3ActionPerformed

    private void or3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_or3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_or3ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //countResultLabel6.setText(packet.Conditions.filenameTextField.getText());
        //(String)packet.countJFrame.jComboBox2.getSelectedItem()
        //String s= Integer.toString(packet.countJFrame.jComboBox2.getSelectedIndex());
        
        
        /*if(packet.countJFrame.jTextField1.getText().length()==0)
       countResultLabel6.setText("nevwer");
        else
        countResultLabel6.setText((String)packet.countJFrame.jComboBox2.getSelectedItem());*/
        ArrayList<Packet> file= new ArrayList<Packet>();
        //new
        if(Tempfile.tf!=null){
            //System.out.println("method 1");
        file= Tempfile.tf;
        //Tempfile.tf=null;
        }
        
        else if(Conditions.filenameTextField.getText()!=null){ 
            //System.out.println("method 2");
         file= packet.LoadPacketfile.Loadfile();}
        
        ArrayList<String> state= collectdata(); //THIS COLLECTS JCOMBOX DATA & JTEXTFIELD
        //countResultLabel6.setText(state.get(2));
        if(state.size()==0){
            if(packet.countJFrame.showjCheckBox1.isSelected()==true){
                try {
                    Infotable.ShowDetail(file);
                    //showqueryJFrame frame1=new showqueryJFrame(file);
                    //countJFrame.this.setVisible(false);
                    //frame1.setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(countJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
                        
                if(packet.countJFrame.countjCheckBox2.isSelected()==true)
                packet.LoadPacketfile.finalcountdown(file);
        }
            //packet.LoadPacketfile.finalcountdown(file);
            
        if(state.size()==3){ //at least one condition, FOR NOW IF ONE CONDITION,THEN IT SHOULD BE 1ST CON/ROW
            //if no bool
            //ArrayList<Packet> con1list = packet.LoadPacketfile.Some_eq(file, s, state.get(2));
            
             //lect 0th element//se
                int field =packet.countJFrame.jComboBox1.getSelectedIndex();
                try {
                    ArrayList<Packet> con1list= new ArrayList<Packet>();
                    /*if(packet.countJFrame.jComboBox2.getSelectedIndex()==0)//EQUAL OPTION
                     con1list = packet.LoadPacketfile.Some_eq(file, field, state.get(2));
                    
                     if(packet.countJFrame.jComboBox2.getSelectedIndex()==1){ //GRETER THAN
                     con1list = packet.LoadPacketfile.Some_gt(file, field, state.get(2));}
                    
                     if(packet.countJFrame.jComboBox2.getSelectedIndex()==2) //LESS THAN
                     con1list = packet.LoadPacketfile.Some_ls(file, field, state.get(2));*/
                    
                    con1list= countJFrame.condition_list1(file, field,state.get(2) );
                    //countResultLabel6.setText(Integer.toString(packet.countJFrame.jComboBox2.getSelectedIndex()));
                    if(con1list==null)
                        System.out.println("wrong");
                    else{
                        if(packet.countJFrame.showjCheckBox1.isSelected()==true){
                        //packet.LoadPacketfile.finalshow(con1list);
                        //packet.Infotable.ShowDetail(con1list);
                        //setting new frame
                            //new showqueryJFrame(con1list).setVisible(true);
                        //showqueryJFrame frame1=new showqueryJFrame(con1list);
                            //Conditions frame1=new Conditions();
                        //captureResultJFrame frame1 = new captureResultJFrame();
                       // countJFrame.this.setVisible(false);
                        //frame1.setVisible(true);
                      packet.Infotable.ShowDetail(con1list);

                        }
                        
                        if(packet.countJFrame.countjCheckBox2.isSelected()==true)
                        packet.LoadPacketfile.finalcountdown(con1list);
                    }
                } catch (UnknownHostException ex) {
                    Logger.getLogger(countJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                Logger.getLogger(countJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
                    
        }
        if(state.size()==6 &&(packet.countJFrame.and1.isSelected()==true || packet.countJFrame.or1.isSelected()==true)){ try {
            //at least two condition and bool, FOR NOW IF 2 CONDITION,THEN IT SHOULD BE 1ST &2nd CON/ROW
            
            //ArrayList<Packet> con1list = packet.LoadPacketfile.Some_eq(file, s, state.get(2));
            
            
            int field1  =packet.countJFrame.jComboBox1.getSelectedIndex();
            int field2  =packet.countJFrame.jComboBox3.getSelectedIndex();
            
            ArrayList<Packet> con1list= new ArrayList<Packet>();
            ArrayList<Packet> con2list= new ArrayList<Packet>();
            
            con1list= countJFrame.condition_list1(file, field1, state.get(2));
            
            
            if(packet.countJFrame.and1.isSelected()==true){
                con2list= countJFrame.condition_list2(con1list, field2, state.get(5));
            }
            if(packet.countJFrame.or1.isSelected()==true){
                con2list= countJFrame.condition_list2(file, field2, state.get(5));
                con2list= BoolTest.union(con2list,con1list);
                
            }
            
            
            
            
            if(packet.countJFrame.showjCheckBox1.isSelected()==true){
                
                try {
                    /*showqueryJFrame frame1=new showqueryJFrame(con2list);
                    countJFrame.this.setVisible(false);
                    frame1.setVisible(true);*/
                    packet.Infotable.ShowDetail(con2list);
                } catch (IOException ex) {
                    Logger.getLogger(countJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
            if(packet.countJFrame.countjCheckBox2.isSelected()==true)
                packet.LoadPacketfile.finalcountdown(con2list);
            
            
            // packet.LoadPacketfile.finalcountdown(con2list);
            } catch (UnknownHostException ex) {
                Logger.getLogger(countJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

                    
        }
        
        if(state.size()==9 &&(packet.countJFrame.and2.isSelected()==true || packet.countJFrame.or2.isSelected()==true)){ try {
            //at least 3 condition and bool, 
            
            
            int field1  =packet.countJFrame.jComboBox1.getSelectedIndex();
            int field2  =packet.countJFrame.jComboBox3.getSelectedIndex();
            int field3  =packet.countJFrame.jComboBox5.getSelectedIndex();
            
            ArrayList<Packet> con1list= new ArrayList<Packet>();
            ArrayList<Packet> con2list= new ArrayList<Packet>();
            ArrayList<Packet> con3list= new ArrayList<Packet>();
            
            con1list= countJFrame.condition_list1(file, field1, state.get(2));
            
                
                if(countJFrame.and1.isSelected()==true && countJFrame.and2.isSelected()==true){
                    con2list= countJFrame.condition_list2(con1list, field2, state.get(5));
                    con3list= countJFrame.condition_list3(con2list, field3, state.get(8));
                }
                if(countJFrame.and1.isSelected()==true && countJFrame.or2.isSelected()==true){
                    con2list= countJFrame.condition_list2(con1list, field2, state.get(5));
                    con3list= countJFrame.condition_list3(file, field3, state.get(8));
                    con3list=  packet.BoolTest.union(con2list,con3list);
                }
                
                if(countJFrame.or1.isSelected()==true && countJFrame.and2.isSelected()==true){
                    con2list= countJFrame.condition_list2(file, field2, state.get(5));
                    con3list= countJFrame.condition_list3(con2list, field3, state.get(8));
                    con3list=  packet.BoolTest.union(con1list,con3list);
                }
                if(countJFrame.or1.isSelected()==true && countJFrame.or2.isSelected()==true){
                    con2list= countJFrame.condition_list2(file, field2, state.get(5));
                    con3list= countJFrame.condition_list3(file, field3, state.get(8));
                    con3list= BoolTest.union(con1list,BoolTest.union(con2list,con3list));
                }
                
                
                
            
            
            if(packet.countJFrame.showjCheckBox1.isSelected()==true){
                
                try {
                    /*showqueryJFrame frame1=new showqueryJFrame(con2list);
                    countJFrame.this.setVisible(false);
                    frame1.setVisible(true);*/
                    packet.Infotable.ShowDetail(con3list);
                } catch (IOException ex) {
                    Logger.getLogger(countJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
            if(packet.countJFrame.countjCheckBox2.isSelected()==true)
                packet.LoadPacketfile.finalcountdown(con3list);
            } catch (UnknownHostException ex) {
                Logger.getLogger(countJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
             
             
        } 
        
        if(state.size()==12 &&(packet.countJFrame.and3.isSelected()==true || packet.countJFrame.or3.isSelected()==true)){
        
            try {
                int field1  =packet.countJFrame.jComboBox1.getSelectedIndex();
                int field2  =packet.countJFrame.jComboBox3.getSelectedIndex();
                int field3  =packet.countJFrame.jComboBox5.getSelectedIndex();
                int field4  =packet.countJFrame.jComboBox7.getSelectedIndex();
                
                ArrayList<Packet> con1list= new ArrayList<Packet>();
                ArrayList<Packet> con2list= new ArrayList<Packet>();
                ArrayList<Packet> con3list= new ArrayList<Packet>();
                ArrayList<Packet> con4list= new ArrayList<Packet>();
                
                con1list= countJFrame.condition_list1(file, field1, state.get(2));
                
               
                    if(countJFrame.and1.isSelected()==true && countJFrame.and2.isSelected()==true && countJFrame.and3.isSelected()==true){
                        con2list= countJFrame.condition_list2(con1list, field2, state.get(5));
                        con3list= countJFrame.condition_list3(con2list, field3, state.get(8));
                        con4list= countJFrame.condition_list4(con3list,field4, state.get(11));
                    }
                    
                    if(countJFrame.and1.isSelected()==true && countJFrame.and2.isSelected()==true && countJFrame.or3.isSelected()==true){
                        con2list= countJFrame.condition_list2(con1list, field2, state.get(5));
                        con3list= countJFrame.condition_list3(con2list, field3, state.get(8));
                        con4list= countJFrame.condition_list4(file, field4, state.get(11));
                        con4list= BoolTest.union(con3list, con4list);
                    }
                    if(countJFrame.and1.isSelected()==true && countJFrame.or2.isSelected()==true && countJFrame.and3.isSelected()==true){
                        con2list= countJFrame.condition_list2(con1list, field2, state.get(5));
                        con3list= countJFrame.condition_list3(file, field3, state.get(8));
                        con4list= countJFrame.condition_list4(con3list,field4, state.get(11));
                        con4list= BoolTest.union(con2list, con4list);
                    }
                    
                    if(countJFrame.and1.isSelected()==true && countJFrame.or2.isSelected()==true && countJFrame.or3.isSelected()==true){
                        con2list= countJFrame.condition_list2(con1list, field2, state.get(5));
                        con3list= countJFrame.condition_list3(file, field3, state.get(8));
                        con4list= countJFrame.condition_list4(file, field4, state.get(11));
                        con4list= BoolTest.union(con2list,BoolTest.union(con3list, con4list));
                        
                    }
                    if(countJFrame.or1.isSelected()==true && countJFrame.and2.isSelected()==true && countJFrame.and3.isSelected()==true){
                        con2list= countJFrame.condition_list2(file, field2, state.get(5));
                        con3list= countJFrame.condition_list3(con2list, field3, state.get(8));
                        con4list= countJFrame.condition_list4(con3list, field4, state.get(11));
                        con4list= BoolTest.union(con1list, con4list);
                            
                    }
                    if(countJFrame.or1.isSelected()==true && countJFrame.and2.isSelected()==true && countJFrame.or3.isSelected()==true){
                        con2list= countJFrame.condition_list2(file, field2, state.get(5));
                        con3list= countJFrame.condition_list3(con2list, field3, state.get(8));
                        con4list= countJFrame.condition_list4(file, field4, state.get(11));
                        con4list= BoolTest.union(con3list, con4list);
                        con4list= BoolTest.union(con1list, con4list);
                    }
                    if(countJFrame.or1.isSelected()==true && countJFrame.or2.isSelected()==true && countJFrame.and3.isSelected()==true){
                        con2list= countJFrame.condition_list2(file, field2, state.get(5));
                        con3list= countJFrame.condition_list3(file, field3, state.get(8));
                        con4list= countJFrame.condition_list4(con3list, field4, state.get(11));
                        con4list= BoolTest.union(con2list, con4list);
                        con4list= BoolTest.union(con1list, con4list);
                    }
                    if(countJFrame.or1.isSelected()==true && countJFrame.or2.isSelected()==true && countJFrame.or3.isSelected()==true){
                        con2list= countJFrame.condition_list2(file, field2, state.get(5));
                        con3list= countJFrame.condition_list3(file, field3, state.get(8));
                        con4list= countJFrame.condition_list4(file, field4, state.get(11));
                        con4list= BoolTest.union(con4list,BoolTest.union(con2list, con3list));
                        con4list= BoolTest.union(con1list, con4list);
                    }
                    
              
                
                
                
                if(packet.countJFrame.showjCheckBox1.isSelected()==true)
                     try {
                         packet.Infotable.ShowDetail(con4list);
                } catch (IOException ex) {
                    Logger.getLogger(countJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if(packet.countJFrame.countjCheckBox2.isSelected()==true)
                packet.LoadPacketfile.finalcountdown(con4list);

                
                
                    
            } catch (UnknownHostException ex) {
                Logger.getLogger(countJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

            
               
            
        }
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void countjCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countjCheckBox2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_countjCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        System.out.println("row");
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(countJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(countJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(countJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(countJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new countJFrame().setVisible(true);
               // groupButton( ) ;
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JRadioButton and1;
    public static javax.swing.JRadioButton and2;
    public static javax.swing.JRadioButton and3;
    private javax.swing.JButton backButton1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    public static javax.swing.JLabel countResultLabel6;
    public static javax.swing.JCheckBox countjCheckBox2;
    private javax.swing.JButton jButton1;
    public static javax.swing.JCheckBox jCheckBox3;
    public static javax.swing.JCheckBox jCheckBox4;
    public static javax.swing.JCheckBox jCheckBox5;
    public static javax.swing.JCheckBox jCheckBox6;
    public static javax.swing.JCheckBox jCheckBox7;
    public static javax.swing.JCheckBox jCheckBox8;
    public static javax.swing.JComboBox jComboBox1;
    public static javax.swing.JComboBox jComboBox2;
    public static javax.swing.JComboBox jComboBox3;
    public static javax.swing.JComboBox jComboBox4;
    public static javax.swing.JComboBox jComboBox5;
    public static javax.swing.JComboBox jComboBox6;
    public static javax.swing.JComboBox jComboBox7;
    public static javax.swing.JComboBox jComboBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    public static javax.swing.JTextField jTextField1;
    private static javax.swing.JTextField jTextField2;
    public static javax.swing.JTextField jTextField3;
    public static javax.swing.JTextField jTextField4;
    public static javax.swing.JRadioButton or1;
    private static javax.swing.JRadioButton or2;
    public static javax.swing.JRadioButton or3;
    public static javax.swing.JCheckBox showjCheckBox1;
    // End of variables declaration//GEN-END:variables
}


