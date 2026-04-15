//funciona el pull 1
package com.mycompany.restaurante;

public class Plato {
    String nombre; // Guarda el nombre del plato
    double precio; // Guarda el precio del plato

    // Constructor vacío
    public Plato() {

    }

    // Constructor con parámetros
    public Plato(String nombre, double precio) {
        this.nombre = nombre; // Asigna el nombre recibido
        this.precio = precio; // Asigna el precio recibido
    }
      // Método mostrar el plato
    public String mostrar() {
        return nombre + " - $" + precio; // Retorna texto del plato con nombre y precio
    }
}
