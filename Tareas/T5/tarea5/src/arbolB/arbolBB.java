
package arbolB;


public class arbolBB {
    nodoBB raiz; //Raíz del árbol
    int t; //Grado mínimo
    
    public arbolBB(int t){
        this.t = t;
        this.raiz = null;
    }
    
    public nodoBB buscar(int valor){
        if (raiz == null){
            return null;
        }else{
            return raiz.buscar(valor);
        }
    }
    
    public void traverse(){
        if (raiz != null){
            raiz.traverse();
        }
    }
    
    public void insertar(int valor){
        // Si el árbol esta vacio
        if (raiz == null) 
        { 
            raiz = new nodoBB(t, true); 
            raiz.claves[0] = valor;  // Insertar valor 
            raiz.n = 1;  // Actualizar número de claves en la raíz
        } 
        else // Si no esta vacio 
        { 
            // Si la raiz esta llena, el árbol crece hacia arriba
            if (raiz.n == 2*t-1) 
            { 
                // Crear nueva raíz
                nodoBB nRaiz = new nodoBB(t, false); 

                // Convertir antigua raiz en hijo de la nueva raiz
                nRaiz.hijos[0] = raiz; 

                // Llamar a función dividir en la antigua raiz
                nRaiz.dividir(0, raiz); 

                // Decidir el hijo que tendrá la nueva clave
                int i = 0; 
                if (nRaiz.claves[0] < valor) 
                    i++; 
                nRaiz.hijos[i].insertarNoFull(valor); 

                // Cambiar raiz 
                raiz = nRaiz; 
            } 
            else  // If root is not full, call insertNonFull for root 
                // Si la raiz no esta llena insertar con método de nonFull
                raiz.insertarNoFull(valor); 
        } 
    } 
    
}
