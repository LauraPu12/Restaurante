
package com.mycompany.restaurante;

import com.murcia.utils.ColaEnlazada;

class ColaPedidos extends ColaEnlazada<Pedido> { //clase que hereda de ColaEnlazada
    
    public void agregarPedido(Pedido p){ //metodo para agregar pedido a la cola
        encolar (p); //para agregarlo
    }
    public Pedido atenderPedido(){ //metodo para sacar el pedido
        return desencolar(); //sacar el primer pedido
    }
}
