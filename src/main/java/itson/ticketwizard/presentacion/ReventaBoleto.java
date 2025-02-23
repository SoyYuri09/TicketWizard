package itson.ticketwizard.presentacion;

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
public class ReventaBoleto extends javax.swing.JFrame {

    //Agregar control para caso de uso reventa
    
    public ReventaBoleto() {
        initComponents();
        setIconImage(iconoPropio);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Reventa de boletos");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlEncabezado = new javax.swing.JPanel();
        etqLogo = new javax.swing.JLabel();
        etqTitulo = new javax.swing.JLabel();
        etqNombreUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        etqReventaBoleto = new javax.swing.JLabel();
        pnlReventaBoleto = new RoundedPanel(50, new Color(255,255,255));
        etqFila = new javax.swing.JLabel();
        etqAsiento = new javax.swing.JLabel();
        etqAsientoBD = new javax.swing.JLabel();
        etqFilaBD = new javax.swing.JLabel();
        etqCostoOriginal = new javax.swing.JLabel();
        etqCostoOriginalBD = new javax.swing.JLabel();
        etqPesosCostoOriginal = new javax.swing.JLabel();
        etqMXNCostoOriginal = new javax.swing.JLabel();
        etqCostoReventa = new javax.swing.JLabel();
        campoCostoReventa = new javax.swing.JTextField();
        etqPesosCostoReventa = new javax.swing.JLabel();
        etqMXNCostoReventa = new javax.swing.JLabel();
        etqDescipcion = new javax.swing.JLabel();
        etqMonto = new javax.swing.JLabel();
        etqPesosMonto = new javax.swing.JLabel();
        etqMXNMonto = new javax.swing.JLabel();
        etqCostoReventa1 = new javax.swing.JLabel();
        campoFechaLimite = new com.github.lgooddatepicker.components.DatePicker();
        btnVolver = new javax.swing.JButton();
        btnPonerEnVenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPrincipal.setBackground(new java.awt.Color(239, 239, 239));

        pnlEncabezado.setBackground(new java.awt.Color(90, 137, 255));

        etqLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoTicketwizard.png"))); // NOI18N

        etqTitulo.setText("Ticketwizard");
        etqTitulo.setBackground(new java.awt.Color(255, 255, 255));
        etqTitulo.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(255, 255, 255));

        etqNombreUsuario.setText("Nombre de Usuario");
        etqNombreUsuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        etqNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoUsuario.png"))); // NOI18N

