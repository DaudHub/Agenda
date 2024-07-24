package logica;

import java.io.Serializable;

public class Contacto implements Serializable{
    String nombre;
    String mail;
    int numero;
    String direccion;

    public Contacto() {
        nombre = "Ninguno";
    }

    public Contacto(String nombre, String mail, int numero, String direccion) {
        this.nombre = nombre;
        this.mail = mail;
        this.numero = numero;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", mail=" + mail + ", numero=" + numero + ", direccion=" + direccion + '}';
    }
    
    
    
}
