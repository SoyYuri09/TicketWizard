
package itson.ticketwizard.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author García López, Yuri Germán - ID: 00000252583
 * @author Mendoza Baypoli, Vladimir Iván - ID: 00000252758
 * @author Romo López, Manuel - ID: 00000253080
 */

public class ManejadorConexiones {
    private final String cadenaConexion = "jdbc:mysql://localhost/ticketwizardDb";
    private final String usuario = "root";
    private final String contraseña = "Itson";
    
    public Connection crearConexion() throws SQLException{

        Connection conexion;

        conexion = DriverManager.getConnection(cadenaConexion, usuario, contraseña);

        return conexion;
    }
}
