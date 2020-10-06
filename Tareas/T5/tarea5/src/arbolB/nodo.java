
package arbolB;
import java.lang.Math.*;
  

public class nodo {
    private int grado, numClaves, numHijos,minClaves;
    private int[] claves;
    private nodoB hijos;
    private boolean rama;     
    
    public nodo(int grado){
        numHijos = grado;
        numClaves = numHijos-1;
        minClaves = (int)Math.ceil(((float)numHijos/2))-1;
        claves = new int[numHijos];
        hijos = new nodoB(grado);
        rama = true;
    }
    
    public int buscar (int  valor){
        
        for (int i=1;i<numClaves;i++){
            if (claves[i]==valor){
                return i;
            }
        }
        return -1;
    }
    
    public void imprimir(){
        for (int i=1;i<numClaves;i++){
            System.out.print(claves[i]+" - ");
        }
    }
}
