package logica;
import java.io.Serializable;
import java.util.ArrayList;

public class Tarea implements Serializable {
    
    private String nombre;
    private int prioridad;
    private Fecha vencimiento;
    private boolean pendiente;
    private Contacto contacto;
    private ArrayList<Tarea> subtareas;
    
    public Tarea(){}
    
    public Tarea(String nombre, int prioridad, Fecha vencimiento, boolean pendiente, Contacto contacto){
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.vencimiento = vencimiento;
        this.pendiente = pendiente;
        this.contacto = contacto;
        this.subtareas = new ArrayList<>();
    }

    public ArrayList<Tarea> getSubtareas() {
        return subtareas;
    }

    public void setSubtareas(ArrayList<Tarea> subtareas) {
        this.subtareas = subtareas;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public Fecha getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Fecha vencimiento) {
        this.vencimiento = vencimiento;
    }

    public boolean isPendiente() {
        return pendiente;
    }

    public void setPendiente(boolean pendiente) {
        this.pendiente = pendiente;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }
    
    public String traducirPrioridad(){
        String s = null;
        switch(prioridad){
            case 1: s = "Alta"; break;
            case 2: s = "Media"; break;
            case 3: s = "Baja"; break;
        }
        return s;
    }
    public static int traducirPrioridad(String s){
        int n = 3;
        switch(s){
            case "Alta": n = 1; break;
            case "Media": n = 2; break;
            case "Baja": n = 3; break;
        }
        return n;
    }
    
    public String traducirPendiente(){
        String s = null;
        if (pendiente)
            s = "Pendiente";
        else
            s = "Realizada";
        return s;
    }

    @Override
    public String toString() {
        return "Tarea{" + "nombre=" + nombre + ", prioridad=" + prioridad + ", vencimiento=" + vencimiento + ", pendiente=" + pendiente + ", contacto=" + contacto + "hashcode=" + this.hashCode() + '}';
    }
    
}
