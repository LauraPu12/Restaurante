
package com.mycompany.restaurante;
import java.util.Scanner; // permite leer datos del usuario


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // objeto para leer teclado
        Restaurante r = new Restaurante(); // crea el restaurante
        
         int opcion; // variable para guardar la opción

        do{
            System.out.println("\n--- MENU RESTAURANTE ---");
            System.out.println("1. Agregar plato");
            System.out.println("2. Mostrar menu");
            System.out.println("3. Hacer pedido");
            System.out.println("4. Atender pedido");
            System.out.println("5. Mostrar pedidos");
            System.out.println("6. Mostrar historial");
            System.out.println("0. Salir");

            opcion = sc.nextInt(); // lee la opción
            sc.nextLine(); // limpia buffer
            
            switch(opcion){
                case 1:
                    System.out.println("Nombre del plato:");
                    String nombre = sc.nextLine(); // lee nombre
                    System.out.println("Precio:");
                    double precio = sc.nextDouble(); // lee precio
                    r.agregarPlato(new Plato(nombre,precio)); // agrega plato
                break;
                case 2:
                    r.mostrarMenu(); // muestra menú
                break;
                case 3:
                    System.out.println("Nombre del cliente:");
                    String cliente = sc.nextLine(); // lee cliente

                    System.out.println("Plato:");
                    String plato = sc.nextLine(); // lee plato

                    r.hacerPedido(new Pedido(cliente,plato)); // crea pedido
                break;
                case 4:
                    r.atenderPedido(); // atiende el pedido
                break;
                case 5:
                    r.mostrarPedidos(); // muestra pedidos en cola
                break;
                case 6:
                    r.mostrarHistorial(); // muestra historial
                break;

            }

        }while(opcion != 0); // repite hasta que el usuario salga
        
        }
   
}
