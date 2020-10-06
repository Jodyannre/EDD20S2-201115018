
package principal;
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
        
        arbolBB t = new arbolBB(3);
        t.insertar(10); 
        t.insertar(20); 
        t.insertar(5); 
        t.insertar(6); 
        t.insertar(12); 
        t.insertar(30); 
        t.insertar(7); 
        t.insertar(17); 

        int k = 6; 
        if (t.buscar(k)!= null){
            System.out.println("Existe.");
        }else{
            System.out.println("No existe.");
        }

        k = 15; 
        if (t.buscar(k)!= null){
            System.out.println("Existe.");
        }else{
            System.out.println("No existe.");
        }        
    } 
}
