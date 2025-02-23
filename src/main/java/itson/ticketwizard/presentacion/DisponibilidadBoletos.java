package itson.ticketwizard.presentacion;
import itson.ticketwizard.control.ControlCompra;
import itson.ticketwizard.dtos.EventoDisponibilidadBoletoDTO;
import itson.ticketwizard.entidades.Boleto;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * @author García López, Yuri Germán - ID: 00000252583
 * @author Mendoza Baypoli, Vladimir Iván - ID: 00000252758
 * @author Romo López, Manuel - ID: 00000253080
 */

public class DisponibilidadBoletos extends javax.swing.JFrame {

    private final ControlCompra control;
    private final Integer codigoEvento;
    private LinkedList<Integer> listaCodigosBoleto;
    private LinkedList<JCheckBox> listaCheckBoxes;
 
    public DisponibilidadBoletos(ControlCompra control, Integer codigoEvento) {
        initComponents();
        this.control = control;
        this.etqNombreUsuario.setText(control.obtenerNombreCorreoUsuarioDTO().getNombres() + " " 
                + control.obtenerNombreCorreoUsuarioDTO().getApellidoPaterno() + " "
                + control.obtenerNombreCorreoUsuarioDTO().getApellidoMaterno().substring(0,1) + ".");
        this.codigoEvento = codigoEvento;
        this.llenarBoletosTodos();
    }
    
