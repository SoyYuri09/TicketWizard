
package itson.ticketwizard.presentacion;

import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DatePickerSettings;
import itson.ticketwizard.control.ControlIniciarSesion;
import itson.ticketwizard.dtos.SolicitudRegistroUsuarioDTO;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 * @author García López, Yuri Germán - ID: 00000252583
 * @author Mendoza Baypoli, Vladimir Iván - ID: 00000252758
 * @author Romo López, Manuel - ID: 00000253080
 */

public class IngresoDatosRegistro extends javax.swing.JFrame {

    private final ControlIniciarSesion control;

    
    public IngresoDatosRegistro(ControlIniciarSesion control) {
        initComponents();
        
        DatePickerSettings ajustesDatePicker = new DatePickerSettings();
        this.datePickerFechaNacimiento.setSettings(ajustesDatePicker);
        LocalDate fechaMinimaNacimiento = LocalDate.of(1900, 1, 1);
        LocalDate fechaMaximaNacimiento = LocalDate.now();
        ajustesDatePicker.setDateRangeLimits(fechaMinimaNacimiento, fechaMaximaNacimiento);
        
        this.control = control;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEncabezado = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelLogo = new javax.swing.JLabel();
        panelIngresoDatos = new javax.swing.JPanel();
        tituloIngresoDatos = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        textFieldNombre = new javax.swing.JTextField();
        labelApellidoPaterno = new javax.swing.JLabel();
        textFieldApellidoPaterno = new javax.swing.JTextField();
        labelApellidoMaterno = new javax.swing.JLabel();
        textFieldApellidoMaterno = new javax.swing.JTextField();
        labelFechaNacimiento = new javax.swing.JLabel();
        datePickerFechaNacimiento = new com.github.lgooddatepicker.components.DatePicker();
        labelSubtitulo = new javax.swing.JLabel();
        labelCalle = new javax.swing.JLabel();
        textFieldEstado = new javax.swing.JTextField();
        labelCiudad = new javax.swing.JLabel();
        textFieldCiudad = new javax.swing.JTextField();
        labelEstado = new javax.swing.JLabel();
        textFieldColonia = new javax.swing.JTextField();
        labelColonia1 = new javax.swing.JLabel();
        textFieldCalle = new javax.swing.JTextField();
        labelNúmero = new javax.swing.JLabel();
        textFieldNumero = new javax.swing.JTextField();
        textFieldCorreoElectronico = new javax.swing.JTextField();
        labelCorreoElectronico = new javax.swing.JLabel();
        labelContrasenia = new javax.swing.JLabel();
        jPasswordContrasenia = new javax.swing.JPasswordField();
        jButtonVolver = new javax.swing.JButton();
        jButtonGuardarDatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelEncabezado.setBackground(new java.awt.Color(0, 0, 153));

        labelTitulo.setText("Ticketwizard");
        labelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        labelTitulo.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoTicketwizard.png"))); // NOI18N

        javax.swing.GroupLayout panelEncabezadoLayout = new javax.swing.GroupLayout(panelEncabezado);
        panelEncabezado.setLayout(panelEncabezadoLayout);
        panelEncabezadoLayout.setHorizontalGroup(
            panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezadoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(labelLogo)
                .addGap(305, 305, 305)
                .addComponent(labelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEncabezadoLayout.setVerticalGroup(
            panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezadoLayout.createSequentialGroup()
                .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEncabezadoLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(labelTitulo))
                    .addGroup(panelEncabezadoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(labelLogo)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelIngresoDatos.setBackground(new java.awt.Color(255, 255, 255));
        panelIngresoDatos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        tituloIngresoDatos.setText("Ingrese sus datos");
        tituloIngresoDatos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        labelNombre.setText("Nombre(s):");
        labelNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        labelApellidoPaterno.setText("Apellido paterno:");
        labelApellidoPaterno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        labelApellidoMaterno.setText("Apellido materno:");
        labelApellidoMaterno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        labelFechaNacimiento.setText("Fecha de nacimiento:");
        labelFechaNacimiento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        labelSubtitulo.setText("Datos de ubicación");
        labelSubtitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        labelCalle.setText("Calle:");
        labelCalle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        labelCiudad.setText("Ciudad:");
        labelCiudad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        labelEstado.setText("Estado:");
        labelEstado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        labelColonia1.setText("Colonia:");
        labelColonia1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        labelNúmero.setText("Número:");
        labelNúmero.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        labelCorreoElectronico.setText("Correo electrónico:");
        labelCorreoElectronico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        labelContrasenia.setText("Contraseña:");
        labelContrasenia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout panelIngresoDatosLayout = new javax.swing.GroupLayout(panelIngresoDatos);
        panelIngresoDatos.setLayout(panelIngresoDatosLayout);
        panelIngresoDatosLayout.setHorizontalGroup(
            panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresoDatosLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelIngresoDatosLayout.createSequentialGroup()
                        .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelNombre)
                            .addComponent(labelFechaNacimiento)
                            .addComponent(labelApellidoMaterno)
                            .addComponent(labelApellidoPaterno)
                            .addComponent(labelCorreoElectronico)
                            .addComponent(labelContrasenia))
                        .addGap(18, 18, 18)
                        .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldNombre)
                            .addComponent(textFieldApellidoPaterno)
                            .addComponent(textFieldApellidoMaterno)
                            .addComponent(datePickerFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(textFieldCorreoElectronico, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(jPasswordContrasenia)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelIngresoDatosLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelCiudad)
                            .addComponent(labelColonia1)
                            .addComponent(labelEstado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelIngresoDatosLayout.createSequentialGroup()
                                .addComponent(textFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(labelCalle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelIngresoDatosLayout.createSequentialGroup()
                                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textFieldCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                    .addComponent(textFieldColonia))
                                .addGap(18, 18, 18)
                                .addComponent(labelNúmero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldNumero)))))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresoDatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresoDatosLayout.createSequentialGroup()
                        .addComponent(tituloIngresoDatos)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresoDatosLayout.createSequentialGroup()
                        .addComponent(labelSubtitulo)
                        .addGap(167, 167, 167))))
        );
        panelIngresoDatosLayout.setVerticalGroup(
            panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresoDatosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tituloIngresoDatos)
                .addGap(18, 18, 18)
                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCorreoElectronico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelApellidoPaterno))
                .addGap(8, 8, 8)
                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelApellidoMaterno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFechaNacimiento)
                    .addComponent(datePickerFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelContrasenia)
                    .addComponent(jPasswordContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(labelSubtitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textFieldCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelCalle))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelEstado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNúmero)
                    .addComponent(labelCiudad))
                .addGap(7, 7, 7)
                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelColonia1))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jButtonVolver.setText("Volver");
        jButtonVolver.setBackground(new java.awt.Color(204, 255, 204));
        jButtonVolver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jButtonGuardarDatos.setText("Guardar datos");
        jButtonGuardarDatos.setBackground(new java.awt.Color(204, 255, 204));
        jButtonGuardarDatos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonGuardarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(438, 438, 438)
                .addComponent(jButtonVolver)
                .addGap(30, 30, 30)
                .addComponent(jButtonGuardarDatos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(253, Short.MAX_VALUE)
                .addComponent(panelIngresoDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(255, 255, 255))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(panelIngresoDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVolver)
                    .addComponent(jButtonGuardarDatos))
                .addGap(0, 34, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarDatosActionPerformed
        
        String nombres = this.textFieldNombre.getText();
        String apellidoPaterno = this.textFieldApellidoPaterno.getText();
        String apellidoMaterno = this.textFieldApellidoMaterno.getText();
        String correoElectronico = this.textFieldCorreoElectronico.getText();
        String fechaNacimiento = this.datePickerFechaNacimiento.getDateStringOrEmptyString();
        char[] contrasenia = this.jPasswordContrasenia.getPassword();
        
        if((nombres == "") || (apellidoPaterno == "") || (apellidoMaterno == "") || (correoElectronico == "")){
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos", "Datos inválidos", JOptionPane.INFORMATION_MESSAGE);
        }

       
        
        String contraseniaString = "";
        for(char c: contrasenia){
            contraseniaString += c;
        }
        
        String estado = this.textFieldEstado.getText();
        String ciudad = this.textFieldCiudad.getText();
        String colonia = this.textFieldColonia.getText();
        String calle = this.textFieldCalle.getText();
        Integer numero = Integer.valueOf(this.textFieldNumero.getText());
        
        SolicitudRegistroUsuarioDTO nuevoUsuarioDTO = new SolicitudRegistroUsuarioDTO(nombres, apellidoPaterno, apellidoMaterno, 
                correoElectronico, fechaNacimiento, contraseniaString, estado, ciudad, colonia, calle, numero);
        
        this.control.registrarUsuario(nuevoUsuarioDTO);
    }//GEN-LAST:event_jButtonGuardarDatosActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        this.control.volverPantallaIniciarSesion(this);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    public void mostrarMensajeUsuarioExistente(String texto, String titulo, int tipoMensaje){
        JOptionPane.showMessageDialog(this, texto, titulo, tipoMensaje);
    }
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker datePickerFechaNacimiento;
    private javax.swing.JButton jButtonGuardarDatos;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JPasswordField jPasswordContrasenia;
    private javax.swing.JLabel labelApellidoMaterno;
    private javax.swing.JLabel labelApellidoPaterno;
    private javax.swing.JLabel labelCalle;
    private javax.swing.JLabel labelCiudad;
    private javax.swing.JLabel labelColonia1;
    private javax.swing.JLabel labelContrasenia;
    private javax.swing.JLabel labelCorreoElectronico;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JLabel labelFechaNacimiento;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNúmero;
    private javax.swing.JLabel labelSubtitulo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelEncabezado;
    private javax.swing.JPanel panelIngresoDatos;
    private javax.swing.JTextField textFieldApellidoMaterno;
    private javax.swing.JTextField textFieldApellidoPaterno;
    private javax.swing.JTextField textFieldCalle;
    private javax.swing.JTextField textFieldCiudad;
    private javax.swing.JTextField textFieldColonia;
    private javax.swing.JTextField textFieldCorreoElectronico;
    private javax.swing.JTextField textFieldEstado;
    private javax.swing.JTextField textFieldNombre;
    private javax.swing.JTextField textFieldNumero;
    private javax.swing.JLabel tituloIngresoDatos;
    // End of variables declaration//GEN-END:variables
}
