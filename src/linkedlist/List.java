/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author crist
 */
public class List {

    public Box head;

    public List() {

    }

    public void add(String s) {
        Box temp = new Box();
        temp.dado = s;
        if (head == null) {
            head = temp;
        } else {
            Box temp2 = head;
            while (temp2.next != null) {
                temp2 = temp2.next;
            }
            temp2.next = temp;
        }

    }

    public String get(int index) {
        Box temp = head;
        for (int i = 0; i <= index - 1; i++) {
            temp = temp.next;
        }
        return temp.dado;

    }
    public int size(){
        int count = 0;
        Box temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    
    public void addFirst(String s){
        Box temp = new Box ();
        temp.dado = s;
        temp.next = head;
        head = temp;
                           
            
        }
    
    public void remove(int index){
        if(index == 0){
            //Box temp = head;
            head = head.next;
        }else{
            Box temp = head;
            Box temp2 = null;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;

            }
            temp2 = temp.next;
            temp.next = temp2.next;
        }
       
    }
        
        
    }

