
package com.mycompany.restaurante;

import com.murcia.utils.Nodo;

public class PilaHistorial {
    Nodo<Pedido> cima; //nodo de encima de la pila
    
    public PilaHistorial(){
        cima = null; //constructor vacio
    }
}
