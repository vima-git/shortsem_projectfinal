/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;
import jpcap.packet.Packet;
import jpcap.packet.TCPPacket;
import jpcap.packet.UDPPacket;

/**
 *
 * @author xxx
 */
public class LoadPacketfile {
    
     public static ArrayList<Packet> Loadfile()
    {
        ArrayList<Packet> arraylist= new ArrayList<Packet>();
        try
        {   
            //Scanner name= new Scanner(System.in);
            //System.out.println("Enter File Name:");
            //String fname= "2000";
            String fname= packet.Conditions.filenameTextField.getText();
            FileInputStream fis = new FileInputStream(fname);
            ObjectInputStream ois = new ObjectInputStream(fis);
             arraylist = (ArrayList) ois.readObject();
            ois.close();
            fis.close();
            //return arraylist;
         }catch(IOException ioe){
             ioe.printStackTrace();
             //return;
         }catch(ClassNotFoundException c){
             System.out.println("Class not found");
             c.printStackTrace();
             //return;
          }
         return arraylist;
    }
      
        //for(Packet tmp: arraylist){
           // System.out.println(tmp);
        //}
    
     public static ArrayList<Packet> Length_eq(ArrayList<Packet> obj){
        Scanner size= new Scanner(System.in);
        System.out.println("Enter Packet size:");
        int psize= size.nextInt();
        
        
        
        ArrayList<Packet> obj1= new ArrayList<Packet>();
        int j=0;
        
        System.out.println("src ip");
        for( int i=0;i< obj.size();++i){
           String s= "obj.get(i).len>psize";
           
            if(obj.get(i).len>psize)
                //String s = new String();
            //System.out.println(obj.get(i).len);
                obj1.add(obj.get(i));
            j=j+1;

        }
        return obj1;
     }
     
        /*ArrayList<Packet> obj= arraylist;
        System.out.println("src ip");
            for( int i=0;i< obj.size();++i){
               if(obj.get(i).getClass().equals(TCPPacket.class))
               //System.out.println(((TCPPacket)obj.get(i)).src_ip);
               System.out.println(((TCPPacket)obj.get(i)).src_ip+"\t\t"+((TCPPacket)obj.get(i).;
               //if(obj.get(i).getClass().equals(UDPPacket.class))
               //System.out.println(((UDPPacket)obj.get(i)).src_ip); 
               //System.out.println(((UDPPacket)obj.get(i)).src_ip+"\t\t"+((UDPPacket)obj.get(i)).dst_ip);    
            }*/
     
     
     public static ArrayList<Packet> Some_eq(ArrayList<Packet> obj,int some, Object size) throws UnknownHostException{
       
         ArrayList<Packet> obj1= new ArrayList<Packet>();
        
        if(some==0){ //WHEN SRC_IP IS SELECTED
            //ArrayList<Packet> obj1= new ArrayList<Packet>();
            InetAddress psize = InetAddress.getByName((String)size);
            //packet.countJFrame.countResultLabel6.setText("99");

            for( int i=0;i< obj.size();++i){
              
                if(obj.get(i).getClass().equals(TCPPacket.class)){
                    TCPPacket tcp = (TCPPacket)obj.get(i);
                    //System.out.println(tcp.src_ip);
                    //System.out.println(psize);
                    if(tcp.src_ip.toString().equals(psize.toString()) ){
                         obj1.add(obj.get(i));
                         //packet.countJFrame.countResultLabel6.setText((String)size);
                    }
                    //packet.countJFrame.countResultLabel6.setText((String)size);
                    //System.out.println(i);
                    
                    
                }
                if(obj.get(i).getClass().equals(UDPPacket.class)){
                    UDPPacket udp = (UDPPacket)obj.get(i);
                    if(udp.src_ip.toString().equals(psize.toString()))
                         obj1.add(obj.get(i));
                    
                }    
            }
            
        }
        if(some==1){ //WHEN DST_IP IS SELECTED
            //ArrayList<Packet> obj1= new ArrayList<Packet>();
            InetAddress psize = InetAddress.getByName((String)size);
            //packet.countJFrame.countResultLabel6.setText("99");

            for( int i=0;i< obj.size();++i){
              
                if(obj.get(i).getClass().equals(TCPPacket.class)){
                    TCPPacket tcp = (TCPPacket)obj.get(i);
                    //System.out.println(tcp.src_ip);
                    //System.out.println(psize);
                    if(tcp.dst_ip.toString().equals(psize.toString()) ){
                         obj1.add(obj.get(i));
                         //packet.countJFrame.countResultLabel6.setText((String)size);
                    }
                    //packet.countJFrame.countResultLabel6.setText((String)size);
                    //System.out.println(i);
                    
                    
                }
                if(obj.get(i).getClass().equals(UDPPacket.class)){
                    UDPPacket udp = (UDPPacket)obj.get(i);
                    if(udp.dst_ip.toString().equals(psize.toString()))
                         obj1.add(obj.get(i));
                    
                }    
            }
            
            
            
        }
        
        if(some==2){ //WHEN SRC_PORT IS SELECTED
            
            int psize= Integer.valueOf((String) size);

            for( int i=0;i< obj.size();++i){
              
                if(obj.get(i).getClass().equals(TCPPacket.class)){
                    TCPPacket tcp = (TCPPacket)obj.get(i);
                    if(tcp.src_port==psize)
                         obj1.add(obj.get(i));
                    
                }
                if(obj.get(i).getClass().equals(UDPPacket.class)){
                    UDPPacket udp = (UDPPacket)obj.get(i);
                    if(udp.src_port==psize)
                         obj1.add(obj.get(i));
                }    
            }
            
        }
        if(some==3){    //WHEN DST_PORT IS SELECTED
            
            int psize= Integer.valueOf((String) size);

            for( int i=0;i< obj.size();++i){
              
                if(obj.get(i).getClass().equals(TCPPacket.class)){
                    TCPPacket tcp = (TCPPacket)obj.get(i);
                    if(tcp.dst_port==psize)
                         obj1.add(obj.get(i));
                    
                }
                if(obj.get(i).getClass().equals(UDPPacket.class)){
                    UDPPacket udp = (UDPPacket)obj.get(i);
                    if(udp.dst_port==psize)
                         obj1.add(obj.get(i));
                }    
            }
        
        }
        
        if(some==4){ //WHEN LENGTH IS SELECTED
       
            //ArrayList<Packet> obj1= new ArrayList<Packet>();
            int psize= Integer.valueOf((String) size);
            for( int i=0;i< obj.size();++i){
              
                if(obj.get(i).getClass().equals(TCPPacket.class)){
                    TCPPacket tcp = (TCPPacket)obj.get(i);
                    if(tcp.length==psize)
                         obj1.add(obj.get(i));
                    
                }
                if(obj.get(i).getClass().equals(UDPPacket.class)){
                    UDPPacket udp = (UDPPacket)obj.get(i);
                    if(udp.length==psize)
                         obj1.add(obj.get(i));
                }    
            }
        }
        if(some==5){ //WHEN PROTOCOL IS SELECTED
       
            //ArrayList<Packet> obj1= new ArrayList<Packet>();
            String psize= (String)size;
            //System.out.print("OBJ SIZE"+obj.size());
            
            if(psize.equals("TCP")|| psize.equals("tcp")){
                for( int i=0;i< obj.size();++i){
                               // System.out.println(i);

                    if(obj.get(i).getClass().equals(TCPPacket.class))
                       obj1.add(obj.get(i)); 
                }
            }
            else if(psize.equals("UDP") || psize.equals("udp")){
                for( int i=0;i< obj.size();++i){
                    if(obj.get(i).getClass().equals(UDPPacket.class))
                       obj1.add(obj.get(i)); 
                }
            }
            
        }

            
                
            
        
        
        
     
     
     return obj1;
    }

/*SOURCE_IP
DST_IP
SRC_PORT
DST_PORT
LENGTH
PROTOCOL*/
     
