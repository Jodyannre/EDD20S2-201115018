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
        int i;
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
    
    public void dividir(int valor,nodoBB actual){
        // Nuevo nodo para guardar las claves de actual t-1
        nodoBB z = new nodoBB(actual.t, actual.hoja); 
        z.n = t - 1; 

        // Copiar las últimas (t-1) claves de actual a z
        for (int j = 0; j < t-1; j++) 
            z.claves[j] = actual.claves[j+t]; 

        // Copiar los últimos t hijos de actual hacía z 
        if (actual.hoja == false) 
        { 
            for (int j = 0; j < t; j++) 
                z.hijos[j] = actual.hijos[j+t]; 
        } 

        // Reducir el número de claves en actual
        actual.n = t - 1; 

        // Si el nodo debe tener un nuevo hijo 
        // Crear espacio para el nuevo hijo
        for (int j = n; j >= valor+1; j--) 
            hijos[j+1] = hijos[j]; 

        // Enlazar el nuevo hijo a este nodo
        hijos[valor+1] = z; 

        // Encontrar la posición de la clave en actual que será movida a este 
        //nodo y luego mover las claves mayores un espacio
        for (int j = n-1; j >= valor; j--) 
            claves[j+1] = claves[j]; 

        // Copiar la clave del medio de actual a este nuevo nodo
        claves[valor] = actual.claves[t-1]; 

        // Incrimentar el conteo de hijos en el nodo
        n = n + 1; 
    } 

    public void insertarNoFull(int valor){
        // Inicialización del índice utilizando el índice del último hijo
        int i = n-1; 

        // Si es hoja
        if (hoja == true) 
        { 
            // Encontrar el lugar para la nueva clave y reubicar las demás claves
            while (i >= 0 && claves[i] > valor) 
            { 
                claves[i+1] = claves[i]; 
                i--; 
            } 

            // Insertar la nueva clave 
            claves[i+1] = valor; 
            n = n+1; 
        } 
        else // Si no es hoja
        {  
            // Buscar el hijo que tendrá la nueva clave
            while (i >= 0 && claves[i] > valor) 
                i--; 

            // Verificar si el hijo esta lleno
            if (hijos[i+1].n == 2*t-1) 
            { 
                // Dividir el hijo si esta lleno
                dividir(i+1, hijos[i+1]); 

                // La clave intermedia de la división sube al padre e insertar la nueva clave
                // En uno de los hijos partidos
                if (claves[i+1] < valor) 
                    i++; 
            } 
            hijos[i+1].insertarNoFull(valor); 
        }         
       
    }
}
