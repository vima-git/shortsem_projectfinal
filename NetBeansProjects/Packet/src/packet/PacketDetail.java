/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packet;

//import jpcap.packet;
import java.io.UnsupportedEncodingException;
import static java.util.Arrays.stream;
import jpcap.packet.ARPPacket;
import jpcap.packet.TCPPacket;
import jpcap.packet.EthernetPacket;
import jpcap.packet.IPPacket;
import jpcap.packet.ICMPPacket;
import jpcap.packet.DatalinkPacket;
import jpcap.packet.Packet;
import jpcap.packet.UDPPacket;





/**
 *
 * @author xxx
 */
public class PacketDetail {
    
    public static void selectedPacket(){
            Packet ppacket =(Packet)Infotable.finalresult.get(countJFrame.jTable1.getSelectedRow());
        
            
            if(ppacket.getClass().equals(TCPPacket.class))
             TCPHandler(ppacket); 
            
            if(ppacket.getClass().equals(UDPPacket.class))
              UDPHandler(ppacket);
            if(ppacket.getClass().equals(ARPPacket.class))
              ARPHandler(ppacket);
            
    }
    
    public static void TCPHandler(Packet packet){
        TCPPacket Tpacket= (TCPPacket)packet;
        sortJFrame.jTextArea1.append("\n Packet number:  "+countJFrame.jTable1.getSelectedRow());
        sortJFrame.jTextArea1.append("\n Protocol:  TCP");
        sortJFrame.jTextArea1.append("\n Source IP:   "+Tpacket.src_ip.getHostAddress());
        sortJFrame.jTextArea1.append("\n Destination IP:   "+Tpacket.dst_ip.getHostAddress());
        sortJFrame.jTextArea1.append("\n Source Port:   "+Tpacket.src_port);
        sortJFrame.jTextArea1.append("\n Destination Port:   "+Tpacket.dst_port);
        sortJFrame.jTextArea1.append("\n Acknowledgement number:   "+Tpacket.ack_num);
        sortJFrame.jTextArea1.append("\n Sequence number:   "+Tpacket.sequence);        
        sortJFrame.jTextArea1.append("\n Header length:   "+Tpacket.header.length);
        
        EthernetPacket Epacket= (EthernetPacket)packet.datalink;
        sortJFrame.jTextArea1.append("\n Source MAC :   "+Epacket.getSourceAddress());
        sortJFrame.jTextArea1.append("\n Destination MAC :   "+Epacket.getDestinationAddress());
        String date= new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new java.util.Date(Tpacket.sec*1000));
        sortJFrame.jTextArea1.append("\n Arrival time:"+date+" Sri Lanka Standard Time\n");
        //DatalinkPacket ETpacket= (DatalinkPacket)packet;
        sortJFrame.jTextArea1.append("\n\n Data:   \n");
            byte[] R=Tpacket.data;
            if(R.length!=0){
                for(int A=0;A<R.length;A++)
                sortJFrame.jTextArea1.append(Integer.toHexString(R[A] & 0xff) +" ");
            }
            
        
        
//         System.out.println(Tpacket.data.length);
//         System.out.println(Tpacket.header.length);
//         System.out.println(Ipacket.header.length);
        
        
        
        
//        byte[] data= Tpacket.data;
////        String decodedDataUsingUTF8;
////		try {
////			decodedDataUsingUTF8 = new String(data, "UTF-8");  // Best way to decode using "UTF-8"
////		    System.out.println("Text Decryted using UTF-8 : " + decodedDataUsingUTF8);
////		} catch (UnsupportedEncodingException e) {
////			e.printStackTrace();
////		}
//
//String str = new String(data);
//System.out.println(str);
//        String s2= new String(data);
//        sortJFrame.jTextArea1.append(s2);
//        System.out.println(s2);
        
    }
    public static void UDPHandler(Packet packet){
        UDPPacket Upacket= (UDPPacket)packet;
        sortJFrame.jTextArea1.append("\n\n Packet number:  "+(countJFrame.jTable1.getSelectedRow()+1));
        sortJFrame.jTextArea1.append("\n Protocol:  UDP");
        sortJFrame.jTextArea1.append("\n Source IP:   "+Upacket.src_ip.getHostAddress());
        sortJFrame.jTextArea1.append("\n Destination IP:   "+Upacket.dst_ip.getHostAddress());
        sortJFrame.jTextArea1.append("\n Source Port:   "+Upacket.src_port);
        sortJFrame.jTextArea1.append("\n Destination Port:   "+Upacket.dst_port);
             
        sortJFrame.jTextArea1.append("\n UDPHeader length:   "+Upacket.header.length);
        
        EthernetPacket Epacket= (EthernetPacket)packet.datalink;
        sortJFrame.jTextArea1.append("\n Source MAC :   "+Epacket.getSourceAddress());
        sortJFrame.jTextArea1.append("\n Destination MAC :   "+Epacket.getDestinationAddress());
        String date= new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new java.util.Date(Upacket.sec*1000));
       sortJFrame.jTextArea1.append("\n Arrival time:"+date+" Sri Lanka Standard Time\n");
        //DatalinkPacket ETpacket= (DatalinkPacket)packet;
        sortJFrame.jTextArea1.append("\n\n Data:   \n");
            byte[] R=Upacket.data;
            if(R.length!=0){
                for(int A=0;A<R.length;A++)
                sortJFrame.jTextArea1.append(Integer.toHexString(R[A] & 0xff) +" ");
            }
        
       
       
       
        
    }
    public static void ARPHandler(Packet packet){
         ARPPacket Apacket= (ARPPacket)packet;
         sortJFrame.jTextArea1.append("\n\n Packet number:  "+(countJFrame.jTable1.getSelectedRow()+1));
         sortJFrame.jTextArea1.append("\n Protocol:  ARP");
         sortJFrame.jTextArea1.append("\n Sender Hardware address:   "+Apacket.getSenderHardwareAddress());
         sortJFrame.jTextArea1.append("\n Target Hardware address:   "+Apacket.getTargetHardwareAddress());
         sortJFrame.jTextArea1.append("\n Sender Protocol address:   "+Apacket.getSenderProtocolAddress());
         sortJFrame.jTextArea1.append("\n Target Protocol address:   "+Apacket.getTargetProtocolAddress());
         sortJFrame.jTextArea1.append("\n");
         
         String date= new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new java.util.Date(Apacket.sec*1000));
         sortJFrame.jTextArea1.append("\n Arrival time:"+date+" Sri Lanka Standard Time");
         
         
          byte[] R=Apacket.data;
            if(R.length!=0){
                for(int A=0;A<R.length;A++)
                sortJFrame.jTextArea1.append(Integer.toHexString(R[A] & 0xff) +" ");}
    }
    
}
