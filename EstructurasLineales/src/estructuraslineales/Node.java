/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraslineales;

/**
 *
 * @author LuisGuillermo
 */
public class Node<T> {
    T data; 
    Node<T> next; 

    Node (T d) { 
        this.data = d;
        this.next = null;
    } 

   
}
