package IGU;

import Logica.Cliente;
import Logica.Controladora;

import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 @author AbransZ
 */
public class VerDatos extends javax.swing.JFrame {

    /**
     * Creates new form VerDatos
     */
    Controladora control = null;

    public VerDatos() {
        control = new Controladora();

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Snap ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Datos Solicitados");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblDatos);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnEditar)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        CargaTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        //validacion que no este la tabla vacia
        if (tblDatos.getRowCount() > 0)
        {
            //validacion que haya seleccionado alguna fila
            if (tblDatos.getSelectedRow() != -1)
            {

                int num_mascota = Integer.parseInt(String.valueOf(tblDatos.getValueAt(tblDatos.getSelectedRow(), 0)));

                control.borrarMascota(num_mascota);
                CargaTabla();
                
                MensajesDialog("Borrado correcot", "Borrar", "info");

            }else{
            MensajesDialog("Seleccione una mascota", "ERROR", "error");
            }
        }else{
            MensajesDialog("Tabla vacia", "Error", "error");
        }

        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        
        //validacion que no este la tabla vacia
        if (tblDatos.getRowCount() > 0)
        {
            //validacion que haya seleccionado alguna fila
            if (tblDatos.getSelectedRow() != -1)
            {  
                int num_mascota = Integer.parseInt(String.valueOf(tblDatos.getValueAt(tblDatos.getSelectedRow(), 0)));
                
                Edit_Patitas1 editar =new Edit_Patitas1(num_mascota);
                editar.setVisible(true);
                editar.setLocationRelativeTo(null);
                this.dispose();
                
                
                
                
                //MensajesDialog("Modificacion realizada", "Modificar", "edit");

            }
            else{
            MensajesDialog("Seleccione una mascota", "ERROR", "error");
            }
        }
        else{
            MensajesDialog("Tabla vacia", "Error", "error");
        }
    }//GEN-LAST:event_btnEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatos;
    // End of variables declaration//GEN-END:variables

    public void MensajesDialog(String msj, String Titulo, String tipo) {

        JOptionPane OptionPane = new JOptionPane(msj);

        if (tipo.equals("info"))
        {
            OptionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);

        } else if (tipo.equals("error"))
        {
            OptionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }

        JDialog dialog = OptionPane.createDialog(Titulo);

        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

    private void CargaTabla() {

        DefaultTableModel modeloTabla = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        //nombre de columnas
        String NombreColumna[] =
        {
            "ID", "Nombre", "Raza", "Color", "Alergias", "Atencion Esp", "Observaciones", "Dueño", "Celular", "Direccion"
        };
        modeloTabla.setColumnIdentifiers(NombreColumna);

        //Cargar datos a la tabla
        List<Cliente> ListaMascotas = control.traerMascota();

        if (ListaMascotas != null)
        {

            for (Cliente mascota : ListaMascotas)
            {

                Object[] objeto =
                {
                    mascota.getId(), mascota.getNombreCli(),
                    mascota.getRaza(), mascota.getColor(), mascota.getAlergias(),
                    mascota.getAtencionTipo(), mascota.getObservaciones(),
                    mascota.getDueñoCli().getNombre(), mascota.getDueñoCli().getCelular(), mascota.getDueñoCli().getDireciion()
                };

                modeloTabla.addRow(objeto);
            }
        }
        tblDatos.setModel(modeloTabla);
    }

   

}
