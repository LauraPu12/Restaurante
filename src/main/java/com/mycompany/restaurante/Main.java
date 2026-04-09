
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

    

        }
        }
        }