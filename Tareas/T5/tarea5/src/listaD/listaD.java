
package listaD;

public class listaD {
    private int size, claves;
    private nodoL cabeza,ultimo;
    
    public listaD(int claves){
        this.claves = claves;
        this.size = 0;
        cabeza = null;
        ultimo = null;
    }
    
    //Insertar números en orden
    public void insertar(int dato){
        if (getCabeza() == null){
            setCabeza(new nodoL(dato));
            setUltimo(getCabeza());
            this.size++;
        }
        else{
            nodoL aux = cabeza;
            while (aux != null){
                if (dato > aux.getDato()){
                    aux = aux.getSiguiente();
                }else{
                    nodoL nuevo = new nodoL(dato);
                    nuevo.setSiguiente(aux);
                    nuevo.setAnterior(aux.getAnterior());
                    if (aux.getAnterior()!= null){
                        aux.getAnterior().setSiguiente(nuevo);
                    }
                    aux.setAnterior(nuevo);
                    if (aux == cabeza){
                        cabeza = nuevo;
                    }
                    this.size++;
                    return;
                }
                if (aux == null){
                    nodoL nuevo = new nodoL(dato);
                    ultimo.setSiguiente(nuevo);
                    nuevo.setAnterior(ultimo);
                    ultimo = nuevo;
                    this.size++;
                    return;
                }
            }
        }
    }
    
    public void imprimir(){
        nodoL aux = getCabeza();
        while (aux != null){
            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }
    }
    
    public int eliminar(int posicion){
        int contador = 0;
        nodoL aux = this.cabeza;
        while (contador != posicion){
            aux = aux.getSiguiente();
            contador++;
            if (aux == null){
                return -1;
            }
        }
        if (aux == cabeza && cabeza != ultimo){
            nodoL sig = cabeza.getSiguiente();
            if (sig != null){
                sig.setAnterior(null);
                aux.setSiguiente(null);
                cabeza = sig; 
                size--;
                return aux.getDato();
            }else{
                cabeza = null;
                ultimo = null;
                size--;
                return aux.getDato();
            }

        }
        else if (cabeza == ultimo){
            cabeza = null;
            ultimo = null;
            size--;
            return aux.getDato();
        }else if (aux == ultimo){
            nodoL ant = ultimo.getAnterior();
            ant.setSiguiente(null);
            ultimo.setAnterior(null);
            ultimo = ant;
            size--;
            return aux.getDato();
        }else{
            nodoL ant = aux.getAnterior();
            nodoL sig = aux.getSiguiente();
            ant.setSiguiente(sig);
            sig.setAnterior(ant);
            aux.setSiguiente(null);
            aux.setAnterior(null);
            size--;
            return aux.getDato();
        }
        
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the claves
     */
    public int getClaves() {
        return claves;
    }

    /**
     * @param claves the claves to set
     */
    public void setClaves(int claves) {
        this.claves = claves;
    }

    /**
     * @return the cabeza
     */
    public nodoL getCabeza() {
        return cabeza;
    }

    /**
     * @param cabeza the cabeza to set
     */
    public void setCabeza(nodoL cabeza) {
        this.cabeza = cabeza;
    }

    /**
     * @return the ultimo
     */
    public nodoL getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(nodoL ultimo) {
        this.ultimo = ultimo;
    }
}
