/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import jpcap.packet.Packet;

/**
 *
 * @author xxx
 */
public class BoolTest {
    
     public static ArrayList<Packet> union(ArrayList<Packet> list1, ArrayList<Packet> list2) {
         List<Packet> lst1 = new ArrayList<Packet>(list1);
         List<Packet> lst2 = new ArrayList<Packet>(list2);
         
         Set<Packet> setNumbers = new HashSet<Packet>(lst1);
         setNumbers.addAll(lst2);
         HashSet<Packet> hset = new HashSet<Packet>(setNumbers);
         ArrayList<Packet> obj = new ArrayList<Packet>(hset);
         
     return obj;
         
         
     }
  
public static void main(String[] args) {
    
         ArrayList<Integer> numlist= new ArrayList<Integer>();
         numlist.add(12);
         numlist.add(13);
         
         numlist.add(13);
         numlist.add(14);
         numlist.add(99);
         
         for (int t : numlist) {
            System.out.print(t+", ");
        }
         System.out.println("above arraylist");
         
    //getting unique value
    
        List<Integer> lstNumbers = new ArrayList<Integer>(numlist);
        //fill the list of integers...
        Set<Integer> setNumbers = new HashSet<Integer>(lstNumbers);
        //the set will contain no duplicate values...
        for (int t : setNumbers) {
            System.out.print(t+", ");
        }
     // Create a HashSet
     HashSet<Integer> hset = new HashSet<Integer>(setNumbers);
 
     //add elements to HashSet
     /*hset.add("Steve");
     hset.add("Matt");
     hset.add("Govinda");
     hset.add("John");
     hset.add("Tommy");
 */
     // Displaying HashSet elements
     System.out.println("HashSet contains: "+ hset);
 
     // Creating a List of HashSet elements
     ArrayList<Integer> list = new ArrayList<Integer>(hset);
 
     // Displaying ArrayList elements
     System.out.println("ArrayList contains: "+ list);
  }


   
		
	
    
   /* public static ArrayList<Packet> union(ArrayList<Packet> list1, ArrayList<Packet> list2) {
        final ArrayList result = new ArrayList(list1);
        result.addAll(list2);
        return result;
    }*/
    
}
