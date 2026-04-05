
package com.mycompany.restaurante;

import com.murcia.utils.ColaEnlazada;

class ColaPedidos extends ColaEnlazada<Pedido> { //clase que hereda de ColaEnlazada
    
    public void agregarPedido(Pedido p){ //metodo para agregar pedido a la cola
        encolar (p); //para agregarlo
    }
}
