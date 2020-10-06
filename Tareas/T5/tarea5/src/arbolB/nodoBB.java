/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolB;

/**
 *
 * @author Jo
 */
public class nodoBB {
    int claves[];  // Array de claves
    int t;      // Mínimo número de claves 
    nodoBB hijos[]; // An array of child pointers 
    int n;     // Número actual de claves en el nodo
    boolean hoja; // Si el nodo es hoja o el raiz
    public nodoBB(int t, boolean hoja){
        //Inicializando variables
        this.t = t; 
        this.hoja = hoja; 
        this.n = 0;
        //Calcular número de claves e hijos
        this.claves = new int[2*t-1]; 
        this.hijos = new nodoBB[2*t];    
    }
    
    public void traverse(){
        int i = 0;
        for (i = 0; i < n; i++){
            if (!hoja){
                hijos[i].traverse();
                System.out.println(" "+claves[i]);
            }
        }
        if (!hoja){
            hijos[i].traverse();
        }
    }

    public nodoBB buscar(int valor) 
    { 
        // Clave más grande o igual que valor
        int i = 0; 
        while (i < n && valor > claves[i]) 
            i++; 

        // Si la clave es igual a la del nodo actual
        if (claves[i] == valor) 
            return this; 

        // Si la clave no se encuentra retornar null 
        if (hoja) 
            return null; 

        // retornar hijo que contiene el valor 
        return hijos[i].buscar(valor); 
    } 
    
    
}
