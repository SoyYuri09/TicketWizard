package itson.ticketwizard.presentacion;

import itson.ticketwizard.control.ControlCompra;

import itson.ticketwizard.entidades.Evento;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * @author García López, Yuri Germán - ID: 00000252583
 * @author Mendoza Baypoli, Vladimir Iván - ID: 00000252758
 * @author Romo López, Manuel - ID: 00000253080
 */

public class EventosDisponibles extends javax.swing.JFrame {

    private final ControlCompra control;
    private Integer[] codigosEventos;

    
    public EventosDisponibles(ControlCompra control) {
        initComponents();
        this.control = control;
        this.etqNombreUsuario.setText(control.obtenerNombreCorreoUsuarioDTO().getNombres() + " " 
                + control.obtenerNombreCorreoUsuarioDTO().getApellidoPaterno() + " "
                + control.obtenerNombreCorreoUsuarioDTO().getApellidoMaterno().substring(0,1) + ".");
        this.llenarTablaEventos();
    }

    private void llenarTablaEventos(){
        
        List<Evento> listaEventos = this.control.consultarListaEventos();
        
        JButton[] arregloBotones = new JButton[listaEventos.size()];
        
        for(int i = 0; i < arregloBotones.length; i++){
            arregloBotones[i] = new JButton("Comprar boletos");
            Font fuenteBoton = new Font("Segoe UI", Font.BOLD, 15);
            arregloBotones[i].setFont(fuenteBoton);
            arregloBotones[i].setBackground(new Color(190, 202, 255));
        }

        codigosEventos = new Integer[listaEventos.size()];
        
        
        JScrollPane scrollPaneEventos = new JScrollPane();
        
        scrollPaneEventos.setBounds(0,0,panelGeneral.getWidth(), panelGeneral.getHeight());
        panelGeneral.add(scrollPaneEventos);
        
        
        JPanel panelScroll = new JPanel();
        panelScroll.setBounds(20, 0, scrollPaneEventos.getWidth()- 10, scrollPaneEventos.getHeight());
        panelScroll.setLayout(new BoxLayout(panelScroll, BoxLayout.Y_AXIS));
        
        scrollPaneEventos.setViewportView(panelScroll);
        

        for(Evento evento: listaEventos){
           
     
            //Panel separador
            if(listaEventos.indexOf(evento) != 0){
                JPanel panelSeparador = new JPanel();
                panelSeparador.setBounds(0, 0, panelScroll.getWidth(), 20);
                panelSeparador.setBackground(Color.BLACK);
                panelScroll.add(panelSeparador);

            }
            
            
            JPanel panelEvento = new JPanel();
            panelEvento.setBounds(0,0, scrollPaneEventos.getWidth(), 300);
            panelEvento.setLayout(new FlowLayout(FlowLayout.LEFT));
            panelEvento.setBackground(Color.BLACK);
            
            panelScroll.add(panelEvento);
            
            
            JPanel panelInformacionEvento = new JPanel();
            panelInformacionEvento.setLayout(new BoxLayout(panelInformacionEvento, BoxLayout.Y_AXIS));
            panelInformacionEvento.setBounds(500,10,panelEvento.getWidth()/2, panelEvento.getHeight());
            
            //Nombre
            JLabel etqNombre = new JLabel((String)evento.getNombre());
            etqNombre.setForeground(Color.white);
            Font fuenteNombre = new Font("Segoe UI", Font.BOLD, 24);
            etqNombre.setFont(fuenteNombre);
            panelInformacionEvento.add(etqNombre);
            
            //Panel separador
            JPanel panelSeparador1 = new JPanel();
            panelSeparador1.setBackground(Color.BLACK);
            panelInformacionEvento.add(panelSeparador1);
            
            
            //Fecha
            String fecha = (String)evento.getFecha();
            
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
            
            panelInformacionEvento.add(etqFecha);
 
            //Panel separador
            JPanel panelSeparador2 = new JPanel();
            panelSeparador2.setBackground(Color.BLACK);
            panelInformacionEvento.add(panelSeparador2);
            
            //Descripción
            String descripcion = "<html>";
            
            String[] caracteresDescripcion = ((String)evento.getDescripcion()).split("");
            
            Pattern patron = Pattern.compile("^[\\s]");
            Matcher matcher;
            
            int caracteresRenglon = 0;
            for(int i = 0; i < caracteresDescripcion.length; i++){
                
                matcher = patron.matcher(caracteresDescripcion[i]);
                
                
                if(caracteresRenglon >= 60 && matcher.matches()){
                    descripcion += "<br>";
                    caracteresRenglon = 0;
                } else{
                    descripcion += caracteresDescripcion[i];
                    caracteresRenglon++;
                }
            }
            descripcion += "</html>";
            JLabel etqDescripcion = new JLabel(descripcion);
            etqDescripcion.setForeground(Color.white);   
            Font fuenteDescripcion = new Font("Segoe UI", Font.BOLD, 15);
            etqDescripcion.setFont(fuenteDescripcion);
            
            panelInformacionEvento.add(etqDescripcion);
            
            //Panel separador
            JPanel panelSeparador3 = new JPanel();
            panelSeparador3.setBackground(Color.BLACK);
            panelInformacionEvento.add(panelSeparador3);
            
            //Recinto, estado y ciudad
            String lugar = (String)evento.getRecinto() + ", " + (String)evento.getCiudad() + ", " + (String)evento.getEstado();
            JLabel etqLugar = new JLabel(lugar);
            etqLugar.setForeground(Color.white);
            Font fuenteEstado = new Font("Segoe UI", Font.BOLD, 17);
            etqLugar.setFont(fuenteEstado);
            
            panelInformacionEvento.add(etqLugar);
            
            panelInformacionEvento.setBackground(Color.BLACK);
            
            //Panel separador
            JPanel panelSeparador4 = new JPanel();
            panelSeparador4.setBackground(Color.BLACK);
            panelInformacionEvento.add(panelSeparador4);
            
            panelInformacionEvento.add(arregloBotones[listaEventos.indexOf(evento)]);     
            panelScroll.add(panelEvento);
            
            //Agregar banner de evento
            ImageIcon iconoBanner = new ImageIcon(this.getClass().getResource(evento.getDireccionBanner()));
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
            Image imagenBannerReducido = imagenGradiente.getScaledInstance(panelEvento.getWidth() - panelInformacionEvento.getWidth(), 
                    panelEvento.getHeight(), Image.SCALE_AREA_AVERAGING);
            
            ImageIcon imagenIconoReducido = new ImageIcon(imagenBannerReducido);
            
            JLabel etqImagenEvento = new JLabel(imagenIconoReducido);
            

            if(listaEventos.indexOf(evento) % 2 == 0){
                panelEvento.add(panelInformacionEvento);
                panelEvento.add(etqImagenEvento);
            } else{
                panelEvento.add(etqImagenEvento);
                panelEvento.add(panelInformacionEvento);
                
                
            
            }
           
           //Se agrega el código del evento actual a la lista codigosEventos. 
            Integer codigo = (Integer)evento.getCodigo();
            codigosEventos[listaEventos.indexOf(evento)] = codigo;
        }
        
        
        //Se agregan métodos actionPerformed para cada uno de los eventos obtenidos.
        for (int i = 0; i < arregloBotones.length; i++) {
            int j = i;
            JButton boton = arregloBotones[i];
            String nombre = arregloBotones[i].getName();
            boton.setActionCommand(nombre);
            boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    EventosDisponibles.this.control.mostrarListaBoletos(EventosDisponibles.this, codigosEventos[j]);
                }
            });
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollEventos = new javax.swing.JScrollPane();
        tablaListaEventos = new javax.swing.JTable();
        panelEncabezado = new javax.swing.JPanel();
        etqLogo = new javax.swing.JLabel();
        campoFechaInicial = new com.github.lgooddatepicker.components.DatePicker();
        campoFechaFinal = new com.github.lgooddatepicker.components.DatePicker();
        etqTitulo = new javax.swing.JLabel();
        etqFechaInicial = new javax.swing.JLabel();
        etqFechaFinal = new javax.swing.JLabel();
        campoBuscarEvento = new javax.swing.JTextField();
        etqBuscarEvento = new javax.swing.JLabel();
        etqNombreUsuario = new javax.swing.JLabel();
        btnUsuario = new javax.swing.JButton();
        panelGeneral = new javax.swing.JPanel();

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

        panelEncabezado.setBackground(new java.awt.Color(0, 0, 153));

        etqLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoTicketwizard.png"))); // NOI18N

        etqTitulo.setText("Ticketwizard");
        etqTitulo.setBackground(new java.awt.Color(255, 255, 255));
        etqTitulo.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(255, 255, 255));

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

        etqNombreUsuario.setText("Nombre de usuario");
        etqNombreUsuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        etqNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));

        btnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario.png"))); // NOI18N
        btnUsuario.setBackground(new java.awt.Color(245, 245, 245));
        btnUsuario.setForeground(new java.awt.Color(255, 255, 255));
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
                .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelEncabezadoLayout.createSequentialGroup()
                        .addComponent(etqFechaInicial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(etqFechaFinal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(etqBuscarEvento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoBuscarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelEncabezadoLayout.createSequentialGroup()
                        .addComponent(etqLogo)
                        .addGap(656, 656, 656)
                        .addComponent(etqNombreUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUsuario)
                        .addGap(133, 133, 133))))
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
                        .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etqLogo)
                            .addComponent(btnUsuario, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(panelEncabezadoLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(etqNombreUsuario)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqFechaInicial)
                    .addComponent(etqFechaFinal)
                    .addComponent(campoBuscarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqBuscarEvento))
                .addGap(37, 37, 37))
            .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelEncabezadoLayout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(etqTitulo)
                    .addContainerGap(101, Short.MAX_VALUE)))
        );

        panelGeneral.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelGeneralLayout = new javax.swing.GroupLayout(panelGeneral);
        panelGeneral.setLayout(panelGeneralLayout);
        panelGeneralLayout.setHorizontalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelGeneralLayout.setVerticalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 612, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsuarioActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUsuario;
    private javax.swing.JTextField campoBuscarEvento;
    private com.github.lgooddatepicker.components.DatePicker campoFechaFinal;
    private com.github.lgooddatepicker.components.DatePicker campoFechaInicial;
    private javax.swing.JLabel etqBuscarEvento;
    private javax.swing.JLabel etqFechaFinal;
    private javax.swing.JLabel etqFechaInicial;
    private javax.swing.JLabel etqLogo;
    private javax.swing.JLabel etqNombreUsuario;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JPanel panelEncabezado;
    private javax.swing.JPanel panelGeneral;
    private javax.swing.JScrollPane scrollEventos;
    private javax.swing.JTable tablaListaEventos;
    // End of variables declaration//GEN-END:variables
}
