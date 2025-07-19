/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_BD;
import conexion_BD.conexion;

/**
 *
 * @author jr245
 */
public class Sistema_De_Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        conexion dbc = new conexion();
        dbc.conectar();
        
    }
    
}
