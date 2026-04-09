
package com.mycompany.restaurante;

import com.murcia.utils.Menu; // menú del profe
import com.murcia.utils.Input; // entrada de datos

public class Main {

    public static void main(String[] args) {

        Restaurante r = new Restaurante(); // crea el restaurante

        //opciones del menú
        String[] opciones = {"1. Agregar plato", "2. Mostrar menu", "3. Hacer pedido", 
            "4. Atender pedido", "5. Mostrar pedidos", "6. Mostrar historial", "7. Salir"};
         // crea el menú usando el constructor
        Menu menu = new Menu(opciones, 'M', "", "MENU RESTAURANTE");
        char opcion; // variable 

        do {
            opcion = menu.select("Seleccione una opción: "); // muestra menú y lee opción
            switch(opcion){

                case '1': // agregar plato
                    String nombre = Input.nextLine("Nombre del plato: "); // leer nombre
                    double precio = Input.nextInt("Precio: ", 0, 1000000); // leer precio
                    r.agregarPlato(new Plato(nombre, precio)); // agregar plato
                break;
                 case '2': // mostrar menú
                    r.mostrarMenu(); // imprime menú
                break;
                case '3': // hacer pedido
                    String cliente = Input.nextLine("Nombre cliente: "); // leer cliente
                    String plato = Input.nextLine("Plato: "); // leer plato
                    r.hacerPedido(new Pedido(cliente, plato)); // crear pedido
                break;
                case '4': // atender pedido
                    r.atenderPedido(); // atiende pedido
                break;
                case '5': // mostrar pedidos
                    r.mostrarPedidos(); // muestra cola
                break;
                case '6': // mostrar historial
                    r.mostrarHistorial(); // muestra pila
                break;
            }
        } while(opcion != '7'); // repetir hasta salir
    }
   }
        