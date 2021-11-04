package modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.vo.Requerimiento_2Vo;
import util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2Vo> requerimiento2() throws SQLException {
        ArrayList<Requerimiento_2Vo> r2 = new ArrayList<>();
        Connection connection = JDBCUtilities.getConnection();
        Requerimiento_2Vo objeto = null;
        try {
            String sql="SELECT T.usu_alias AS Sobrenombre, T.titulo AS Título, T.trans_fecha AS Transmisión, U.usu_nombre || U.usu_apellido AS Usuario_Visualizador\n" +
"                      FROM TRANSMISIONES T INNER JOIN USUARIO U ON T.usu_alias = U.usu_alias ORDER BY T.ID;";
            Statement stm = connection.createStatement();
            ResultSet res=stm.executeQuery(sql);
             while (res.next()){
               objeto =  new Requerimiento_2Vo();
               objeto.setUsuAlias_fk(res.getString("Sobrenombre"));
               objeto.setTitulo_fk(res.getString("Título"));
               objeto.setTransFecha(res.getString("Transmisión"));
               objeto.setUsuarioVisualizador(res.getString("Usuario_Visualizador"));
               
               r2.add(objeto);
             }
             res.close();
             connection.close();
        } catch (SQLException e) {
            //TODO: handle exception
            System.out.println("Se ha producido el siguiente error:"+e.getMessage());
        }
        return r2;
    }
}