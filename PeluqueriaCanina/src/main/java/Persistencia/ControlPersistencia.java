package Persistencia;

import Logica.Cliente;
import Logica.Dueño;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 @author AbransZ
 */
public class ControlPersistencia {
    ClienteJpaController cliJPA =new ClienteJpaController();
    DueñoJpaController DueJPA= new DueñoJpaController();
    
   

    public void GuardarBD(Dueño dueño, Cliente mascota) {
       
        //crear tabla dueño en bd
        DueJPA.create(dueño);
        
        //crear tabla mascota en la bd
       cliJPA.create(mascota);
    }

    public List<Cliente> MostrarMascota() {
       
        return cliJPA.findClienteEntities() ;
    }

    public void BorrarBD(int num_mascota) {
        try
        {
            cliJPA.destroy(num_mascota);
        } catch (NonexistentEntityException ex)
        {
            Logger.getLogger(ControlPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   

    public Cliente mostrarMAsco(int id) {
        return cliJPA.findCliente(id);
    }

    public Dueño buscardueño(int id) {
        return DueJPA.findDueño(id);
    }

    public void ModificaDue(Dueño dueño) {
        try
        {
            DueJPA.edit(dueño);
        } catch (Exception ex)
        {
            Logger.getLogger(ControlPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarMascota(Cliente mascota) {
        try
        {
            cliJPA.edit(mascota);
        } catch (Exception ex)
        {
            Logger.getLogger(ControlPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            
            System.out.println("Este es el error que pone todo null");
        }
    }

  
    
    
}
