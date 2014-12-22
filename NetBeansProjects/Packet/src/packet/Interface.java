/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packet;

import jpcap.JpcapCaptor;
import jpcap.NetworkInterface;
import jpcap.NetworkInterfaceAddress;

/**
 *
 * @author xxx
 */
public class Interface {
    
    
    
    public static void List(){
        //Obtain the list of network interfaces
        NetworkInterface[] devices = JpcapCaptor.getDeviceList();

        for(int i=0;i<devices.length;++i){
        packet.captureResultJFrame.jComboBox1.addItem(i);
         
        packet.captureResultJFrame.interfaceTextArea.append("\n\n-----Interface "+i+" Info-----");
        packet.captureResultJFrame.interfaceTextArea.append("\nInterface Number: "+i);
        packet.captureResultJFrame.interfaceTextArea.append("\nDescription: "+devices[i].name+"("+devices[i].description+")");
        packet.captureResultJFrame.interfaceTextArea.append("\nDatalink Name: "+devices[i].datalink_name+"("+devices[i].datalink_description+")");
        packet.captureResultJFrame.interfaceTextArea.append("\nMAC address: ");
        byte[] R=devices[i].mac_address;
        for(int A=0;A<=devices.length;A++)
        packet.captureResultJFrame.interfaceTextArea.append(Integer.toHexString(R[A] & 0xff) +":");


        /*NetworkInterfaceAddress [] INT = devices[i].addresses;
        packet.captureResultJFrame.interfaceTextArea.append("\nIP Adress: " +INT[0].address.getHostAddress());
        packet.captureResultJFrame.interfaceTextArea.append("\nSubnet Mask: "+INT[0].subnet);
        packet.captureResultJFrame.interfaceTextArea.append("\nBroadcast adress: "+INT[0].broadcast);*/

        /*for (NetworkInterfaceAddress a : devices[i].addresses)
         packet.captureResultJFrame.interfaceTextArea.append(" address:"+a.address + " " + a.subnet + " "+ a.broadcast);*/
        for (NetworkInterfaceAddress a : devices[i].addresses){
        packet.captureResultJFrame.interfaceTextArea.append("\nIP Adress: " +a.address.getHostAddress());
        packet.captureResultJFrame.interfaceTextArea.append("\nSubnet Mask: "+a.subnet);
        packet.captureResultJFrame.interfaceTextArea.append("\nBroadcast adress: "+a.broadcast);
        }

        }







    }
    public static void device(){
   
    
    }
}
