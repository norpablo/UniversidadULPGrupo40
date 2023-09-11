/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadulpgrupo40;

import java.sql.Connection;
import universidadulpgrupo40.accesoADatos.Conexion;

/**
 *
 * @author pablo
 */
public class UniversidadULPGrupo40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Connection con=Conexion.getConexion();
    }
    
}
