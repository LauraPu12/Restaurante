
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
    }
}