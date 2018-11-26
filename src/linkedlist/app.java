/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

public class app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        String s5 = "E";
        String s6 = "F";
        
        List list = new List();
        
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);


        
        
        for(int i=0; i < list.size(); i++){
         System.out.print(" " + list.get(i));   
        }
        
                list.remove(0);
                list.addFirst(s6);
        
        System.out.println();
                
                
        for(int i=0; i < list.size(); i++){
         System.out.print(" " + list.get(i));   
        }   
        
              System.out.println();
                
                
                
         //System.out.println(list.size());
         //System.out.println(list.size());
    }
    
       
}