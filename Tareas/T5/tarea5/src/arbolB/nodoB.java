package arbolB;


public class nodoB {
    private int claves[];  
    private int t;      //Minimo grado
    private nodoB hijos[];  
    private int n; //Clave que contiene actualmente    
    private boolean rama; 
    
    
    public nodoB(int t){
        n = 0;
        this.t = t;
        claves = new int[2*t-1];
        hijos = new nodoB[2*t];
    }
    
    public int buscar(int valor){
        for (int i = 0; i< this.getN();i++){
            if (this.getClaves()[i] == valor){
                return i;
            }
        }
        return -1;
    }

    /**
     * @return the claves
     */
    public int[] getClaves() {
        return claves;
    }

    /**
     * @param claves the claves to set
     */
    public void setClaves(int[] claves) {
        this.claves = claves;
    }

    /**
     * @return the t
     */
    public int getT() {
        return t;
    }

    /**
     * @param t the t to set
     */
    public void setT(int t) {
        this.t = t;
    }

    /**
     * @return the hijos
     */
    public nodoB[] getHijos() {
        return hijos;
    }

    /**
     * @param hijos the hijos to set
     */
    public void setHijos(nodoB[] hijos) {
        this.hijos = hijos;
    }

    /**
     * @return the n
     */
    public int getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(int n) {
        this.n = n;
    }

    /**
     * @return the rama
     */
    public boolean isRama() {
        return rama;
    }

    /**
     * @param rama the rama to set
     */
    public void setRama(boolean rama) {
        this.rama = rama;
    }
}