
package com.mycompany.restaurante;


public class Pedido {
    
    String cliente; // Nombre del cliente
    String plato; // Nombre del plato pedido

    // Constructor vacío
    public Pedido() {
        // No inicializa atributos
    }

    // Constructor con parámetros
    public Pedido(String cliente, String plato) {
        this.cliente = cliente; // Asigna el cliente recibido
        this.plato = plato; // Asigna el plato recibido
    }
}
