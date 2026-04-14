
package com.mycompany.restaurante;

import com.murcia.utils.Menu; // menú del profe
import com.murcia.utils.Input; // entrada de datos

public class Main {

    static Restaurante r = new Restaurante(); // crea el restaurante
    public static void main(String[] args) {

        final char Salir = '7';//opcion para salir
        //opciones del menú
        String[] opciones = {"1. Agregar plato", "2. Mostrar menu", "3. Hacer pedido", 
            "4. Atender pedido", "5. Mostrar pedidos", "6. Mostrar historial", "7. Salir"};
         // crea el menú usando el constructor
        Menu menu = new Menu(opciones, '1', "", "RESTAURANTE");
        char opcion; // variable 

        do {
            opcion = menu.select("Seleccione una opcion: "); // muestra menú y lee opción
            
            if(opcion == '1')agregarPlato();
            if(opcion == '2')mostrarMenu();
            if(opcion == '3')hacerPedido();
            if(opcion == '4')atenderPedido();
            if(opcion == '5')mostrarPedidos();
            if(opcion == '6')mostrarHistorial();
        } while(opcion != Salir); // repetir hasta salir
    }
     public static void agregarPlato() {//metodo
        String nombre = Input.nextLine("Nombre del plato: "); // leer nombre
        double precio = Input.nextInt("Precio: ", 0, 1000000); // leer precio
        r.agregarPlato(new Plato(nombre, precio)); // agregar
    }
    public static void mostrarMenu() {//metodo
        r.mostrarMenu(); 
    }
     public static void hacerPedido() {
        String cliente = Input.nextLine("Nombre cliente: "); // leer cliente
        String plato = Input.nextLine("Plato: "); // leer plato
        r.hacerPedido(new Pedido(cliente, plato)); 
    }
      public static void atenderPedido() {
        r.atenderPedido(); // atender pedido
    }
    public static void mostrarPedidos() {
        r.mostrarPedidos(); // mostrar cola
    }
    public static void mostrarHistorial() {
        r.mostrarHistorial(); // mostrar pila
    }
   }
        