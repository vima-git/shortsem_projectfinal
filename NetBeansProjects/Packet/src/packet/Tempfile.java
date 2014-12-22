/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packet;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import jpcap.packet.Packet;

/**
 *
 * @author xxx
 */
public class Tempfile {
    
    public static ArrayList<Packet> tf ;
    public static String name;
    
    public static void Savefile() throws FileNotFoundException, IOException{
       // String filename= "3500";
        //System.out.println("filename is"+filename);
        //String filename= packet.captureResultJFrame.fileNamejTextField1.getText();
        String filename= packet.Load.jFileChooser1.getSelectedFile().getPath();
        //System.out.println("filename is"+filename);
        FileOutputStream fos= new FileOutputStream(filename);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
                //duplicate
                ArrayList<Packet> obj_copy= tf;

                oos.writeObject(obj_copy);
                oos.close();
                fos.close();
               // System.out.println(name);
    }
    
    public static String  file(){
    System.out.println(packet.Load.jFileChooser1.getSelectedFile().toString());
    //packet.LoadPacketfile.fname= packet.Load.jFileChooser1.getSelectedFile().toString();
    return packet.Load.jFileChooser1.getSelectedFile().toString();
    }
    
   
    
    
}
