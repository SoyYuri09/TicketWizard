package itson.ticketwizard.presentacion;

import itson.ticketwizard.control.ControlCargarSaldo;
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
public class CargaSaldoCompraExitosa extends javax.swing.JFrame {
    
    private final ControlCargarSaldo control;
    private final Double saldo;
    private final Double precioVenta;

    public CargaSaldoCompraExitosa(ControlCargarSaldo control, Double saldo, Double precioVenta) {
        this.saldo = saldo;
        this.precioVenta = precioVenta;
        initComponents();
        setIconImage(iconoPropio);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Cargo de saldo y compra exitosos");
        this.control = control;
    }
    
    private void cargarDatos(){
        String correoElectronico = control.obtenerNombreCorreoUsuarioDTO().getCorreoElectronico();
        this.control.obtenerUsuarioSaldoDTO(correoElectronico);
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
        etqSaldoDescontado = new javax.swing.JLabel();
        etqSaldoIngresado = new javax.swing.JLabel();
        etqSaldoActual = new javax.swing.JLabel();
        etqSaldoActualBD = new javax.swing.JLabel();
        etqSaldoingresadoBD = new javax.swing.JLabel();
        etqDescontadoBD = new javax.swing.JLabel();
        etqPesosSaldoingresado = new javax.swing.JLabel();
        etqMXNSaldoIngresao = new javax.swing.JLabel();
        etqPesosDescontado = new javax.swing.JLabel();
        etqPesosDescontado1 = new javax.swing.JLabel();
        etqMXNSaldoActual = new javax.swing.JLabel();
        etqPesosSaldoActual1 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPrincipal.setBackground(new java.awt.Color(239, 239, 239));

        pnlEncabezado.setBackground(new java.awt.Color(90, 137, 255));

        etqLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoTicketwizard.png"))); // NOI18N

        etqTitulo.setText("Ticketwizard");
        etqTitulo.setBackground(new java.awt.Color(255, 255, 255));
        etqTitulo.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(255, 255, 255));

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
                .addGap(18, 18, 18)
                .addComponent(etqTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etqNombreUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsuario)
                .addGap(25, 25, 25))
        );
        pnlEncabezadoLayout.setVerticalGroup(
            pnlEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEncabezadoLayout.createSequentialGroup()
                .addGroup(pnlEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEncabezadoLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(pnlEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etqTitulo)
                            .addComponent(etqNombreUsuario)))
                    .addGroup(pnlEncabezadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUsuario)
                            .addComponent(etqLogo))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        etqCargoSaldoCompraExitosa.setText("Cargo de saldo y compra exitosa");
        etqCargoSaldoCompraExitosa.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        etqLogoExito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoCompraExitosa.png"))); // NOI18N

        pnlCargoSaldoCompraExitosa.setBackground(null);

        etqSaldoDescontado.setText("Se descontaron:");
        etqSaldoDescontado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        etqSaldoIngresado.setText("Saldo ingresado:");
        etqSaldoIngresado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        etqSaldoActual.setText("Saldo actual:");
        etqSaldoActual.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        etqSaldoActualBD.setText("$Actual");
        etqSaldoActualBD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        etqSaldoingresadoBD.setText("$Saldo");
        etqSaldoingresadoBD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        etqDescontadoBD.setText("$Descontado");
        etqDescontadoBD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        etqPesosSaldoingresado.setText("Pesos");
        etqPesosSaldoingresado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        etqMXNSaldoIngresao.setText("MXN");
        etqMXNSaldoIngresao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        etqPesosDescontado.setText("Del saldo de su cuenta");
        etqPesosDescontado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        etqPesosDescontado1.setText("Pesos");
        etqPesosDescontado1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        etqMXNSaldoActual.setText("MXN");
        etqMXNSaldoActual.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        etqPesosSaldoActual1.setText("Pesos");
        etqPesosSaldoActual1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout pnlCargoSaldoCompraExitosaLayout = new javax.swing.GroupLayout(pnlCargoSaldoCompraExitosa);
        pnlCargoSaldoCompraExitosa.setLayout(pnlCargoSaldoCompraExitosaLayout);
        pnlCargoSaldoCompraExitosaLayout.setHorizontalGroup(
            pnlCargoSaldoCompraExitosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCargoSaldoCompraExitosaLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(pnlCargoSaldoCompraExitosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etqSaldoActual)
                    .addComponent(etqSaldoIngresado)
                    .addComponent(etqSaldoDescontado))
                .addGap(67, 67, 67)
                .addGroup(pnlCargoSaldoCompraExitosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlCargoSaldoCompraExitosaLayout.createSequentialGroup()
                        .addComponent(etqSaldoActualBD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etqPesosSaldoActual1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCargoSaldoCompraExitosaLayout.createSequentialGroup()
                        .addComponent(etqDescontadoBD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etqPesosDescontado1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCargoSaldoCompraExitosaLayout.createSequentialGroup()
                        .addComponent(etqSaldoingresadoBD)
                        .addGap(62, 62, 62)
                        .addComponent(etqPesosSaldoingresado)))
                .addGap(18, 18, 18)
                .addGroup(pnlCargoSaldoCompraExitosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqMXNSaldoIngresao)
                    .addComponent(etqPesosDescontado)
                    .addComponent(etqMXNSaldoActual))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        pnlCargoSaldoCompraExitosaLayout.setVerticalGroup(
            pnlCargoSaldoCompraExitosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCargoSaldoCompraExitosaLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pnlCargoSaldoCompraExitosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqSaldoIngresado)
                    .addComponent(etqSaldoingresadoBD)
                    .addComponent(etqPesosSaldoingresado)
                    .addComponent(etqMXNSaldoIngresao))
                .addGap(41, 41, 41)
                .addGroup(pnlCargoSaldoCompraExitosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqSaldoDescontado)
                    .addComponent(etqDescontadoBD)
                    .addComponent(etqPesosDescontado)
                    .addComponent(etqPesosDescontado1))
                .addGap(43, 43, 43)
                .addGroup(pnlCargoSaldoCompraExitosaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqSaldoActual)
                    .addComponent(etqSaldoActualBD)
                    .addComponent(etqPesosSaldoActual1)
                    .addComponent(etqMXNSaldoActual))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        btnVolver.setText("Volver al inicio");
        btnVolver.setBackground(new java.awt.Color(192, 223, 255));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addComponent(pnlCargoSaldoCompraExitosa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(etqCargoSaldoCompraExitosa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etqLogoExito))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(pnlEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqLogoExito, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(etqCargoSaldoCompraExitosa)))
                .addGap(18, 18, 18)
                .addComponent(pnlCargoSaldoCompraExitosa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
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

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        //Metodo para volver a la pantalla de disponiilidad de boletos
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsuarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUsuario;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel etqCargoSaldoCompraExitosa;
    private javax.swing.JLabel etqDescontadoBD;
    private javax.swing.JLabel etqLogo;
    private javax.swing.JLabel etqLogoExito;
    private javax.swing.JLabel etqMXNSaldoActual;
    private javax.swing.JLabel etqMXNSaldoIngresao;
    private javax.swing.JLabel etqNombreUsuario;
    private javax.swing.JLabel etqPesosDescontado;
    private javax.swing.JLabel etqPesosDescontado1;
    private javax.swing.JLabel etqPesosSaldoActual1;
    private javax.swing.JLabel etqPesosSaldoingresado;
    private javax.swing.JLabel etqSaldoActual;
    private javax.swing.JLabel etqSaldoActualBD;
    private javax.swing.JLabel etqSaldoDescontado;
    private javax.swing.JLabel etqSaldoIngresado;
    private javax.swing.JLabel etqSaldoingresadoBD;
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