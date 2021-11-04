package modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.vo.Requerimiento_1Vo;


import util.JDBCUtilities;

public class Requerimiento_1Dao {
    public ArrayList<Requerimiento_1Vo> requerimiento1() throws SQLException {
        ArrayList<Requerimiento_1Vo> r1 = new ArrayList<>();
        Connection connection = JDBCUtilities.getConnection();
        Requerimiento_1Vo objeto = null;
        try {
            String sql="DELETE from TRANSMISIONES where ID = (SELECT ID from TRANSMISIONES order by ID DESC limit 1);";
            Statement stm = connection.createStatement();
            ResultSet res=stm.executeQuery(sql); 
             res.close();
             connection.close();
        } catch (SQLException e) {
            //TODO: handle exception
            System.out.println("Se ha producido el siguiente error:"+e.getMessage());
        }
        return r1;
        }
    }
