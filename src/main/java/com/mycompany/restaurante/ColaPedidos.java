
package com.mycompany.restaurante;

import com.murcia.utils.ColaEnlazada;
import com.murcia.utils.Nodo;

class ColaPedidos extends ColaEnlazada<Pedido> { //clase que hereda de ColaEnlazada
    
    public void agregarPedido(Pedido p){ //metodo para agregar pedido a la cola
        encolar (p); //para agregarlo
    }
    public Pedido atenderPedido(){ //metodo para sacar el pedido
        return desencolar(); //sacar el primer pedido
    }
    public void mostrarPedidos(){ //pedidos en cola
        Nodo<Pedido> actual =head; //desde el primero
        
        while(actual!=null){ //recorrer la cola
            Pedido p = actual.getData(); //obtener el pedido
            System.out.println(p.mostrar()); //imprimir el pedido
            actual = actual.getNext();// avanza al siguiente nodo
        }
    }
    // Metodo para buscar pedido en la cola
   public int buscarPedido(int id){
    
    Nodo<Pedido> actual = primero; // inicio de la cola
    int posicion = 1; // posicion
    
    while(actual != null){
        Pedido p = actual.getData(); // obtener pedido
        
        if(p.getId() == id){ // si coincide
            return posicion; // retorna posicion
        }
        
        actual = actual.getNext(); // avanzar
        posicion++; // aumentar posicion
    }
    
    return -1; // no encontrado
}
}
