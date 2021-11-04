package modelo.dao;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import modelo.vo.TransmisionesModelo;
import util.JDBCUtilities;

public class TransmisionesDao {
    TransmisionesModelo obo = new TransmisionesModelo();
     public void requerimiento3(TransmisionesModelo obo1) throws SQLException {
        obo= obo1;
        Connection connection = JDBCUtilities.getConnection();
        try {
         
        String sql = "INSERT INTO TRANSMISIONES(ID, usu_alias, Titulo, trans_fecha)"
                    + "VALUES(?,?,?,?);";
            PreparedStatement statement = connection.prepareStatement(sql);
            /*statement.setInt        (1, ob.getTrans());*/
            statement.setString     (2, obo.getUsuAlias_fk());
            statement.setString     (3, obo.getTitulo_fk());
            statement.setString     (4, obo.getTransFecha());
            int rowsInserted    =   statement.executeUpdate();
            
            if (rowsInserted>0){
               JOptionPane.showMessageDialog(null, "Se Inserto un nueva Transmisión");
               
            }
            
             
             connection.close();
            } catch (SQLException e) {
               
               System.out.println("Se ha producido el siguiente error:"+e.getMessage());
           }
       
       
     }
}