    private void cargarDatosEvento(){
        EventoDisponibilidadBoletoDTO eventoDisponibilidadBoletoDTO = this.control.obtenerDatosBasicosEvento(codigoEvento);
        
        //Se crea un panel para el fondo
        JPanel panelBannerFondo  =new JPanel();
        panelBannerFondo.setBounds(0,0,panelGeneral.getWidth(),panelGeneral.getHeight());
        panelGeneral.add(panelBannerFondo);
                
        //Cargar imagen
        ImageIcon iconoBanner = new ImageIcon(this.getClass().getResource(eventoDisponibilidadBoletoDTO.getDireccionBanner()));
        Image imagenBanner = iconoBanner.getImage();

        //Aplicar gradiente al banner
        BufferedImage imagenGradiente = new BufferedImage(imagenBanner.getWidth(null), imagenBanner.getHeight(null), 
                BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2d = imagenGradiente.createGraphics();

        g2d.drawImage(imagenBanner, 0, 0, null);

        GradientPaint gradiente = new GradientPaint(panelBannerFondo.getWidth()/2, panelBannerFondo.getHeight(),
                new Color(0,0,0,250), panelBannerFondo.getWidth()/2, 
                -panelBannerFondo.getHeight(), new Color(0,0,0,0));
        g2d.setPaint(gradiente);
        g2d.fillRect(0, 0, imagenBanner.getWidth(null), imagenBanner.getHeight(null));

        g2d.dispose();

        //Cambio de tamaño de banner
        Image imagenBannerAumentado = imagenGradiente.getScaledInstance(panelBannerFondo.getWidth(), 
                panelBannerFondo.getHeight(), Image.SCALE_AREA_AVERAGING);

        ImageIcon imagenIconoAumentado = new ImageIcon(imagenBannerAumentado);

        JLabel etqImagenEvento = new JLabel(imagenIconoAumentado);
          
  
        panelBannerFondo.add(etqImagenEvento);
        
        radioBoletera.setBackground(null);
 
    }
    
    private void cargarTablaBoletos(List<Boleto> listaBoletos){
        
        panelScrollBoletos.removeAll();
        panelScrollBoletos.repaint();
        
        scrollPaneBoletos.setViewportView(panelScrollBoletos);
            
       
        if(listaBoletos.isEmpty()){
            
            
            panelScrollBoletos.setLayout(new BoxLayout(panelScrollBoletos, BoxLayout.Y_AXIS));
            
            JPanel panelMensaje = new JPanel(new FlowLayout(FlowLayout.CENTER));
            JPanel panelImagen = new JPanel(new FlowLayout(FlowLayout.CENTER));
            JPanel separadorSuperior = new JPanel();
            JPanel separadorInferior = new JPanel();
            
            panelScrollBoletos.add(separadorSuperior);
            panelScrollBoletos.add(panelImagen);
            panelScrollBoletos.add(panelMensaje);
            panelScrollBoletos.add(separadorInferior);
            
            separadorSuperior.setBackground(new Color(36, 39, 51));
            panelImagen.setBackground(new Color(36, 39, 51));
            panelMensaje.setBackground(new Color(36, 39, 51));
            separadorInferior.setBackground(new Color(36, 39, 51));
            
            panelScrollBoletos.setBackground(new Color(36, 39, 51));
         
            
            JLabel etqSinResultados = new JLabel("No se econtraron resultados");
            Font fuenteBoton = new Font("Segoe UI", Font.BOLD, 22);
            etqSinResultados.setFont(fuenteBoton);
            etqSinResultados.setForeground(Color.WHITE);
            
            
            ImageIcon iconoLupa = new ImageIcon(this.getClass().getResource("/lupaInvalida.png"));
            JLabel etqImagenLupa = new JLabel(iconoLupa); 
           
            panelMensaje.add(etqImagenLupa);
            panelImagen.add(etqSinResultados);
            
            etqImagenLupa.setHorizontalAlignment(SwingConstants.CENTER);
            etqSinResultados.setHorizontalAlignment(SwingConstants.CENTER);
               
        } else{
            
            listaCodigosBoleto = new LinkedList<>();
            listaCheckBoxes = new LinkedList<>();

            panelEncabezadosTabla.setBackground(new Color(218,218,218,100));


           
            panelScrollBoletos.setLayout(new GridLayout(listaBoletos.size(), 4));


            for(Boleto boleto: listaBoletos){
 
                listaCodigosBoleto.add(boleto.getCodigo());

                JCheckBox checkBoxBoleto = new JCheckBox();
                listaCheckBoxes.add(checkBoxBoleto);
                checkBoxBoleto.setBackground(null);
                checkBoxBoleto.setText("");

                String fila = "Fila " +  boleto.getFila();
                JLabel etqFilaValor = new JLabel(fila);

                String asiento = "Asiento "  + String.format("%02d", boleto.getAsiento());
                JLabel etqAsientoValor = new JLabel(asiento);

                String precio = "$" + String.format("%.2f", boleto.getPrecio()) + " pesos MXN";
                JLabel etqPrecioVaor = new JLabel(precio);

                Font fuenteValoresTabla = new Font("Segoe UI", Font.BOLD, 18);

                etqFilaValor.setForeground(Color.WHITE);
                etqAsientoValor.setForeground(Color.WHITE);
                etqPrecioVaor.setForeground(Color.WHITE);

                etqFilaValor.setFont(fuenteValoresTabla);
                etqAsientoValor.setFont(fuenteValoresTabla);
                etqPrecioVaor.setFont(fuenteValoresTabla);

                JPanel panelCheckBox = new JPanel(new FlowLayout(FlowLayout.CENTER));
                panelCheckBox.setBackground(new Color(36, 39, 51));

                JPanel panelFila = new JPanel(new FlowLayout(FlowLayout.CENTER));
                panelFila.setBackground(new Color(36, 39, 51));

                JPanel panelAsiento = new JPanel(new FlowLayout(FlowLayout.LEFT));
                panelAsiento.setBackground(new Color(36, 39, 51));

                JPanel panelPrecio = new JPanel(new FlowLayout(FlowLayout.LEFT));
                panelPrecio.setBackground(new Color(36, 39, 51));

                panelCheckBox.add(checkBoxBoleto);
                panelFila.add(etqFilaValor);
                panelAsiento.add(etqAsientoValor);
                panelPrecio.add(etqPrecioVaor);

                panelScrollBoletos.add(panelCheckBox);
                panelScrollBoletos.add(panelFila);
                panelScrollBoletos.add(panelAsiento);
                panelScrollBoletos.add(panelPrecio);


            }
        }
        
    }
    
    private void llenarBoletosTodos(){
        this.cargarDatosEvento();
        this.cargarTablaBoletos(this.control.obtenerBoletos(codigoEvento));
        
    }

    private void llenarBoletosReventa(){
        this.cargarDatosEvento();
        this.cargarTablaBoletos(this.control.obtenerBoletosReventa(codigoEvento));
    }
    
    private void llenarBoletosBoletera(){
        this.cargarDatosEvento();
        this.cargarTablaBoletos(this.control.obtenerBoletosBoletera(codigoEvento));
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jMenu1 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        panelEncabezado = new javax.swing.JPanel();
        etqLogo = new javax.swing.JLabel();
        etqTitulo = new javax.swing.JLabel();
        etqNombreUsuario = new javax.swing.JLabel();
        panelGeneral = new javax.swing.JPanel();
        btnComprar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        scrollPaneBoletos = new javax.swing.JScrollPane();
        panelScrollBoletos = new javax.swing.JPanel();
        panelEncabezadosTabla = new javax.swing.JPanel();
        etqFila = new javax.swing.JLabel();
        etqPrecio = new javax.swing.JLabel();
        etqAsiento = new javax.swing.JLabel();
        etqSeleccion = new javax.swing.JLabel();
        etqEncabezadoTitulo = new javax.swing.JLabel();
        panelRadioBoletos = new javax.swing.JPanel();
        radioTodos = new javax.swing.JRadioButton();
        radioReventa = new javax.swing.JRadioButton();
        radioBoletera = new javax.swing.JRadioButton();
        etqVer = new javax.swing.JLabel();
        panelOrden = new javax.swing.JPanel();
        radioBtnMayorMenor = new javax.swing.JRadioButton();
        radioBtnMenorMayor = new javax.swing.JRadioButton();
        etqRadioOrden1 = new javax.swing.JLabel();
        etqRadioOrden2 = new javax.swing.JLabel();

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
                .addGap(94, 94, 94))
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

        panelGeneral.setBackground(new java.awt.Color(204, 204, 204));
        panelGeneral.setForeground(new java.awt.Color(255, 255, 255));

        btnComprar.setBackground(new java.awt.Color(204, 255, 204));
        btnComprar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(204, 255, 204));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        panelScrollBoletos.setBackground(new Color(0,0,0,0));
        panelScrollBoletos.setOpaque(false);

