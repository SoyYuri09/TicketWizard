package itson.ticketwizard.presentacion;

import itson.ticketwizard.control.ControlConsultarBoletos;
import java.awt.Image;
import java.awt.Toolkit;

/**
 * @author García López, Yuri Germán - ID: 00000252583
 * @author Mendoza Baypoli, Vladimir Iván - ID: 00000252758
 * @author Romo López, Manuel - ID: 00000253080
 */
public class ConsultaBoletos extends javax.swing.JFrame {

    private ControlConsultarBoletos control;
    
    public ConsultaBoletos(ControlConsultarBoletos control) {
        initComponents();
        
        setIconImage(iconoPropio);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Consulta de boletos");
        this.control = control;
        this.etqNombreUsuario.setText(control.obtenerNombreCorreoUsuarioDTO().getNombres() + " " 
                + control.obtenerNombreCorreoUsuarioDTO().getApellidoPaterno() + " "
                + control.obtenerNombreCorreoUsuarioDTO().getApellidoMaterno().substring(0,1) + ".");
//        this.cargarBoletos();
    }
//    
//    private void cargarBoletos(){
//        
//        
//        
//        
//        
//    }
//

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEncabezado3 = new javax.swing.JPanel();
        campoFechaInicial3 = new com.github.lgooddatepicker.components.DatePicker();
        campoFechaFinal3 = new com.github.lgooddatepicker.components.DatePicker();
        etqFechaInicial3 = new javax.swing.JLabel();
        etqFechaFinal3 = new javax.swing.JLabel();
        campoBuscarEvento3 = new javax.swing.JTextField();
        etqBuscarEvento3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        etqConsultarBoletos = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        menuUsuario = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu32 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        etqNombreUsuario = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(239, 239, 239));

        panelEncabezado3.setBackground(new java.awt.Color(90, 137, 255));

        etqFechaInicial3.setText("Fecha Inicial");
        etqFechaInicial3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etqFechaInicial3.setForeground(new java.awt.Color(255, 255, 255));

        etqFechaFinal3.setText("Fecha Final");
        etqFechaFinal3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etqFechaFinal3.setForeground(new java.awt.Color(255, 255, 255));

        campoBuscarEvento3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        etqBuscarEvento3.setText("Buscar Evento");
        etqBuscarEvento3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etqBuscarEvento3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelEncabezado3Layout = new javax.swing.GroupLayout(panelEncabezado3);
        panelEncabezado3.setLayout(panelEncabezado3Layout);
        panelEncabezado3Layout.setHorizontalGroup(
            panelEncabezado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezado3Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(etqFechaInicial3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFechaInicial3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etqFechaFinal3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFechaFinal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(etqBuscarEvento3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoBuscarEvento3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        panelEncabezado3Layout.setVerticalGroup(
            panelEncabezado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezado3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEncabezado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoFechaInicial3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoFechaFinal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqFechaInicial3)
                    .addComponent(etqFechaFinal3)
                    .addComponent(campoBuscarEvento3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqBuscarEvento3))
                .addGap(6, 6, 6))
        );

        jScrollPane1.setMaximumSize(new java.awt.Dimension(102767, 102767));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1119, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 586, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        etqConsultarBoletos.setText("Consultar boletos");
        etqConsultarBoletos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        btnVolver.setText("Volver");
        btnVolver.setBackground(new java.awt.Color(192, 223, 255));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        menuUsuario.setBackground(new java.awt.Color(90, 137, 255));

        jMenu3.setBackground(new java.awt.Color(90, 137, 255));
        jMenu3.setMaximumSize(new java.awt.Dimension(30, 32767));
        menuUsuario.add(jMenu3);

        jMenu32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoTicketwizard.png"))); // NOI18N
        jMenu32.setBackground(new java.awt.Color(90, 137, 255));
        jMenu32.setBorderPainted(false);
        jMenu32.setContentAreaFilled(false);
        jMenu32.setFocusable(false);
        jMenu32.setForeground(new java.awt.Color(90, 137, 255));
        jMenu32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jMenu32.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenu32.setMargin(new java.awt.Insets(3, 6, 3, 100));
        jMenu32.setMaximumSize(new java.awt.Dimension(95, 300));
        jMenu32.setRequestFocusEnabled(false);
        jMenu32.setRolloverEnabled(false);
        jMenu32.setVerifyInputWhenFocusTarget(false);
        menuUsuario.add(jMenu32);

        jMenu2.setText("Ticketwizard");
        jMenu2.setBackground(new java.awt.Color(90, 137, 255));
        jMenu2.setBorderPainted(false);
        jMenu2.setContentAreaFilled(false);
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu2.setFocusable(false);
        jMenu2.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setMaximumSize(new java.awt.Dimension(1100, 1000));
        jMenu2.setRequestFocusEnabled(false);
        jMenu2.setRolloverEnabled(false);
        jMenu2.setVerifyInputWhenFocusTarget(false);
        menuUsuario.add(jMenu2);

        etqNombreUsuario.setText("Nombre de usuario");
        etqNombreUsuario.setBackground(new java.awt.Color(90, 137, 255));
        etqNombreUsuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        etqNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        etqNombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etqNombreUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        etqNombreUsuario.setMaximumSize(new java.awt.Dimension(320, 32767));
        etqNombreUsuario.setVerifyInputWhenFocusTarget(false);
        menuUsuario.add(etqNombreUsuario);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoUsuario.png"))); // NOI18N
        jMenu1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jMenu1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoPerfil.png"))); // NOI18N
        jMenuItem2.setText("Mi perfil");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoTickets.png"))); // NOI18N
        jMenuItem3.setText("Mis boletos");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoCartera.png"))); // NOI18N
        jMenuItem4.setText("Cragar saldo");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoMovimientos.png"))); // NOI18N
        jMenuItem5.setText("Consultar movimientos");
        jMenu1.add(jMenuItem5);
        jMenu1.add(jSeparator1);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoCerrarSesion.png"))); // NOI18N
        jMenuItem6.setText("Cerrar sesión");
        jMenu1.add(jMenuItem6);

        menuUsuario.add(jMenu1);

        jMenu4.setBackground(new java.awt.Color(90, 137, 255));
        jMenu4.setMaximumSize(new java.awt.Dimension(30, 32767));
        menuUsuario.add(jMenu4);

        setJMenuBar(menuUsuario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEncabezado3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(517, 517, 517)
                .addComponent(etqConsultarBoletos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(526, 526, 526))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelEncabezado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etqConsultarBoletos)
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVolver)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        
    }//GEN-LAST:event_btnVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JTextField campoBuscarEvento3;
    private com.github.lgooddatepicker.components.DatePicker campoFechaFinal3;
    private com.github.lgooddatepicker.components.DatePicker campoFechaInicial3;
    private javax.swing.JLabel etqBuscarEvento3;
    private javax.swing.JLabel etqConsultarBoletos;
    private javax.swing.JLabel etqFechaFinal3;
    private javax.swing.JLabel etqFechaInicial3;
    private javax.swing.JMenu etqNombreUsuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu32;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuBar menuUsuario;
    private javax.swing.JPanel panelEncabezado3;
    // End of variables declaration//GEN-END:variables

    Image iconoPropio = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/logoTicketwizard.png")).getScaledInstance(80, 80, Image.SCALE_SMOOTH);
}