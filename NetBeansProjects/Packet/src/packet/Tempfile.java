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
import jpcap.packet.Packet;

/**
 *
 * @author xxx
 */
public class Tempfile {
    
    public static ArrayList<Packet> tf ;
    public static String name;
    
    public static void Savefile() throws FileNotFoundException, IOException{
    String filename= packet.captureResultJFrame.fileNamejTextField1.getText();
        
        FileOutputStream fos= new FileOutputStream(filename);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
                //duplicate
                ArrayList<Packet> obj_copy= tf;

                oos.writeObject(obj_copy);
                oos.close();
                fos.close();
               // System.out.println(name);
    }
    
    
   
    
    
}
