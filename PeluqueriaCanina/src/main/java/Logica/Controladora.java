package Logica;

import Persistencia.ControlPersistencia;
import java.util.List;

/*
 @author AbransZ
 */
public class Controladora {

    ControlPersistencia controP = new ControlPersistencia();
    Dueño dueño = new Dueño();
    Cliente mascota = new Cliente();

    public void guardar(String nombreMascota, String Raza, String Color,
            String Alergias, String Cuidados, String Observaciones,
            String nombreDueño, String Celular, String Direccion) {

        dueño.setNombre(nombreDueño);
        dueño.setCelular(Celular);
        dueño.setDireciion(Direccion);

        mascota.setNombreCli(nombreMascota);
        mascota.setRaza(Raza);
        mascota.setColor(Color);
        mascota.setObservaciones(Observaciones);
        mascota.setAlergias(Alergias);
        mascota.setAtencionTipo(Cuidados);
        mascota.setDueñoCli(dueño);

        controP.GuardarBD(dueño, mascota);

    }

    public List<Cliente> traerMascota() {

        return controP.MostrarMascota();
    }
    
    public Cliente mostrarMascota(int id){
    return controP.mostrarMAsco( id);
    }

    public void borrarMascota(int num_mascota) {
        controP.BorrarBD(num_mascota);
    }

   

    public void editar(Cliente masco, String nombreMascota, String Raza, 
            String Color, String Alergias, String Cuidados, String Observaciones,
            String nombreDueño, String Celular, String Direccion) {
        

        masco.setNombreCli(nombreMascota);
        masco.setRaza(Raza);
        masco.setColor(Color);
        masco.setObservaciones(Observaciones);
        masco.setAlergias(Alergias);
        masco.setAtencionTipo(Cuidados);
         
        
        controP.editarMascota(masco);
        
        Dueño dueño1 = this.bucarDueño(masco.getDueñoCli().getId());
        
        dueño1.setNombre(nombreDueño);
        dueño1.setCelular(Celular);
        dueño1.setDireciion(Direccion);
        
        this.ModificarDueño(dueño1);
    }

  

     private Dueño bucarDueño(int id) {
       return controP.buscardueño(id);
    }

    private void ModificarDueño(Dueño dueño) {
        controP.ModificaDue(dueño);
    }

}
