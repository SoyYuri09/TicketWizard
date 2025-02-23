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
public class CompraSaldoInsuficiente extends javax.swing.JFrame {

    private final ControlCompra control;
    
    public CompraSaldoInsuficiente(ControlCompra control) {
        initComponents();
        setIconImage(iconoPropio);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Saldo insuficiente");
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
        btnUsuario = new javax.swing.JButton();
        etqSaldoInsuficiente = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new RoundedPanel(50, new Color(255,255,255));
        etqSaldoActual = new javax.swing.JLabel();
        etqSaldo = new javax.swing.JLabel();
        etqPesosSaldoActual = new javax.swing.JLabel();
        etqMXNSaldoActual = new javax.swing.JLabel();
        etqTotalCompra = new javax.swing.JLabel();
        etqTotalCompraBD = new javax.swing.JLabel();
        etqPesosTotalCompra = new javax.swing.JLabel();
        etqMXNTotalCompra = new javax.swing.JLabel();
        etqSaldoFaltante = new javax.swing.JLabel();
        etqSaldoFaltanteBD = new javax.swing.JLabel();
        etqPesosSaldoFaltante = new javax.swing.JLabel();
        etqMXNSaldoFaltante = new javax.swing.JLabel();
        etqDescripcion1 = new javax.swing.JLabel();
        etqDescripcion2 = new javax.swing.JLabel();
        btnVolverInicio = new javax.swing.JButton();
        btnCargarSaldo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPrincipal.setBackground(new java.awt.Color(239, 239, 239));

        panelEncabezado.setBackground(new java.awt.Color(90, 137, 255));

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

        javax.swing.GroupLayout panelEncabezadoLayout = new javax.swing.GroupLayout(panelEncabezado);
        panelEncabezado.setLayout(panelEncabezadoLayout);
        panelEncabezadoLayout.setHorizontalGroup(
            panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezadoLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(etqLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etqTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etqNombreUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsuario)
                .addGap(24, 24, 24))
        );
        panelEncabezadoLayout.setVerticalGroup(
            panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezadoLayout.createSequentialGroup()
                .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEncabezadoLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etqTitulo)
                            .addComponent(etqNombreUsuario)))
                    .addGroup(panelEncabezadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUsuario)
                            .addComponent(etqLogo))))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        etqSaldoInsuficiente.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etqSaldoInsuficiente.setText("Saldo insuficiente");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoSaldo.png"))); // NOI18N

        jPanel1.setBackground(null);

        etqSaldoActual.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etqSaldoActual.setText("Saldo actual:");

        etqSaldo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etqSaldo.setText("$Saldo");

        etqPesosSaldoActual.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etqPesosSaldoActual.setText("Pesos");

        etqMXNSaldoActual.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etqMXNSaldoActual.setText("MXN");

        etqTotalCompra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etqTotalCompra.setText("Total de compra:");

        etqTotalCompraBD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etqTotalCompraBD.setText("$Total");

        etqPesosTotalCompra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etqPesosTotalCompra.setText("Pesos");

        etqMXNTotalCompra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etqMXNTotalCompra.setText("MXN");

        etqSaldoFaltante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etqSaldoFaltante.setText("Saldo faltante:");

        etqSaldoFaltanteBD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etqSaldoFaltanteBD.setText("$Faltante");

        etqPesosSaldoFaltante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etqPesosSaldoFaltante.setText("Pesos");

        etqMXNSaldoFaltante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etqMXNSaldoFaltante.setText("MXN");

        etqDescripcion1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqDescripcion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqDescripcion1.setText("Los boletos de su compra se apartarán por 10 minutos ");

        etqDescripcion2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqDescripcion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqDescripcion2.setText("Deberá cargar saldo antes de ese tiempo para adquirirlos automáticamente ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(etqDescripcion2)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etqSaldoActual)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(151, 151, 151)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(etqTotalCompraBD)
                                            .addComponent(etqSaldo)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(etqTotalCompra)
                                            .addComponent(etqSaldoFaltante))
                                        .addGap(52, 52, 52)
                                        .addComponent(etqSaldoFaltanteBD)))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etqPesosSaldoFaltante)
                                    .addComponent(etqPesosSaldoActual)
                                    .addComponent(etqPesosTotalCompra))))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etqMXNTotalCompra)
                            .addComponent(etqMXNSaldoActual)
                            .addComponent(etqMXNSaldoFaltante)))
                    .addComponent(etqDescripcion1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqSaldoActual)
                    .addComponent(etqSaldo)
                    .addComponent(etqPesosSaldoActual)
                    .addComponent(etqMXNSaldoActual))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqTotalCompra)
                    .addComponent(etqTotalCompraBD)
                    .addComponent(etqPesosTotalCompra)
                    .addComponent(etqMXNTotalCompra))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqSaldoFaltante)
                    .addComponent(etqSaldoFaltanteBD)
                    .addComponent(etqPesosSaldoFaltante)
                    .addComponent(etqMXNSaldoFaltante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(etqDescripcion1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqDescripcion2)
                .addGap(41, 41, 41))
        );

        btnVolverInicio.setBackground(new java.awt.Color(192, 223, 255));
        btnVolverInicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVolverInicio.setText("Volver al inicio");
        btnVolverInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverInicioActionPerformed(evt);
            }
        });

        btnCargarSaldo.setBackground(new java.awt.Color(193, 224, 255));
        btnCargarSaldo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCargarSaldo.setText("Cargar saldo");
        btnCargarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarSaldoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(etqSaldoInsuficiente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(btnVolverInicio)
                        .addGap(80, 80, 80)
                        .addComponent(btnCargarSaldo)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(panelEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(etqSaldoInsuficiente)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolverInicio)
                    .addComponent(btnCargarSaldo))
                .addGap(0, 31, Short.MAX_VALUE))
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

    private void btnVolverInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverInicioActionPerformed
        //Metodo para volver a la pantalla de disponiilidad de boletos
    }//GEN-LAST:event_btnVolverInicioActionPerformed

    private void btnCargarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarSaldoActionPerformed
        //Metodo para continuar a la pantalla de compra exitosa o de saldo insuficiente
    }//GEN-LAST:event_btnCargarSaldoActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsuarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarSaldo;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JButton btnVolverInicio;
    private javax.swing.JLabel etqDescripcion1;
    private javax.swing.JLabel etqDescripcion2;
    private javax.swing.JLabel etqLogo;
    private javax.swing.JLabel etqMXNSaldoActual;
    private javax.swing.JLabel etqMXNSaldoFaltante;
    private javax.swing.JLabel etqMXNTotalCompra;
    private javax.swing.JLabel etqNombreUsuario;
    private javax.swing.JLabel etqPesosSaldoActual;
    private javax.swing.JLabel etqPesosSaldoFaltante;
    private javax.swing.JLabel etqPesosTotalCompra;
    private javax.swing.JLabel etqSaldo;
    private javax.swing.JLabel etqSaldoActual;
    private javax.swing.JLabel etqSaldoFaltante;
    private javax.swing.JLabel etqSaldoFaltanteBD;
    private javax.swing.JLabel etqSaldoInsuficiente;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JLabel etqTotalCompra;
    private javax.swing.JLabel etqTotalCompraBD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelEncabezado;
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
