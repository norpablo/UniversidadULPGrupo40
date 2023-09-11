package universidadulpgrupo40.accesoADatos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class Conexion {
    private static final String URL="jdbc:mariadb://localhost/";
    private static final String DB="gestionuniversal-enj";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection connection;
    
    private Conexion(){}
    
    public static Connection getConexion(){
        
        if(connection==null){
            
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL+DB,USUARIO,PASSWORD);
                
                JOptionPane.showMessageDialog(null, "Conectado");
                
            } catch (ClassNotFoundException ex) {
               JOptionPane.showMessageDialog(null,"Error al cargar los driver ");
               
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error el conectarse a la base de datos ");
                
            }
        }
        
        return connection;
    }  
    
      
}

