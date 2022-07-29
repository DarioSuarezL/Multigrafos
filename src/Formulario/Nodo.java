package Formulario;

public class Nodo {
    private int data;
    private Nodo link;
    private int peso;
    
    public Nodo(int data, int peso){
        this.data = data;
        this.link = null;
        this.peso = peso;
    }   
    
    public Nodo(){
        this.data = 0;
        this.link = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Nodo getLink() {
        return link;
    }

    public void setLink(Nodo link) {
        this.link = link;
    }
    
    public int getPeso(){
        return peso;
    }
    
    public void setPeso(int peso){
        this.peso = peso;
    }
    
}
