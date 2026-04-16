
package com.mycompany.restaurante;

public class Pedido {
    
    int id; // identificador unico del pedido
    String cliente; // Nombre del cliente
    String plato; // Nombre del plato pedido

    // Constructor vacío
    public Pedido() {
    }

    // Constructor con parámetros
    public Pedido(int id, String cliente, String plato) {
        this.id = id; // Asigna el id recibido
        this.cliente = cliente; // Asigna el cliente recibido
        this.plato = plato; // Asigna el plato recibido
    }
      // Metodo para obtener el id
    public int getId() {
    return id; // Retorna el id
    }
    
    // Método para mostrar el pedido
    public String mostrar() {
        return "ID: " + id + " - " + cliente + " pidio " + plato; // Retorna descripción del pedido
    }
}
