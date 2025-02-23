package itson.ticketwizard.presentacion;

import itson.ticketwizard.control.ControlIniciarSesion;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import javax.swing.JPanel;
/**
 * @author García López, Yuri Germán - ID: 00000252583
 * @author Mendoza Baypoli, Vladimir Iván - ID: 00000252758
 * @author Romo López, Manuel - ID: 00000253080
 */
public class InformacionUsuario extends javax.swing.JFrame {

    private final ControlIniciarSesion control;
    
    public InformacionUsuario(ControlIniciarSesion control) {
        initComponents();
        setIconImage(iconoPropio);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Información del usuario");
        this.control = control;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        panelEncabezado = new javax.swing.JPanel();
        etqLogo = new javax.swing.JLabel();
        etqTitulo = new javax.swing.JLabel();
        etqNombreUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        etqInformacionPerfil = new javax.swing.JLabel();
        pnlInformacionPerfil = new RoundedPanel(50, new Color(214,214,214));
        etqNombre = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        etqApellidoPaterno = new javax.swing.JLabel();
        campoApellidoPaterno = new javax.swing.JTextField();
        etqApellidoMaterno = new javax.swing.JLabel();
        campoApellidoMaterno = new javax.swing.JTextField();
        etqFechaNacimiento = new javax.swing.JLabel();
        campoFechaNacimiento = new com.github.lgooddatepicker.components.DatePicker();
        etqCorreoElectronico = new javax.swing.JLabel();
        campoCorreoElectronico = new javax.swing.JTextField();
        etqSubtitulo = new javax.swing.JLabel();
        etqEstado = new javax.swing.JLabel();
        campoEstado = new javax.swing.JTextField();
        etqCiudad = new javax.swing.JLabel();
        campoCiudad = new javax.swing.JTextField();
        etqColonia = new javax.swing.JLabel();
        campoColonia = new javax.swing.JTextField();
        etqNumero = new javax.swing.JLabel();
        campoNumero = new javax.swing.JTextField();
        etqCalle = new javax.swing.JLabel();
        campoCalle = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        btnGuardarDatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPrincipal.setBackground(new java.awt.Color(239, 239, 239));

        panelEncabezado.setBackground(new java.awt.Color(90, 137, 255));

        etqLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoTicketwizard.png"))); // NOI18N

        etqTitulo.setText("Ticketwizard");
        etqTitulo.setBackground(new java.awt.Color(255, 255, 255));
        etqTitulo.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(255, 255, 255));

        etqNombreUsuario.setText("Nombre de Usuario");
        etqNombreUsuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        etqNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoUsuario.png"))); // NOI18N

