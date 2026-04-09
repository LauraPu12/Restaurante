
package com.mycompany.restaurante;


public class Restaurante {
        
        ListaMenu menu; // lista que guarda los platos
        ColaPedidos cola; // cola de pedidos pendientes
        PilaHistorial historial; // pila con pedidos atendidos

         // Constructor del restaurante
        public Restaurante(){
        menu = new ListaMenu(); // crea el menú
        cola = new ColaPedidos(); // crea la cola de pedidos
        historial = new PilaHistorial(); // crea el historial
        
    }
        
    // Método para agregar un plato al menú
    public void agregarPlato(Plato p){
        menu.agregarPlato(p); // usa el método de ListaMenu
    }
    
    // Método para mostrar el menú
    public void mostrarMenu(){
        menu.mostrarMenu(); // muestra todos los platos
    }

    // Método para agregar un pedido
    public void hacerPedido(Pedido p){
        cola.agregarPedido(p); // agrega el pedido a la cola
    }



}
