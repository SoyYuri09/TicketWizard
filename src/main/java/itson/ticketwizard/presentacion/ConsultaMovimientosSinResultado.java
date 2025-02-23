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
public class ConsultaMovimientosSinResultado extends javax.swing.JFrame {

    private final ControlCompra control;

    public ConsultaMovimientosSinResultado(ControlCompra control) {
        initComponents();
        setIconImage(iconoPropio);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Consulta de movimientos");
        this.control = control;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollEventos = new javax.swing.JScrollPane();
        tablaListaEventos = new javax.swing.JTable();
        pnlPrincipal = new javax.swing.JPanel();
        panelEncabezado1 = new javax.swing.JPanel();
        etqLogo = new javax.swing.JLabel();
        campoFechaInicial1 = new com.github.lgooddatepicker.components.DatePicker();
        campoFechaFinal1 = new com.github.lgooddatepicker.components.DatePicker();
        etqTitulo = new javax.swing.JLabel();
        etqFechaInicial1 = new javax.swing.JLabel();
        etqFechaFinal1 = new javax.swing.JLabel();
        campoBuscarEvento1 = new javax.swing.JTextField();
        etqBuscarEvento1 = new javax.swing.JLabel();
        etqNombreUsuario = new javax.swing.JLabel();
        btnUsuario = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        pnlBusquedaRangoFechasInvalida = new RoundedPanel(50, new Color(214,214,214));
        etqLogoBusquedaInvalida = new javax.swing.JLabel();
        etqBusquedaInvalida = new javax.swing.JLabel();

        scrollEventos.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollEventos.setEnabled(false);

        tablaListaEventos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Fecha", "Descripción", "Recinto", "Ciudad", "Estado", "Selección de evento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaListaEventos.setColumnSelectionAllowed(true);
        tablaListaEventos.setEnabled(false);
        scrollEventos.setViewportView(tablaListaEventos);
        tablaListaEventos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicketWizard");

        pnlPrincipal.setBackground(new java.awt.Color(45, 48, 89));

        panelEncabezado1.setBackground(new java.awt.Color(90, 137, 255));

        etqLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoTicketwizard.png"))); // NOI18N

        etqTitulo.setText("Ticketwizard");
        etqTitulo.setBackground(new java.awt.Color(255, 255, 255));
        etqTitulo.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(255, 255, 255));

        etqFechaInicial1.setText("Fecha Inicial");
        etqFechaInicial1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etqFechaInicial1.setForeground(new java.awt.Color(255, 255, 255));

        etqFechaFinal1.setText("Fecha Final");
        etqFechaFinal1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etqFechaFinal1.setForeground(new java.awt.Color(255, 255, 255));

        campoBuscarEvento1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        etqBuscarEvento1.setText("Buscar Evento");
        etqBuscarEvento1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etqBuscarEvento1.setForeground(new java.awt.Color(255, 255, 255));

        etqNombreUsuario.setText("Nombre de usuario");
        etqNombreUsuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        etqNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));

        btnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoUsuario.png"))); // NOI18N
        btnUsuario.setBackground(null);
        btnUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuario.setToolTipText("");
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout panelEncabezado1Layout = new javax.swing.GroupLayout(panelEncabezado1);
        panelEncabezado1.setLayout(panelEncabezado1Layout);
        panelEncabezado1Layout.setHorizontalGroup(
            panelEncabezado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEncabezado1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(etqFechaInicial1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFechaInicial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etqFechaFinal1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFechaFinal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etqBuscarEvento1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoBuscarEvento1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEncabezado1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etqNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsuario)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEncabezado1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(443, 443, 443))
        );
        panelEncabezado1Layout.setVerticalGroup(
            panelEncabezado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezado1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEncabezado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etqLogo)
                    .addGroup(panelEncabezado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnUsuario)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEncabezado1Layout.createSequentialGroup()
                            .addGroup(panelEncabezado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(etqNombreUsuario)
                                .addComponent(etqTitulo))
                            .addGap(11, 11, 11))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEncabezado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoFechaInicial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoFechaFinal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqFechaInicial1)
                    .addComponent(etqFechaFinal1)
                    .addComponent(campoBuscarEvento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqBuscarEvento1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(17, 17, 17))
        );

        etqLogoBusquedaInvalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoBusquedaInvalida.png"))); // NOI18N

        etqBusquedaInvalida.setText("No se encontraron movimientos");
        etqBusquedaInvalida.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        javax.swing.GroupLayout pnlBusquedaRangoFechasInvalidaLayout = new javax.swing.GroupLayout(pnlBusquedaRangoFechasInvalida);
        pnlBusquedaRangoFechasInvalida.setLayout(pnlBusquedaRangoFechasInvalidaLayout);
        pnlBusquedaRangoFechasInvalidaLayout.setHorizontalGroup(
            pnlBusquedaRangoFechasInvalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBusquedaRangoFechasInvalidaLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(etqBusquedaInvalida)
                .addGap(18, 18, 18)
                .addComponent(etqLogoBusquedaInvalida, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        pnlBusquedaRangoFechasInvalidaLayout.setVerticalGroup(
            pnlBusquedaRangoFechasInvalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBusquedaRangoFechasInvalidaLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(pnlBusquedaRangoFechasInvalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqLogoBusquedaInvalida)
                    .addGroup(pnlBusquedaRangoFechasInvalidaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(etqBusquedaInvalida)))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEncabezado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(pnlBusquedaRangoFechasInvalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(panelEncabezado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(pnlBusquedaRangoFechasInvalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsuarioActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUsuario;
    private javax.swing.JTextField campoBuscarEvento1;
    private com.github.lgooddatepicker.components.DatePicker campoFechaFinal1;
    private com.github.lgooddatepicker.components.DatePicker campoFechaInicial1;
    private javax.swing.JLabel etqBuscarEvento1;
    private javax.swing.JLabel etqBusquedaInvalida;
    private javax.swing.JLabel etqFechaFinal1;
    private javax.swing.JLabel etqFechaInicial1;
    private javax.swing.JLabel etqLogo;
    private javax.swing.JLabel etqLogoBusquedaInvalida;
    private javax.swing.JLabel etqNombreUsuario;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel panelEncabezado1;
    private javax.swing.JPanel pnlBusquedaRangoFechasInvalida;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JScrollPane scrollEventos;
    private javax.swing.JTable tablaListaEventos;
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