        javax.swing.GroupLayout panelEncabezadoLayout = new javax.swing.GroupLayout(panelEncabezado);
        panelEncabezado.setLayout(panelEncabezadoLayout);
        panelEncabezadoLayout.setHorizontalGroup(
            panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezadoLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(etqLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etqNombreUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );
        panelEncabezadoLayout.setVerticalGroup(
            panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezadoLayout.createSequentialGroup()
                .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelEncabezadoLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(etqLogo))
                        .addGroup(panelEncabezadoLayout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(etqNombreUsuario)
                                .addComponent(etqTitulo)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        etqInformacionPerfil.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etqInformacionPerfil.setText("Información de mi Perfil");

        pnlInformacionPerfil.setBackground(null);

        etqNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        etqNombre.setText("Nombre(s):");

        etqApellidoPaterno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        etqApellidoPaterno.setText("Apellido paterno:");

        etqApellidoMaterno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        etqApellidoMaterno.setText("Apellido materno:");

        etqFechaNacimiento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        etqFechaNacimiento.setText("Fecha de nacimiento:");

        etqCorreoElectronico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        etqCorreoElectronico.setText("Correo electrónico:");

        etqSubtitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqSubtitulo.setText("Datos de ubicación");

        etqEstado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        etqEstado.setText("Estado:");

        etqCiudad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        etqCiudad.setText("Ciudad:");

        etqColonia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        etqColonia.setText("Colonia:");

        etqNumero.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        etqNumero.setText("Número:");

        etqCalle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        etqCalle.setText("Calle:");

        javax.swing.GroupLayout pnlInformacionPerfilLayout = new javax.swing.GroupLayout(pnlInformacionPerfil);
        pnlInformacionPerfil.setLayout(pnlInformacionPerfilLayout);
        pnlInformacionPerfilLayout.setHorizontalGroup(
            pnlInformacionPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInformacionPerfilLayout.createSequentialGroup()
                .addGroup(pnlInformacionPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInformacionPerfilLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(etqSubtitulo))
                    .addGroup(pnlInformacionPerfilLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(pnlInformacionPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlInformacionPerfilLayout.createSequentialGroup()
                                .addGroup(pnlInformacionPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(etqCiudad)
                                    .addComponent(etqColonia)
                                    .addComponent(etqEstado))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlInformacionPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoEstado)
                                    .addComponent(campoCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                    .addComponent(campoColonia, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                                .addGroup(pnlInformacionPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlInformacionPerfilLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(etqNumero)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInformacionPerfilLayout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(etqCalle)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(pnlInformacionPerfilLayout.createSequentialGroup()
                                .addGroup(pnlInformacionPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(etqNombre)
                                    .addComponent(etqFechaNacimiento)
                                    .addComponent(etqApellidoMaterno)
                                    .addComponent(etqApellidoPaterno)
                                    .addComponent(etqCorreoElectronico))
                                .addGap(18, 18, 18)
                                .addGroup(pnlInformacionPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(campoCorreoElectronico, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoApellidoPaterno, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoApellidoMaterno, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoFechaNacimiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        pnlInformacionPerfilLayout.setVerticalGroup(
            pnlInformacionPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInformacionPerfilLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlInformacionPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInformacionPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqApellidoPaterno))
                .addGap(8, 8, 8)
                .addGroup(pnlInformacionPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqApellidoMaterno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInformacionPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqCorreoElectronico, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInformacionPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqFechaNacimiento)
                    .addComponent(campoFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(etqSubtitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlInformacionPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInformacionPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(etqCalle))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInformacionPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(etqEstado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInformacionPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqNumero)
                    .addComponent(etqCiudad))
                .addGap(7, 7, 7)
                .addGroup(pnlInformacionPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqColonia))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        btnVolver.setBackground(new java.awt.Color(192, 223, 255));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnGuardarDatos.setBackground(new java.awt.Color(192, 223, 255));
        btnGuardarDatos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardarDatos.setText("Guardar datos");
        btnGuardarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(44, 44, 44)
                .addComponent(btnGuardarDatos)
                .addGap(281, 281, 281))
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(pnlInformacionPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap(262, Short.MAX_VALUE)
                .addComponent(etqInformacionPerfil)
                .addGap(262, 262, 262))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(panelEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(etqInformacionPerfil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlInformacionPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardarDatos)
                    .addComponent(btnVolver))
                .addGap(0, 54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed

    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnGuardarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDatosActionPerformed

        //Pendiente

    }//GEN-LAST:event_btnGuardarDatosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarDatos;
    private javax.swing.JButton btnVolver;
    private javax.swing.JTextField campoApellidoMaterno;
    private javax.swing.JTextField campoApellidoPaterno;
    private javax.swing.JTextField campoCalle;
    private javax.swing.JTextField campoCiudad;
    private javax.swing.JTextField campoColonia;
    private javax.swing.JTextField campoCorreoElectronico;
    private javax.swing.JTextField campoEstado;
    private com.github.lgooddatepicker.components.DatePicker campoFechaNacimiento;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoNumero;
    private javax.swing.JLabel etqApellidoMaterno;
    private javax.swing.JLabel etqApellidoPaterno;
    private javax.swing.JLabel etqCalle;
    private javax.swing.JLabel etqCiudad;
    private javax.swing.JLabel etqColonia;
    private javax.swing.JLabel etqCorreoElectronico;
    private javax.swing.JLabel etqEstado;
    private javax.swing.JLabel etqFechaNacimiento;
    private javax.swing.JLabel etqInformacionPerfil;
    private javax.swing.JLabel etqLogo;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JLabel etqNombreUsuario;
    private javax.swing.JLabel etqNumero;
    private javax.swing.JLabel etqSubtitulo;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelEncabezado;
    private javax.swing.JPanel pnlInformacionPerfil;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables

    class RoundedPanel extends JPanel{
        private Color backgroundColor;
        private int cornerRadius = 15;
        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }
        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
            
        }
        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());

        }
    }
    
    Image iconoPropio = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/logoTicketwizard.png")).getScaledInstance(80, 80, Image.SCALE_SMOOTH);
    
}
