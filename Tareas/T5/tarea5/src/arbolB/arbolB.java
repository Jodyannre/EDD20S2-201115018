package arbolB;

public class arbolB {
    private int t;
    private nodoB raiz;
    public arbolB(int t){
        this.t = t;
        raiz = new nodoB(t);
        raiz.setRama(true);
    }
    
    public void dividir(nodoB n, nodoB m, int pos){
        nodoB aux = new nodoB(t);
        aux.setRama(m.isRama());
        aux.setN(t-1);
        for (int i = 0; i<t-1;i++){
            aux.getClaves()[i]= m.getClaves()[i+t];
        }
        if (!m.isRama()) {
          for (int i = 0; i < t; i++) {
            aux.getHijos()[i] = m.getHijos()[i + t];
          }
        }
        m.setN(t-1);;
        for (int i = n.getN(); i >= pos + 1; i--) {
          n.getHijos()[i + 1] = n.getHijos()[i];
        }
        n.getHijos()[pos + 1] = aux;

        for (int i = n.getN() - 1; i >= pos; i--) {
          n.getClaves()[i + 1] = n.getClaves()[i];
        }
        n.getClaves()[pos] = m.getClaves()[t - 1];
        n.setN(n.getN()+1);
    }
    
    public void insertar(int valor) {
      nodoB nuevo = raiz;
      if (nuevo.getN() == 2 * t - 1) {
        nodoB s = new nodoB(t);
        raiz = s;
        s.setRama(false);
        s.setN(0);
        s.getHijos()[0] = nuevo;
        dividir(s,nuevo,0);
        insertar(s, valor);
      } else {
        insertar(nuevo, valor);
      }
    }
    private void insertar(nodoB x, int valor) {

      if (x.isRama()) {
        int i = 0;
        for (i = x.getN() - 1; i >= 0 && valor < x.getClaves()[i]; i--) {
          x.getClaves()[i + 1] = x.getClaves()[i];
        }
        x.getClaves()[i + 1] = valor;
        x.setN(x.getN()+ 1);
      } else {
        int i = 0;
        //for (i = x.getN() - 1; i >= 0 && valor < x.getClaves()[i]; i--) {
        //}
        //;
        //i++;
        nodoB temp = x.getHijos()[i];
        if (temp.getN() == 2 * t - 1) {
          dividir(x, temp, i);
          if (valor > x.getClaves()[i]) {
            i++;
          }
        }
        insertar(x.getHijos()[i], valor);
      }

    }
    
    public void imprimir(){
        imprimir(raiz);
    }
    
    private void imprimir(nodoB actual){
        assert (actual==null);
        for (int i = 0; i < actual.getN(); i++) {
          System.out.print(actual.getClaves()[i] + " ");
        }
        if (!actual.isRama()) {
          for (int i = 0; i < actual.getN() + 1; i++) {
            imprimir(actual.getHijos()[i]);
          }
        }        
    }
}

