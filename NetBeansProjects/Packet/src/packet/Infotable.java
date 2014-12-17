
package packet;

import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import jpcap.JpcapCaptor;
import jpcap.NetworkInterface;
import jpcap.packet.Packet;
import jpcap.packet.TCPPacket;
import jpcap.packet.UDPPacket;

/**
 *
 * 
 */
public class Infotable {
    
    public static void ShowDetail1(ArrayList<Packet> obj) throws IOException{
        
                
    
        for(int i=0;i<obj.size();i++){
                //capture a single packet and print it out
            Packet packets = obj.get(i);
            packet.captureResultJFrame.capjLabel3.setVisible(true);

                if(packets.getClass().equals(TCPPacket.class)){
                    
                    TCPPacket p = (TCPPacket)packets;

                    //System.out.println("?? TCP ??");
                    InetAddress col1 = p.src_ip;
                    InetAddress col2 = p.dst_ip;
                    int col3 = p.src_port;
                    int col4 = p.dst_port;
                    int col5 = p.length;
                    String col6 = "TCP";
                    //System.out.println(p.length);*/
                    Object[] row = {col1,col2,col3,col4,col5,col6 };
                    DefaultTableModel model = (DefaultTableModel) packet.captureResultJFrame.jTable1.getModel();
                    model.addRow(row);


                }
                else if(packets.getClass().equals(UDPPacket.class)){
                    UDPPacket up = (UDPPacket)packets;
                    
                    InetAddress col1 = up.src_ip;
                    InetAddress col2 = up.dst_ip;
                    int col3 = up.src_port;
                    int col4 = up.dst_port;
                    int col5 = up.length;
                    String col6 = "UDP";
                    //System.out.println(p.length);*/
                    Object[] row = {col1,col2,col3,col4,col5,col6 };
                    DefaultTableModel model = (DefaultTableModel) packet.captureResultJFrame.jTable1.getModel();
                    model.addRow(row);
                    


                }

            
            
            
            
        }
                    packet.captureResultJFrame.capjLabel3.setVisible(false);

    
    }
    
    public static void Filterdetail(ArrayList<Packet> obj){
     
        for(int i=0;i<obj.size();++i){
            
            Packet packets= obj.get(i);
            if(packets.getClass().equals(TCPPacket.class)){
                    
                    //obj.add(packets);
                    TCPPacket p = (TCPPacket)packets;

                    //System.out.println("?? TCP ??");
                    InetAddress col1 = p.src_ip;
                    InetAddress col2 = p.dst_ip;
                    int col3 = p.src_port;
                    int col4 = p.dst_port;
                    //System.out.println(p.length);
                    //Object[] row = {col1,col2,col3,col4 };
                    //DefaultTableModel model = (DefaultTableModel)packet.showqueryJFrame.jTable1.getModel();
                    //model.addRow(row);

                }

            /*
                else if(packets.getClass().equals(UDPPacket.class)){
                    //obj.add(packets);
                    UDPPacket up = (UDPPacket)packets;
                    
                    InetAddress col1 = up.src_ip;
                    InetAddress col2 = up.dst_ip;
                    int col3 = up.src_port;
                    int col4 = up.dst_port;
                    //System.out.println(p.length);
                    Object[] row = {col1,col2,col3,col4 };
                    DefaultTableModel model = (DefaultTableModel) packet.showqueryJFrame.jTable1.getModel();
                    model.addRow(row);
                    


                }*/
        }
    }
    
    public static void ShowDetail(ArrayList<Packet> obj) throws IOException{
        
       
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
                    InetAddress col1 = p.src_ip;
                    InetAddress col2 = p.dst_ip;
                    int col3 = p.src_port;
                    int col4 = p.dst_port;
                    int col5 = p.length;
                    String col6 = "TCP";
                    //System.out.println(p.length);
                    Object[] row = {col0,col1,col2,col3,col4,col5,col6 };
                    //DefaultTableModel model = (DefaultTableModel)packet.countJFrame.jTable1.getModel();
                    model.addRow(row);

                }
                else if(obj.get(i).getClass().equals(UDPPacket.class)){
                    //obj.add(packets);
                    UDPPacket up = (UDPPacket)obj.get(i);
                    int col0= i+1;
                    InetAddress col1 = up.src_ip;
                    InetAddress col2 = up.dst_ip;
                    int col3 = up.src_port;
                    int col4 = up.dst_port;
                    int col5 = up.length;
                    String col6 = "UDP";
                    //System.out.println(p.length);
                    Object[] row = {col0,col1,col2,col3,col4,col5,col6 };
                    //DefaultTableModel model = (DefaultTableModel) packet.countJFrame.jTable1.getModel();
                    model.addRow(row);
                    


                }

            
            
            
            
        }
        
        
    
    }
    
    public static ArrayList<Packet> getPacketArray() throws IOException{
        NetworkInterface[] devices = JpcapCaptor.getDeviceList();
        
        //setting index using jframe2 
        int index= Integer.parseUnsignedInt(packet.captureJFrame.indexTextField.getText());
        
        //initialize num of packets
        int maxnum= Integer.parseUnsignedInt(packet.captureResultJFrame.numOfpacketsTextField1.getText());
        
        
        
         //Open an interface using method openDevice(NetworkInterface intrface, int snaplen, boolean promics, int to_ms)
        JpcapCaptor captor= JpcapCaptor.openDevice(devices[index],65, false, 20);
        

        captor.setFilter("udp", true);
        
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
            }
        }
    
        return obj;
    }
}