        javax.swing.GroupLayout pnlEncabezadoLayout = new javax.swing.GroupLayout(pnlEncabezado);
        pnlEncabezado.setLayout(pnlEncabezadoLayout);
        pnlEncabezadoLayout.setHorizontalGroup(
            pnlEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEncabezadoLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(etqLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                .addComponent(etqNombreUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(21, 21, 21))
        );
        pnlEncabezadoLayout.setVerticalGroup(
            pnlEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEncabezadoLayout.createSequentialGroup()
                .addGroup(pnlEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(pnlEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlEncabezadoLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(etqLogo))
                        .addGroup(pnlEncabezadoLayout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(pnlEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(etqNombreUsuario)
                                .addComponent(etqTitulo)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        etqReventaBoleto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqReventaBoleto.setText("Reventa de boleto");

        pnlReventaBoleto.setBackground(null);

        etqFila.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqFila.setText("Fila:");

        etqAsiento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqAsiento.setText("Asiento:");

        etqAsientoBD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etqAsientoBD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqAsientoBD.setText("Asiento");

        etqFilaBD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etqFilaBD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqFilaBD.setText("Fila");

        etqCostoOriginal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqCostoOriginal.setText("Costo original:");

        etqCostoOriginalBD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etqCostoOriginalBD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqCostoOriginalBD.setText("$Costo");

        etqPesosCostoOriginal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etqPesosCostoOriginal.setText("Pesos");

        etqMXNCostoOriginal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etqMXNCostoOriginal.setText("MXN");

        etqCostoReventa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqCostoReventa.setText("Costo de reventa:");

        campoCostoReventa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        etqPesosCostoReventa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etqPesosCostoReventa.setText("Pesos");

        etqMXNCostoReventa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etqMXNCostoReventa.setText("MXN");

        etqDescipcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etqDescipcion.setText("El monto no debe superar los:");

        etqMonto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etqMonto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqMonto.setText("$Monto");

        etqPesosMonto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etqPesosMonto.setText("Pesos");

        etqMXNMonto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etqMXNMonto.setText("MXN");

        etqCostoReventa1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        etqCostoReventa1.setText("Fecha límite:");

        javax.swing.GroupLayout pnlReventaBoletoLayout = new javax.swing.GroupLayout(pnlReventaBoleto);
        pnlReventaBoleto.setLayout(pnlReventaBoletoLayout);
        pnlReventaBoletoLayout.setHorizontalGroup(
            pnlReventaBoletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReventaBoletoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pnlReventaBoletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlReventaBoletoLayout.createSequentialGroup()
                        .addComponent(etqDescipcion, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etqMonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etqPesosMonto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etqMXNMonto))
                    .addGroup(pnlReventaBoletoLayout.createSequentialGroup()
                        .addGroup(pnlReventaBoletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etqCostoReventa)
                            .addComponent(etqCostoOriginal)
                            .addComponent(etqAsiento)
                            .addComponent(etqFila))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlReventaBoletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etqFilaBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etqAsientoBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etqCostoOriginalBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoCostoReventa, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlReventaBoletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlReventaBoletoLayout.createSequentialGroup()
                                .addComponent(etqPesosCostoReventa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etqMXNCostoReventa))
                            .addGroup(pnlReventaBoletoLayout.createSequentialGroup()
                                .addComponent(etqPesosCostoOriginal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etqMXNCostoOriginal)))))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(pnlReventaBoletoLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(etqCostoReventa1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFechaLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlReventaBoletoLayout.setVerticalGroup(
            pnlReventaBoletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReventaBoletoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlReventaBoletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqFila)
                    .addComponent(etqFilaBD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlReventaBoletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqAsiento)
                    .addComponent(etqAsientoBD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlReventaBoletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqCostoOriginal)
                    .addComponent(etqCostoOriginalBD)
                    .addComponent(etqPesosCostoOriginal)
                    .addComponent(etqMXNCostoOriginal))
                .addGap(27, 27, 27)
                .addGroup(pnlReventaBoletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqCostoReventa)
                    .addComponent(campoCostoReventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqPesosCostoReventa)
                    .addComponent(etqMXNCostoReventa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlReventaBoletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqDescipcion)
                    .addComponent(etqMonto)
                    .addComponent(etqPesosMonto)
                    .addComponent(etqMXNMonto))
                .addGap(18, 18, 18)
                .addGroup(pnlReventaBoletoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqCostoReventa1)
                    .addComponent(campoFechaLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        btnVolver.setBackground(new java.awt.Color(192, 223, 255));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnPonerEnVenta.setBackground(new java.awt.Color(192, 223, 255));
        btnPonerEnVenta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPonerEnVenta.setText("Poner boleto en venta");
        btnPonerEnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPonerEnVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(pnlReventaBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(etqReventaBoleto)
                        .addGap(365, 365, 365))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addGap(40, 40, 40)
                        .addComponent(btnPonerEnVenta)
                        .addGap(269, 269, 269))))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(pnlEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(etqReventaBoleto)
                .addGap(18, 18, 18)
                .addComponent(pnlReventaBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPonerEnVenta)
                    .addComponent(btnVolver))
                .addGap(0, 35, Short.MAX_VALUE))
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
        //Control para volver a la pantalla anterior
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnPonerEnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPonerEnVentaActionPerformed
        //Falta agregar action para revender
    }//GEN-LAST:event_btnPonerEnVentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPonerEnVenta;
    private javax.swing.JButton btnVolver;
    private javax.swing.JTextField campoCostoReventa;
    private com.github.lgooddatepicker.components.DatePicker campoFechaLimite;
    private javax.swing.JLabel etqAsiento;
    private javax.swing.JLabel etqAsientoBD;
    private javax.swing.JLabel etqCostoOriginal;
    private javax.swing.JLabel etqCostoOriginalBD;
    private javax.swing.JLabel etqCostoReventa;
    private javax.swing.JLabel etqCostoReventa1;
    private javax.swing.JLabel etqDescipcion;
    private javax.swing.JLabel etqFila;
    private javax.swing.JLabel etqFilaBD;
    private javax.swing.JLabel etqLogo;
    private javax.swing.JLabel etqMXNCostoOriginal;
    private javax.swing.JLabel etqMXNCostoReventa;
    private javax.swing.JLabel etqMXNMonto;
    private javax.swing.JLabel etqMonto;
    private javax.swing.JLabel etqNombreUsuario;
    private javax.swing.JLabel etqPesosCostoOriginal;
    private javax.swing.JLabel etqPesosCostoReventa;
    private javax.swing.JLabel etqPesosMonto;
    private javax.swing.JLabel etqReventaBoleto;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnlEncabezado;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlReventaBoleto;
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