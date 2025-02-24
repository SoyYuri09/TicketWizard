package itson.ticketwizard.presentacion;

import itson.ticketwizard.control.ControlCargarSaldo;

import itson.ticketwizard.dtos.TransaccionApartadaDTO;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * @author García López, Yuri Germán - ID: 00000252583
 * @author Mendoza Baypoli, Vladimir Iván - ID: 00000252758
 * @author Romo López, Manuel - ID: 00000253080
 */

public class ComprasRealizadas extends javax.swing.JFrame {

    private final ControlCargarSaldo control;
    private Integer codigoUsuario; 
    private List<TransaccionApartadaDTO> listaTransaccionApartadaDTOs;
    private Integer[] codigoTransacciones;

    
    public ComprasRealizadas(ControlCargarSaldo control, List<TransaccionApartadaDTO> listaTransaccionApartadaDTOs) {
        this.listaTransaccionApartadaDTOs = listaTransaccionApartadaDTOs;
        initComponents();
        this.control = control;
        this.etqNombreUsuario.setText(control.obtenerNombreCorreoUsuarioDTO().getNombres() + " " 
                + control.obtenerNombreCorreoUsuarioDTO().getApellidoPaterno() + " "
                + control.obtenerNombreCorreoUsuarioDTO().getApellidoMaterno().substring(0,1) + ".");
    }

