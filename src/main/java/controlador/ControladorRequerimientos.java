package controlador;

import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;


import modelo.dao.TransmisionesDao;
import modelo.dao.Requerimiento_1Dao;
import modelo.dao.Requerimiento_2Dao;
import modelo.dao.USUARIO2Dao;

import modelo.vo.Nombres_alias;
import modelo.vo.Requerimiento_1Vo;
import modelo.vo.Requerimiento_2Vo;
import vista.VistaRequerimientos;
import modelo.vo.TransmisionesModelo;

public class ControladorRequerimientos {
    // Su código
    private Requerimiento_1Dao requerimiento1;
    private Requerimiento_2Dao requerimiento2;
   

    public ControladorRequerimientos() {
       this.requerimiento1 = new Requerimiento_1Dao();
       this.requerimiento2 = new Requerimiento_2Dao();
       
    }

    public ArrayList<Requerimiento_1Vo> consultarRequerimiento1() throws SQLException {
       return this.requerimiento1.requerimiento1();
    }


    public ArrayList<Requerimiento_2Vo> consultarRequerimiento2() throws SQLException {
        return this.requerimiento2.requerimiento2();
    }
    
    public void consultartransmision(TransmisionesModelo obo) throws SQLException {
        TransmisionesDao dao =new TransmisionesDao();
        dao.requerimiento3(obo);   
    }
    public void consultarusuario(Nombres_alias obi) throws SQLException {
        USUARIO2Dao daoo =new USUARIO2Dao();
        daoo.requerimiento4(obi);   
    }

    public void mostrarventana(){
        VistaRequerimientos formulario = new VistaRequerimientos();
         formulario.setBounds(50, 50, 800, 450);
         formulario.setResizable(false);
         formulario.setTitle("Carlos Andres Ortiz || Juan Jose Portilla Rodriguez Reto 5");
         formulario.getContentPane().setBackground(new Color(30, 29, 29));
         formulario.setVisible(true);
         formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}   
