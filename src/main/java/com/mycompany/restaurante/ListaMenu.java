
package com.mycompany.restaurante;

import com.murcia.utils.ListaEnlazada;
import com.murcia.utils.Nodo;

 class ListaMenu extends ListaEnlazada<Plato> { //clase que representa el menu heredado
     
    public void agregarPlato(Plato p){ //metodo para agregar plato al menu
        addLast(p); //usar metodo de la clase ListaEnlazada heredada para gregar al final
    }
    public void mostrarMenu(){ 
        Nodo<Plato>actual=head; //empieza desde el primero
        
        while(actual!=null){ //para recorrer la lista
            Plato p= actual.getData(); //usar getData (Nodo) para obtener el plato
            System.out.println(p.mostrar()); //imprimir el dato usando mostrar
            actual=actual.getNext(); //usar getNext para avanzar
        }
    }
}
