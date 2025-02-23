package itson.ticketwizard.presentacion;
import itson.ticketwizard.control.ControlCompra;
import itson.ticketwizard.dtos.BoletoElegidoDTO;
import itson.ticketwizard.dtos.NombreCorreoUsuarioDTO;
import itson.ticketwizard.dtos.UsuarioSaldoDTO;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.LinkedList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author García López, Yuri Germán - ID: 00000252583
 * @author Mendoza Baypoli, Vladimir Iván - ID: 00000252758
 * @author Romo López, Manuel - ID: 00000253080
 */

public class ConfirmacionCompra extends javax.swing.JFrame {

    private final ControlCompra control;
    private final Integer codigoEvento;
    private Double totalCompra;
    private LinkedList<Integer> codigosBoletosSeleccionados;
    
    public ConfirmacionCompra(ControlCompra control, LinkedList<Integer> codigosBoletosSeleccionados, Integer codigoEvento) {
        initComponents();
        this.control = control;
        this.etqNombreUsuario.setText(control.obtenerNombreCorreoUsuarioDTO().getNombres() + " " 
                + control.obtenerNombreCorreoUsuarioDTO().getApellidoPaterno() + " "
                + control.obtenerNombreCorreoUsuarioDTO().getApellidoMaterno().substring(0,1) + ".");
        this.codigosBoletosSeleccionados = codigosBoletosSeleccionados;
        this.codigoEvento = codigoEvento;
        this.cargarInformacionCompra();
    }
    
    private void cargarInformacionCompra(){
        List<BoletoElegidoDTO> listaBoletosElegidosDTO = this.control.obtenerListaBoletosElegidoDTO(codigosBoletosSeleccionados);
        
        this.scrollPaneCompras.setViewportView(panelScrollCompras);
        
        double precioTotal = 0;
        for(BoletoElegidoDTO boletoElegidoDTO: listaBoletosElegidosDTO){
            
            if(listaBoletosElegidosDTO.indexOf(boletoElegidoDTO) == 0){
                this.etqEventoTitulo.setText(boletoElegidoDTO.getNombreEvento());
                this.etqUbicacionEvento.setText(boletoElegidoDTO.getRecinto() + ", " + boletoElegidoDTO.getCiudad() + " " + boletoElegidoDTO.getEstado());
                
            }
            
            this.panelScrollCompras.setLayout(new GridLayout(listaBoletosElegidosDTO.size(), 2));
            
            JPanel panelIzquierdo = new JPanel();
            panelIzquierdo.setLayout(new FlowLayout(FlowLayout.CENTER));
            JPanel panelDerecho = new JPanel();
            panelDerecho.setLayout(new FlowLayout(FlowLayout.CENTER));


            JLabel etqBoletoTitulo = new JLabel("Fila " + boletoElegidoDTO.getFila() + " Asiento " +
                String.format("%02d", boletoElegidoDTO.getAsiento()));

            JLabel etqPrecioBoleto = new JLabel("$" + String.format("%.2f", boletoElegidoDTO.getPrecio()) + " pesos MXN");

            precioTotal += boletoElegidoDTO.getPrecio();

            Font fuenteBolteos = new Font("Segoe UI", Font.BOLD, 19);
            etqBoletoTitulo.setFont(fuenteBolteos);
            etqPrecioBoleto.setFont(fuenteBolteos);

            panelIzquierdo.add(etqBoletoTitulo);
            panelDerecho.add(etqPrecioBoleto);


            panelIzquierdo.setBackground(Color.WHITE);
            panelDerecho.setBackground(Color.WHITE);


            panelScrollCompras.add(panelIzquierdo);
            panelScrollCompras.add(panelDerecho);
            

        }
        this.etqPrecioTotal.setText("$" + String.format("%.2f", precioTotal) + " pesos MXN");
        this.totalCompra = precioTotal;
        
    }
    
    
    

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jMenu1 = new javax.swing.JMenu();
        panelEncabezado = new javax.swing.JPanel();
        etqLogo = new javax.swing.JLabel();
        etqTitulo = new javax.swing.JLabel();
        etqNombreUsuario = new javax.swing.JLabel();
        etqTituloConfirmacionCompra = new javax.swing.JLabel();
        scrollPaneCompras = new javax.swing.JScrollPane();
        panelScrollCompras = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        etqEventoTitulo = new javax.swing.JLabel();
        etqNombreEvento = new javax.swing.JLabel();
        etqUbicacionTitulo = new javax.swing.JLabel();
        etqUbicacionEvento = new javax.swing.JLabel();
        etqBoleto = new javax.swing.JLabel();
        etqPrecioBoleto = new javax.swing.JLabel();
        etqPrecioTotal = new javax.swing.JLabel();
        etqPrecioTotal1 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicketWizard");

        panelEncabezado.setBackground(new java.awt.Color(0, 0, 153));

        etqLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoTicketwizard.png"))); // NOI18N

