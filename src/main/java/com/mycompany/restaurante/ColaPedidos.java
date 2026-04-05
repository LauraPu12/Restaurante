
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
}