    public static ArrayList<Packet> Some_gt(ArrayList<Packet> obj,int some, Object size)throws UnknownHostException{
          
           ArrayList<Packet> obj1= new ArrayList<Packet>();
           
        
        if(some==2){ //WHEN SRC_PORT IS SELECTED
            
            int psize= Integer.valueOf((String) size);

            for( int i=0;i< obj.size();++i){
              
                if(obj.get(i).getClass().equals(TCPPacket.class)){
                    TCPPacket tcp = (TCPPacket)obj.get(i);
                    if(tcp.src_port>psize)
                         obj1.add(obj.get(i));
                    
                }
                if(obj.get(i).getClass().equals(UDPPacket.class)){
                    UDPPacket udp = (UDPPacket)obj.get(i);
                    if(udp.src_port>psize)
                         obj1.add(obj.get(i));
                }    
            }
            
        }
        if(some==3){    //WHEN DST_PORT IS SELECTED
            
            int psize= Integer.valueOf((String) size);

            for( int i=0;i< obj.size();++i){
              
                if(obj.get(i).getClass().equals(TCPPacket.class)){
                    TCPPacket tcp = (TCPPacket)obj.get(i);
                    if(tcp.src_port>psize)
                         obj1.add(obj.get(i));
                    
                }
                if(obj.get(i).getClass().equals(UDPPacket.class)){
                    UDPPacket udp = (UDPPacket)obj.get(i);
                    if(udp.src_port>psize)
                         obj1.add(obj.get(i));
                }    
            }
        
        }
        
        if(some==4){ //WHEN LENGTH IS SELECTED
       
            //ArrayList<Packet> obj1= new ArrayList<Packet>();
            int psize= Integer.valueOf((String) size);
            
            for( int i=0;i< obj.size();++i){
              
                if(obj.get(i).getClass().equals(TCPPacket.class)){
                    TCPPacket tcp = (TCPPacket)obj.get(i);
                    if(tcp.length>psize)
                         obj1.add(obj.get(i));
                    
                }
                if(obj.get(i).getClass().equals(UDPPacket.class)){
                    UDPPacket udp = (UDPPacket)obj.get(i);
                    if(udp.length>psize)
                         obj1.add(obj.get(i));
                }    
            }
        }
          
          return obj1;
      }

      
    public static ArrayList<Packet> Some_ls(ArrayList<Packet> obj,int some, Object size)throws UnknownHostException{
          
           ArrayList<Packet> obj1= new ArrayList<Packet>();
        
        /*if(some==0){ //WHEN SRC_IP IS SELECTED
            //ArrayList<Packet> obj1= new ArrayList<Packet>();
            InetAddress psize = InetAddress.getByName((String)size);
            //packet.countJFrame.countResultLabel6.setText("99");

            for( int i=0;i< obj.size();++i){
              
                if(obj.get(i).getClass().equals(TCPPacket.class)){
                    TCPPacket tcp = (TCPPacket)obj.get(i);
                    //System.out.println(tcp.src_ip);
                    //System.out.println(psize);
                    if(tcp.src_ip.toString().equals(psize.toString()) ){
                         obj1.add(obj.get(i));
                         //packet.countJFrame.countResultLabel6.setText((String)size);
                    }
                    //packet.countJFrame.countResultLabel6.setText((String)size);
                    //System.out.println(i);
                    
                    
                }
                if(obj.get(i).getClass().equals(UDPPacket.class)){
                    UDPPacket udp = (UDPPacket)obj.get(i);
                    if(udp.src_ip.toString().equals(psize.toString()))
                         obj1.add(obj.get(i));
                    
                }    
            }
            
        }
        if(some==1){ //WHEN DST_IP IS SELECTED
            //ArrayList<Packet> obj1= new ArrayList<Packet>();
            InetAddress psize = InetAddress.getByName((String)size);
            //packet.countJFrame.countResultLabel6.setText("99");

            for( int i=0;i< obj.size();++i){
              
                if(obj.get(i).getClass().equals(TCPPacket.class)){
                    TCPPacket tcp = (TCPPacket)obj.get(i);
                    //System.out.println(tcp.src_ip);
                    //System.out.println(psize);
                    if(tcp.dst_ip.toString().equals(psize.toString()) ){
                         obj1.add(obj.get(i));
                         //packet.countJFrame.countResultLabel6.setText((String)size);
                    }
                    //packet.countJFrame.countResultLabel6.setText((String)size);
                    //System.out.println(i);
                    
                    
                }
                if(obj.get(i).getClass().equals(UDPPacket.class)){
                    UDPPacket udp = (UDPPacket)obj.get(i);
                    if(udp.dst_ip.toString().equals(psize.toString()))
                         obj1.add(obj.get(i));
                    
                }    
            }
            
            
            
        }*/
        
        if(some==2){ //WHEN SRC_PORT IS SELECTED
            
            int psize= Integer.valueOf((String) size);

            for( int i=0;i< obj.size();++i){
              
                if(obj.get(i).getClass().equals(TCPPacket.class)){
                    TCPPacket tcp = (TCPPacket)obj.get(i);
                    if(tcp.src_port<psize)
                         obj1.add(obj.get(i));
                    
                }
                if(obj.get(i).getClass().equals(UDPPacket.class)){
                    UDPPacket udp = (UDPPacket)obj.get(i);
                    if(udp.src_port<psize)
                         obj1.add(obj.get(i));
                }    
            }
            
        }
        if(some==3){    //WHEN DST_PORT IS SELECTED
            
            int psize= Integer.valueOf((String) size);

            for( int i=0;i< obj.size();++i){
              
                if(obj.get(i).getClass().equals(TCPPacket.class)){
                    TCPPacket tcp = (TCPPacket)obj.get(i);
                    if(tcp.src_port<psize)
                         obj1.add(obj.get(i));
                    
                }
                if(obj.get(i).getClass().equals(UDPPacket.class)){
                    UDPPacket udp = (UDPPacket)obj.get(i);
                    if(udp.src_port<psize)
                         obj1.add(obj.get(i));
                }    
            }
        
        }
        
        if(some==4){ //WHEN LENGTH IS SELECTED
       
            //ArrayList<Packet> obj1= new ArrayList<Packet>();
            int psize= Integer.valueOf((String) size);

           for( int i=0;i< obj.size();++i){
              
                if(obj.get(i).getClass().equals(TCPPacket.class)){
                    TCPPacket tcp = (TCPPacket)obj.get(i);
                    if(tcp.length<psize)
                         obj1.add(obj.get(i));
                    
                }
                if(obj.get(i).getClass().equals(UDPPacket.class)){
                    UDPPacket udp = (UDPPacket)obj.get(i);
                    if(udp.length<psize)
                         obj1.add(obj.get(i));
                }    
            }
        }
          
          return obj1;
      }

    public static void finalcountdown(ArrayList<Packet> obj){
        packet.countJFrame.countResultLabel6.setText("Number of Packets satisfying above condtions is "+Integer.toString(obj.size()));
    }
    
    public static void finalshow(ArrayList<Packet> obj){
        packet.Infotable.Filterdetail(obj);

    }

}