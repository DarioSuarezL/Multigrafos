package proyecto_multigrafo;

public class Multigrafo {
    private static final int MAXVERTEX = 49;
    
    private Lista V[];
    private String Nombre[];
    private int n;
    private boolean marca[];
    
    public Multigrafo(){
        V = new Lista[MAXVERTEX+1];
        Nombre = new String[MAXVERTEX+1];
        n = -1;
        marca = new boolean[MAXVERTEX+1];
    }
    
    public boolean nombreValido(String name){
        for (int i = 0; i < cantVertice(); i++) 
            if(Nombre[i].equals(name))
                return false;
        return true;
    }
    
    public void addVertice(String name){
        if(n == MAXVERTEX || !nombreValido(name))
            return;
        n++;
        Nombre[n] = name;
        V[n] = new Lista();
    }
    
    public int cantVertice(){
        return n+1;
    }
    
    public boolean isVerticeValido(int v){
        return(0 <= v && n >= v);
    }
    
    private boolean isVerticeValido(int v, String metodo){
        boolean b = isVerticeValido(v);
        if (!b)
            System.err.println("Grafo."+metodo+": " + v + " no es un vértice del Grafo " + getIndicacion());

        return b;
    }
    
    private String getIndicacion(){  //Corrutina de boolean isVerticeValido(int, String)
        switch (cantVertice()){
            case 0  :   return "(el grafo no tiene vértices). ";
            case 1  :   return "(el 0 es el único vértice). ";
            case 2  :   return "(0 y 1 son los únicos vértices). ";
            default :   return "(los vértices van de 0 a " + (cantVertice()-1) + "). "; 
        }
    }
    
    public int nombreVertice(String name){
        for(int i = 0; i <=n; i++)
            if(Nombre[i].equals(name))
                return i;
        return -1;
    }
    
    public void delArista(String u,int peso ,String v){
        String metodo="delArista";
        int uVert = nombreVertice(u);
        int vVert = nombreVertice(v);
        if (!isVerticeValido(uVert, metodo) || !isVerticeValido(vVert, metodo))
            return;
        
        V[uVert].del(vVert,peso);
    }
    
    public void addArista(String u, int peso, String v){
        if(peso <= 0){
            System.err.println("Grafo.addArista:  El peso debe ser mayor que cero");
            return;
        }
        int uVert = nombreVertice(u);
        int vVert = nombreVertice(v);
        String metodo = "addArista";
        if(!isVerticeValido(uVert,metodo) || !isVerticeValido(vVert,metodo))
            return;
        V[uVert].add(vVert, peso);            
    }
    
    public String printListas(){ 
        String cad="";
        if (cantVertice()==0)
            return "(Grafo vacío)";
        else{
            for (int i = 0; i <= n; i++) {
                cad += Nombre[i]+": V["+i+"]-->"+V[i]+"\n";
            }      
        }
        return cad;
    }

// METODOS DE MARCADO
    
    private void marcar(int u){
        if (isVerticeValido(u))
           marca[u] = true; 
    }

    private void desmarcarTodos(){
        for (int i = 0; i <= n; i++) {
            marca[i] = false;  
        }
    }
    
    private void desmarcar(int u){
        if (isVerticeValido(u))
           marca[u] = false; 
    }
    
    private boolean isMarcado(int u){   //Devuelve true sii el vertice u está marcado.
        return marca[u]; 
    }
    
}
