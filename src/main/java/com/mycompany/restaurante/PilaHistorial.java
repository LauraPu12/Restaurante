
package com.mycompany.restaurante;

import com.murcia.utils.Nodo;

public class PilaHistorial {
    Nodo<Pedido> cima; //nodo de encima de la pila
    
    public PilaHistorial(){
        cima = null; //constructor vacio
    }
    public void push(Pedido p){ //metodo para agregar pedido al historial
        Nodo<Pedido> nd = new Nodo(p); //nuevo nodo con el pedido
        nd.setNext(cima); //el nuevo nodo apunta al anterior
        cima = nd;//el nuevo es la cima
    }
}
