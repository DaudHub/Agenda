package logica;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
public class ListaTareas implements Serializable {
    
    ArrayList<Tarea> lista;

    public ListaTareas(){
        lista = new ArrayList<>();
    }
    public ListaTareas(ArrayList<Tarea> lista) {
        this.lista = lista;
    }

    public ArrayList<Tarea> getLista() {
        return lista;
    }
    
    public void setLista(ArrayList<Tarea> lista) {
        this.lista = lista;
    }
    
    public void agregar(Tarea t){
        lista.add(t);
    }
    public void agregar(int i, Tarea t){
        lista.add(i, t);
    }
    
    public void eliminar(int i){
        lista.remove(i);
    }
    public void eliminar(Tarea t){
        lista.remove(t);
    }
    
    public Tarea obtener(int i){
        return lista.get(i);
    }
    
    public int cantidad(){
        return lista.size();
    }
    
    public void ordenarPorPrioridad(){
        ArrayList<Integer> listaN = new ArrayList<>();
        ArrayList<Tarea> listaT = new ArrayList<>();
        Tarea tarea = new Tarea();
        for (Tarea t : lista) {
            listaN.add(t.getPrioridad());
        }
        Collections.sort(listaN);
        for (int n : listaN) {
            for(Tarea t : lista){
                if(t.getPrioridad() == n){
                    tarea = t;
                    
                }
            }
            listaT.add(tarea);
        }
        lista = listaT;
    }

        public Tarea buscar(String nombre){
        Tarea tarea = new Tarea();
        for(Tarea t : lista){
            if(t.getNombre().equals(nombre)){
                tarea = t;
            }
        }
        return tarea;
    }
        
    @Override
    public String toString() {
        return "ListaTareas{" + "lista=" + lista + '}';
    }
    
}
