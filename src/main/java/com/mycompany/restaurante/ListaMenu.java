
package com.mycompany.restaurante;

import com.murcia.utils.ListaEnlazada;

 class ListaMenu extends ListaEnlazada<Plato> { //clase que representa el menu heredado
     
    public void agregarPlato(Plato p){ //metodo para agregar plato al menu
        addLast(p); //usar metodo de la clase ListaEnlazada heredada para gregar al final
    }
}
