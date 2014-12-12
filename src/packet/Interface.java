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

        packet.captureJFrame.interfaceTextArea.append("\n\n-----Interface "+i+" Info-----");
        packet.captureJFrame.interfaceTextArea.append("\nInterface Number: "+i);
        packet.captureJFrame.interfaceTextArea.append("\nDescription: "+devices[i].name+"("+devices[i].description+")");
        packet.captureJFrame.interfaceTextArea.append("\nDatalink Name: "+devices[i].datalink_name+"("+devices[i].datalink_description+")");
        packet.captureJFrame.interfaceTextArea.append("\nMAC address: ");
        byte[] R=devices[i].mac_address;
        for(int A=0;A<=devices.length;A++)
        packet.captureJFrame.interfaceTextArea.append(Integer.toHexString(R[A] & 0xff) +":");


        NetworkInterfaceAddress [] INT = devices[i].addresses;
        packet.captureJFrame.interfaceTextArea.append("\nIP Adress: " +INT[0].address);
        packet.captureJFrame.interfaceTextArea.append("\nSubnet Mask: "+INT[0].subnet);
        packet.captureJFrame.interfaceTextArea.append("\nBroadcast adress: "+INT[0].broadcast);



        }







    }

}
