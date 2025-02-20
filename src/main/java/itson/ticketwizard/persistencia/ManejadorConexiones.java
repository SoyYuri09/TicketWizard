package itson.ticketwizard.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ManejadorConexiones {
    private final String cadenaConexion = "jdbc:mysql://localhost/ticketwizardDb";
    private final String usuario = "root";
    private final String contraseña = "mroMSQL1147-";
    
    public Connection crearConexion() throws SQLException{
        //Se establece la conexión con el servidor de base de datos
        Connection conexion;

        conexion = DriverManager.getConnection(cadenaConexion, usuario, contraseña);

        return conexion;
    }
}
