
package principal;
import listaD.*;
import java.math.*;
import arbolB.*;

public class main {
    public static void main(String[]args){
        /*
        listaD lista = new listaD(3);
        lista.insertar(2);
        System.out.println(lista.getSize());
        lista.insertar(3);
        System.out.println(lista.getSize());
        lista.insertar(1);
        System.out.println(lista.getSize());
        lista.insertar(25);
        System.out.println(lista.getSize());
        lista.insertar(12);
        System.out.println(lista.getSize());
        lista.insertar(112);
        System.out.println(lista.getSize());
        lista.insertar(32);
        System.out.println(lista.getSize());
        lista.imprimir();
        int eliminado = lista.eliminar(6);
        System.out.println(eliminado);
        lista.imprimir();
        eliminado = lista.eliminar(5);
        System.out.println(eliminado);
        lista.imprimir();   
        */
        
        arbolB arbol = new arbolB(3);
        arbol.insertar(8);
        arbol.insertar(9);
        arbol.insertar(10);
        arbol.insertar(11);
        arbol.insertar(15);
        arbol.insertar(20);
        arbol.insertar(17);
        arbol.imprimir();
    } 
}
