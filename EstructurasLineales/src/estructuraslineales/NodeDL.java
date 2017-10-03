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
public class NodeDL<T> {
    T data;
    NodeDL<T> next;
    NodeDL<T> back;
    
    NodeDL (T d) { 
        this.data = d;
        this.next = this.back = null;
    } 
}
