
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
    
    // Método para atender el siguiente pedido
    public void atenderPedido(){
        Pedido p = cola.atenderPedido(); // saca el primer pedido de la cola

        if(p != null){ // si sí había pedido
            historial.push(p); // lo guarda en el historial
            System.out.println("Pedido atendido: " + p.mostrar()); // muestra el pedido
        }else{
            System.out.println("No hay pedidos en la cola"); // mensaje si está vacía
        }
    }
    
    // Método para mostrar pedidos pendientes
    public void mostrarPedidos(){
        cola.mostrarPedidos(); // muestra la cola
    }

    // Método para mostrar historial de pedidos
    public void mostrarHistorial(){
        historial.mostrarHistorial(); // muestra la pila
    }

}
