package itson.ticketwizard.persistencia;

import itson.ticketwizard.dtos.CompraReservaUsuarioTransaccionDTO;
import itson.ticketwizard.dtos.TransaccionApartadaDTO;
import itson.ticketwizard.entidades.Evento;
import itson.ticketwizard.entidades.Reserva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;


public class ReservasDAO {
    private final ManejadorConexiones manejadorConexiones;
    
    
    public ReservasDAO(ManejadorConexiones manejadorConexiones){
        this.manejadorConexiones = manejadorConexiones;
    }
    
    
    public Reserva registrar(CompraReservaUsuarioTransaccionDTO compraReservaUsuarioTransaccionDTO){
        String codigoSQLInsercion = """
                                    INSERT INTO Reservas (fechaHoraLimite, codigoTransaccion, codigoUsuario) 
                                    VALUES (DATE_ADD(NOW(), INTERVAL 10 MINUTE), ?, ?);
                                    """;
        String codigoSQLConsultaCodigo = "SELECT LAST_INSERT_ID() AS Codigo;";
        
        String codigoSQLFechaLimiteReserva = "SELECT fechaHoraLimite FROM Reservas WHERE codigo = ?";
        
        Reserva reserva = null;
        try{
            Connection conexion = manejadorConexiones.crearConexion();

            PreparedStatement comando1 = conexion.prepareStatement(codigoSQLInsercion); 
            PreparedStatement comando2 = conexion.prepareStatement(codigoSQLConsultaCodigo); 
            PreparedStatement comando3 = conexion.prepareStatement(codigoSQLFechaLimiteReserva); 
            
            comando1.setInt(1, compraReservaUsuarioTransaccionDTO.getCodigoTransaccion());
            comando1.setInt(2, compraReservaUsuarioTransaccionDTO.getCodigoUsuario());
           
            
            int filasAfectadas = comando1.executeUpdate();
            
            ResultSet resultado1 = comando2.executeQuery();
            
            Integer codigo = null;
            while(resultado1.next()){
                codigo = resultado1.getInt("Codigo");
            }
            
            comando3.setInt(1, codigo);
            
            ResultSet resultado2 = comando3.executeQuery();
            
            String fechaHoraLimite = null;
            while(resultado2.next()){
                fechaHoraLimite = resultado2.getString("fechaHoraLimite");
            }
            reserva = new Reserva(codigo, fechaHoraLimite, compraReservaUsuarioTransaccionDTO.getCodigoUsuario(), compraReservaUsuarioTransaccionDTO.getCodigoTransaccion());
            

        } catch (SQLException e){
            System.err.println(e.getMessage());
        }
        return reserva;
    }

    public List<TransaccionApartadaDTO> obtenerResevasValidas(String correoElectronico){
        String codigoSQL = """
                            SELECT 
                            	ta.codigo,
                                bo.codigo,
                                ta.fechaHora,
                                ta.codigoUsuarioRevendedor,
                                ta.precioVenta,
                                ev.nombre,
                                ev.recinto,
                                ev.fecha,
                                ev.estado,
                                ev.ciudad,
                                ev.direccionBanner,
                                ta.codigoUsuarioComprador
                            FROM Usuarios AS us
                            INNER JOIN Reservas AS re ON us.codigo = re.codigoUsuario
                            INNER JOIN Transacciones AS ta ON ta.codigo = re.codigoTransaccion
                            INNER JOIN Boletos AS bo ON bo.codigo = ta.codigoBoleto
                            INNER JOIN Eventos AS ev ON ev.codigo = bo.codigoEvento
                            WHERE us.correoElectronico = ? AND fechaHoraLimite > NOW();
        """;

        List<TransaccionApartadaDTO> listaTransaccionApartadaDTO = new LinkedList<>();
        try {
            
            Connection conexion = this.manejadorConexiones.crearConexion();
            PreparedStatement comando = conexion.prepareStatement(codigoSQL);
            comando.setString(1, correoElectronico);
            ResultSet resultadosConsultaReservas = comando.executeQuery();
            while(resultadosConsultaReservas.next()){
                Integer codigoBoleto = resultadosConsultaReservas.getInt("bo.codigo");
                Integer codigoTransaccion = resultadosConsultaReservas.getInt("ta.codigo");
                String fechaHora = resultadosConsultaReservas.getString("ta.fechaHora");
                Integer codigoUsuarioRevendedor = resultadosConsultaReservas.getInt("ta.codigoUsuarioRevendedor");
                Double precioVenta = resultadosConsultaReservas.getDouble("ta.precioVenta");
                String nombre = resultadosConsultaReservas.getString("ev.nombre");
                String recinto = resultadosConsultaReservas.getString("ev.recinto");
                String fechaEvento = resultadosConsultaReservas.getString("ev.fecha");
                String estado = resultadosConsultaReservas.getString("ev.estado");
                String ciudad = resultadosConsultaReservas.getString("ev.ciudad");
                String direccionBanner = resultadosConsultaReservas.getString("ev.direccionBanner");
                Integer codigoUsuarioComprador = resultadosConsultaReservas.getInt("ta.codigoUsuarioComprador");

                TransaccionApartadaDTO transaccionApartadaDTO = new TransaccionApartadaDTO(codigoBoleto, codigoTransaccion, fechaHora, codigoUsuarioRevendedor,
                        precioVenta, nombre, recinto, fechaEvento, estado, ciudad, direccionBanner, codigoUsuarioComprador);

                listaTransaccionApartadaDTO.add(transaccionApartadaDTO);
            }
            
            
        } catch(SQLException ex){
            System.out.println("Error al desplegar los eventos: " + ex.getMessage());
        }
        return listaTransaccionApartadaDTO;
    }
    
}
