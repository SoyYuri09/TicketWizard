
package itson.ticketwizard.presentacion;

import itson.ticketwizard.control.ControlIniciarSesion;
import itson.ticketwizard.dtos.IngresoUsuarioDTO;
import javax.swing.JOptionPane;

/**
 * @author García López, Yuri Germán - ID: 00000252583
 * @author Mendoza Baypoli, Vladimir Iván - ID: 00000252758
 * @author Romo López, Manuel - ID: 00000253080
 */

public class IngresoDatosInicioSesion extends javax.swing.JFrame {

    private final ControlIniciarSesion control;

    public IngresoDatosInicioSesion(ControlIniciarSesion control) {
        initComponents();
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
        campoCorreoElectronico = new javax.swing.JTextField();
        etqCorreoElectronico = new javax.swing.JLabel();
        etqContrasenia = new javax.swing.JLabel();
        campoContrasenia = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnRegistrarse = new javax.swing.JButton();
        etqSinCuenta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelEncabezado.setBackground(new java.awt.Color(0, 0, 153));

        labelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        labelTitulo.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Ticketwizard");

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
                .addContainerGap(405, Short.MAX_VALUE))
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

        tituloIngresoDatos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tituloIngresoDatos.setText("Ingrese sus datos");

        etqCorreoElectronico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        etqCorreoElectronico.setText("Correo electrónico:");

        etqContrasenia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        etqContrasenia.setText("Contraseña:");

        btnIngresar.setBackground(new java.awt.Color(193, 224, 255));
        btnIngresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(192, 223, 255));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelIngresoDatosLayout = new javax.swing.GroupLayout(panelIngresoDatos);
        panelIngresoDatos.setLayout(panelIngresoDatosLayout);
        panelIngresoDatosLayout.setHorizontalGroup(
            panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresoDatosLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresoDatosLayout.createSequentialGroup()
                        .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etqCorreoElectronico, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etqContrasenia, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tituloIngresoDatos))
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresoDatosLayout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addGap(32, 32, 32)
                        .addComponent(btnIngresar)
                        .addGap(144, 144, 144))))
        );
        panelIngresoDatosLayout.setVerticalGroup(
            panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresoDatosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tituloIngresoDatos)
                .addGap(40, 40, 40)
                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqCorreoElectronico))
                .addGap(26, 26, 26)
                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqContrasenia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(panelIngresoDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar)
                    .addComponent(btnVolver))
                .addGap(14, 14, 14))
        );

        btnRegistrarse.setBackground(new java.awt.Color(204, 204, 255));
        btnRegistrarse.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrarse.setText("Regístrate");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        etqSinCuenta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        etqSinCuenta.setText("¿No tienes una cuenta?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panelIngresoDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(261, 261, 261))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(etqSinCuenta)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrarse)
                        .addGap(415, 415, 415))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(panelIngresoDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarse)
                    .addComponent(etqSinCuenta))
                .addGap(57, 57, 57))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        this.control.mostrarFormularioRegistro(this);
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.control.volverPantallaIniciarSesion(this);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        
        //Pendiente validcaciones.
        String correoElectronico = (String) this.campoCorreoElectronico.getText();
        char[] contrasenia = this.campoContrasenia.getPassword();
        
        String contraseniaString = "";
        for(char c: contrasenia){
            contraseniaString += c;
        }
        
        IngresoUsuarioDTO ingresoUsuarioDTO = new IngresoUsuarioDTO(correoElectronico, contraseniaString);
        this.control.inciarSesion(ingresoUsuarioDTO);
    }//GEN-LAST:event_btnIngresarActionPerformed

    public void mostrarMensajeUsuarioContraseniaInvalido(String texto, String titulo, int tipoMensaje){
        JOptionPane.showMessageDialog(this, texto, titulo, tipoMensaje);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPasswordField campoContrasenia;
    private javax.swing.JTextField campoCorreoElectronico;
    private javax.swing.JLabel etqContrasenia;
    private javax.swing.JLabel etqCorreoElectronico;
    private javax.swing.JLabel etqSinCuenta;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelEncabezado;
    private javax.swing.JPanel panelIngresoDatos;
    private javax.swing.JLabel tituloIngresoDatos;
    // End of variables declaration//GEN-END:variables
}