        etqTitulo.setBackground(new java.awt.Color(255, 255, 255));
        etqTitulo.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo.setText("Ticketwizard");

        etqNombreUsuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etqNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        etqNombreUsuario.setText("Nombre de Usuario");

        javax.swing.GroupLayout panelEncabezadoLayout = new javax.swing.GroupLayout(panelEncabezado);
        panelEncabezado.setLayout(panelEncabezadoLayout);
        panelEncabezadoLayout.setHorizontalGroup(
            panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezadoLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(etqLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etqNombreUsuario)
                .addGap(137, 137, 137))
            .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelEncabezadoLayout.createSequentialGroup()
                    .addGap(114, 114, 114)
                    .addComponent(etqTitulo)
                    .addContainerGap(833, Short.MAX_VALUE)))
        );
        panelEncabezadoLayout.setVerticalGroup(
            panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezadoLayout.createSequentialGroup()
                .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEncabezadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etqLogo))
                    .addGroup(panelEncabezadoLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(etqNombreUsuario)))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelEncabezadoLayout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(etqTitulo)
                    .addContainerGap(49, Short.MAX_VALUE)))
        );

        etqTituloConfirmacionCompra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etqTituloConfirmacionCompra.setText("Resumen de compra");

        panelScrollCompras.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelScrollComprasLayout = new javax.swing.GroupLayout(panelScrollCompras);
        panelScrollCompras.setLayout(panelScrollComprasLayout);
        panelScrollComprasLayout.setHorizontalGroup(
            panelScrollComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 778, Short.MAX_VALUE)
        );
        panelScrollComprasLayout.setVerticalGroup(
            panelScrollComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );

        scrollPaneCompras.setViewportView(panelScrollCompras);

        btnVolver.setBackground(new java.awt.Color(196, 225, 255));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnAceptar.setBackground(new java.awt.Color(183, 219, 255));
        btnAceptar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        etqEventoTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqEventoTitulo.setText("Evento:");

        etqNombreEvento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        etqUbicacionTitulo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        etqUbicacionTitulo.setText("Ubicación:");

        etqUbicacionEvento.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        etqBoleto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqBoleto.setText("Boleto");

        etqPrecioBoleto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqPrecioBoleto.setText("Precio");

        etqPrecioTotal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        etqPrecioTotal1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etqPrecioTotal1.setText("Total:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etqBoleto)
                            .addGap(251, 251, 251)
                            .addComponent(etqPrecioBoleto)
                            .addGap(180, 180, 180))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(242, 242, 242)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(etqUbicacionTitulo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(etqUbicacionEvento))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(etqEventoTitulo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(etqNombreEvento)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(scrollPaneCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(199, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(etqTituloConfirmacionCompra)
                        .addGap(450, 450, 450))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etqPrecioTotal1)
                                .addGap(54, 54, 54)
                                .addComponent(etqPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btnVolver)
                                .addGap(69, 69, 69)
                                .addComponent(btnAceptar)))
                        .addGap(253, 253, 253))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etqTituloConfirmacionCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqEventoTitulo)
                    .addComponent(etqNombreEvento))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqUbicacionTitulo)
                    .addComponent(etqUbicacionEvento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqBoleto)
                    .addComponent(etqPrecioBoleto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqPrecioTotal1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnVolver))
                .addGap(39, 39, 39))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.control.mostrarListaBoletos(this, this.codigoEvento);
        
        
        
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        NombreCorreoUsuarioDTO nombreCorreoUsuarioDTO = this.control.obtenerNombreCorreoUsuarioDTO();
        
        String correoElectronico = nombreCorreoUsuarioDTO.getCorreoElectronico();
        UsuarioSaldoDTO usuarioSaldoDTO= this.control.obtenerUsuarioSaldoDTO(correoElectronico);
        
        Integer codigoUsuario = usuarioSaldoDTO.getCodigo();
        Double saldo = usuarioSaldoDTO.getSaldo();
        
        if(saldo >= this.totalCompra){
            this.control.comprarBoletos(codigosBoletosSeleccionados, codigoUsuario);
        } else{
            this.control.crearReserva(codigosBoletosSeleccionados, codigoUsuario);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel etqBoleto;
    private javax.swing.JLabel etqEventoTitulo;
    private javax.swing.JLabel etqLogo;
    private javax.swing.JLabel etqNombreEvento;
    private javax.swing.JLabel etqNombreUsuario;
    private javax.swing.JLabel etqPrecioBoleto;
    private javax.swing.JLabel etqPrecioTotal;
    private javax.swing.JLabel etqPrecioTotal1;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JLabel etqTituloConfirmacionCompra;
    private javax.swing.JLabel etqUbicacionEvento;
    private javax.swing.JLabel etqUbicacionTitulo;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel panelEncabezado;
    private javax.swing.JPanel panelScrollCompras;
    private javax.swing.JScrollPane scrollPaneCompras;
    // End of variables declaration//GEN-END:variables
}
