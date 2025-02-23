package itson.ticketwizard.presentacion;

import itson.ticketwizard.control.ControlCompra;
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
public class ReventaExitosa extends javax.swing.JFrame {
    
    private final ControlCompra control;

    public ReventaExitosa(ControlCompra control) {
        initComponents();
        setIconImage(iconoPropio);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Reventa exitosa");
        this.control = control;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlEncabezado = new javax.swing.JPanel();
        etqLogo = new javax.swing.JLabel();
        etqTitulo = new javax.swing.JLabel();
        etqNombreUsuario = new javax.swing.JLabel();
        btnUsuario = new javax.swing.JButton();
        etqCargoSaldoCompraExitosa = new javax.swing.JLabel();
        etqLogoExito = new javax.swing.JLabel();
        pnlCargoSaldoCompraExitosa = new RoundedPanel(50, new Color(255,255,255));
        etqDescripcion1 = new javax.swing.JLabel();
        etqFilaBD = new javax.swing.JLabel();
        etqDescripcion2 = new javax.swing.JLabel();
        etqAsientoBD = new javax.swing.JLabel();
        etqDescripcion3 = new javax.swing.JLabel();
        etqDescripcion4 = new javax.swing.JLabel();
        etqPrecioBD = new javax.swing.JLabel();
        etqDescripcion5 = new javax.swing.JLabel();
        etqDescipcion6 = new javax.swing.JLabel();
        etqDescripcion7 = new javax.swing.JLabel();
        etqFechaLimite = new javax.swing.JLabel();
        btnConsultarBoletos = new javax.swing.JButton();
        btnVolverInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPrincipal.setBackground(new java.awt.Color(239, 239, 239));

        pnlEncabezado.setBackground(new java.awt.Color(90, 137, 255));

        etqLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoTicketwizard.png"))); // NOI18N

        etqTitulo.setBackground(new java.awt.Color(255, 255, 255));
        etqTitulo.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo.setText("Ticketwizard");

        etqNombreUsuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        etqNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        etqNombreUsuario.setText("Nombre de Usuario");

        btnUsuario.setBackground(null);
        btnUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoUsuario.png"))); // NOI18N
        btnUsuario.setToolTipText("");
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEncabezadoLayout = new javax.swing.GroupLayout(pnlEncabezado);
        pnlEncabezado.setLayout(pnlEncabezadoLayout);
        pnlEncabezadoLayout.setHorizontalGroup(
            pnlEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEncabezadoLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(etqLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etqNombreUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsuario)
                .addGap(24, 24, 24))
        );
        pnlEncabezadoLayout.setVerticalGroup(
            pnlEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEncabezadoLayout.createSequentialGroup()
                .addGroup(pnlEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEncabezadoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(pnlEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etqNombreUsuario)
                            .addComponent(etqTitulo)))
                    .addGroup(pnlEncabezadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUsuario)
                            .addComponent(etqLogo))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        etqCargoSaldoCompraExitosa.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etqCargoSaldoCompraExitosa.setText("Boleto en venta");

        etqLogoExito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoCompraExitosa.png"))); // NOI18N

        pnlCargoSaldoCompraExitosa.setBackground(null);

        etqDescripcion1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etqDescripcion1.setText("El boleto de la Fila:");

        etqFilaBD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etqFilaBD.setText("Fila");

        etqDescripcion2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etqDescripcion2.setText("Asiento:");

        etqAsientoBD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etqAsientoBD.setText("Asiento");

        etqDescripcion3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etqDescripcion3.setText("Fue puesto en ");

        etqDescripcion4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etqDescripcion4.setText("venta a un precio de:");

        etqPrecioBD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etqPrecioBD.setText("$Precio");

        etqDescripcion5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etqDescripcion5.setText("pesos");

        etqDescipcion6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etqDescipcion6.setText("del:");

        etqDescripcion7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etqDescripcion7.setText("MXN, con fecha límite");

        etqFechaLimite.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etqFechaLimite.setText("FechaLimite");

        javax.swing.GroupLayout pnlCargoSaldoCompraExitosaLayout = new javax.swing.GroupLayout(pnlCargoSaldoCompraExitosa);
        pnlCargoSaldoCompraExitosa.setLayout(pnlCargoSaldoCompraExitosaLayout);
        pnlCargoSaldoCompraExitosaLayout.setHorizontalGroup(
            pnlCargoSaldoCompraExitosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCargoSaldoCompraExitosaLayout.createSequentialGroup()
                .addGroup(pnlCargoSaldoCompraExitosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCargoSaldoCompraExitosaLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(pnlCargoSaldoCompraExitosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCargoSaldoCompraExitosaLayout.createSequentialGroup()
                                .addComponent(etqDescripcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etqFilaBD, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etqDescripcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etqAsientoBD, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etqDescripcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCargoSaldoCompraExitosaLayout.createSequentialGroup()
                                .addComponent(etqDescripcion4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etqPrecioBD)
                                .addGap(18, 18, 18)
                                .addComponent(etqDescripcion5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etqDescripcion7))))
                    .addGroup(pnlCargoSaldoCompraExitosaLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(etqDescipcion6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etqFechaLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        pnlCargoSaldoCompraExitosaLayout.setVerticalGroup(
            pnlCargoSaldoCompraExitosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCargoSaldoCompraExitosaLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(pnlCargoSaldoCompraExitosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqDescripcion1)
                    .addComponent(etqFilaBD)
                    .addComponent(etqDescripcion2)
                    .addComponent(etqAsientoBD)
                    .addComponent(etqDescripcion3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCargoSaldoCompraExitosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqDescripcion4)
                    .addComponent(etqPrecioBD)
                    .addComponent(etqDescripcion5)
                    .addComponent(etqDescripcion7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCargoSaldoCompraExitosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqDescipcion6)
                    .addComponent(etqFechaLimite))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        btnConsultarBoletos.setBackground(new java.awt.Color(192, 223, 255));
        btnConsultarBoletos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConsultarBoletos.setText("Consultar boletos");
        btnConsultarBoletos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarBoletosActionPerformed(evt);
            }
        });

        btnVolverInicio.setBackground(new java.awt.Color(192, 223, 255));
        btnVolverInicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVolverInicio.setText("Volver al inicio");
        btnVolverInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(pnlCargoSaldoCompraExitosa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(etqCargoSaldoCompraExitosa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etqLogoExito))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(btnVolverInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnConsultarBoletos, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(pnlEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqLogoExito, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(etqCargoSaldoCompraExitosa)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlCargoSaldoCompraExitosa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultarBoletos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolverInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarBoletosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarBoletosActionPerformed
        //Metodo para volver a la pantalla de disponiilidad de boletos
    }//GEN-LAST:event_btnConsultarBoletosActionPerformed

    private void btnVolverInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverInicioActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsuarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarBoletos;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JButton btnVolverInicio;
    private javax.swing.JLabel etqAsientoBD;
    private javax.swing.JLabel etqCargoSaldoCompraExitosa;
    private javax.swing.JLabel etqDescipcion6;
    private javax.swing.JLabel etqDescripcion1;
    private javax.swing.JLabel etqDescripcion2;
    private javax.swing.JLabel etqDescripcion3;
    private javax.swing.JLabel etqDescripcion4;
    private javax.swing.JLabel etqDescripcion5;
    private javax.swing.JLabel etqDescripcion7;
    private javax.swing.JLabel etqFechaLimite;
    private javax.swing.JLabel etqFilaBD;
    private javax.swing.JLabel etqLogo;
    private javax.swing.JLabel etqLogoExito;
    private javax.swing.JLabel etqNombreUsuario;
    private javax.swing.JLabel etqPrecioBD;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JPanel pnlCargoSaldoCompraExitosa;
    private javax.swing.JPanel pnlEncabezado;
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