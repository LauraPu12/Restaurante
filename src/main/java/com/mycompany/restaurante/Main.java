
package com.mycompany.restaurante;
import com.murcia.utils.Menu; // importa la clase Menu de la libreria
import com.murcia.utils.Input; // importa clase para leer datos

public class Main {

    public static void main(String[] args) {
        Restaurante r = new Restaurante(); // crea el restaurante
        // crea el menu usando la libreria
        Menu menu = new Menu("MENU RESTAURANTE"); 

        menu.add("Agregar plato"); // opcion 1
        menu.add("Mostrar menu"); // opcion 2
        menu.add("Hacer pedido"); // opcion 3
        menu.add("Atender pedido"); // opcion 4
        menu.add("Mostrar pedidos"); // opcion 5
        menu.add("Mostrar historial"); // opcion 6
        menu.add("Salir"); // opcion 7

        int opcion; // variable opcion
        }
    do{
            opcion = menu.show(); // muestra menu y lee opcion

            switch(opcion){

                case 1: // agregar plato

                    String nombre = Input.readString("Nombre del plato: "); // leer nombre
                    double precio = Input.readDouble("Precio: "); // leer precio

                    r.agregarPlato(new Plato(nombre,precio)); // agrega plato
                break;
                case 2: // mostrar menu

                    r.mostrarMenu(); // imprime menu
                break;

                case 3: // hacer pedido

                    String cliente = Input.readString("Nombre cliente: "); // leer cliente
                    String plato = Input.readString("Plato: "); // leer plato

                    r.hacerPedido(new Pedido(cliente,plato)); // crear pedido
                break;

   
}
