
package arbolB;


public class arbolBB {
    nodoBB raiz; //Raíz del árbol
    int t; //Grado mínimo
    
    public arbolBB(int t){
        this.t = t;
        this.raiz = null;
    }
    
    public nodoBB buscar(int valor){
        return null;
    }
    
    public void traversee(){
        if (raiz != null){
            raiz.traverse();
        }
    }
    
    public void insertar(int valor){
        //Árbol vacio
        if (raiz == null){
            nodoBB nuevo = new nodoBB(t,true);
            raiz.claves[0]= valor; //Insertar
            raiz.n = 1; //Actualizar número de claves insertadas
        }
        else{
            //Raiz llena
            if(raiz.n == 2*t-1){
                nodoBB nuevo = new nodoBB(t,false);
                //Asignar antigua raíz como hijo de la nueva raíz
                nuevo.hijos[0] = raiz;
                
                //Separar la raíz llena y mover el nodo indicado a la nueva raíz
                
            }
        }
    }
    
    public void dividir(int valor,nodoBB nodo){
        
    }
}
