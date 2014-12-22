
package packet;

import java.awt.Color;
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import jpcap.JpcapCaptor;
import jpcap.NetworkInterface;
import jpcap.packet.ARPPacket;
import jpcap.packet.ICMPPacket;
import jpcap.packet.Packet;
import jpcap.packet.TCPPacket;
import jpcap.packet.UDPPacket;
import jpcap.packet.DatalinkPacket;

//import net.sourceforge.jpcap.net.TCPPacket;


/**
 *
 * 
 */
public class Infotable {
    public static ArrayList<Packet> finalresult;
    
                 
    
    public static void ShowDetail1(ArrayList<Packet> obj) throws IOException{
        
                
    
        for(int i=0;i<obj.size();i++){
                //capture a single packet and print it out
            Packet packets = obj.get(i);
            

                if(packets.getClass().equals(TCPPacket.class)){
                    
                    TCPPacket p = (TCPPacket)packets;
                    //System.out.println(p.datalink.toString());
                    //System.out.println(p.data);
                    //System.out.println("?? TCP ??");;
                    String col1 = p.src_ip.getHostAddress();
                    String col2 = p.dst_ip.getHostAddress();
                    int col3 = p.src_port;
                    int col4 = p.dst_port;
                    int col5 = p.len;
                    String col6 = "TCP";
                    //System.out.println(p.len);*/
                    Object[] row = {col1,col2,col3,col4,col5,col6 };
                    DefaultTableModel model = (DefaultTableModel) packet.captureResultJFrame.jTable1.getModel();
                    model.addRow(row);
                    


                }
                else if(packets.getClass().equals(UDPPacket.class)){
                    UDPPacket up = (UDPPacket)packets;
                    
                    String col1 = up.src_ip.getHostAddress();
                    String col2 = up.dst_ip.getHostAddress();
                    int col3 = up.src_port;
                    int col4 = up.dst_port;
                    int col5 = up.len;
                    String col6 = "UDP";
                    //System.out.println(p.len);*/
                    Object[] row = {col1,col2,col3,col4,col5,col6 };
                    DefaultTableModel model = (DefaultTableModel) packet.captureResultJFrame.jTable1.getModel();
                    model.addRow(row);
                    


                }
                else if(packets.getClass().equals(ARPPacket.class)){
                    ARPPacket ap = (ARPPacket)packets;
                    
                    Object col1 = ap.getSenderProtocolAddress();
                    Object col2 = ap.getTargetProtocolAddress();
                    String col3 ="";
                    String col4 ="" ;
                    int col5 = ap.len;
                    String col6 = "ARP";
                    //System.out.println(p.len);*/
                    Object[] row = {col1,col2,col3,col4,col5,col6 };
                    DefaultTableModel model = (DefaultTableModel) packet.captureResultJFrame.jTable1.getModel();
                    model.addRow(row);
                }
                
            
            
            
            
        }
                packet.captureResultJFrame.capjLabel3.setText("capturing is finished");

                  
    }
    
    
    
    public static void ShowDetail(ArrayList<Packet> obj) throws IOException{
        
       finalresult=obj;
       
        DefaultTableModel model = (DefaultTableModel)packet.countJFrame.jTable1.getModel();
        model.setRowCount(0);
        //declaring an array list
        //ArrayList<Packet> obj = new ArrayList<Packet>();
        
        
        for(int i=0;i<obj.size();i++){
                //capture a single packet and print it out
            
           // System.out.println(obj.get(i).header.toString());
                if(obj.get(i).getClass().equals(TCPPacket.class)){
                    
                   // obj.add(packets);
                    TCPPacket p = (TCPPacket)obj.get(i);

                    //System.out.println("?? TCP ??");
                    int col0 = i+1;
                    String col1 = p.src_ip.getHostAddress();
                    String col2 = p.dst_ip.getHostAddress();
                    int col3 = p.src_port;
                    int col4 = p.dst_port;
                    int col5 = p.len;
                    String col6 = "TCP";
                    //System.out.println(p.len);
                    Object[] row = {col0,col1,col2,col3,col4,col5,col6 };
                   
                    //DefaultTableModel model = (DefaultTableModel)packet.countJFrame.jTable1.getModel();
                    model.addRow(row);
                    
                    

                }
                else if(obj.get(i).getClass().equals(UDPPacket.class)){
                    //obj.add(packets);
                    UDPPacket up = (UDPPacket)obj.get(i);
                    int col0= i+1;
                    String col1 = up.src_ip.getHostAddress();
                    String col2 = up.dst_ip.getHostAddress();
                    int col3 = up.src_port;
                    int col4 = up.dst_port;
                    int col5 = up.len;
                    String col6 = "UDP";
                    //System.out.println(p.len);
                    Object[] row = {col0,col1,col2,col3,col4,col5,col6 };
                    //DefaultTableModel model = (DefaultTableModel) packet.countJFrame.jTable1.getModel();
                    model.addRow(row);
                    


                }
                else if(obj.get(i).getClass().equals(ARPPacket.class)){
                    //obj.add(packets);
                    ARPPacket ap = (ARPPacket)obj.get(i);
                    int col0= i+1;
                    Object col1 = ap.getSenderProtocolAddress();
                    Object col2 = ap.getTargetProtocolAddress();
                    String col3 ="";
                    String col4 = "";
                    int col5 = ap.len;
                    String col6 = "ARP";
                    //System.out.println(p.len);
                    Object[] row = {col0,col1,col2,col3,col4,col5,col6 };
                    //DefaultTableModel model = (DefaultTableModel) packet.countJFrame.jTable1.getModel();
                    model.addRow(row);
                    


                }

            
            
            
            
        }
        
        
    
    }
    
    public static ArrayList<Packet> getPacketArray() throws IOException{
        NetworkInterface[] devices = JpcapCaptor.getDeviceList();
        
        //setting index number 
        int index= packet.captureResultJFrame.jComboBox1.getSelectedIndex();
        
        //initialize num of packets
        int maxnum= Integer.parseUnsignedInt(packet.captureResultJFrame.numOfpacketsTextField1.getText());
        
        
        
         //Open an interface using method openDevice(NetworkInterface intrface, int snaplen, boolean promics, int to_ms)
        JpcapCaptor captor= JpcapCaptor.openDevice(devices[index],65565, false, 20);
        

        captor.setFilter("tcp or udp or arp or icmp", true);
        
        
        //declaring an array list
        ArrayList<Packet> obj = new ArrayList<Packet>();
        
        
        for(int i=0;i<maxnum;i++){
                //capture a single packet and add to arraylist
            Packet packets = captor.getPacket();
            
            if(packets != null){

                if(packets.getClass().equals(TCPPacket.class))
                    obj.add(packets);
                
                else if(packets.getClass().equals(UDPPacket.class))
                    obj.add(packets);
                else if(packets.getClass().equals(ARPPacket.class))
                    obj.add(packets);
                else if(packets.getClass().equals(ICMPPacket.class))
                    obj.add(packets);
            }
            //9else {i = i-1;}
        }
    
        return obj;
    }
     
    
    
}
