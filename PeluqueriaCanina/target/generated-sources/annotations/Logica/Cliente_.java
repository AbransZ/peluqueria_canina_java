package Logica;

import Logica.Dueño;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-28T14:16:44", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> Raza;
    public static volatile SingularAttribute<Cliente, String> Alergias;
    public static volatile SingularAttribute<Cliente, String> NombreCli;
    public static volatile SingularAttribute<Cliente, Dueño> DueñoCli;
    public static volatile SingularAttribute<Cliente, String> Color;
    public static volatile SingularAttribute<Cliente, String> Observaciones;
    public static volatile SingularAttribute<Cliente, String> AtencionTipo;
    public static volatile SingularAttribute<Cliente, Integer> id;

}