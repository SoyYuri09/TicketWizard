
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

public class InicioSesionUsuario extends javax.swing.JFrame {

    private final ControlIniciarSesion control;

    public InicioSesionUsuario(ControlIniciarSesion control) {
        initComponents();
        setIconImage(iconoPropio);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("TicketWizard");
        this.control = control;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSeleccion = new RoundedPanel(50, new Color(255,255,255));
        tituloSeleccion = new javax.swing.JLabel();
        jButtonIniciarSesion = new javax.swing.JButton();
        jButtonRegistrarse = new javax.swing.JButton();
        panelEncabezado = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(239, 239, 239));

        panelSeleccion.setBackground(null);

        tituloSeleccion.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        tituloSeleccion.setText("Bienvenido a Ticketwizard");

        jButtonIniciarSesion.setBackground(new java.awt.Color(255, 153, 153));
        jButtonIniciarSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonIniciarSesion.setText("Iniciar Sesión");
        jButtonIniciarSesion.setAutoscrolls(true);
        jButtonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarSesionActionPerformed(evt);
            }
        });

        jButtonRegistrarse.setBackground(new java.awt.Color(255, 153, 153));
        jButtonRegistrarse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonRegistrarse.setText("Registrarse");
        jButtonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSeleccionLayout = new javax.swing.GroupLayout(panelSeleccion);
        panelSeleccion.setLayout(panelSeleccionLayout);
        panelSeleccionLayout.setHorizontalGroup(
            panelSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSeleccionLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(tituloSeleccion)
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSeleccionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                .addGap(116, 116, 116))
        );
        panelSeleccionLayout.setVerticalGroup(
            panelSeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSeleccionLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(tituloSeleccion)
                .addGap(53, 53, 53)
                .addComponent(jButtonIniciarSesion)
                .addGap(18, 18, 18)
                .addComponent(jButtonRegistrarse)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        panelEncabezado.setBackground(new java.awt.Color(90, 137, 255));

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
                .addGap(251, 251, 251)
                .addComponent(labelLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelEncabezadoLayout.setVerticalGroup(
            panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEncabezadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTitulo)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(208, Short.MAX_VALUE)
                .addComponent(panelSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(panelSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButtonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarSesionActionPerformed
        this.control.mostrarFormularioIngreso(this);
    }//GEN-LAST:event_jButtonIniciarSesionActionPerformed

    private void jButtonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarseActionPerformed
        this.control.mostrarFormularioRegistro(this);
    }//GEN-LAST:event_jButtonRegistrarseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIniciarSesion;
    private javax.swing.JButton jButtonRegistrarse;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelEncabezado;
    private javax.swing.JPanel panelSeleccion;
    private javax.swing.JLabel tituloSeleccion;
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