package proyecto_multigrafo;

public class Lista {
    private Nodo L;
    private int n;
    
    public Lista(){
        L = null;
        n = 0;
    }
    
    public boolean isVacia(){
        return (L == null);
    }
    
    public boolean Existe(int x, int peso){       
        Nodo p = L; 
        Nodo Ant = null;
        while((p != null && x > p.getData()) || (p != null && x == p.getData() && peso >= p.getPeso())){ //entra si llega p no es nulo y "x" es mayo al data de p... o si p no es nulo, "x" es la misma data de p, pero a la vez el peso sigue siendo mayor
            Ant = p;
            p = p.getLink();
        }
        
        return Ant != null && Ant.getData() == x && Ant.getPeso() == peso;
    }
    
    public void add(int x, int peso){
        Nodo Ant = null;
        Nodo p = L;
        
        while((p != null && x > p.getData()) || (p != null && x == p.getData() && peso >= p.getPeso())){ //entra si llega p no es nulo y "x" es mayo al data de p... o si p no es nulo, "x" es la misma data de p, pero a la vez el peso sigue siendo mayor
            Ant = p;
            p = p.getLink();
        }
        
        Nodo nuevo;
        if (Ant == null){
            nuevo = new Nodo(x, peso);
            nuevo.setLink(L);
            L = nuevo;
            n++;
        }
        else
            if (Ant.getData() != x || (x == Ant.getData() && peso > Ant.getPeso())){
                nuevo = new Nodo(x, peso);
                Ant.setLink(nuevo);
                nuevo.setLink(p);
                n++;
            }        
    }
    
    public void del(int x, int peso){
        Nodo Ant = null;
        Nodo p = L;
        
        while (p != null && x >= p.getData() && peso != p.getPeso()){
            Ant = p;
            p = p.getLink();
        }
        
        if (p != null && p.getData() == x && p.getPeso() == peso){  
            if (Ant == null)
                L = L.getLink();    
            else
                Ant.setLink(p.getLink());
            
            p.setLink(null);
            n--;    
        }        
    }
    
    public int length(){
        return n;
    }
    
    public int get(int k){       
        if (k < 0 || k > length() - 1) //Diverge con la PRE
            throw new RuntimeException("Lista.get: Índice " + k + ", fuera de rango.");
            
        Nodo p=L;
        for (int i = 1; i <= k; i++){           
            p = p.getLink();
        }
        
        return p.getData();
    }
    
    public Nodo getNodo(int k){
                if (k < 0 || k > length() - 1) //Diverge con la PRE
            throw new RuntimeException("Lista.get: Índice " + k + ", fuera de rango.");
            
        Nodo p=L;
        for (int i = 1; i <= k; i++){           
            p = p.getLink();
        }
        
        return p;
    }
    
    @Override
    public String toString(){ 
        String S = "[";
        String coma="";
       
        Nodo p  = L;
        while (p != null){
            S += coma + p.getData() + "/" + p.getPeso();
            coma=", ";
            p = p.getLink();
        }
       
       return S+"]";
    }
    
}
