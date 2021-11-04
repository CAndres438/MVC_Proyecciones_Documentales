
package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.vo.Nombres_alias;
import util.JDBCUtilities;


public class USUARIO2Dao {
   Nombres_alias obi = new Nombres_alias();
     public void requerimiento4(Nombres_alias obi1) throws SQLException {
        obi=obi1;
        Connection connection = JDBCUtilities.getConnection();
        try {
         
        String sql = "insert into USUARIO(usu_alias, usu_nombre, usu_apellido) VALUES (?,?,?);";
                    
            PreparedStatement statement = connection.prepareStatement(sql);
         
            statement.setString     (1, obi.getUsuAlias());
            statement.setString     (2, obi.getUsuNombre());
            statement.setString     (3, obi.getUsuApellido());
            var res =statement.executeUpdate();
            
            if (res>0){
               JOptionPane.showMessageDialog(null, "Se Inserto un nuevo Usuario");
            }
            
             
             connection.close();
            } catch (SQLException e) {
               System.out.println("Se ha producido el siguiente error:"+e.getMessage());
           }
       
       
     }
}