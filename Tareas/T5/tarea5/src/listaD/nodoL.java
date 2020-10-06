
package listaD;
import arbolB.nodoB;

public class nodoL {
    private int dato;
    private nodoL siguiente, anterior;
    private nodoB izquierdo, derecho;
    
    public nodoL(int dato){
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
        this.izquierdo = null;
        this.derecho = null;
    }
    public nodoL(){
        
    }

    /**
     * @return the dato
     */
    public int getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(int dato) {
        this.dato = dato;
    }

    /**
     * @return the siguiente
     */
    public nodoL getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(nodoL siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public nodoL getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(nodoL anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the izquierdo
     */
    public nodoB getIzquierdo() {
        return izquierdo;
    }

    /**
     * @param izquierdo the izquierdo to set
     */
    public void setIzquierdo(nodoB izquierdo) {
        this.izquierdo = izquierdo;
    }

    /**
     * @return the derecho
     */
    public nodoB getDerecho() {
        return derecho;
    }

    /**
     * @param derecho the derecho to set
     */
    public void setDerecho(nodoB derecho) {
        this.derecho = derecho;
    }
    
}
