
package com.mycompany.restaurante;

import com.murcia.utils.Menu; // menú del profe
import com.murcia.utils.Input; // entrada de datos

public class Main {

    public static void main(String[] args) {

        Restaurante r = new Restaurante(); // crea el restaurante

        // arreglo con las opciones del menú
        String[] opciones = {
            "1. Agregar plato",
            "2. Mostrar menu",
            "3. Hacer pedido",
            "4. Atender pedido",
            "5. Mostrar pedidos",
            "6. Mostrar historial",
            "7. Salir"
        };
         // crea el menú usando el constructor correcto
        Menu menu = new Menu(opciones, '1', "-", "MENU RESTAURANTE");
        char opcion; // variable 

        do {
            opcion = menu.select("Seleccione una opción: "); // muestra menú y lee opción

            switch(opcion){

                case '1': // agregar plato
                    String nombre = Input.nextLine("Nombre del plato: "); // leer nombre
                    double precio = Input.nextInt("Precio: ", 0, 1000000); // leer precio
                    r.agregarPlato(new Plato(nombre, precio)); // agregar plato
                break;
    }
}
        