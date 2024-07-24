package logica;
import java.io.Serializable;
import java.util.ArrayList;

public class ListaContactos implements Serializable{

    ArrayList<Contacto> listaC;
    
    public ListaContactos(){
        listaC = new ArrayList<>();
    }

    public ArrayList<Contacto> getLista() {
        return listaC;
    }

    public void setLista(ArrayList<Contacto> listaC) {
        this.listaC = listaC;
    }
    
    

    public void agregar(Contacto c){
        listaC.add(c);
    }
    public void agregar(int i, Contacto c){
        listaC.add(i, c);
    }
    
    public void eliminar(int i){
        listaC.remove(i);
    }
    public void eliminar(Contacto c){
        listaC.remove(c);
    }
    
    public Contacto obtener(int i){
        return listaC.get(i);
    }
    
    public int cantidad(){
        return listaC.size();
    }
    
    public Contacto buscar(String nombre){
        Contacto con = new Contacto();
        for(Contacto c : listaC){
            if(c.getNombre().equals(nombre)){
                con = c;
            }
        }
        return con;
    }

    @Override
    public String toString() {
        return "ListaContactos{" + "listaC=" + listaC + '}';
    }
    
    
}
