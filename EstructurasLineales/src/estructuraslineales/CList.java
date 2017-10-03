/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraslineales;

import estructuraslineales.Node;

/**
 *
 * @author LuisGuillermo
 */
public class CList<T> {
    Node pivote;
     Node pointer;
     int length;
    
    CList(){
        this.pivote=null;
        this.pointer=null;
        this.length=0;
    }
    
    CList(T d){
        Node node = new Node(d);
        pivote=node.next=node;
        length++;
    }
      
    public boolean isEmpty(){
        return length == 0;
    }
    
    public void insert(T d){
        Node node = new Node(d);
        if(isEmpty()){
            pivote=node.next=node;
        }else{
            node.next=pivote.next;
            pivote.next=node;
        }
        length++;
    }

    public void deleteNode(T d){
        if(!isEmpty()){
            pointer = pivote;
            for(int i = 1; i<=length;i++){
                if(pointer.next.data == d){
                    pointer.next = pointer.next.next;
                    if(pivote.data == d){
                        pivote=pointer;
                    }
                    length--;
                    pointer=null;
                    i=length+1;
                }
                pointer=pointer.next;
            }
        }
        
    }

    public void deleteList(){
        pivote = pointer = null;
    }

    public void showList(){
        pointer = pivote;
        System.out.print("first->");
        for(int i = 0; i<length ; i++){
            System.out.print("[" + pointer.data.toString() + "]->");
            pointer = pointer.next;
        }
        System.out.println("<-last");
    }
    
}
