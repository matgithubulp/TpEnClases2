
package tpenclases2.Vista;
import tpenclases2.Empresa;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import tpenclases2.Empleado;
import tpenclases2.Empresa;

public class VistaPrincipal extends javax.swing.JFrame {

    private ArrayList<Empresa> empresas = new ArrayList<>();
    public VistaPrincipal() {
        initComponents();
    }
   
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jtxDocumento = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtxNombre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jtxApellido = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jcbCategoria = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jtxSueldo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jcbEmpresa = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jtxRazonSocial = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtxCuit = new javax.swing.JTextField();
        jbtnEmpresa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jLabel11.setText("Documento");

        jLabel12.setText("Nombre");

        jLabel13.setText("Apellido");

        jLabel14.setText("Categoria");

        jcbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jefe", "Administrador", "Gerente", "Seguridad" }));

        jLabel15.setText("Sueldo");

        jLabel16.setText("Empresas");

        jcbEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEmpresaActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar emp.");
        btnMostrar.setEnabled(false);
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnGuardar)
                        .addGap(33, 33, 33)
                        .addComponent(btnMostrar)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtxDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jtxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jtxApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jcbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jtxSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jcbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnMostrar))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 102)));

        jLabel9.setText("Razon Social");

        jLabel10.setText("CUIT");

        jbtnEmpresa.setText("Crear Empresa");
        jbtnEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEmpresaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnEmpresa)
                .addGap(57, 57, 57))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxCuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbtnEmpresa)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void bloquear(){
        
        if(jcbEmpresa.getSelectedItem() != null){
            btnMostrar.setEnabled(true);
            btnGuardar.setEnabled(true); 
        }
    
    }
       
//    public void verificar(){
//        
//        int num = 0;
//        
//        if(jtxApellido.getText() == null){
//            
//            JOptionPane.showMessageDialog(null, "No ha llenado el campo de Apellido.", "error", ERROR);        
//            num++;
//        }else if(jtxNombre.getText() == null){
//            JOptionPane.showMessageDialog(null, "No ha llenado el campo de Nombre.", "error", ERROR);        
//            num++;
//        }else if(jtxSueldo.getText() == null){
//            JOptionPane.showMessageDialog(null, "No ha llenado el campo de sueldo.", "error", ERROR);        
//            num++;
//        }else if(jtxDocumento.getText() == null){
//            JOptionPane.showMessageDialog(null, "No ha llenado el campo de Documento.", "error", ERROR);        
//            num++;
//        }else if(jcbCategoria.getSelectedItem() == null){
//            JOptionPane.showMessageDialog(null, "No ha llenado el campo de Categoria.", "error", ERROR);        
//            num++;
//        }else if(jcbEmpresa.getSelectedItem() == null){
//            JOptionPane.showMessageDialog(null, "No ha llenado el campo de Empresa.", "error", ERROR);        
//            num++;
//        }
//        
//       
//    }
    
    private void jbtnEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEmpresaActionPerformed
       try{
        // Obtener la información de la nueva empresa desde la GUI
        String razonSocial = jtxRazonSocial.getText();
        int cuit = Integer.parseInt(jtxCuit.getText());

        // Crear una nueva empresa y agregarla a la lista de empresas
        Empresa nuevaEmpresa = new Empresa(razonSocial, cuit, new ArrayList<>());
        empresas.add(nuevaEmpresa);

        // Agregar el nombre de la nueva empresa al ComboBox
        jcbEmpresa.addItem(razonSocial);

        // Bloquear botones según el estado
        bloquear();
        }catch(NumberFormatException d){
            JOptionPane.showMessageDialog(this, "Verifica los campos <ERROR de datos>.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtnEmpresaActionPerformed

    private void jcbEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEmpresaActionPerformed
        
    }//GEN-LAST:event_jcbEmpresaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    

         try {
        String apellido = jtxApellido.getText();
        String nombre = jtxNombre.getText();
        String categoria = (String) jcbCategoria.getSelectedItem();
        String razonSocialEmpresa = (String) jcbEmpresa.getSelectedItem();
        int documento = Integer.parseInt(jtxDocumento.getText());
        double sueldo = Double.parseDouble(jtxSueldo.getText());

        if (jtxApellido.getText().isEmpty() || jcbEmpresa.getSelectedItem() == null || jtxNombre.getText().isEmpty() || jcbCategoria.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Por favor, complet todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Buscar la empresa correspondiente
            Empresa empresaSeleccionada = null;
            for (Empresa empresa : empresas) {
                if (empresa.getRazonSocial().equals(razonSocialEmpresa)) {
                    empresaSeleccionada = empresa;
                    break;
                }
            }

            if (empresaSeleccionada != null) {
                String nombreYapellido = apellido + " " + nombre;
                Empleado nuevoEmpleado = new Empleado(documento, nombreYapellido, categoria, sueldo, empresaSeleccionada);
                empresaSeleccionada.agregarEmpleado(nuevoEmpleado);

                // Limpieza de campos después de guardar
                jtxApellido.setText("");
                jtxNombre.setText("");
                jtxDocumento.setText("");
                jtxSueldo.setText("");
                jcbCategoria.setSelectedIndex(-1);
                jcbEmpresa.setSelectedIndex(-1);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro la empresa seleccionada.", "Opss", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (NumberFormatException nf) {
        JOptionPane.showMessageDialog(null, "Verifica los Campos <ERROR de datos>.", "Opss", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // Obtener el nombre de la empresa seleccionada en el ComboBox
        String razonSocialEmpresa = (String) jcbEmpresa.getSelectedItem();

        // Recorremos la lista de empresas para encontrar la empresa seleccionada
        Empresa empresaSeleccionada = null;
        for (Empresa empresa : empresas) {
            if (empresa.getRazonSocial().equals(razonSocialEmpresa)) {
                empresaSeleccionada = empresa;
                break;
            }
        }

        // Verificar si se encontró una empresa correspondiente
        if (empresaSeleccionada != null) {
            // Llamar al método mostrarEmpleado de la empresa seleccionada
            empresaSeleccionada.mostrarEmpleado();
        } else {
            // Si no se encontró la empresa, mostrar un mensaje de error
            JOptionPane.showMessageDialog(null, "No se encontró la empresa seleccionada.", "Opss", JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_btnMostrarActionPerformed

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtnEmpresa;
    private javax.swing.JComboBox<String> jcbCategoria;
    private javax.swing.JComboBox<String> jcbEmpresa;
    private javax.swing.JTextField jtxApellido;
    private javax.swing.JTextField jtxCuit;
    private javax.swing.JTextField jtxDocumento;
    private javax.swing.JTextField jtxNombre;
    private javax.swing.JTextField jtxRazonSocial;
    private javax.swing.JTextField jtxSueldo;
    // End of variables declaration//GEN-END:variables
}
