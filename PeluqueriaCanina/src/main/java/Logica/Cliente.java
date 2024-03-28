package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


/*
 @author AbransZ
 */
@Entity
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Basic
    private String NombreCli;
    private String Raza;
    private String Color;
    private String Alergias;
    private String AtencionTipo;
    private String Observaciones;
    
    @OneToOne
    private Dueño DueñoCli;
    

    public Cliente() {
    }

    public Cliente(int id, String NombreCli, String Raza, String Color, String Alergias, String AtencionTipo, String Observaciones, Dueño DueñoCli) {
        this.id = id;
        this.NombreCli = NombreCli;
        this.Raza = Raza;
        this.Color = Color;
        this.Alergias = Alergias;
        this.AtencionTipo = AtencionTipo;
        this.Observaciones = Observaciones;
        this.DueñoCli = DueñoCli;
    }

    public Dueño getDueñoCli() {
        return DueñoCli;
    }

    public void setDueñoCli(Dueño DueñoCli) {
        this.DueñoCli = DueñoCli;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCli() {
        return NombreCli;
    }

    public void setNombreCli(String NombreCli) {
        this.NombreCli = NombreCli;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getAlergias() {
        return Alergias;
    }

    public void setAlergias(String Alergias) {
        this.Alergias = Alergias;
    }

    public String getAtencionTipo() {
        return AtencionTipo;
    }

    public void setAtencionTipo(String AtencionTipo) {
        this.AtencionTipo = AtencionTipo;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    @Override
    public String toString() {
        return "Cliente: " 
                + "\nid: " + id 
                + "\n Nombre de cliente: " + NombreCli 
                + "\n Raza: " + Raza 
                + "\n Color: " + Color 
                + "\n Alergias: " + Alergias 
                + "\n AtencionTipo: " + AtencionTipo 
                + "\n Observaciones: " + Observaciones;
    }

  
    
    
}
