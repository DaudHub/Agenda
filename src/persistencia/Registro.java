package persistencia;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import logica.ListaContactos;
import logica.ListaTareas;

public class Registro {
    
    static Registro instancia;
    final String pathTareas;
    final String pathContactos;
    
    public Registro(){
        pathTareas = "ListaTareas.dat";
        pathContactos = "ListaContactos.dat";
    }
    
    public static Registro getInstancia(){
        if(instancia == null) 
            instancia = new Registro();
        return instancia;
    }
    
    public void setTareas(ListaTareas lista){
        try{
            FileOutputStream fos = new FileOutputStream(pathTareas);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(lista);
            fos.close();
            oos.close();
        }catch(Exception e){
            System.err.println(e);
        }
    }
    
    public ListaTareas getTareas(){
        ListaTareas lista = new ListaTareas();
        try{
            FileInputStream fis = new FileInputStream(pathTareas);
            ObjectInputStream ois = new ObjectInputStream(fis);
            lista = (ListaTareas) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception e){
            System.out.println(e);
        }
        return lista;
    }
    
    public void setContactos(ListaContactos lista){
        try{
            FileOutputStream fos = new FileOutputStream(pathContactos);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(lista);
            fos.close();
            oos.close();
        }catch(Exception e){
            System.err.println(e);
        }
    }
    
    public ListaContactos getContactos(){
        ListaContactos lista = new ListaContactos();
        try{
            FileInputStream fis = new FileInputStream(pathContactos);
            ObjectInputStream ois = new ObjectInputStream(fis);
            lista = (ListaContactos) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception e){
            System.out.println(e);
        }
        return lista;
    }
    
}
