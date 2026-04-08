
package com.mycompany.restaurante;

import com.murcia.utils.Nodo;

public class PilaHistorial {
    Nodo<Pedido> primero; //nodo de encima de la pila
    
    public PilaHistorial(){
        primero= null; //constructor vacio
    }
    public void push(Pedido p){ //metodo para agregar pedido al historial
        Nodo<Pedido> nd = new Nodo(p); //nuevo nodo con el pedido
        nd.setNext(primero); //el nuevo nodo apunta al anterior
        primero= nd;//el nuevo es la cima
    }
    public Pedido pop(){ //mrotdo para sacar el ultimo pedido
        if (primero ==null){ //si esta vacio
            return null; //no saca nada
        }else{
            Pedido p = primero.getData(); //guarda el dato de la cima
            primero = primero.getNext(); //mueve el primero al siguiente nodo
            return p;//devuelve el pedido que se elimino
        }
    }
    public void mostrarHistorial(){ //metodo para mostrar el historial
        Nodo<Pedido> ahora = primero;//empieza desde el primer pedido
        
        while(ahora!=null){//recorrer la pila con while
            Pedido p=ahora.getData(); //tener el pedido
            System.out.println(p.mostrar());//imprimir el pedido
            ahora=ahora.getNext();//continua con el siguiente
        }
    }
}