        javax.swing.GroupLayout panelScrollBoletosLayout = new javax.swing.GroupLayout(panelScrollBoletos);
        panelScrollBoletos.setLayout(panelScrollBoletosLayout);
        panelScrollBoletosLayout.setHorizontalGroup(
            panelScrollBoletosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1025, Short.MAX_VALUE)
        );
        panelScrollBoletosLayout.setVerticalGroup(
            panelScrollBoletosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
        );

        scrollPaneBoletos.setViewportView(panelScrollBoletos);

        etqFila.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqFila.setForeground(new java.awt.Color(255, 255, 255));
        etqFila.setText("Fila");

        etqPrecio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqPrecio.setForeground(new java.awt.Color(255, 255, 255));
        etqPrecio.setText("Precio");

        etqAsiento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqAsiento.setForeground(new java.awt.Color(255, 255, 255));
        etqAsiento.setText("Asiento");

        etqSeleccion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqSeleccion.setForeground(new java.awt.Color(255, 255, 255));
        etqSeleccion.setText("Comprar boleto");

        javax.swing.GroupLayout panelEncabezadosTablaLayout = new javax.swing.GroupLayout(panelEncabezadosTabla);
        panelEncabezadosTabla.setLayout(panelEncabezadosTablaLayout);
        panelEncabezadosTablaLayout.setHorizontalGroup(
            panelEncabezadosTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezadosTablaLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(etqSeleccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(etqFila)
                .addGap(127, 127, 127)
                .addComponent(etqAsiento)
                .addGap(196, 196, 196)
                .addComponent(etqPrecio)
                .addGap(199, 199, 199))
        );
        panelEncabezadosTablaLayout.setVerticalGroup(
            panelEncabezadosTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezadosTablaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelEncabezadosTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqAsiento)
                    .addComponent(etqPrecio)
                    .addComponent(etqSeleccion)
                    .addComponent(etqFila))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        etqEncabezadoTitulo.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        etqEncabezadoTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etqEncabezadoTitulo.setText("Boletos disponibles");

        panelRadioBoletos.setBackground(new java.awt.Color(0, 0, 0));
        panelRadioBoletos.setForeground(new java.awt.Color(255, 255, 255));

        radioTodos.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(radioTodos);
        radioTodos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        radioTodos.setForeground(new java.awt.Color(255, 255, 255));
        radioTodos.setText("Todos");
        radioTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTodosActionPerformed(evt);
            }
        });

        radioReventa.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(radioReventa);
        radioReventa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        radioReventa.setForeground(new java.awt.Color(255, 255, 255));
        radioReventa.setText("Reventa");
        radioReventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioReventaActionPerformed(evt);
            }
        });

        radioBoletera.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(radioBoletera);
        radioBoletera.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        radioBoletera.setForeground(new java.awt.Color(255, 255, 255));
        radioBoletera.setText("De boletera");
        radioBoletera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBoleteraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRadioBoletosLayout = new javax.swing.GroupLayout(panelRadioBoletos);
        panelRadioBoletos.setLayout(panelRadioBoletosLayout);
        panelRadioBoletosLayout.setHorizontalGroup(
            panelRadioBoletosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRadioBoletosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRadioBoletosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioTodos)
                    .addComponent(radioReventa)
                    .addComponent(radioBoletera))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panelRadioBoletosLayout.setVerticalGroup(
            panelRadioBoletosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRadioBoletosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(radioTodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioReventa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioBoletera)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        etqVer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqVer.setForeground(new java.awt.Color(255, 255, 255));
        etqVer.setText("Ver:");

        panelOrden.setBackground(new java.awt.Color(0, 0, 0));

        radioBtnMayorMenor.setBackground(new java.awt.Color(0, 0, 0));
        radioBtnMayorMenor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        radioBtnMayorMenor.setForeground(new java.awt.Color(255, 255, 255));
        radioBtnMayorMenor.setText("De mayor a");
        radioBtnMayorMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnMayorMenorActionPerformed(evt);
            }
        });

        radioBtnMenorMayor.setBackground(new java.awt.Color(0, 0, 0));
        radioBtnMenorMayor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        radioBtnMenorMayor.setForeground(new java.awt.Color(255, 255, 255));
        radioBtnMenorMayor.setText("De menor a");
        radioBtnMenorMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnMenorMayorActionPerformed(evt);
            }
        });

        etqRadioOrden1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqRadioOrden1.setForeground(new java.awt.Color(255, 255, 255));
        etqRadioOrden1.setText("menor precio");

        etqRadioOrden2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etqRadioOrden2.setForeground(new java.awt.Color(255, 255, 255));
        etqRadioOrden2.setText("mayor precio");

        javax.swing.GroupLayout panelOrdenLayout = new javax.swing.GroupLayout(panelOrden);
        panelOrden.setLayout(panelOrdenLayout);
        panelOrdenLayout.setHorizontalGroup(
            panelOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioBtnMayorMenor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOrdenLayout.createSequentialGroup()
                        .addComponent(radioBtnMenorMayor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(124, 124, 124))
                    .addGroup(panelOrdenLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panelOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etqRadioOrden2)
                            .addComponent(etqRadioOrden1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelOrdenLayout.setVerticalGroup(
            panelOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOrdenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radioBtnMayorMenor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqRadioOrden1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioBtnMenorMayor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqRadioOrden2)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout panelGeneralLayout = new javax.swing.GroupLayout(panelGeneral);
        panelGeneral.setLayout(panelGeneralLayout);
        panelGeneralLayout.setHorizontalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGeneralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(452, 452, 452))
            .addGroup(panelGeneralLayout.createSequentialGroup()
                .addGroup(panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGeneralLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scrollPaneBoletos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(panelEncabezadosTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etqVer)
                            .addComponent(panelRadioBoletos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelGeneralLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(etqEncabezadoTitulo)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        panelGeneralLayout.setVerticalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etqEncabezadoTitulo)
                .addGroup(panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGeneralLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(panelEncabezadosTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollPaneBoletos, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGeneralLayout.createSequentialGroup()
                                .addComponent(panelRadioBoletos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22)
                        .addGroup(panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelGeneralLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(etqVer)))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void radioBoleteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBoleteraActionPerformed
        this.llenarBoletosBoletera();
    }//GEN-LAST:event_radioBoleteraActionPerformed

    private void radioReventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioReventaActionPerformed
        this.llenarBoletosReventa();
    }//GEN-LAST:event_radioReventaActionPerformed

    private void radioTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTodosActionPerformed
        this.llenarBoletosTodos();
    }//GEN-LAST:event_radioTodosActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.control.iniciarCompra(this);
    }//GEN-LAST:event_btnVolverActionPerformed
        
    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        
        LinkedList<Integer> listaCodigosBoletosSeleccionados = new LinkedList<>();
        
        for(JCheckBox checkbox: listaCheckBoxes){
            if(checkbox.isSelected()){
                listaCodigosBoletosSeleccionados.add(listaCodigosBoleto.get(listaCheckBoxes.indexOf(checkbox)));
            }
        }
        
        if(listaCodigosBoletosSeleccionados.isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe seleccionar al menos un boleto para continuar", "Seleccionar boleto",
                    JOptionPane.INFORMATION_MESSAGE);
        } else{
            this.control.mostrarConfirmacionCompra(this, listaCodigosBoletosSeleccionados, codigoEvento);
        }
   
    }//GEN-LAST:event_btnComprarActionPerformed

    private void radioBtnMayorMenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnMayorMenorActionPerformed
        
    }//GEN-LAST:event_radioBtnMayorMenorActionPerformed

    private void radioBtnMenorMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnMenorMayorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnMenorMayorActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnVolver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel etqAsiento;
    private javax.swing.JLabel etqEncabezadoTitulo;
    private javax.swing.JLabel etqFila;
    private javax.swing.JLabel etqLogo;
    private javax.swing.JLabel etqNombreUsuario;
    private javax.swing.JLabel etqPrecio;
    private javax.swing.JLabel etqRadioOrden1;
    private javax.swing.JLabel etqRadioOrden2;
    private javax.swing.JLabel etqSeleccion;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JLabel etqVer;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel panelEncabezado;
    private javax.swing.JPanel panelEncabezadosTabla;
    private javax.swing.JPanel panelGeneral;
    private javax.swing.JPanel panelOrden;
    private javax.swing.JPanel panelRadioBoletos;
    private javax.swing.JPanel panelScrollBoletos;
    private javax.swing.JRadioButton radioBoletera;
    private javax.swing.JRadioButton radioBtnMayorMenor;
    private javax.swing.JRadioButton radioBtnMenorMayor;
    private javax.swing.JRadioButton radioReventa;
    private javax.swing.JRadioButton radioTodos;
    private javax.swing.JScrollPane scrollPaneBoletos;
    // End of variables declaration//GEN-END:variables
}
