package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 @author AbransZ
 */
@Entity
public class Dueño implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Basic
    private String Nombre;
    private String Celular;
    private String Direciion;
    
    
    public Dueño() {
    }

    public Dueño(int id, String Nombre, String Celular, String Direciion) {
        this.id = id;
        this.Nombre = Nombre;
        this.Celular = Celular;
        this.Direciion = Direciion;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getDireciion() {
        return Direciion;
    }

    public void setDireciion(String Direciion) {
        this.Direciion = Direciion;
    }

    @Override
    public String toString() {
        return "Dueño: " 
                + "\nid: " + id 
                + "\n Nombre: " + Nombre 
                + "\n Celular: " + Celular 
                + "\n Direciion: " + Direciion;
    }
    
    
}
