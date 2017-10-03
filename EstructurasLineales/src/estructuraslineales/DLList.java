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
public class DLList<T> {
    public NodeDL<T> first;
    public NodeDL<T> last;
    public NodeDL<T> pointer;
    public int length;
    
public DLList(){
    first = null;
    last = null;
    pointer = null;
    length = 0;
   }

DLList(T d) {//Constructos con un primer nodo
    NodeDL<T> node = new NodeDL<T>(d);
//Apuntamos primero y ultimo al nuevo node
    first = node;
    last = node;
//Los apuntadores siguiente y atras apuntan a nulo
    node.next = null;
    node.back = null;
//Incrementamos el contador de elementos de la lista
    length++;
}

boolean isEmpty() {
    return length == 0;
}

public void insertFirst(T d) {
NodeDL<T> node = new NodeDL<T>(d);
    if (isEmpty()) {
        first = node;
        last = node;
    }else {//Si la lista ya cuenta con elementos
//El siguiente del nuevo node apunta al node que apunta first
    node.next = first;
//El node que apunta first en su apuntador back apunta al nuevo nodo
    first.back = node;
//El apuntador first apunta al nuevo nodo
    first = node;
  }
    length++;
}

public void insertLast(T d) {
//Instanciamos el nuevo nodo
    NodeDL<T> node = new NodeDL<T>(d);
	if (isEmpty()) {
	first = node;
	last = node;
}else {//Si la lista ya cuenta con elementos
        node.back = last;
	last.next = node;
	last = node;
    }
   length++;
}

public void deletefirst() {
    if(!isEmpty()){
    if(length == 1){
	first = null;
	last = null;
}
    else {
	first = first.next;
	first.back = null;
    }
}
length--;
}

void deletelast() {
    if (!isEmpty()) {
    if (length == 1) {
	first = null;
	last = null;
}
    else {
	pointer = first;
	while (pointer.next != last) {
	pointer = pointer.next;
    }
        last = pointer;
	pointer = null;
	last.next = null;
}
    length--;
   }
}

public void deletenode(T data) {
    if (!isEmpty()) {
    if (first.data == data) {
	deletefirst();
	length--;
}
    if (last.data == data) {
	deletelast();
	length--;
}
	pointer = first;
    do {
	if (pointer.data == data) {
            pointer.prev.next = pointer.next;
	    pointer.next.prev = pointer.prev;
	    pointer = null;
		length--;
   }else{ 
        pointer = pointer.next;   
  }
} while (pointer != null);
    }
}

public void showList() {
    pointer = first;
    for (int i = 0; i < length; i++) {
	pointer = pointer.next;
    }
}

}