    private void llenarTablaCompras(){
        
        if(listaTransaccionApartadaDTOs.isEmpty()){
            this.control.mostrarCompra(this);
        } else {

            JScrollPane scrollPaneCompras = new JScrollPane();

            scrollPaneCompras.setBounds(0,0,panelGeneral.getWidth(), panelGeneral.getHeight());
            panelGeneral.add(scrollPaneCompras);
            panelGeneral.setBackground(Color.red);

            JPanel panelScroll = new JPanel();
            panelScroll.setBounds(20, 0, scrollPaneCompras.getWidth(), scrollPaneCompras.getHeight());
            panelScroll.setLayout(new BoxLayout(panelScroll, BoxLayout.Y_AXIS));

            scrollPaneCompras.setViewportView(panelScroll);
            for(TransaccionApartadaDTO transaccionApartadaDTO: listaTransaccionApartadaDTOs){


                if(listaTransaccionApartadaDTOs.indexOf(transaccionApartadaDTO) == 0){
                    this.codigoUsuario = transaccionApartadaDTO.getCodigoUsuarioComprador();

                }

                //Panel separador
                if(listaTransaccionApartadaDTOs.indexOf(transaccionApartadaDTO) != 0){
                    JPanel panelSeparador = new JPanel();
                    panelSeparador.setBounds(0, 0, panelScroll.getWidth(), 20);
                    panelSeparador.setBackground(Color.BLACK);
                    panelScroll.add(panelSeparador);

                }


                JPanel panelCompra = new JPanel();
                panelCompra.setBounds(0,0, scrollPaneCompras.getWidth(), 300);
                panelCompra.setLayout(new FlowLayout(FlowLayout.LEFT));
                panelCompra.setBackground(Color.BLACK);

                panelScroll.add(panelCompra);


                JPanel panelInformacionReservas = new JPanel();
                panelInformacionReservas.setLayout(new BoxLayout(panelInformacionReservas, BoxLayout.Y_AXIS));
                panelInformacionReservas.setBounds(500,10,panelCompra.getWidth()/2, panelCompra.getHeight());

                //Código de transacción
                JLabel etqCodigoTransaccion = new JLabel(String.valueOf(transaccionApartadaDTO.getCodigoTransaccion()));
                etqCodigoTransaccion.setForeground(Color.white);
                Font fuenteTransaccion = new Font("Segoe UI", Font.BOLD, 24);
                etqCodigoTransaccion.setFont(fuenteTransaccion);
                panelInformacionReservas.add(etqCodigoTransaccion);

                //Panel separador
                JPanel panelSeparador1 = new JPanel();
                panelSeparador1.setBackground(Color.BLACK);
                panelInformacionReservas.add(panelSeparador1);

                
                //Numero boleto
                JLabel etqNumeroBoleto = new JLabel(String.valueOf(transaccionApartadaDTO.getCodigoBoleto()));
                etqNumeroBoleto.setForeground(Color.white);
                Font fuenteBoleto = new Font("Segoe UI", Font.BOLD, 24);
                etqNumeroBoleto.setFont(fuenteBoleto);
                panelInformacionReservas.add(etqNumeroBoleto);

                //Fecha hora
                String fecha = (String)transaccionApartadaDTO.getFechaHora();

                String[] partesFecha = fecha.split("-");

                String mesFecha = "";
                for(int i = 0; i < 3; i++){
                    if(partesFecha[i].equals("01")){
                        mesFecha = "enero";
                    }
                    if(partesFecha[i].equals("02")){
                        mesFecha = "febrero";
                    }
                    if(partesFecha[i].equals("03")){
                        mesFecha = "marzo";
                    }
                    if(partesFecha[i].equals("04")){
                        mesFecha = "abril";
                    }
                    if(partesFecha[i].equals("05")){
                        mesFecha = "mayo";
                    }
                    if(partesFecha[i].equals("06")){
                        mesFecha = "junio";
                    }
                    if(partesFecha[i].equals("07")){
                        mesFecha = "julio";
                    }
                    if(partesFecha[i].equals("08")){
                        mesFecha = "agosto";
                    }
                    if(partesFecha[i].equals("09")){
                        mesFecha = "septiembre";
                    }
                     if(partesFecha[i].equals("10")){
                        mesFecha = "octubre";
                    }
                    if(partesFecha[i].equals("11")){
                        mesFecha = "noviembre";
                    }
                    if(partesFecha[i].equals("12")){
                        mesFecha = "diciembre";
                    }

                }

                String fechaConFormato = partesFecha[2] + " de " + mesFecha + ", " + partesFecha[0];

                JLabel etqFecha = new JLabel(fechaConFormato);
                etqFecha.setForeground(Color.white);
                Font fuenteFecha = new Font("Segoe UI", Font.BOLD, 20);
                etqFecha.setFont(fuenteFecha);

                panelInformacionReservas.add(etqFecha);

                //Panel separador
                JPanel panelSeparador2 = new JPanel();
                panelSeparador2.setBackground(Color.BLACK);
                panelInformacionReservas.add(panelSeparador2);

                //Codigo usuario comprador
                String adquisicion = null;
                if(transaccionApartadaDTO.getCodigoUsuarioRevendedor() == null){
                    adquisicion = "De boletera";
                } else {
                    adquisicion = "De reventa";
                }
                JLabel etqAdquisicion = new JLabel(adquisicion);
                etqAdquisicion.setForeground(Color.white);
                Font fuenteAdquisicion = new Font("Segoe UI", Font.BOLD, 24);
                etqAdquisicion.setFont(fuenteAdquisicion);
                panelInformacionReservas.add(etqAdquisicion);

                //Panel separador
                JPanel panelSeparador3 = new JPanel();
                panelSeparador3.setBackground(Color.BLACK);
                panelInformacionReservas.add(panelSeparador3);

                //Costo
                JLabel etqCosto = new JLabel(String.format("%.2f",transaccionApartadaDTO.getPrecioVenta()));
                etqCosto.setForeground(Color.white);
                Font fuenteCosto = new Font("Segoe UI", Font.BOLD, 24);
                etqCosto.setFont(fuenteCosto);
                panelInformacionReservas.add(etqCosto);

                //Recinto, estado y ciudad
                String lugar = (String)transaccionApartadaDTO.getRecinto() + ", " + (String)transaccionApartadaDTO.getCiudad() + ", " + (String)transaccionApartadaDTO.getEstado();
                JLabel etqLugar = new JLabel(lugar);
                etqLugar.setForeground(Color.white);
                Font fuenteEstado = new Font("Segoe UI", Font.BOLD, 17);
                etqLugar.setFont(fuenteEstado);

                panelInformacionReservas.add(etqLugar);

                panelInformacionReservas.setBackground(Color.BLACK);

                //Panel separador
                JPanel panelSeparador4 = new JPanel();
                panelSeparador4.setBackground(Color.BLACK);
                panelInformacionReservas.add(panelSeparador4);

                //Agregar banner de evento
                ImageIcon iconoBanner = new ImageIcon(this.getClass().getResource(transaccionApartadaDTO.getDireccionBanner()));
                Image imagenBanner = iconoBanner.getImage();

                //Aplicar gradiente al banner
                BufferedImage imagenGradiente = new BufferedImage(imagenBanner.getWidth(null), imagenBanner.getHeight(null), 
                        BufferedImage.TYPE_INT_ARGB);

                Graphics2D g2d = imagenGradiente.createGraphics();

                g2d.drawImage(imagenBanner, 0, 0, null);

                GradientPaint gradienteIzquierda = new GradientPaint(0, imagenBanner.getHeight(null)/2,
                        Color.BLACK, imagenBanner.getWidth(null)/3, 
                        imagenBanner.getHeight(null)/2, new Color(0,0,0,0));
                g2d.setPaint(gradienteIzquierda);
                g2d.fillRect(0, 0, imagenBanner.getWidth(null), imagenBanner.getHeight(null));

                GradientPaint gradienteDerecha = new GradientPaint(imagenBanner.getWidth(null), imagenBanner.getHeight(null)/2,
                        Color.BLACK, imagenBanner.getWidth(null)/ 3 * 2, 
                        imagenBanner.getHeight(null)/2, new Color(0,0,0,0));

                g2d.setPaint(gradienteDerecha);
                g2d.fillRect(0, 0, imagenBanner.getWidth(null), imagenBanner.getHeight(null));

                g2d.dispose();

                //Cambio de tamaño de banner
                Image imagenBannerReducido = imagenGradiente.getScaledInstance(panelCompra.getWidth() - panelInformacionReservas.getWidth(), 
                        panelCompra.getHeight(), Image.SCALE_AREA_AVERAGING);

                ImageIcon imagenIconoReducido = new ImageIcon(imagenBannerReducido);

                JLabel etqImagenEvento = new JLabel(imagenIconoReducido);


                panelCompra.add(etqImagenEvento);
                panelCompra.add(panelInformacionReservas);
                panelCompra.setBackground(Color.red);
                panelInformacionReservas.setBackground(Color.BLUE);
                panelScroll.setBackground(Color.GREEN);
                scrollPaneCompras.setBackground(Color.PINK);


                //Se agrega el código del evento actual a la lista codigosEventos. 
                Integer codigoTransaccion = transaccionApartadaDTO.getCodigoTransaccion();
                codigoTransacciones[listaTransaccionApartadaDTOs.indexOf(transaccionApartadaDTO)] = codigoTransaccion;
            }
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollEventos = new javax.swing.JScrollPane();
        tablaListaEventos = new javax.swing.JTable();
        panelGeneral = new javax.swing.JPanel();
        panelEncabezado = new javax.swing.JPanel();
        campoFechaInicial = new com.github.lgooddatepicker.components.DatePicker();
        campoFechaFinal = new com.github.lgooddatepicker.components.DatePicker();
        etqFechaInicial = new javax.swing.JLabel();
        etqFechaFinal = new javax.swing.JLabel();
        campoBuscarEvento = new javax.swing.JTextField();
        etqBuscarEvento = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        menuUsuario = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu32 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        etqNombreUsuario = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        opcionPerfil = new javax.swing.JMenuItem();
        opcMisBoletos = new javax.swing.JMenuItem();
        opcioCargarSaldo = new javax.swing.JMenuItem();
        opcionConsultarMovimientos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        opcionCerrarSesion = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

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

        panelGeneral.setBackground(new java.awt.Color(255, 255, 255));
        panelGeneral.setOpaque(false);

        javax.swing.GroupLayout panelGeneralLayout = new javax.swing.GroupLayout(panelGeneral);
        panelGeneral.setLayout(panelGeneralLayout);
        panelGeneralLayout.setHorizontalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1181, Short.MAX_VALUE)
        );
        panelGeneralLayout.setVerticalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
        );

        panelEncabezado.setBackground(new java.awt.Color(90, 137, 255));

        etqFechaInicial.setText("Fecha Inicial");
        etqFechaInicial.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etqFechaInicial.setForeground(new java.awt.Color(255, 255, 255));

        etqFechaFinal.setText("Fecha Final");
        etqFechaFinal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etqFechaFinal.setForeground(new java.awt.Color(255, 255, 255));

        campoBuscarEvento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        etqBuscarEvento.setText("Buscar Evento");
        etqBuscarEvento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etqBuscarEvento.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelEncabezadoLayout = new javax.swing.GroupLayout(panelEncabezado);
        panelEncabezado.setLayout(panelEncabezadoLayout);
        panelEncabezadoLayout.setHorizontalGroup(
            panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezadoLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(etqFechaInicial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etqFechaFinal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(etqBuscarEvento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoBuscarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        panelEncabezadoLayout.setVerticalGroup(
            panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqFechaInicial)
                    .addComponent(etqFechaFinal)
                    .addComponent(campoBuscarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqBuscarEvento))
                .addGap(6, 6, 6))
        );

        btnAceptar.setText("Aceptar");
        btnAceptar.setBackground(new java.awt.Color(192, 223, 255));
        btnAceptar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
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

        opcionPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoPerfil.png"))); // NOI18N
        opcionPerfil.setText("Mi perfil");
        jMenu1.add(opcionPerfil);

        opcMisBoletos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoTickets.png"))); // NOI18N
        opcMisBoletos.setText("Mis boletos");
        jMenu1.add(opcMisBoletos);

        opcioCargarSaldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoCartera.png"))); // NOI18N
        opcioCargarSaldo.setText("Cargar saldo");
        opcioCargarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcioCargarSaldoActionPerformed(evt);
            }
        });
        jMenu1.add(opcioCargarSaldo);

        opcionConsultarMovimientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoMovimientos.png"))); // NOI18N
        opcionConsultarMovimientos.setText("Consultar movimientos");
        jMenu1.add(opcionConsultarMovimientos);
        jMenu1.add(jSeparator1);

        opcionCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoCerrarSesion.png"))); // NOI18N
        opcionCerrarSesion.setText("Cerrar sesión");
        jMenu1.add(opcionCerrarSesion);

        menuUsuario.add(jMenu1);

        jMenu4.setBackground(new java.awt.Color(90, 137, 255));
        jMenu4.setMaximumSize(new java.awt.Dimension(30, 32767));
        menuUsuario.add(jMenu4);

        setJMenuBar(menuUsuario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(509, 509, 509)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAceptar)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void opcioCargarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcioCargarSaldoActionPerformed

    }//GEN-LAST:event_opcioCargarSaldoActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
    this.control.mostrarCompra(this);
    }//GEN-LAST:event_btnAceptarActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JTextField campoBuscarEvento;
    private com.github.lgooddatepicker.components.DatePicker campoFechaFinal;
    private com.github.lgooddatepicker.components.DatePicker campoFechaInicial;
    private javax.swing.JLabel etqBuscarEvento;
    private javax.swing.JLabel etqFechaFinal;
    private javax.swing.JLabel etqFechaInicial;
    private javax.swing.JMenu etqNombreUsuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu32;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuBar menuUsuario;
    private javax.swing.JMenuItem opcMisBoletos;
    private javax.swing.JMenuItem opcioCargarSaldo;
    private javax.swing.JMenuItem opcionCerrarSesion;
    private javax.swing.JMenuItem opcionConsultarMovimientos;
    private javax.swing.JMenuItem opcionPerfil;
    private javax.swing.JPanel panelEncabezado;
    private javax.swing.JPanel panelGeneral;
    private javax.swing.JScrollPane scrollEventos;
    private javax.swing.JTable tablaListaEventos;
    // End of variables declaration//GEN-END:variables
}
